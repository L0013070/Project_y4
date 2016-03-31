/*
 * Copyright (C) 2016 Dietmar.
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
 * @author Dietmar
 */
public class DirectDistanceTime extends Heuristic{

    @Override
    public double calculate(Node from, Node to) {
        double distance = 0.0;
        if (from.getxPosition() == to.getxPosition()) {
            distance = Math.abs(from.getyPosition() - to.getyPosition());
        } else if (from.getyPosition() == to.getyPosition()) {
            distance = Math.abs(from.getxPosition() - to.getxPosition());
        } else {
            double x = from.getxPosition() - to.getxPosition();
            double y = from.getyPosition() - to.getyPosition();
            distance = Math.sqrt(Math.pow(y, 2)+Math.pow(x, 2));
        }
        return distance * (getSquareSize()/(getMinVelocity()+getMaxVelocity()/2));
    }
    
}
