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
package project_year4.algorithm;

import project_year4.algorithm.heuristic.Heuristic;
import project_year4.algorithm.heuristic.NullHeuristic;
import project_year4.algorithm.mode.Constant;
import project_year4.algorithm.mode.MovementMode;
import project_year4.maze.Maze;

/**
 *
 * @author L00131070
 */
public abstract class Algorithm {
    
    public abstract void run(Maze maze);

}
