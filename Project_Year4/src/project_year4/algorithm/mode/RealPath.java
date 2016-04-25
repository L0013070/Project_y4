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
package project_year4.algorithm.mode;

import project_year4.maze.Node;

/**
 *
 * @author L00131070
 */
public class RealPath  extends MovementMode{
    
    @Override
    public double getCost(Node from, Node to) {
        double ret = 0.0;
        if (from.getTyp() == to.getTyp()) {
            ret = getSquareSize();
        } else {
            ret = getSquareSize() * Math.PI/4;
        }
        return ret;
    }

    @Override
    public String getName() {
        return "Real Path";
    }

}
