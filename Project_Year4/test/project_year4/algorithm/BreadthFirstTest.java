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
package project_year4.algorithm;

import junit.framework.TestSuite;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import project_year4.maze.Maze;
import project_year4.maze.MazeCell;
import project_year4.maze.Node;

/**
 *
 * @author L00131070
 */
public class BreadthFirstTest {

    public BreadthFirstTest() {
    }

    public static junit.framework.Test suite() {
        TestSuite suite = new TestSuite(BreadthFirstTest.class);
        return suite;
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of run method, of class BreadthFirst.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Maze maze = new Maze();
        maze.setStart(maze.getMazeCell(0, 0));
        BreadthFirst instance = new BreadthFirst();
        instance.run(maze);
        MazeCell cell = maze.getStart();
        Node[] nodes = cell.getNodes();
        for (Node node : nodes) {
            if (node != null) {
                assertTrue(0.5 == node.getValue());
            }
        }
    }

}
