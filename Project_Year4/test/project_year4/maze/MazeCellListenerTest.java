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
public class MazeCellListenerTest extends TestCase {
    
    public MazeCellListenerTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(MazeCellListenerTest.class);
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
     * Test of changedMazeCell method, of class MazeCellListener.
     */
    public void testChangedMazeCell() {
        System.out.println("changedMazeCell");
        MazeCell cell = null;
        MazeCellListener instance = new MazeCellListenerImpl();
        instance.changedMazeCell(cell);
    }

    public class MazeCellListenerImpl implements MazeCellListener {

        public void changedMazeCell(MazeCell cell) {
        }
    }

}
