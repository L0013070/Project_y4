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
package project_year4.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import project_year4.maze.Node;
import project_year4.maze.NodeListener;

/**
 *
 * @author L00131070
 */
public class DisplayNode extends DisplayMazeElement implements NodeListener {

    public enum NodeTyp {

        X,
        Y;
    }

    public NodeTyp typ = NodeTyp.X;

    public DisplayNode(String text, NodeTyp typ) {
        super(text);
        this.typ = typ;
        this.setOpaque(false);
        this.setForeground(Color.red);
        setFont(new Font("Courier New", Font.BOLD, 12));
    }

    @Override
    public void changedNode(Node node) {
        // TODO Auto-generated method stub
    }
/*
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Dimension size = getSize();
        System.out.print("size: "+size);
        System.out.println(" typ: "+typ);
            g2d.setColor(Color.LIGHT_GRAY);
        if (typ == NodeTyp.X) {
            g2d.fillRect(size.width / 2 - 2, 2, 8, size.height-2);
        } else {
            g2d.fillRect(2, size.height / 2 - 2, size.width-2, 8);
        }
        super.paint(g);
    }
    */
}
