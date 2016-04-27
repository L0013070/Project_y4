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

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
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
public class Dijkstra extends Algorithm {

    PriorityQueue<Node> openList = new PriorityQueue<>();

    @Override
    public void run(Maze maze) {
        init();
        Node[] startNodes = maze.getStartNodes();
        if (startNodes == null) {
            return;
        }
        for (Node node : startNodes) {
            if (node != null && !node.isWall()) {
                node.setValue(0.5);
                node.setDirection(NodeDirection.FORWARD);
                openList.add(node);
                getStatistic().incrementOpenedNodes();
            }
        }
        Node node = null;
        int i = 0;
        while (node == null) {
            node = startNodes[i];
            i++;
        }
        Node[] goalNodes = maze.getGoal().getNodes();
        while (!openList.isEmpty()&& !Arrays.asList(goalNodes).contains(node)) {
            node = openList.poll();
            getStatistic().incrementClosedNodes();
            Node[] children = node.getChildren();
            for (Node child : children) {
                if (child != null && !child.isWall() && (node.getValue() + maze.getMovementMode().getCost(node, child) < child.getValue() || child.getValue() < 0)) {
                    if (child.getState() == NodeState.CLOSED) {
                        System.out.println("reopen node: "+child.print());
                        getStatistic().incrementReopenedNodes();
                    }
                    child.setValue(node.getValue() + maze.getMovementMode().getCost(node, child));
                    child.setHeuristicValue(child.getValue());
                    child.setParent(node);
                    openList.add(child);
                    child.setState(NodeState.OPEN);
                    getStatistic().incrementOpenedNodes();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Dijkstra.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
            node.setState(NodeState.CLOSED);

        }
    }

    private void init() {
        openList.clear();
        getStatistic().reset();
    }

    @Override
    public String getName() {
        return "Dijkstra";
    }

}
