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
import project_year4.maze.mode.ModeSuite;
import project_year4.maze.typ.TypSuite;

/**
 *
 * @author L00131070
 */
public class MazeSuite extends TestCase {
    
    public MazeSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("MazeSuite");
        suite.addTest(MazeTest.suite());
        suite.addTest(MazeCellTest.suite());
        suite.addTest(DirectionTest.suite());
        suite.addTest(MazeListenerTest.suite());
        suite.addTest(TypSuite.suite());
        suite.addTest(MazeCellListenerTest.suite());
        suite.addTest(NodesTest.suite());
        suite.addTest(NodeTest.suite());
        suite.addTest(NodeListenerTest.suite());
        suite.addTest(NodeDirectionTest.suite());
        suite.addTest(ModeSuite.suite());
        suite.addTest(NodeTypTest.suite());
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
    
}
