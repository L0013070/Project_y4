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
package project_year4.algorithm.heuristic;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import project_year4.maze.Node;

/**
 *
 * @author Dietmar
 */
public class ManhattenDistanceTest extends TestCase {
    
    public ManhattenDistanceTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ManhattenDistanceTest.class);
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
     * Test of calculate method, of class ManhattenDistance.
     */
    public void testCalculate() {
        System.out.println("calculate");
        Node from = null;
        Node to = null;
        ManhattenDistance instance = new ManhattenDistance();
        double expResult = 0.0;
        double result = instance.calculate(from, to);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
