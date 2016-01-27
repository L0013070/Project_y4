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
import project_year4.maze.MazeCell;
import project_year4.maze.MazeCellListener;


/**
 *
 * @author L00131070
 */
public class DisplayGridCell extends DisplayMazeElement  implements MazeCellListener{

    public DisplayGridCell(String text) {
        super(text);
        setBackground(Color.LIGHT_GRAY);
    }

    @Override
    public void changedMazeCell(MazeCell maze) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
