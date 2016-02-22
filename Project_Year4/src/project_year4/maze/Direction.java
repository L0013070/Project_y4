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
    
    public Node getNodeForCell(int xPos, int yPos, Nodes nodes) {
        xPos += xCellOffset;
        yPos += yCellOffset;
        return nodes.getNode(typ, xPos , yPos);
    }
    
    public static Node[] getNodesForCell(int xPos, int yPos, Nodes nodes) {
        Node[] ret = new Node[4]; 
        for (int i = 0; i < Direction.values().length; i++) {
            ret[i] = Direction.values()[i].getNodeForCell(xPos, yPos, nodes);
        }
        return ret;
    }
    
    /**
     * @return the typ
     */
    public NodeTyp getTyp() {
        return typ;
    }

    public Node getXNodeForCell(int x, int y, Nodes nodes) {
        return nodes.getNode(NodeTyp.X, x+this.xCellOffset, y+this.yCellOffset);
    }

    public Node getYNodeForCell(int x, int y, Nodes nodes) {
        return nodes.getNode(NodeTyp.Y, x+this.xCellOffset, y+this.yCellOffset);
    }
}
