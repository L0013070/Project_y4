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

    private Node east;
    private Node west;
    private Node north;
    private Node south;

    public MazeCell(Node east, Node west, Node north, Node south) {
        setNodes(east, west, north, south);
    }

    /**
     * @return the east
     */
    public Node getEast() {
        return east;
    }

    /**
     * @param north the east to set
     */
    public void setEast(Node east) {
        this.east = east;
    }

    /**
     * @return the west
     */
    public Node getWest() {
        return west;
    }

    /**
     * @param west the west to set
     */
    public void setWest(Node west) {
        this.west = west;
    }

    /**
     * @return the north
     */
    public Node getNorth() {
        return north;
    }

    /**
     * @param north the north to set
     */
    public void setNorth(Node north) {
        this.north = north;
    }

    /**
     * @return the south
     */
    public Node getSouth() {
        return south;
    }

    /**
     * @param south the south to set
     */
    public void setSouth(Node south) {
        this.south = south;
    }

    
    public void setNodes(Node east, Node west, Node north, Node south) {
        this.setEast(east);
        this.setWest(west);
        this.setNorth(north);
        this.setSouth(south);
    }

    public ArrayList<Node> getNodes() {
        ArrayList<Node> nodes = new ArrayList<>(4);
        nodes.add(getEast());
        nodes.add(getWest());
        nodes.add(getNorth());
        nodes.add(getSouth());
        return nodes;
    }
}
