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

import java.io.File;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import project_year4.algorithm.Algorithm;
import project_year4.algorithm.BreadthFirst;
import project_year4.algorithm.heuristic.Heuristic;
import project_year4.gui.DisplayMaze;
import project_year4.algorithm.mode.MovementMode;

/**
 *
 * @author L00131070
 */
public class MazeTest extends TestCase {
    
    public MazeTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(MazeTest.class);
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
     * Test of setAlgorithm method, of class Maze.
     */
    public void testSetAlgorithm() {
        System.out.println("setAlgorithm");
        Algorithm algorithm = null;
        Maze instance = new Maze();
        instance.setAlgorithm(algorithm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHeuristic method, of class Maze.
     */
    public void testSetHeuristic() {
        System.out.println("setHeuristic");
        Heuristic heuristic = null;
        Maze instance = new Maze();
        instance.setHeuristic(heuristic);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMovementMode method, of class Maze.
     */
    public void testSetMovementMode() {
        System.out.println("setMovementMode");
        MovementMode mode = null;
        Maze instance = new Maze();
        instance.setMovementMode(mode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of solve method, of class Maze.
     */
    public void testSolve() {
        System.out.println("solve");
        Maze instance = new Maze();
        instance.solve();
        instance.setAlgorithm(new BreadthFirst());
        instance.solve();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of load method, of class Maze.
     */
    public void testLoad() {
        System.out.println("load");
        File file = null;
        Maze instance = new Maze();
        boolean expResult = false;
        boolean result = instance.load(file);
        assertEquals(expResult, result);
    }

    /**
     * Test of getMazeCell method, of class Maze.
     */
    public void testGetMazeCell() {
        System.out.println("getMazeCell");
        int x = 0;
        int y = 0;
        Maze instance = new Maze();
        MazeCell result = instance.getMazeCell(x, y);
        assertNotNull(result);
        assertEquals(x, result.getxPos());
        assertEquals(y, result.getyPos());
    }

    /**
     * Test of createDisplayPanel method, of class Maze.
     */
    public void testCreateDisplayPanel() {
        System.out.println("createDisplayPanel");
        Maze instance = new Maze();
        DisplayMaze expResult = null;
        DisplayMaze result = instance.createDisplayPanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readMazFile method, of class Maze.
     */
    public void testReadMazFile() {
        System.out.println("readMazFile");
        File file = new File("X:\\Project\\Project_y4\\Project_Year4\\mazefiles\\Mazes\\00japan.bin");
        Maze instance = new Maze();
        Nodes nodes = instance.getNodes();
        instance.readMazFile(file);
        Node result = nodes.getNode(NodeTyp.X, 0, 0);
        assertEquals(result.isWall(), true);
        result = nodes.getNode(NodeTyp.Y, 0, 0);
        assertEquals(result.getDirection(), NodeDirection.FORWARD);
    }

    /**
     * Test of reset method, of class Maze.
     */
    public void testReset() {
        System.out.println("reset");
        Maze instance = new Maze();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMazeCells method, of class Maze.
     */
    public void testGetMazeCells() {
        System.out.println("getMazeCells");
        Maze instance = new Maze();
        MazeCell[][] result = instance.getMazeCells();
        assertNotNull(result);
        assertEquals(Maze.MAZESIZE, result.length);
    }

    /**
     * Test of getNodes method, of class Maze.
     */
    public void testGetNodes() {
        System.out.println("getNodes");
        Maze instance = new Maze();
        Nodes result = instance.getNodes();
        assertNotNull(result);
    }

    /**
     * Test of resetNodes method, of class Maze.
     */
    public void testResetNodes() {
        System.out.println("resetNodes");
        Maze instance = new Maze();
        instance.resetNodes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addListener method, of class Maze.
     */
    public void testAddListener() {
        System.out.println("addListener");
        project_year4.maze.MazeListener listener = null;
        Maze instance = new Maze();
        boolean expResult = false;
        boolean result = instance.addListener(listener);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeListeners method, of class Maze.
     */
    public void testRemoveListeners() {
        System.out.println("removeListeners");
        project_year4.maze.MazeListener listener = null;
        Maze instance = new Maze();
        boolean expResult = false;
        boolean result = instance.removeListeners(listener);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changedMaze method, of class Maze.
     */
    public void testChangedMaze() {
        System.out.println("changedMaze");
        Maze instance = new Maze();
        instance.changedMaze();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartNodes method, of class Maze.
     */
    public void testGetStartNodes() {
        System.out.println("getStartNodes");
        Maze instance = new Maze();
        Node[] expResult = null;
        Node[] result = instance.getStartNodes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStart method, of class Maze.
     */
    public void testGetStart() {
        System.out.println("getStart");
        Maze instance = new Maze();
        MazeCell expResult = null;
        MazeCell result = instance.getStart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStart method, of class Maze.
     */
    public void testSetStart() {
        System.out.println("setStart");
        MazeCell start = null;
        Maze instance = new Maze();
        instance.setStart(start);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGoal method, of class Maze.
     */
    public void testGetGoal() {
        System.out.println("getGoal");
        Maze instance = new Maze();
        MazeCell expResult = null;
        MazeCell result = instance.getGoal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGoal method, of class Maze.
     */
    public void testSetGoal() {
        System.out.println("setGoal");
        MazeCell goal = null;
        Maze instance = new Maze();
        instance.setGoal(goal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMovementMode method, of class Maze.
     */
    public void testGetMovementMode() {
        System.out.println("getMovementMode");
        Maze instance = new Maze();
        MovementMode expResult = null;
        MovementMode result = instance.getMovementMode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeuristic method, of class Maze.
     */
    public void testGetHeuristic() {
        System.out.println("getHeuristic");
        Maze instance = new Maze();
        Heuristic expResult = null;
        Heuristic result = instance.getHeuristic();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


}
