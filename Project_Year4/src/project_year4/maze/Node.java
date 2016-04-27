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
package project_year4.maze;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author L00131070
 */
public class Node implements Comparable<Node> {

    private double value = -1.0;
    private double heuristicValue = 0.0;
    private NodeDirection direction = NodeDirection.FORWARD;
    private NodeTyp typ = NodeTyp.X;
    private boolean wall = false;
    private int xPosition = 0;
    private int yPosition = 0;
    private Node parent = null;
    private Node[] forwardChildren = null;
    private Node[] reverseChildren = null;
    private NodeState state = NodeState.NORMAL;
    private int straightCount = 0;
    private ParentDirection parentDirection = ParentDirection.NONE;
    ArrayList<NodeListener> listeners = new ArrayList<>(10);

    public Node(NodeTyp typ, int xPosition, int yPosition) {
        this.typ = typ;
        this.xPosition = xPosition;
        this.yPosition = yPosition;

    }

    public void reset() {
        setStraightCount(0);
        setValue(-1.0);
        setDirection(NodeDirection.FORWARD);
        setState(NodeState.NORMAL);
        setParent(null);
    }

    public void init() {
        reset();
        setWall(false);
    }

    public void setState(NodeState state) {
        this.state = state;
        changedState();
    }

    public NodeState getState() {
        return state;
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

    protected void changedValue() {
        for (NodeListener listener : listeners) {
            listener.updateValue(String.format("<HTML>%.2f<BR/>%d/%C/%s<HTML>", getValue(), straightCount, getDirection().toString().charAt(0), parentDirection.getArrow()));

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
        if (direction != null && getDirection() != direction) {
            Node[] children = getChildren();
            for (Node child : Arrays.asList(children)) {
                if (child != null && child.getParent() == this) {
                    child.reset();
                }
            }
        }
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

    private void changedState() {
        for (NodeListener listener : listeners) {
            listener.updateState(state);
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

    /**
     * @return the parent
     */
    public Node getParent() {
        return parent;
    }

    /**
     * @param parent the parent to set
     */
    public void setParent(Node parent) {
        int parentDirectionIndex = -1;
        if (Arrays.asList(forwardChildren).contains(parent)) {
            this.setDirection(NodeDirection.REVERSE);
            parentDirectionIndex = Arrays.asList(forwardChildren).indexOf(parent);
        }
        if (Arrays.asList(reverseChildren).contains(parent)) {
            this.setDirection(NodeDirection.FORWARD);
            parentDirectionIndex = Arrays.asList(reverseChildren).indexOf(parent) + 3;
        }
        if (getTyp() == NodeTyp.Y) {
            parentDirectionIndex = parentDirectionIndex + 6;
        }
        if (parentDirectionIndex < 0 || parentDirectionIndex > 11 || parent == null) {
            parentDirection = ParentDirection.NONE;
        } else {
            parentDirection = ParentDirection.values()[parentDirectionIndex];
        }
//        System.out.println("index: "+parentDirectionIndex+" enum: "+parentDirection);
        if (parent != null && getTyp() == parent.getTyp()) {
            setStraightCount(parent.getStraightCount() + 1);
        } else {
            setStraightCount(0);
        }
        this.parent = parent;
        changedValue();
    }

    public String print() {
        return this.typ + ":" + this.xPosition + "/" + this.yPosition;
    }

    public String printData() {
        String ret = print() + "\nForwardChildren\n";
        for (Node child : forwardChildren) {
            if (child != null) {
                ret += child.print() + ", ";
            }
        }
        ret += "\nReverseChildren\n";
        for (Node child : reverseChildren) {
            if (child != null) {
                ret += child.print() + ", ";
            }
        }
        ret += "\n";
        return ret;
    }

    public int compare(Node o1, Node o2) {
        int ret = 0;
        if (o1.getHeuristicValue() < o2.getHeuristicValue()) {
            ret = -1;
        } else if (o1.getHeuristicValue() > o2.getHeuristicValue()) {
            ret = 1;
        }
        return ret;
    }

    @Override
    public int compareTo(Node o) {
        if (o == null) {
            return 1;
        }
        return compare(this, o);
    }

    public double getHeuristicValue() {
        return heuristicValue;
    }

    public void setHeuristicValue(double heuristicValue) {
        this.heuristicValue = heuristicValue;
        changedValue();

    }

    public int getStraightCount() {
        return straightCount;
    }

    public void setStraightCount(int straightCount) {
        this.straightCount = straightCount;
    }

}
