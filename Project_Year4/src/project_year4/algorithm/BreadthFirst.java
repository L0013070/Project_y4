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

import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import project_year4.maze.Maze;
import project_year4.maze.Node;
import project_year4.maze.NodeDirection;

/**
 *
 * @author L00131070
 */
public class BreadthFirst extends Algorithm {

    LinkedList<Node> openList = new LinkedList();

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
                openList.addLast(node);
            }
        }
        while (!openList.isEmpty()) {
            System.out.println("start count: " + openList.size());
            Node node = openList.removeFirst();
            Node[] children = node.getChildren();
            System.out.println("children: "+children.length);
            for (Node child : children) {
                if (child != null && !child.isWall() && node.getValue() + 1.00 < child.getValue()) {
                    child.setValue(node.getValue() + 1.00);
                    child.setDirection(NodeDirection.FORWARD);
                    openList.addLast(child);
                    System.out.println("node: "+ node.getxPosition()+"/"+node.getyPosition()+ node.getTyp() + " " + node.getValue());
                    System.out.println("child: "+ child.getxPosition()+"/"+child.getyPosition()+ node.getTyp() + " " + child.getValue());
                    
                }
            }

        }
    }

    private void init() {
        openList.clear();
    }

}
