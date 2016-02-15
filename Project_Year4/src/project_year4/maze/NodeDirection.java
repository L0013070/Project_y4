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

/**
 *
 * @author L00131070
 */
public enum NodeDirection {

    FORWARD(NodeTyp.Y, 1, 0, NodeTyp.X, 1, 0, NodeTyp.Y, 1, -1, NodeTyp.X, -1, 1, NodeTyp.Y, 0, 1, NodeTyp.X, 0, 1),
    REVERSE(NodeTyp.Y, 0, 0, NodeTyp.X, -1, 0, NodeTyp.Y, 0, -1, NodeTyp.X, 0, 0, NodeTyp.Y, 0, -1, NodeTyp.X, 0, -1);

    private NodeTyp[] forwardChildrenTyp = new NodeTyp[3];
    private int[] forwardChildrenX = {0,0,0};
    private int[] forwardChildrenY = {0,0,0};
    private NodeTyp[] reverseChildrenTyp = new NodeTyp[3];
    private int[] reverseChildrenX = {0,0,0};
    private int[] reverseChildrenY = {0,0,0};

    private NodeDirection(NodeTyp typForward1, int xForwardOffset1, int yForwardOffset1,
            NodeTyp typForward2, int xForwardOffset2, int yForwardOffset2,
            NodeTyp typForward3, int xForwardOffset3, int yForwardOffset3,
            NodeTyp typReverse1, int xReverseOffset1, int yReverseOffset1,
            NodeTyp typReverse2, int xReverseOffset2, int yReverseOffset2,
            NodeTyp typReverse3, int xReverseOffset3, int yReverseOffset3) {
            forwardChildrenTyp[0] = typForward1;
            forwardChildrenX[0] = xForwardOffset1;
            forwardChildrenY[0] = yForwardOffset1;
            forwardChildrenTyp[1] = typForward2;
            forwardChildrenX[1] = xForwardOffset2;
            forwardChildrenY[1] = yForwardOffset2;
            forwardChildrenTyp[2] = typForward3;
            forwardChildrenX[2] = xForwardOffset3;
            forwardChildrenY[2] = yForwardOffset3;
            reverseChildrenTyp[0] = typReverse1;
            reverseChildrenX[0] = xReverseOffset1;
            reverseChildrenY[0] = yReverseOffset1;
            reverseChildrenTyp[1] = typReverse2;
            reverseChildrenX[1] = xReverseOffset2;
            reverseChildrenY[1] = yReverseOffset2;
            reverseChildrenTyp[2] = typReverse3;
            reverseChildrenX[2] = xReverseOffset3;
            reverseChildrenY[2] = yReverseOffset3;
    }

    public void initChilden(Node node, Node[][] xNodes, Node[][] yNodes) {

    }
    
    public String toString() {
        String ret = "";
        for (int i = 0; i < 3; i++) {
            ret += "Child forward: "+i+"\n";
            ret += "Typ: "+forwardChildrenTyp[i]+" x: "+forwardChildrenX[i]+" y: "+forwardChildrenY[i]+"\n";
            ret += "reverse:\n";
            ret += "Typ: "+reverseChildrenTyp[i]+" x: "+reverseChildrenX[i]+" y: "+reverseChildrenY[i]+"\n";
        }
        return ret;
    }
}
