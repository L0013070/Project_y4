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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import project_year4.maze.NodeTyp;

/**
 *
 * @author L00131070
 */
public class DisplayNodePopUpMenu extends JPopupMenu implements ActionListener{

    private static DisplayNodePopUpMenu menu = new DisplayNodePopUpMenu();
    
    public DisplayNodePopUpMenu(String label) {
        super(label);
    }

    public DisplayNodePopUpMenu() {
        JMenuItem item = new JMenuItem("Make Wall");
        item.addActionListener(this);
        add(item);
        item = new JMenuItem("Make X");
        item.addActionListener(this);
        add(item);
        item = new JMenuItem("Make Y");
        item.addActionListener(this);
        add(item);
    }
    
    public static DisplayNodePopUpMenu getMenu() {
        return menu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DisplayNode node = (DisplayNode) getInvoker();
        if (e.getActionCommand().equals("Make Wall")) {
            ((DisplayNode) getInvoker()).setTyp(NodeTyp.WALL);
            ((DisplayNode) getInvoker()).setText("");
            getInvoker().repaint();
        }
        if (e.getActionCommand().equals("Make X")) {
            ((DisplayNode) getInvoker()).setTyp(NodeTyp.X);
            ((DisplayNode) getInvoker()).setText("-1.00");
            getInvoker().repaint();
        }
        if (e.getActionCommand().equals("Make Y")) {
            ((DisplayNode) getInvoker()).setTyp(NodeTyp.Y);
            ((DisplayNode) getInvoker()).setText("-1.00");
            getInvoker().repaint();
        }
    }

}
