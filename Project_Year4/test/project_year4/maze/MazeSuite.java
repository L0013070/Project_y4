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
package project_year4.maze;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Dietmar
 */
public class MazeSuite extends TestCase {
    
    public MazeSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("MazeSuite");
        suite.addTest(MazeCellListenerTest.suite());
        suite.addTest(MazeListenerTest.suite());
        suite.addTest(NodeDirectionTest.suite());
        suite.addTest(NodesTest.suite());
        suite.addTest(DirectionTest.suite());
        suite.addTest(NodeTest.suite());
        suite.addTest(MazeCellStateTest.suite());
        suite.addTest(NodeTypTest.suite());
        suite.addTest(MazeTest.suite());
        suite.addTest(MazeCellTest.suite());
        suite.addTest(NodeListenerTest.suite());
        suite.addTest(NodeStateTest.suite());
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
