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

    private Node xNodePlus;
    private Node xNodeNeg;
    private Node yNodePlus;
    private Node yNodeNeg;

    public MazeCell(Node xPlus, Node xNeg, Node yPlus, Node yNeg) {
        setNodes(xPlus, xNeg, yPlus, yNeg);
    }

    /**
     * @return the xNodePlus
     */
    public Node getxNodePlus() {
        return xNodePlus;
    }

    /**
     * @param xNodePlus the xNodePlus to set
     */
    public void setxNodePlus(Node xNodePlus) {
        this.xNodePlus = xNodePlus;
    }

    /**
     * @return the xNodeNeg
     */
    public Node getxNodeNeg() {
        return xNodeNeg;
    }

    /**
     * @param xNodeNeg the xNodeNeg to set
     */
    public void setxNodeNeg(Node xNodeNeg) {
        this.xNodeNeg = xNodeNeg;
    }

    /**
     * @return the yNodePlus
     */
    public Node getyNodePlus() {
        return yNodePlus;
    }

    /**
     * @param yNodePlus the yNodePlus to set
     */
    public void setyNodePlus(Node yNodePlus) {
        this.yNodePlus = yNodePlus;
    }

    /**
     * @return the yNodeNeg
     */
    public Node getyNodeNeg() {
        return yNodeNeg;
    }

    /**
     * @param yNodeNeg the yNodeNeg to set
     */
    public void setyNodeNeg(Node yNodeNeg) {
        this.yNodeNeg = yNodeNeg;
    }

    
    public void setNodes(Node xPlus, Node xNeg, Node yPlus, Node yNeg) {
        this.setxNodePlus(xPlus);
        this.setxNodeNeg(xNeg);
        this.setyNodePlus(yPlus);
        this.setyNodeNeg(yNeg);
    }

    public ArrayList<Node> getNodes() {
        ArrayList<Node> nodes = new ArrayList<>(4);
        nodes.add(getxNodePlus());
        nodes.add(getxNodeNeg());
        nodes.add(getyNodePlus());
        nodes.add(getyNodeNeg());
        return nodes;
    }
}
