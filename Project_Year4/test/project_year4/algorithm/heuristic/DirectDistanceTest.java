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
package project_year4.algorithm.heuristic;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import project_year4.maze.Maze;
import project_year4.maze.MazeCell;
import project_year4.maze.Node;
import project_year4.maze.NodeTyp;

/**
 *
 * @author L00131070@student.lyit.ie
 */
public class DirectDistanceTest extends TestCase {
    
    public DirectDistanceTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(DirectDistanceTest.class);
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
     * Test of calculate method, of class DirectDistance.
     */
    public void testCalculate() {
        System.out.println("calculate");
        Maze maze = new Maze();
        MazeCell to = maze.getMazeCell(4, 4);
        Node from = maze.getMazeCell(0, 0).getNodes()[0];
        DirectDistance instance = new DirectDistance();
        double expResult = 5.0;
        double result = instance.getDistance(from, to);
        assertEquals(expResult, result);
    }
    
}
