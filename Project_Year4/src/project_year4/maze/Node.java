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
    
    private double value = -1.00;
    private NodeDirection direction = NodeDirection.WALL;

    ArrayList<NodeListener> listeners = new ArrayList<>(10);

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
    public void setValue(double value){
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
    }

}
