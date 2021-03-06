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
package project_year4.algorithm;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import project_year4.maze.Maze;
import project_year4.maze.Node;
import project_year4.maze.NodeDirection;
import project_year4.maze.NodeState;

/**
 *
 * @author L00131070
 */
public class AlgorithmA extends Algorithm {

    PriorityQueue<Node> openList = new PriorityQueue<>();

    @Override
    public void run(Maze maze) {
        init();
        Node[] startNodes = maze.getStartNodes();
        if (startNodes == null) {
            return;
        }
        Node[] goalNodes = maze.getGoal().getNodes();
        for (Node node : startNodes) {
            if (node != null && !node.isWall()) {
                node.setValue(0.5);
                node.setDirection(NodeDirection.FORWARD);
                openList.add(node);
            }
        }
        Node node = null;
        int i = 0;
        while (node == null) {
            node = startNodes[i];
            i++;
        }
        System.out.println(node.print());
        while (!openList.isEmpty() && !Arrays.asList(goalNodes).contains(node)) {
            node = openList.poll();
            getStatistic().incrementClosedNodes();
            Node[] children = node.getChildren();
            for (Node child : children) {
                if (child != null && !child.isWall() && (node.getValue() + maze.getMovementMode().getCost(node, child) < child.getValue() || child.getValue() < 0)) {
                    child.setValue(node.getValue() + maze.getMovementMode().getCost(node, child));
                    child.setHeuristicValue(child.getValue() + maze.getHeuristic().getDistance(child, maze.getGoal()));
                    child.setParent(node);
                    if (child.getState() == NodeState.CLOSED) {
                        System.out.println("reopen node: " + child.print());
                        getStatistic().incrementReopenedNodes();
                    }
                    if (openList.contains(child)) {
                        System.out.println("child allready in openList");
                        openList.add(child);
                    } else {
                        openList.add(child);
                    }

                    getStatistic().incrementOpenedNodes();
                    child.setState(NodeState.OPEN);
                    try {
                        Thread.sleep(Algorithm.DELAY);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(AlgorithmA.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                node.setState(NodeState.CLOSED);
            }

        }
    }

    private void init() {
        openList.clear();
        getStatistic().reset();
    }

    @Override
    public String getName() {
        return "Algorithm A";
    }

}
