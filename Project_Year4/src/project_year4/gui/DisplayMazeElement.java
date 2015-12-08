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
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author L00131070
 */
public class DisplayMazeElement extends JLabel{
    
    public final static byte CELLSIZE = 50;
    
   
    public DisplayMazeElement(String text) {
        super();
        this.setPreferredSize(new Dimension(CELLSIZE,CELLSIZE));
        setSize(CELLSIZE,CELLSIZE);
        setOpaque(true);
        setHorizontalAlignment(SwingConstants.CENTER);
        setFont(new Font("Courier New",Font.BOLD,9));
        setText(text);
        setBackground(Color.WHITE);
//        this.setOpaque(false);
    }
    
}
