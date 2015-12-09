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
import java.awt.event.MouseListener;
import project_year4.maze.Node;
import project_year4.maze.NodeListener;
import project_year4.maze.NodeTyp;

/**
 *
 * @author L00131070
 */
public class DisplayNode extends DisplayMazeElement implements NodeListener {

    public NodeTyp typ = NodeTyp.X;

    public DisplayNode(String text, NodeTyp typ) {
        super(text);
        this.typ = typ;
        this.setOpaque(false);
        this.setForeground(Color.red);
        setFont(new Font("Courier New", Font.BOLD, 10));
        this.setComponentPopupMenu(new DisplayNodePopUpMenu());
    }

    @Override
    public void changedNode(Node node) {
        // TODO Auto-generated method stub
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Dimension size = getSize();
        System.out.print("size: "+size);
        System.out.println(" typ: "+typ);
        if (typ == NodeTyp.X) {
            g2d.setColor(Color.GREEN);
            g2d.fillRect(size.width / 2 - 1, 1,2, size.height-2);
        } else if (typ == NodeTyp.Y){
            g2d.setColor(Color.YELLOW);
            g2d.fillRect(1, size.height / 2 - 1, size.width-2, 2);
        }
        super.paint(g);
    }
    
}
