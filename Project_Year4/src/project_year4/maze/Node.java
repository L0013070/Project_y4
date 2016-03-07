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
package project_year4.maze;

import java.util.ArrayList;

/**
 *
 * @author L00131070
 */
public class Node {

    private double value = 500.0;
    private NodeDirection direction = NodeDirection.FORWARD;
    private NodeTyp typ = NodeTyp.X;
    private boolean wall = false;
    private int xPosition = 0;
    private int yPosition = 0;
    private Node parent = null;
    private Node[] forwardChildren = null;
    private Node[] reverseChildren = null;

    ArrayList<NodeListener> listeners = new ArrayList<>(10);
    
    public Node(NodeTyp typ, int xPosition, int yPosition) {
        this.typ = typ;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        
    }
    
    /**
     *
     * @param listener
     * @return
     */
    public boolean addListener(NodeListener listener) {
        if (!listeners.contains(listener)) {
            return listeners.add(listener);
        }
        return false;
    }

    /**
     *
     * @param listener
     * @return
     */
    public boolean removeListeners(NodeListener listener) {
        return listeners.remove(listener);
    }

    /**
     *
     */
    protected void changedNode() {
        for (NodeListener listener : listeners) {
            listener.changedNode(this);
        }
    }

    /**
     *
     */
    protected void changedValue() {
        for (NodeListener listener : listeners) {
            listener.updateValue(String.format("%.2f", getValue()));
        }
    }

    /**
     *
     * @param value the value to set
     */
    public void setValue(double value) {
        this.value = value;
        changedValue();

    }

    /**
     * @return the value
     */
    public double getValue() {
        return value;
    }

    /**
     * @return the direction
     */
    public NodeDirection getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(NodeDirection direction) {
        this.direction = direction;
        changedDirection();
    }

    private void changedDirection() {
        for (NodeListener listener : listeners) {
            listener.updateDirection(direction);
        }
    }

    /**
     * @return the typ
     */
    public NodeTyp getTyp() {
        return typ;
    }

    /**
     * @param typ the typ to set
     */
    public void setTyp(NodeTyp typ) {
        this.typ = typ;
    }

    /**
     * @return the wall
     */
    public boolean isWall() {
        return wall;
    }

    /**
     * @param wall the wall to set
     */
    public void setWall(boolean wall) {
        this.wall = wall;
        changedWall();
    }

    private void changedWall() {
        for (NodeListener listener : listeners) {
            listener.updateWall(wall);
        }
    }

    /**
     * @return the forwardChildren
     */
    public Node[] getForwardChildren() {
        return forwardChildren;
    }

    /**
     * @param forwardChildren the forwardChildren to set
     */
    public void setForwardChildren(Node[] forwardChildren) {
        this.forwardChildren = forwardChildren;
    }

    /**
     * @return the reverseChildren
     */
    public Node[] getReverseChildren() {
        return reverseChildren;
    }

    /**
     * @param reverseChildren the reverseChildren to set
     */
    public void setReverseChildren(Node[] reverseChildren) {
        this.reverseChildren = reverseChildren;
    }

    /**
     * @return the xPosition
     */
    public int getxPosition() {
        return xPosition;
    }

    /**
     * @return the yPosition
     */
    public int getyPosition() {
        return yPosition;
    }

    public void initChildren(Nodes nodes) {
        NodeDirection.initChilden(this, nodes);
    }

    public Node[] getChildren() {
        Node[] children = null;
        if (direction != null) {
            if (direction == NodeDirection.FORWARD) {
                children = this.getForwardChildren();
            } else {
                children = this.getReverseChildren();
            }
        } else {
            children = new Node[3];
        }
        return children;
    }


}
