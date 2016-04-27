/*
 * Copyright (C) 2016 L00131070@student.lyit.ie.
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
package project_year4.algorithm.heuristic;

import project_year4.maze.Node;

/**
 *
 * @author L00131070@student.lyit.ie
 */
public class ManhattenDistance extends Heuristic{

    @Override
    public double calculate(Node from, Node to) {
        double distance = Math.abs(from.getyPosition() - to.getyPosition());
        distance += Math.abs(from.getxPosition() - to.getxPosition());
        return distance * getSquareSize();
    }

    @Override
    public String getName() {
        return "Manhattan Distance";
    }
    
}
