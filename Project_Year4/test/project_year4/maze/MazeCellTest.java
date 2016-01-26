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
        Node xPlus = new Node();
        Node xNeg = new Node();
        Node yPlus = new Node();
        Node yNeg = new Node();
        MazeCell instance = new MazeCell(null, null, null, null);
        assertSame(instance.getxNodePlus(), null);
        assertSame(instance.getyNodePlus(), null);
        assertSame(instance.getxNodeNeg(), null);
        assertSame(instance.getxNodeNeg(), null);
        instance.setNodes(xPlus, xNeg, yPlus, yNeg);
        assertSame(instance.getxNodePlus(), xPlus);
        assertSame(instance.getyNodePlus(), yPlus);
        assertSame(instance.getxNodeNeg(), xNeg);
        assertSame(instance.getyNodeNeg(), yNeg);
    }

    /**
     * Test of getNodes method, of class MazeCell.
     */
    public void testGetNodes() {
        System.out.println("getNodes");
        Node xPlus = new Node();
        Node xNeg = new Node();
        Node yPlus = new Node();
        Node yNeg = new Node();
        MazeCell instance = new MazeCell(xPlus, xNeg, yPlus, yNeg);
        ArrayList<Node> expResult = new ArrayList<>(4);
        expResult.add(xPlus);
        expResult.add(xNeg);
        expResult.add(yPlus);
        expResult.add(yNeg);
        ArrayList<Node> result = instance.getNodes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getxNodePlus method, of class MazeCell.
     */
    public void testGetxNodePlus() {
        System.out.println("getxNodePlus");
        Node xPlus = new Node();
        Node xNeg = new Node();
        Node yPlus = new Node();
        Node yNeg = new Node();
        MazeCell instance = new MazeCell(xPlus, xNeg, yPlus, yNeg);
        Node expResult = xPlus;
        Node result = instance.getxNodePlus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setxNodePlus method, of class MazeCell.
     */
    public void testSetxNodePlus() {
        System.out.println("setxNodePlus");
        Node xNodePlus = new Node();
        MazeCell instance = new MazeCell(xNodePlus, null, null, null);
        instance.setxNodePlus(xNodePlus);
        assertSame(instance.getxNodePlus(), xNodePlus);
    }

    /**
     * Test of getxNodeNeg method, of class MazeCell.
     */
    public void testGetxNodeNeg() {
        System.out.println("getxNodeNeg");
        Node xPlus = new Node();
        Node xNeg = new Node();
        Node yPlus = new Node();
        Node yNeg = new Node();
        MazeCell instance = new MazeCell(xPlus, xNeg, yPlus, yNeg);
        Node expResult = xNeg;
        Node result = instance.getxNodeNeg();
        assertEquals(expResult, result);
    }

    /**
     * Test of setxNodeNeg method, of class MazeCell.
     */
    public void testSetxNodeNeg() {
        System.out.println("setxNodeNeg");
        Node node = new Node();
        MazeCell instance = new MazeCell(null, node, null, null);
        instance.setxNodePlus(node);
        assertSame(instance.getxNodeNeg(), node);
    }

    /**
     * Test of getyNodePlus method, of class MazeCell.
     */
    public void testGetyNodePlus() {
        System.out.println("getyNodePlus");
        Node xPlus = new Node();
        Node xNeg = new Node();
        Node yPlus = new Node();
        Node yNeg = new Node();
        MazeCell instance = new MazeCell(xPlus, xNeg, yPlus, yNeg);
        Node expResult = yPlus;
        Node result = instance.getyNodePlus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setyNodePlus method, of class MazeCell.
     */
    public void testSetyNodePlus() {
        System.out.println("setyNodePlus");
        Node node = new Node();
        MazeCell instance = new MazeCell(null, null, node, null);
        instance.setyNodePlus(node);
        assertSame(instance.getyNodePlus(), node);
    }

    /**
     * Test of getyNodeNeg method, of class MazeCell.
     */
    public void testGetyNodeNeg() {
        System.out.println("getyNodeNeg");
        Node xPlus = new Node();
        Node xNeg = new Node();
        Node yPlus = new Node();
        Node yNeg = new Node();
        MazeCell instance = new MazeCell(xPlus, xNeg, yPlus, yNeg);
        Node expResult = yNeg;
        Node result = instance.getyNodeNeg();
        assertEquals(expResult, result);
    }

    /**
     * Test of setyNodeNeg method, of class MazeCell.
     */
    public void testSetyNodeNeg() {
        System.out.println("setyNodeNeg");
        Node node = new Node();
        MazeCell instance = new MazeCell(null, null, null, node);
        instance.setyNodeNeg(node);
        assertSame(instance.getyNodeNeg(), node);
    }

}
