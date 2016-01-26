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
     * Test of setNodes method, of class MazeCell.
     */
    public void testSetNodes() {
        System.out.println("setNodes");
        Node east = new Node();
        Node west = new Node();
        Node north = new Node();
        Node south = new Node();
        MazeCell instance = new MazeCell(null, null, null, null);
        assertSame(instance.getEast(), null);
        assertSame(instance.getWest(), null);
        assertSame(instance.getNorth(), null);
        assertSame(instance.getSouth(), null);
        instance.setNodes(east, west, north, south);
        assertSame(instance.getEast(), east);
        assertSame(instance.getNorth(), north);
        assertSame(instance.getWest(), west);
        assertSame(instance.getSouth(), south);
    }

    /**
     * Test of getNodes method, of class MazeCell.
     */
    public void testGetNodes() {
        System.out.println("getNodes");
        Node east = new Node();
        Node west = new Node();
        Node north = new Node();
        Node south = new Node();
        MazeCell instance = new MazeCell(east, west, north, south);
        ArrayList<Node> expResult = new ArrayList<>(4);
        expResult.add(east);
        expResult.add(west);
        expResult.add(north);
        expResult.add(south);
        ArrayList<Node> result = instance.getNodes();
        for (int i=0; i < result.size(); i++)
            assertEquals(expResult.get(i), result.get(i));
    }

    /**
     * Test of getxNodePlus method, of class MazeCell.
     */
    public void testGetEast() {
        System.out.println("getxNodePlus");
        Node east = new Node();
        Node west = new Node();
        Node north = new Node();
        Node south = new Node();
        MazeCell instance = new MazeCell(east, west, north, south);
        Node expResult = east;
        Node result = instance.getEast();
        assertEquals(expResult, result);
    }

    /**
     * Test of setxNodePlus method, of class MazeCell.
     */
    public void testEast() {
        System.out.println("setxNodePlus");
        Node east = new Node();
        MazeCell instance = new MazeCell(null, null, null, null);
        instance.setNorth(east);
        assertSame(instance.getNorth(), east);
    }

    /**
     * Test of getxNodeNeg method, of class MazeCell.
     */
    public void testGetWest() {
        System.out.println("getxNodeNeg");
        Node east = new Node();
        Node west = new Node();
        Node north = new Node();
        Node south = new Node();
        MazeCell instance = new MazeCell(east, west, north, south);
        Node expResult = west;
        Node result = instance.getWest();
        assertEquals(expResult, result);
    }

    /**
     * Test of setxNodeNeg method, of class MazeCell.
     */
    public void testSetWest() {
        System.out.println("setxNodeNeg");
        Node node = new Node();
        MazeCell instance = new MazeCell(null, null, null, null);
        instance.setWest(node);
        assertSame(instance.getWest(), node);
    }

    /**
     * Test of getyNodePlus method, of class MazeCell.
     */
    public void testGetNorth() {
        System.out.println("getyNodePlus");
        Node east = new Node();
        Node west = new Node();
        Node north = new Node();
        Node south = new Node();
        MazeCell instance = new MazeCell(east, west, north, south);
        Node expResult = north;
        Node result = instance.getNorth();
        assertEquals(expResult, result);
    }

    /**
     * Test of setyNodePlus method, of class MazeCell.
     */
    public void testSetNorth() {
        System.out.println("setNorth");
        Node node = new Node();
        MazeCell instance = new MazeCell(null, null, node, null);
        instance.setNorth(node);
        assertSame(instance.getNorth(), node);
    }

    /**
     * Test of getyNodeNeg method, of class MazeCell.
     */
    public void testGetSouthg() {
        System.out.println("getSouth");
        Node east = new Node();
        Node west = new Node();
        Node north = new Node();
        Node south = new Node();
        MazeCell instance = new MazeCell(east, west, north, south);
        Node expResult = south;
        Node result = instance.getSouth();
        assertEquals(expResult, result);
    }

    /**
     * Test of setyNodeNeg method, of class MazeCell.
     */
    public void testSetSouth() {
        System.out.println("setSouth");
        Node node = new Node();
        MazeCell instance = new MazeCell(null, null, null, node);
        instance.setSouth(node);
        assertSame(instance.getSouth(), node);
    }

}
