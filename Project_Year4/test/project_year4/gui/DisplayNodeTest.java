/*
 * Copyright (C) 2016 L00131070@student.lyit.ie.
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

import java.awt.Graphics;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import project_year4.maze.Node;
import project_year4.maze.NodeDirection;
import project_year4.maze.NodeState;
import project_year4.maze.NodeTyp;

/**
 *
 * @author L00131070@student.lyit.ie
 */
public class DisplayNodeTest extends TestCase {
    
    public DisplayNodeTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(DisplayNodeTest.class);
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
     * Test of changedNode method, of class DisplayNode.
     */
    public void testChangedNode() {
        System.out.println("changedNode");
        Node node = null;
        DisplayNode instance = null;
        instance.changedNode(node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateValue method, of class DisplayNode.
     */
    public void testUpdateValue() {
        System.out.println("updateValue");
        String value = "";
        DisplayNode instance = null;
        instance.updateValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paint method, of class DisplayNode.
     */
    public void testPaint() {
        System.out.println("paint");
        Graphics g = null;
        DisplayNode instance = null;
        instance.paint(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTyp method, of class DisplayNode.
     */
    public void testGetTyp() {
        System.out.println("getTyp");
        DisplayNode instance = null;
        NodeTyp expResult = null;
        NodeTyp result = instance.getTyp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTyp method, of class DisplayNode.
     */
    public void testSetTyp() {
        System.out.println("setTyp");
        NodeTyp typ = null;
        DisplayNode instance = null;
        instance.setTyp(typ);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDirection method, of class DisplayNode.
     */
    public void testGetDirection() {
        System.out.println("getDirection");
        DisplayNode instance = null;
        NodeDirection expResult = null;
        NodeDirection result = instance.getDirection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDirection method, of class DisplayNode.
     */
    public void testSetDirection() {
        System.out.println("setDirection");
        NodeDirection direction = null;
        DisplayNode instance = null;
        instance.setDirection(direction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDirection method, of class DisplayNode.
     */
    public void testUpdateDirection() {
        System.out.println("updateDirection");
        NodeDirection direction = null;
        DisplayNode instance = null;
        instance.updateDirection(direction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isWall method, of class DisplayNode.
     */
    public void testIsWall() {
        System.out.println("isWall");
        DisplayNode instance = null;
        boolean expResult = false;
        boolean result = instance.isWall();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWall method, of class DisplayNode.
     */
    public void testSetWall() {
        System.out.println("setWall");
        boolean wall = false;
        DisplayNode instance = null;
        instance.setWall(wall);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWall method, of class DisplayNode.
     */
    public void testUpdateWall() {
        System.out.println("updateWall");
        boolean wall = false;
        DisplayNode instance = null;
        instance.updateWall(wall);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateState method, of class DisplayNode.
     */
    public void testUpdateState() {
        System.out.println("updateState");
        NodeState state = null;
        DisplayNode instance = null;
        instance.updateState(state);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
