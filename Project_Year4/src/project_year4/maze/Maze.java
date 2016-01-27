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
import java.util.ArrayList;
import project_year4.algorithm.Algorithm;
import project_year4.algorithm.heuristic.Heuristic;
import project_year4.gui.DisplayMaze1;
import project_year4.maze.mode.MovementMode;
import project_year4.maze.typ.SimulationTyp;

/**
 *
 * @author L00131070
 */
public class Maze {
    
    public static final int mazeSize = 16;

    Algorithm algorithm = null;
    MovementMode movementMode = null;
    SimulationTyp simulationTyp = null;
    ArrayList<MazeListener> listeners = new ArrayList<>(10);

    private MazeCell[][] mazeCells = new MazeCell[mazeSize][mazeSize];
    private Node[][] xNodes = new Node[mazeSize -1 ][mazeSize];
    private Node[][] yNodes = new Node[mazeSize][mazeSize - 1];

    public Maze() {
        for (int x = 0; x < 16; x++) {
            for (int y = 0; y < 16; y++) {
                mazeCells[x][y] = new MazeCell(x, y);
                if (x < 15) {
                    xNodes[x][y] = new Node();
                }
                if (y < 15) {
                    yNodes[x][y] = new Node();
                }
            }
        }
    }
    
    public MazeCell getMazeCell(int x, int y) {
        return mazeCells[x][y];
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

    public DisplayMaze1 createDisplayPanel() {
        DisplayMaze1 panel = new DisplayMaze1(mazeCells, xNodes, yNodes);
        return panel;
    }
}
