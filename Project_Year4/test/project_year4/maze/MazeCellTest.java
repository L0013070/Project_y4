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
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import project_year4.gui.DisplayGridCell;

/**
 *
 * @author L00131070
 */
public class MazeCellTest extends TestCase {

    public MazeCellTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(MazeCellTest.class);
        return suite;
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
        Maze maze = new Maze();
        MazeCell instance = new MazeCell(maze, 10, 20);
        int expResult = 10;
        int result = instance.getxPos();
        assertEquals(expResult, result);
    }

    /**
     * Test of setxPos method, of class MazeCell.
     */
    public void testSetxPos() {
        System.out.println("setxPos");
        Maze maze = new Maze();
        int xPos = 10;
        MazeCell instance = new MazeCell(maze, 0, 20);
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
        Maze maze = new Maze();
        MazeCell instance = new MazeCell(maze, 10, yPos);
        int result = instance.getyPos();
        assertEquals(yPos, result);
    }

    /**
     * Test of setyPos method, of class MazeCell.
     */
    public void testSetyPos() {
        System.out.println("setyPos");
        int yPos = 20;
        Maze maze = new Maze();
        MazeCell instance = new MazeCell(maze, 10, 0);
        instance.setxPos(yPos);
        int result = instance.getxPos();
        assertEquals(yPos, result);
    }

    /**
     * Test of addListener method, of class MazeCell.
     */
    public void testAddListener() {
        System.out.println("addListener");
        Maze maze = new Maze();
        MazeCellListener listener = new DisplayGridCell("");
        MazeCell instance = new MazeCell(maze, 0, 0);
        boolean expResult = true;
        boolean result = instance.addListener(listener);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeListeners method, of class MazeCell.
     */
    public void testRemoveListeners() {
        System.out.println("removeListeners");
        Maze maze = new Maze();
        MazeCellListener listener = new DisplayGridCell("");
        MazeCell instance = new MazeCell(maze, 0, 0);
        boolean expResult = false;
        boolean result = instance.removeListeners(listener);
        assertEquals(expResult, result);
    }

    /**
     * Test of getNodes method, of class MazeCell.
     */
    public void testGetNodes() {
        System.out.println("getNodes");
        Maze maze = new Maze();
        MazeCell instance = new MazeCell(maze, 0, 0);
        Node[] result = instance.getNodes();
        for (int i = 0; i < result.length; i++) {
            if (3 == i || 2 == i) {
                assertNull(result[i]);
            } else {
                assertNotNull(result[i]);
            }
        }
    }

    /**
     * Test of setWalls method, of class MazeCell.
     */
    public void testSetWalls() {
        System.out.println("setWalls");
        Maze maze = new Maze();
        int walls = 1;
        MazeCell instance = maze.getMazeCell(0, 0);
        assertFalse(Direction.NORTH.getNodeForCell(0,0, maze.getNodes()).isWall());
        instance.setWalls(walls);
        assertTrue(Direction.NORTH.getNodeForCell(0,0, maze.getNodes()).isWall());
    }

    /**
     * Test of getState method, of class MazeCell.
     */
    public void testGetState() {
        System.out.println("getState");
        MazeCell instance = null;
        MazeCellState expResult = null;
        MazeCellState result = instance.getState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setState method, of class MazeCell.
     */
    public void testSetState() {
        System.out.println("setState");
        MazeCellState state = null;
        MazeCell instance = null;
        instance.setState(state);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changedCell method, of class MazeCell.
     */
    public void testChangedCell() {
        System.out.println("changedCell");
        MazeCell instance = null;
        instance.changedCell();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
