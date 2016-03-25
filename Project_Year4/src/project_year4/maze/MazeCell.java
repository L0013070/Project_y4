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

import java.util.ArrayList;

/**
 *
 * @author L00131070
 */
public class MazeCell {

    private ArrayList<MazeCellListener> listeners = new ArrayList<>(10);
    private int xPos = -1;
    private int yPos = -1;
    private Maze maze = null;
    private MazeCellState state = MazeCellState.NORMAL;

    public MazeCell(Maze maze, int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.maze = maze;
    }

    /**
     * @return the xPos
     */
    public int getxPos() {
        return xPos;
    }

    /**
     * @param xPos the xPos to set
     */
    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    /**
     * @return the yPos
     */
    public int getyPos() {
        return yPos;
    }

    /**
     * @param yPos the yPos to set
     */
    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public boolean addListener(MazeCellListener listener) {
        if (!listeners.contains(listener)) {
            boolean ret = listeners.add(listener);
            changedCell();
            return ret;
        }
        return false;
    }

    public boolean removeListeners(MazeCellListener listener) {
        return listeners.remove(listener);
    }

    public Node[] getNodes() {
        return Direction.getNodesForCell(xPos, yPos, maze.getNodes());
    }

    public void setWalls(int walls) {
        Node[] nodes = Direction.getNodesForCell(xPos, yPos, maze.getNodes());
        if (walls > 0) {
            if ((walls & 0x01) > 0 && nodes[Direction.NORTH.ordinal()] != null) {
                nodes[Direction.NORTH.ordinal()].setWall(true);
            }
            if ((walls & 0x02) > 0 && nodes[Direction.EAST.ordinal()] != null) {
                nodes[Direction.EAST.ordinal()].setWall(true);
            }
            if ((walls & 0x04) > 0 && nodes[Direction.SOUTH.ordinal()] != null) {
                nodes[Direction.SOUTH.ordinal()].setWall(true);
            }
            if ((walls & 0x08) > 0 && nodes[Direction.WEST.ordinal()] != null) {
                nodes[Direction.WEST.ordinal()].setWall(true);
            }
        } else {
            for (Node node : nodes) {
                if (node != null) {
                    node.setDirection(NodeDirection.FORWARD);
                }
            }
        }
    }
    
    public MazeCellState getState() {
        return state;
    }

    public void setState(MazeCellState state) {
        this.state = state;
        changedCell();
    }
    
    public void changedCell() {
        for (MazeCellListener listener : listeners) {
            listener.changedMazeCell(this);
        }
    }

}
