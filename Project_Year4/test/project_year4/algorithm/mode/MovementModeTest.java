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
package project_year4.algorithm.mode;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import project_year4.maze.Node;

/**
 *
 * @author Dietmar
 */
public class MovementModeTest extends TestCase {
    
    public MovementModeTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(MovementModeTest.class);
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
     * Test of getCost method, of class MovementMode.
     */
    public void testGetCost() {
        System.out.println("getCost");
        Node from = null;
        Node to = null;
        MovementMode instance = new MovementModeImpl();
        double expResult = 0.0;
        double result = instance.getCost(from, to);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class MovementModeImpl extends MovementMode {

        public double getCost(Node from, Node to) {
            return 0.0;
        }
    }

}
