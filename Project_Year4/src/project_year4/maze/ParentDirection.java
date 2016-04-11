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

/**
 *
 * @author Dietmar
 */
public enum ParentDirection {
    XR0 ("ru"),
    XR1 ("r"),
    XR2 ("rd"),
    XF0 ("lu"),
    XF1 ("l"),
    XF2 ("ld"),
    YR0 ("ul"),
    YR1 ("u"),
    YR2 ("ur"),
    YF0 ("dr"),
    YF1 ("d"),
    YF2 ("dl"),
    NONE ("");
    
    private final String arrow;
    
    private ParentDirection(String arrow) {
        this.arrow = arrow;
    }

    public String getArrow() {
        return arrow;
    }
}
