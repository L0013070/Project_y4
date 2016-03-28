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
public class TimeMode extends MovementMode {

    double[] costStraight = {1.0, 1 / 2.0, 1 / 3.0, 1 / 4.0, 1 / 5.0, 1 / 5.0};
    double costTurn = Math.PI / 4;
    double[] penaltyTurn = new double[(costStraight.length * 2)-1];

    public TimeMode() {
        double[] accelerationCost = new double[penaltyTurn.length];
        accelerationCost[0] = 0.0;
        for (int i = 1; i < accelerationCost.length; i++) {
            if (i < costStraight.length) {
                accelerationCost[i] = accelerationCost[i - 1] + costStraight[i];
            } else {
                accelerationCost[i] = accelerationCost[i - 1] + costStraight[costStraight.length - 1];
            }
        }
        penaltyTurn[0] = 0;
        System.out.println("breaking penalty " + 0 + ": " + penaltyTurn[0]);
        penaltyTurn[1] = 0.5;
        System.out.println("breaking penalty " + 1 + ": " + penaltyTurn[1]);
        for (int i = 2; i < penaltyTurn.length; i = i + 2) {
            double breakingCost = 2 * accelerationCost[i / 2];
            penaltyTurn[i] = Math.abs(breakingCost - accelerationCost[i]);
            System.out.println("breaking penalty " + i + ": " + penaltyTurn[i] + "streight: " + accelerationCost[i] + "breaking: " + breakingCost);
            if ((i / 2 + 1) < costStraight.length) {
                breakingCost += costStraight[i / 2 + 1];
                penaltyTurn[i + 1] = Math.abs(breakingCost - accelerationCost[i + 1]);
                System.out.println("breaking penalty " + (i + 1) + ": " + penaltyTurn[i + 1] + "streight: " + accelerationCost[i + 1] + "breaking: " + breakingCost);
            }
        }
    }

    @Override
    public double getCost(Node from, Node to) {
        return 0.5;
    }

}
