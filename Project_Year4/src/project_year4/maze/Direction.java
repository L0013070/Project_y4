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

/**
 *
 * @author L00131070
 */
public enum Direction {
    NORTH(0,0, NodeTyp.Y),
    EAST(0,0, NodeTyp.X),
    SOUTH(0,-1, NodeTyp.Y),
    WEST(-1,0, NodeTyp.X);
    
    private int xCellOffset = 0;
    private int yCellOffset = 0;
    private NodeTyp typ;
    
    Direction(int xCellOffset, int yCellOffset, NodeTyp typ) {
        this.xCellOffset = xCellOffset;
        this.yCellOffset = yCellOffset;
        this.typ = typ;
    }
    
    public Node getNodeForCell(int xPos, int yPos, Node[][] xNodes, Node[][] yNodes) {
        Node ret = null;
        xPos += xCellOffset;
        yPos += yCellOffset;
        if (getTyp() == NodeTyp.X && xPos < Maze.MAZESIZE-1 && yPos < Maze.MAZESIZE && xPos > -1 && yPos > -1) {
            ret = xNodes[xPos][yPos];
        }
        if (getTyp() == NodeTyp.Y && yPos < Maze.MAZESIZE-1 && xPos < Maze.MAZESIZE && xPos > -1 && yPos > -1) {
            ret = yNodes[xPos][yPos];
        }
        return ret;
    }

    /**
     * @return the typ
     */
    public NodeTyp getTyp() {
        return typ;
    }
}
