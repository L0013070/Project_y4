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
	
	public void solve() {
		algorithm.run(this);
	}
        
        public boolean load(File file) {
            return false;
        }
    
}
