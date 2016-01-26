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
import project_year4.maze.mode.MovementMode;
import project_year4.maze.typ.SimulationTyp;

/**
 *
 * @author L00131070
 */
public class Maze {
	
	Node[] nodes = null;
	Algorithm algorithm = null;
        MovementMode movementMode = null;
        SimulationTyp simulationTyp = null;
        ArrayList<MazeListener> listeners = new ArrayList<>(10);
	
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
            for(MazeListener listener : listeners) {
                listener.changedMaze(this);
            }
        }
    
}
