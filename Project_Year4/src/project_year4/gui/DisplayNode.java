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
package project_year4.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseListener;
import project_year4.maze.Node;
import project_year4.maze.NodeDirection;
import project_year4.maze.NodeListener;
import project_year4.maze.NodeState;
import project_year4.maze.NodeTyp;

/**
 *
 * @author L00131070
 */
public class DisplayNode extends DisplayMazeElement implements NodeListener {

    private NodeTyp typ = NodeTyp.X;
    private NodeDirection direction = NodeDirection.FORWARD;
    private boolean wall = false;
    private String value;
    private NodeState state = NodeState.NORMAL;

    public DisplayNode(String text, NodeTyp typ) {
        super(text);
        this.typ = typ;
        this.setOpaque(false);
        this.setForeground(Color.BLACK);
        setFont(new Font("Courier New", Font.BOLD, 10));
        this.setComponentPopupMenu(DisplayNodePopUpMenu.getMenu());
    }

    @Override
    public void changedNode(Node node) {
        // TODO Auto-generated method stub
    }

    @Override
    public void updateValue(String value) {
        this.value = value;
        setText(value);
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Dimension size = getSize();
        if (isWall()) {
            g2d.setColor(Color.BLACK);
        } else {
            g2d.setColor(state.getColor());
        }
        if (getTyp() == NodeTyp.X) {
            g2d.fillRect(size.width / 2 - 1, 1, 2, size.height - 2);
        } else if (getTyp() == NodeTyp.Y) {
            g2d.fillRect(1, size.height / 2 - 1, size.width - 2, 2);
        }
        super.paint(g);
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
     * @return the direction
     */
    public NodeDirection getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(NodeDirection direction) {
        if (this.direction != direction) {
            this.direction = direction;
            repaint();
        }
    }

    @Override
    public void updateDirection(NodeDirection direction) {
        setDirection(direction);
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
        if (wall) {
            setText("");
        }
        repaint();
    }

    @Override
    public void updateWall(boolean wall) {
        setWall(wall);
    }

    @Override
    public void updateState(NodeState state) {
        this.state = state;
        repaint();
    }

}
