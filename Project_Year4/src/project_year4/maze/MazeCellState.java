/*
 * Copyright (C) 2016 Dietmar.
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

import java.awt.Color;


/**
 *
 * @author Dietmar
 */
public enum MazeCellState {
    
    NORMAL (Color.WHITE),
    START (Color.GREEN),
    GOAL (Color.RED);
    
    private Color color = Color.WHITE;
    
    private MazeCellState(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
    
    
}
