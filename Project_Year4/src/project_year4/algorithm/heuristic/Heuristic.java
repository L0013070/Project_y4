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
package project_year4.algorithm.heuristic;

import project_year4.maze.MazeCell;
import project_year4.maze.Node;
import project_year4.robot.Robot;

/**
 *
 * @author L00131070
 */
public abstract class Heuristic {

    private double squareSize = 1.0;
    private Robot robot = new Robot(1.0, 1.0, 1.0);

    public void init(double squareSize, Robot robot) {
        this.squareSize = squareSize;
        if (robot != null) {
            this.robot = robot;
        } else {
            this.robot = new Robot(1.0,1.0,1.0);
        }
    }

    public double getSquareSize() {
        return squareSize;
    }

    public double getMinVelocity() {
        return robot.getMinVelocity();
    }
    
    public double getMaxVelocity() {
        return robot.getMaxVelocity();
    }
    
    public double getAcceleration() {
        return robot.getAcceleration();
    }

    public double getDistance(Node from, MazeCell goal) {
        double distance = Double.MAX_VALUE;
        for (Node node : goal.getNodes()) {
            if (node != null) {
                double calcDistance = calculate(from, node);
                if (calcDistance < distance) {
                    distance = calcDistance;
                }
            }
        }
        return distance;
    }

    public abstract double calculate(Node from, Node to);
    
    public abstract String getName();

}
