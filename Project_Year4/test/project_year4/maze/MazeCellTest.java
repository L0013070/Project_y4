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
package project_year4.maze;

import java.util.ArrayList;
import javax.swing.text.Position;
import junit.framework.TestCase;

/**
 *
 * @author L00131070
 */
public class MazeCellTest extends TestCase {

    public MazeCellTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getxPos method, of class MazeCell.
     */
    public void testGetxPos() {
        System.out.println("getxPos");
        MazeCell instance = new MazeCell(10, 20);
        int expResult = 10;
        int result = instance.getxPos();
        assertEquals(expResult, result);
    }

    /**
     * Test of setxPos method, of class MazeCell.
     */
    public void testSetxPos() {
        System.out.println("setxPos");
        int xPos = 10;
        MazeCell instance = new MazeCell(0, 20);
        instance.setxPos(xPos);
        int result = instance.getxPos();
        assertEquals(xPos, result);
    }

    /**
     * Test of getyPos method, of class MazeCell.
     */
    public void testGetyPos() {
        System.out.println("getyPos");
        int yPos = 20;
        MazeCell instance = new MazeCell(10,yPos);
        int result = instance.getyPos();
        assertEquals(yPos, result);
    }

    /**
     * Test of setyPos method, of class MazeCell.
     */
    public void testSetyPos() {
        System.out.println("setyPos");
        int yPos = 20;
        MazeCell instance = new MazeCell(10,0);
        instance.setxPos(yPos);
        int result = instance.getxPos();
        assertEquals(yPos, result);
    }

}
