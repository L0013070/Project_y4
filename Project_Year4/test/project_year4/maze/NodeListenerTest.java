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
public class NodeListenerTest extends TestCase {
    
    public NodeListenerTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(NodeListenerTest.class);
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
     * Test of changedNode method, of class NodeListener.
     */
    public void testChangedNode() {
        System.out.println("changedNode");
        Node node = null;
        NodeListener instance = new NodeListenerImpl();
        instance.changedNode(node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateValue method, of class NodeListener.
     */
    public void testUpdateValue() {
        System.out.println("updateValue");
        String value = "";
        NodeListener instance = new NodeListenerImpl();
        instance.updateValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDirection method, of class NodeListener.
     */
    public void testUpdateDirection() {
        System.out.println("updateDirection");
        NodeDirection direction = null;
        NodeListener instance = new NodeListenerImpl();
        instance.updateDirection(direction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWall method, of class NodeListener.
     */
    public void testUpdateWall() {
        System.out.println("updateWall");
        boolean wall = false;
        NodeListener instance = new NodeListenerImpl();
        instance.updateWall(wall);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class NodeListenerImpl implements NodeListener {

        public void changedNode(Node node) {
        }

        public void updateValue(String value) {
        }

        public void updateDirection(NodeDirection direction) {
        }

        public void updateWall(boolean wall) {
        }
    }
    
}
