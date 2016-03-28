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
import project_year4.gui.DisplayNode;

/**
 *
 * @author L00131070
 */
public class NodeTest extends TestCase {

    public NodeTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(NodeTest.class);
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
     * Test of addListener method, of class Node.
     */
    public void testAddListener() {
        System.out.println("addListener");
        NodeListener listener = new DisplayNode("", NodeTyp.X);
        Node instance = new Node(NodeTyp.X, 4, 4);
        boolean expResult = true;
        boolean result = instance.addListener(listener);
        assertEquals(expResult, result);
        expResult = false;
        result = instance.addListener(listener);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeListeners method, of class Node.
     */
    public void testRemoveListeners() {
        System.out.println("removeListeners");
        NodeListener listener = null;
        Node instance = null;
        boolean expResult = false;
        boolean result = instance.removeListeners(listener);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changedNode method, of class Node.
     */
    public void testChangedNode() {
        System.out.println("changedNode");
        Node instance = null;
        instance.changedNode();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changedValue method, of class Node.
     */
    public void testChangedValue() {
        System.out.println("changedValue");
        Node instance = null;
        instance.changedValue();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class Node.
     */
    public void testSetValue() {
        System.out.println("setValue");
        double value = 0.0;
        Node instance = null;
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class Node.
     */
    public void testGetValue() {
        System.out.println("getValue");
        Node instance = null;
        double expResult = 0.0;
        double result = instance.getValue();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDirection method, of class Node.
     */
    public void testGetDirection() {
        System.out.println("getDirection");
        Node instance = null;
        NodeDirection expResult = null;
        NodeDirection result = instance.getDirection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDirection method, of class Node.
     */
    public void testSetDirection() {
        System.out.println("setDirection");
        NodeDirection direction = null;
        Node instance = null;
        instance.setDirection(direction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTyp method, of class Node.
     */
    public void testGetTyp() {
        System.out.println("getTyp");
        Node instance = null;
        NodeTyp expResult = null;
        NodeTyp result = instance.getTyp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTyp method, of class Node.
     */
    public void testSetTyp() {
        System.out.println("setTyp");
        NodeTyp typ = null;
        Node instance = null;
        instance.setTyp(typ);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isWall method, of class Node.
     */
    public void testIsWall() {
        System.out.println("isWall");
        Node instance = null;
        boolean expResult = false;
        boolean result = instance.isWall();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWall method, of class Node.
     */
    public void testSetWall() {
        System.out.println("setWall");
        boolean wall = false;
        Node instance = null;
        instance.setWall(wall);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getForwardChildren method, of class Node.
     */
    public void testGetForwardChildren() {
        System.out.println("getForwardChildren");
        Node instance = null;
        Node[] expResult = null;
        Node[] result = instance.getForwardChildren();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setForwardChildren method, of class Node.
     */
    public void testSetForwardChildren() {
        System.out.println("setForwardChildren");
        Node[] forwardChildren = null;
        Node instance = null;
        instance.setForwardChildren(forwardChildren);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReverseChildren method, of class Node.
     */
    public void testGetReverseChildren() {
        System.out.println("getReverseChildren");
        Node instance = null;
        Node[] expResult = null;
        Node[] result = instance.getReverseChildren();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReverseChildren method, of class Node.
     */
    public void testSetReverseChildren() {
        System.out.println("setReverseChildren");
        Node[] reverseChildren = null;
        Node instance = null;
        instance.setReverseChildren(reverseChildren);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getxPosition method, of class Node.
     */
    public void testGetxPosition() {
        System.out.println("getxPosition");
        Node instance = null;
        int expResult = 0;
        int result = instance.getxPosition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getyPosition method, of class Node.
     */
    public void testGetyPosition() {
        System.out.println("getyPosition");
        Node instance = null;
        int expResult = 0;
        int result = instance.getyPosition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initChildren method, of class Node.
     */
    public void testInitChildren() {
        System.out.println("initChildren");
        Maze maze = new Maze();
        Nodes nodes = maze.getNodes();
        Node instance = nodes.getNode(NodeTyp.X, 0, 0);
        instance.initChildren(nodes);
        instance.setDirection(NodeDirection.FORWARD);
        Node[] children = instance.getChildren();
        for (Node node : children) {
            if (node != null) {
                System.out.println(node.toString());
            } else {
                System.out.println(node);
            }
        }

    }

    /**
     * Test of setState method, of class Node.
     */
    public void testSetState() {
        System.out.println("setState");
        NodeState state = null;
        Node instance = null;
        instance.setState(state);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getState method, of class Node.
     */
    public void testGetState() {
        System.out.println("getState");
        Node instance = null;
        NodeState expResult = null;
        NodeState result = instance.getState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChildren method, of class Node.
     */
    public void testGetChildren() {
        System.out.println("getChildren");
        Node instance = null;
        Node[] expResult = null;
        Node[] result = instance.getChildren();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParent method, of class Node.
     */
    public void testGetParent() {
        System.out.println("getParent");
        Node instance = null;
        Node expResult = null;
        Node result = instance.getParent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParent method, of class Node.
     */
    public void testSetParent() {
        System.out.println("setParent");
        Node parent = null;
        Node instance = null;
        instance.setParent(parent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class Node.
     */
    public void testPrint() {
        System.out.println("print");
        Node instance = null;
        String expResult = "";
        String result = instance.print();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printData method, of class Node.
     */
    public void testPrintData() {
        System.out.println("printData");
        Node instance = null;
        String expResult = "";
        String result = instance.printData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compare method, of class Node.
     */
    public void testCompare() {
        System.out.println("compare");
        Node o1 = null;
        Node o2 = null;
        Node instance = null;
        int expResult = 0;
        int result = instance.compare(o1, o2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Node.
     */
    public void testCompareTo() {
        System.out.println("compareTo");
        Node o = null;
        Node instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeuristicValue method, of class Node.
     */
    public void testGetHeuristicValue() {
        System.out.println("getHeuristicValue");
        Node instance = null;
        double expResult = 0.0;
        double result = instance.getHeuristicValue();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHeuristicValue method, of class Node.
     */
    public void testSetHeuristicValue() {
        System.out.println("setHeuristicValue");
        double heuristicValue = 0.0;
        Node instance = null;
        instance.setHeuristicValue(heuristicValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
