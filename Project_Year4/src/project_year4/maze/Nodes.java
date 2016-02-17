/*
 * Copyright (C) 2016 L00131070.
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
package project_year4.maze;

import static project_year4.maze.Maze.MAZESIZE;

/**
 *
 * @author L00131070
 */
public class Nodes {

    private Node[][] xNodes = new Node[MAZESIZE - 1][MAZESIZE];
    private Node[][] yNodes = new Node[MAZESIZE][MAZESIZE - 1];

    public Nodes() {
        for (int x = 0; x < Maze.MAZESIZE; x++) {
            for (int y = 0; y < Maze.MAZESIZE; y++) {
                if (x < 15) {
                    xNodes[x][y] = new Node(NodeTyp.X, x, y);
                }
                if (y < 15) {
                    yNodes[x][y] = new Node(NodeTyp.Y, x, y);
                }
            }
        }
        for (int x = 0; x < Maze.MAZESIZE; x++) {
            for (int y = 0; y < Maze.MAZESIZE; y++) {
                if (x < 15) {
                    xNodes[x][y].initChildren(xNodes, yNodes);
                }
                if (y < 15) {
                    yNodes[x][y].initChildren(xNodes, yNodes);
                }
            }
        }

    }

    Node getNode(NodeTyp typ, int xPos, int yPos) {
        Node ret = null;
        if (typ == NodeTyp.X && xPos < Maze.MAZESIZE - 1 && xPos >= 0 && yPos >= 0 && yPos < Maze.MAZESIZE) {
            ret = xNodes[xPos][yPos];
        }
        if (typ == NodeTyp.Y && yPos < Maze.MAZESIZE - 1 && yPos >= 0 && xPos >= 0 && xPos < Maze.MAZESIZE) {
            ret = yNodes[xPos][yPos];
        }
        return ret;
    }

}
