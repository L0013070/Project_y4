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

import junit.framework.TestCase;

/**
 *
 * @author L00131070
 */
public class NodeDirectionTest extends TestCase {

    public NodeDirectionTest(String testName) {
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
     * Test of values method, of class NodeDirection.
     */
    public void testValues() {
        System.out.println("values");
        NodeDirection[] expResult = {NodeDirection.NONE, NodeDirection.FORWARD, NodeDirection.REVERSE, NodeDirection.WALL};
        NodeDirection[] result = NodeDirection.values();
        for (int i = 0; i < result.length; i++) {
            assertEquals(expResult[i], result[i]);
        }
    }

    /**
     * Test of valueOf method, of class NodeDirection.
     */
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "FORWARD";
        NodeDirection expResult = NodeDirection.FORWARD;
        NodeDirection result = NodeDirection.valueOf(name);
        assertEquals(expResult, result);
        name = "REVERSE";
        expResult = NodeDirection.REVERSE;
        result = NodeDirection.valueOf(name);
        assertEquals(expResult, result);
        name = "WALL";
        expResult = NodeDirection.WALL;
        result = NodeDirection.valueOf(name);
        assertEquals(expResult, result);
        name = "NONE";
        expResult = NodeDirection.NONE;
        result = NodeDirection.valueOf(name);
        assertEquals(expResult, result);
    }

}
