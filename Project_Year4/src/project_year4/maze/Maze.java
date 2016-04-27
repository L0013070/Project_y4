/*
 * Copyright (C) L00131070@student.lyit.ie.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package project_year4.maze;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import project_year4.algorithm.Algorithm;
import project_year4.algorithm.heuristic.Heuristic;
import project_year4.algorithm.heuristic.NullHeuristic;
import project_year4.algorithm.mode.Constant;
import project_year4.gui.DisplayMaze;
import project_year4.algorithm.mode.MovementMode;
import project_year4.robot.Robot;

/**
 *
 * @author L00131070
 */
public class Maze {

    public static final int MAZESIZE = 16;

    private double squareSize = 0.18;
    private Robot robot = new Robot(1.0,3.5,10.0);
    private Algorithm algorithm = null;
    private MovementMode movementMode = new Constant();
    private Heuristic heuristic = new NullHeuristic(); 
    private final ArrayList<MazeListener> listeners = new ArrayList<>(10);

    private final MazeCell[][] mazeCells = new MazeCell[MAZESIZE][MAZESIZE];
    private final Nodes nodes = new Nodes();
    private MazeCell start = null;
    private MazeCell goal = null;
    
    private boolean simulatorRunning = false;


    public Maze() {
        for (int x = 0; x < Maze.MAZESIZE; x++) {
            for (int y = 0; y < Maze.MAZESIZE; y++) {
                mazeCells[x][y] = new MazeCell(this, x, y);
            }
        }
    }

    public void reset() {
        for (int x = 0; x < Maze.MAZESIZE; x++) {
            for (int y = 0; y < Maze.MAZESIZE; y++) {
                mazeCells[x][y].setWalls(0);
                mazeCells[x][y].setState(MazeCellState.NORMAL);
                for (Node node : mazeCells[x][y].getNodes()) {
                    if (null != node) {
                        node.init();
                    }
                }
            }
        }
    }

    public void resetNodes() {
        for (int x = 0; x < Maze.MAZESIZE; x++) {
            for (int y = 0; y < Maze.MAZESIZE; y++) {
                for (Node node : mazeCells[x][y].getNodes()) {
                    if (null != node && !node.isWall()) {
                        node.reset();
                    }
                }
                mazeCells[x][y].setState(MazeCellState.NORMAL);
            }
        }
    }

    public MazeCell getMazeCell(int x, int y) {
        return getMazeCells()[x][y];
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public Algorithm getAlgorithm() {
        return this.algorithm;
    }

    public void setHeuristic(Heuristic heuristic) {
        this.heuristic = heuristic;
    }

    public void setMovementMode(MovementMode mode) {
        movementMode = mode;
    }

    public void solve() {
        setSimulatorRunning(true);
        if (algorithm != null) {
            algorithm.run(this);
        }
        double value = 1000.0;
        Node goalNode = null;
        for (Node node : goal.getNodes()) {
            if (!node.isWall() && node.getValue() < value) {
                value = node.getValue();
                goalNode = node;
            }
        }
        getAlgorithm().getStatistic().setPathLength(goalNode.getValue());
        setSimulatorRunning(false);
    }

    public boolean load(File file) {
        return false;
    }

    public boolean addListener(MazeListener listener) {
        if (!listeners.contains(listener)) {
            return listeners.add(listener);
        }
        return false;
    }

    public boolean removeListeners(MazeListener listener) {
        return listeners.remove(listener);
    }

    protected void changedMaze() {
        for (MazeListener listener : listeners) {
            listener.changedMaze(this);
        }
    }

    protected void changedSimulation(){
        for (MazeListener listener : listeners) {
            listener.simulationEnded();
        }
    }

    public DisplayMaze createDisplayPanel() {
        DisplayMaze panel = new DisplayMaze(getMazeCells(), getNodes());
        return panel;
    }

    public void readMazFile(File file) {
        FileInputStream fileIn;
        try {
            fileIn = new FileInputStream(file);
            int i = 0;
            while (fileIn.available() > 0) {
                int read = fileIn.read();
                int x = 15 - ((255 - i) % 16);
                int y = (255 - i) / 16;
                getMazeCell(x, y).setWalls(read);
                i++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Maze.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Maze.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * @return the mazeCells
     */
    protected MazeCell[][] getMazeCells() {
        return mazeCells;
    }

    /**
     * @return the Nodes
     */
    protected Nodes getNodes() {
        return nodes;
    }

    public Node[] getStartNodes() {
        if (getStart() != null) {
            return getStart().getNodes();
        } else {
            return null;
        }
    }

    /**
     * @return the start
     */
    public MazeCell getStart() {
        return start;
    }

    /**
     * @param start the start to set
     */
    public void setStart(MazeCell start) {
        if (this.start != null) {
            this.start.setState(MazeCellState.NORMAL);
        }
        this.start = start;
        this.start.setState(MazeCellState.START);
    }

    /**
     * @return the goal
     */
    public MazeCell getGoal() {
        return goal;
    }

    /**
     * @param goal the goal to set
     */
    public void setGoal(MazeCell goal) {
        if (this.goal != null) {
            this.goal.setState(MazeCellState.NORMAL);
        }
        goal.setState(MazeCellState.GOAL);
        this.goal = goal;
    }

    public MovementMode getMovementMode() {
        return movementMode;
    }

    public Heuristic getHeuristic() {
        return heuristic;
    }

    public double getSquareSize() {
        return squareSize;
    }

    public void setSquareSize(double squareSize) {
        this.squareSize = squareSize;
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    /**
     * @return the simulatorRunning
     */
    public boolean isSimulatorRunning() {
        return simulatorRunning;
    }

    /**
     * @param simulatorRunning the simulatorRunning to set
     */
    public void setSimulatorRunning(boolean simulatorRunning) {
        this.simulatorRunning = simulatorRunning;
        if (simulatorRunning == false) {
            this.changedSimulation();
        }
    }

}
