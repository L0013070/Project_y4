/*
 * Copyright (C) 2015 L00131070.
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
import project_year4.gui.DisplayMaze;
import project_year4.maze.mode.MovementMode;
import project_year4.maze.typ.SimulationTyp;

/**
 *
 * @author L00131070
 */
public class Maze {

    public static final int MAZESIZE = 16;

    Algorithm algorithm = null;
    MovementMode movementMode = null;
    SimulationTyp simulationTyp = null;
    ArrayList<MazeListener> listeners = new ArrayList<>(10);

    private MazeCell[][] mazeCells = new MazeCell[MAZESIZE][MAZESIZE];
    private Nodes nodes = new Nodes();
    
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
                for (Node node : mazeCells[x][y].getNodes()) {
                    if (null != node) {
                        node.setWall(false);
                    }
                }
            }
        }
    }

    public MazeCell getMazeCell(int x, int y) {
        return getMazeCells()[x][y];
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void setHeuristic(Heuristic heuristic) {

    }

    public void setMovementMode(MovementMode mode) {
        movementMode = mode;
    }

    public void setSimulationTyp(SimulationTyp typ) {
        simulationTyp = typ;
    }

    public void solve() {
        if (algorithm != null) {
            algorithm.run(this);
        }
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

}
