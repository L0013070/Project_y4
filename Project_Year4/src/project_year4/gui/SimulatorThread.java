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
package project_year4.gui;

import project_year4.algorithm.AlgorithmStatistics;
import project_year4.maze.Maze;
import project_year4.maze.MazeCell;
import project_year4.maze.Node;
import project_year4.maze.NodeState;

/**
 *
 * @author Dietmar
 */
public class SimulatorThread implements Runnable {

    private final Maze maze;

    public SimulatorThread(Maze maze) {
        this.maze = maze;
    }

    @Override
    public void run() {
        maze.setStart(maze.getMazeCell(0, 0));
        MazeCell goal = maze.getMazeCell(7, 7);
        maze.setGoal(goal);
        maze.getHeuristic().init(maze.getSquareSize(), maze.getRobot());
        maze.getMovementMode().init(maze.getSquareSize(), maze.getRobot());
        maze.solve();
        System.out.println("Statistic: " + maze.getAlgorithm().getStatistic().toString());

        Node goalNode = null;
        double value = 1000.0;
        for (Node node : goal.getNodes()) {
            if (!node.isWall() && node.getValue() < value) {
                value = node.getValue();
                goalNode = node;
            }
        }
        AlgorithmStatistics statistic = maze.getAlgorithm().getStatistic();
        statistic.setPathLength(goalNode.getValue());
        System.out.println("Statistics: "+statistic.toString());
        goalNode.setState(NodeState.PATH);
        Node actNode = goalNode;
        while (actNode.getValue() > 0.5) {
            actNode.setState(NodeState.PATH);
            actNode = actNode.getParent();
        }
        actNode.setState(NodeState.PATH);
    }

}
