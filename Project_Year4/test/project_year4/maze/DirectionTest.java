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

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author L00131070
 */
public class DirectionTest extends TestCase {

    public DirectionTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(DirectionTest.class);
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
     * Test of values method, of class Direction.
     */
    public void testValues() {
        System.out.println("values");
        Direction[] expResult = {Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};
        Direction[] result = Direction.values();
        for (int i = 0; i < expResult.length; i++) {
            assertEquals(expResult[i], result[i]);
        }
    }

    /**
     * Test of valueOf method, of class Direction.
     */
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "NORTH";
        Direction expResult = Direction.NORTH;
        Direction result = Direction.valueOf(name);
        assertEquals(expResult, result);
    }

    /**
     * Test of getNodeForCell method, of class Direction.
     */
    public void testGetNodeForCell() {
        System.out.println("getNode");
        Maze maze = new Maze();
        Nodes nodes = maze.getNodes();
        int xPos = 0;
        int yPos = 0;
        Direction instance = Direction.NORTH;
        Node result = instance.getNodeForCell(xPos, yPos, nodes);
        assertTrue(result != null);
        instance = Direction.SOUTH;
        result = instance.getNodeForCell(xPos, yPos, nodes);
        assertTrue(result == null);
        instance = Direction.EAST;
        result = instance.getNodeForCell(xPos, yPos, nodes);
        assertTrue(result != null);
        instance = Direction.WEST;
        result = instance.getNodeForCell(xPos, yPos, nodes);
        assertTrue(result == null);
        xPos = 15;
        instance = Direction.NORTH;
        result = instance.getNodeForCell(xPos, yPos, nodes);
        assertTrue(result != null);
        instance = Direction.SOUTH;
        result = instance.getNodeForCell(xPos, yPos, nodes);
        assertTrue(result == null);
        instance = Direction.EAST;
        result = instance.getNodeForCell(xPos, yPos, nodes);
        assertTrue(result == null);
        instance = Direction.WEST;
        result = instance.getNodeForCell(xPos, yPos, nodes);
        assertTrue(result != null);
        yPos = 15;
        instance = Direction.NORTH;
        result = instance.getNodeForCell(xPos, yPos, nodes);
        assertTrue(result == null);
        instance = Direction.SOUTH;
        result = instance.getNodeForCell(xPos, yPos, nodes);
        assertTrue(result != null);
        instance = Direction.EAST;
        result = instance.getNodeForCell(xPos, yPos, nodes);
        assertTrue(result == null);
        instance = Direction.WEST;
        result = instance.getNodeForCell(xPos, yPos, nodes);
        assertTrue(result != null);
        xPos = 0;
        instance = Direction.NORTH;
        result = instance.getNodeForCell(xPos, yPos, nodes);
        assertTrue(result == null);
        instance = Direction.SOUTH;
        result = instance.getNodeForCell(xPos, yPos, nodes);
        assertTrue(result != null);
        instance = Direction.EAST;
        result = instance.getNodeForCell(xPos, yPos, nodes);
        assertTrue(result != null);
        instance = Direction.WEST;
        result = instance.getNodeForCell(xPos, yPos, nodes);
        assertTrue(result == null);
    }

    /**
     * Test of getTyp method, of class Direction.
     */
    public void testGetTyp() {
        System.out.println("getTyp");
        Direction instance = Direction.NORTH;
        NodeTyp expResult = NodeTyp.Y;
        NodeTyp result = instance.getTyp();
        assertEquals(expResult, result);
        instance = Direction.SOUTH;
        expResult = NodeTyp.Y;
        result = instance.getTyp();
        assertEquals(expResult, result);
        instance = Direction.EAST;
        expResult = NodeTyp.X;
        result = instance.getTyp();
        assertEquals(expResult, result);
        instance = Direction.WEST;
        expResult = NodeTyp.X;
        result = instance.getTyp();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNodesForCell method, of class Direction.
     */
    public void testGetNodesForCell() {
        System.out.println("getNodesForCell");
        Maze maze = new Maze();
        Nodes nodes = maze.getNodes();
        int xPos = 0;
        int yPos = 0;
        Node[] expResult = {nodes.getNode(NodeTyp.Y, xPos, yPos), nodes.getNode(NodeTyp.X, xPos, yPos), null, null};
        Node[] result = Direction.getNodesForCell(xPos, yPos, nodes);
        for (int i = 0; i < expResult.length; i++) {
            assertEquals(expResult[i], result[i]);
        }
    }

    /**
     * Test of getXNodeForCell method, of class Direction.
     */
    public void testGetXNodeForCell() {
        System.out.println("getXNodeForCell");
        Maze maze = new Maze();
        Nodes nodes = maze.getNodes();
        int x = 0;
        int y = 0;
        Direction instance = Direction.WEST;
        Node expResult = null;
        Node result = instance.getXNodeForCell(x, y, nodes);
        assertEquals(expResult, result);
   }

    /**
     * Test of getYNodeForCell method, of class Direction.
     */
    public void testGetYNodeForCell() {
        System.out.println("getYNodeForCell");
        Maze maze = new Maze();
        Nodes nodes = maze.getNodes();
        int x = 0;
        int y = 0;
        Direction instance = Direction.SOUTH;
        Node expResult = null;
        Node result = instance.getYNodeForCell(x, y, nodes);
        assertEquals(expResult, result);
    }

}
