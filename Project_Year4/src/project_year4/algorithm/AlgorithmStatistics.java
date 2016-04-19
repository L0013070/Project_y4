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
package project_year4.algorithm;

/**
 *
 * @author L00131070
 */
public class AlgorithmStatistics {
    
    private int openedNodes;
    private int closedNodes;
    private int reopenedNodes;
    private double pathLength;

    public void reset() {
        openedNodes = 0;
        closedNodes = 0;
        reopenedNodes = 0;
        setPathLength(0.0);
    }
    
    /**
     * @return the openedNodes
     */
    public int getOpenedNodes() {
        return openedNodes;
    }

    /**
     * @param openedNodes the openedNodes to set
     */
    public void setOpenedNodes(int openedNodes) {
        this.openedNodes = openedNodes;
    }
    
    public void incrementOpenedNodes() {
        openedNodes++;
    }

    /**
     * @return the closedNodes
     */
    public int getClosedNodes() {
        return closedNodes;
    }

    /**
     * @param closedNodes the closedNodes to set
     */
    public void setClosedNodes(int closedNodes) {
        this.closedNodes = closedNodes;
    }

    public void incrementClosedNodes() {
        closedNodes++;
    }

    /**
     * @return the reopenedNodes
     */
    public int getReopenedNodes() {
        return reopenedNodes;
    }

    /**
     * @param reopenedNodes the reopenedNodes to set
     */
    public void setReopenedNodes(int reopenedNodes) {
        this.reopenedNodes = reopenedNodes;
    }
    
    public void incrementReopenedNodes() {
        reopenedNodes++;
    }

    @Override
    public String toString() {
        return "opened: "+openedNodes+" closed: "+closedNodes+" reopened: "+reopenedNodes+" Path length: "+pathLength;
    }

    /**
     * @return the pathLength
     */
    public double getPathLength() {
        return pathLength;
    }

    /**
     * @param pathLength the pathLength to set
     */
    public void setPathLength(double pathLength) {
        this.pathLength = pathLength;
    }
    
}
