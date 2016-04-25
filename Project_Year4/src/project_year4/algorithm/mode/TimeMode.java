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

import java.util.Arrays;
import project_year4.maze.Maze;
import project_year4.maze.Node;
import project_year4.robot.Robot;

/**
 *
 * @author L00131070
 */
public class TimeMode extends MovementMode {

    double[] costStraight;
    double lengthFactorTurn = Math.PI / 4;
    double[] costTurn;

    public TimeMode() {
        System.out.println("distance for maxVelocity: " + getDistance() / getSquareSize());
        System.out.println("max index needed: " + (getDistance() / getSquareSize() * 2));

    }

    public void init(double squareSize, Robot robot) {
        super.init(squareSize, robot);
        System.out.println("Acc: " + this.getAcceleration());
        System.out.println("min: " + this.getMinVelocity());
        System.out.println("max: " + this.getMaxVelocity());

        int indexSize = (int) (getDistance() / getSquareSize());
        System.out.println("distance for maxVelocity in Squares: " + indexSize);
        System.out.println("maxVelocity for indexSize: " + getFinalVelocity(indexSize));
        System.out.println("max index needed: " + (indexSize * 2));
        double[] velocities = new double[(indexSize * 2) + 1];
        for (int i = 0; i < (velocities.length); i++) {
            velocities[i] = getFinalVelocity(i / 2.0);
        }
        costStraight = new double[indexSize + 1];
        for (int i = 0; i < costStraight.length - 1; i++) {
            costStraight[i] = (velocities[(i + 1) * 2] - velocities[i * 2]) / getAcceleration();
        }
        costStraight[costStraight.length - 1] = getSquareSize() / velocities[velocities.length - 1];
        System.out.println("Velocities: " + Arrays.toString(velocities));
        System.out.println("cost straight: " + Arrays.toString(costStraight));
        double[] straightAccumulatedCost = new double[(indexSize*2)];
        straightAccumulatedCost[0] = costStraight[0];
        for (int i=1; i < straightAccumulatedCost.length; i++) {
            if (i < 3) {
                straightAccumulatedCost[i] = straightAccumulatedCost[i-1]+costStraight[i];
            } else {
                straightAccumulatedCost[i] = straightAccumulatedCost[i-1]+costStraight[costStraight.length-1];
            }
        }
        System.out.println("acc cost straight: " + Arrays.toString(straightAccumulatedCost));
        costTurn = new double[indexSize * 2];
        for (int i = 0; i < costTurn.length; i++) {
            costTurn[i] = getTime(velocities[i+1])*2 - straightAccumulatedCost[i];
        }
        System.out.println("cost turn: " + Arrays.toString(costTurn));
    }

    public double getFinalVelocity(double distance) {
        return Math.sqrt(2 * getAcceleration() * getSquareSize() * distance + getMinVelocity());
    }

    public double getDistance() {
        return (Math.pow(getMaxVelocity(), 2) - Math.pow(getMinVelocity(), 2)) / (2 * getAcceleration());
    }
    
    public double getTime(double velocity) {
        return (velocity - getMinVelocity()) / getAcceleration();
    }

    @Override
    public double getCost(Node from, Node to) {
        double ret = 0.0;
        if (from.getTyp() == to.getTyp()) {
            if (from.getStraightCount() < costStraight.length) {
                ret = costStraight[from.getStraightCount()];
            } else {
                ret = costStraight[costStraight.length-1];
            }
        } else {
            ret = ((getSquareSize() * lengthFactorTurn)/getMinVelocity());
            if (from.getStraightCount() > 0) {
                if ( from.getStraightCount() < costTurn.length) {
                    ret += costTurn[from.getStraightCount()-1];
                } else {
                    ret += costTurn[costTurn.length-1];
                }
            }
        }
        return ret;
    }

    @Override
    public String getName() {
        return "Time Cost";
    }

}
