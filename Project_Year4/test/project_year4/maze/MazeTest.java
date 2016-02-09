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
import junit.framework.TestCase;
import project_year4.algorithm.Algorithm;
import project_year4.algorithm.heuristic.Heuristic;
import project_year4.gui.DisplayMaze;
import project_year4.maze.mode.MovementMode;
import project_year4.maze.typ.SimulationTyp;

/**
 *
 * @author L00131070
 */
public class MazeTest extends TestCase {
    
    public MazeTest(String testName) {
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
     * Test of setSimulationTyp method, of class Maze.
     */
    public void testSetSimulationTyp() {
        System.out.println("setSimulationTyp");
        SimulationTyp typ = null;
        Maze instance = new Maze();
        instance.setSimulationTyp(typ);
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
     * Test of addListener method, of class Maze.
     */
    public void testAddListener() {
        System.out.println("addListener");
        MazeListener listener = (MazeListener) new MazeListenerDummy();
        Maze instance = new Maze();
        assertTrue(instance.addListener(listener));
        assertFalse(instance.addListener(listener));
    }

    /**
     * Test of removeListeners method, of class Maze.
     */
    public void testRemoveListeners() {
        System.out.println("removeListeners");
        MazeListener listener = (MazeListener) new MazeListenerDummy();
        Maze instance = new Maze();
        instance.addListener(listener);
        assertTrue(instance.removeListeners(listener));
        assertFalse(instance.removeListeners(listener));
    }

    /**
     * Test of changedMaze method, of class Maze.
     */
    public void testChangedMaze() {
        System.out.println("changedMaze");
        MazeListenerDummy listener = new MazeListenerDummy();
        Maze instance = new Maze();
        instance.changedMaze();
        assertEquals(listener.getCalls(), 0);
        instance.addListener(listener);
        assertEquals(listener.getCalls(), 0);
        instance.changedMaze();
        assertEquals(listener.getCalls(), 1);
        instance.changedMaze();
        assertEquals(listener.getCalls(), 2);
        assertTrue(instance.removeListeners(listener));
        assertFalse(instance.removeListeners(listener));
    }

    /**
     * Test of getMazeCell method, of class Maze.
     */
    public void testGetMazeCell() {
        System.out.println("getMazeCell");
        int x = 0;
        int y = 0;
        Maze instance = new Maze();
        MazeCell expResult = null;
        MazeCell result = instance.getMazeCell(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        instance.readMazFile(file);
        Node result = instance.getxNodes()[0][0];
        assertEquals(result.getDirection(), NodeDirection.WALL);
        result = instance.getyNodes()[0][0];
        assertEquals(result.getDirection(), NodeDirection.NONE);
    }


}
