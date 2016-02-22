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

    FORWARD(NodeTyp.Y, 1, 1, NodeTyp.X, 1, 0, NodeTyp.Y, 1, -1, NodeTyp.X, -1, 1, NodeTyp.Y, 0, 1, NodeTyp.X, 1, 1),
    REVERSE(NodeTyp.Y, 0, 0, NodeTyp.X, -1, 0, NodeTyp.Y, -1, -1, NodeTyp.X, 0, 0, NodeTyp.Y, 0, -1, NodeTyp.X, -1, -1);

    private final NodeTyp[] typXChildrenTyp = new NodeTyp[3];
    private final int[] typXChildrenX = {0,0,0};
    private final int[] typXChildrenY = {0,0,0};
    private final NodeTyp[] typYChildrenTyp = new NodeTyp[3];
    private final int[] typYChildrenX = {0,0,0};
    private final int[] typYChildrenY = {0,0,0};

    private NodeDirection(NodeTyp typTypX1, int xTypXOffset1, int xTypYOffset1,
            NodeTyp typTypX2, int xTypXOffset2, int xTypYOffset2,
            NodeTyp typTypX3, int xTypXOffset3, int xTypYOffset3,
            NodeTyp typTypY1, int yTypXOffset1, int yTypYOffset1,
            NodeTyp typTypY2, int yTypXOffset2, int yTypYOffset2,
            NodeTyp typTypY3, int yTypXOffset3, int yTypYOffset3) {
            typXChildrenTyp[0] = typTypX1;
            typXChildrenX[0] = xTypXOffset1;
            typXChildrenY[0] = xTypYOffset1;
            typXChildrenTyp[1] = typTypX2;
            typXChildrenX[1] = xTypXOffset2;
            typXChildrenY[1] = xTypYOffset2;
            typXChildrenTyp[2] = typTypX3;
            typXChildrenX[2] = xTypXOffset3;
            typXChildrenY[2] = xTypYOffset3;
            typYChildrenTyp[0] = typTypY1;
            typYChildrenX[0] = yTypXOffset1;
            typYChildrenY[0] = yTypYOffset1;
            typYChildrenTyp[1] = typTypY2;
            typYChildrenX[1] = yTypXOffset2;
            typYChildrenY[1] = yTypYOffset2;
            typYChildrenTyp[2] = typTypY3;
            typYChildrenX[2] = yTypXOffset3;
            typYChildrenY[2] = yTypYOffset3;
    }

    public static void initChilden(Node node, Nodes nodes) {
        for (int i = 0; i < 3; i++) {
                node.setForwardChildren(NodeDirection.FORWARD.getChildren(node, nodes));
                node.setReverseChildren(NodeDirection.REVERSE.getChildren(node, nodes));
        }
    }
    
    public String getData() {
        String ret = this.name();
        for (int i = 0; i < 3; i++) {
            ret += "Child typX: "+i+"\n";
            ret += "Typ: "+typXChildrenTyp[i]+" x: "+typXChildrenX[i]+" y: "+typXChildrenY[i]+"\n";
            ret += "reverse:\n";
            ret += "Typ: "+typYChildrenTyp[i]+" x: "+typYChildrenX[i]+" y: "+typYChildrenY[i]+"\n";
        }
        return ret;
    }

    private Node[] getChildren(Node node, Nodes nodes) {
        Node[] children = new Node[3];
        if (node.getTyp() == NodeTyp.X) {
            for (int i = 0; i < 3; i++) {
                if (this.typXChildrenTyp[i] == NodeTyp.X) {
                    children[i] = nodes.getNode(NodeTyp.X, (node.getxPosition()+this.typXChildrenX[i]), (node.getyPosition()+this.typXChildrenY[i]));
                } else {
                    children[i] = nodes.getNode(NodeTyp.Y, (node.getxPosition()+this.typXChildrenX[i]), (node.getyPosition()+this.typXChildrenY[i]));
                }
            }
        } else if (node.getTyp() == NodeTyp.Y){
            for (int i = 0; i < 3; i++) {
                if (this.typXChildrenTyp[i] == NodeTyp.X) {
                    children[i] = nodes.getNode(NodeTyp.X, (node.getxPosition()+this.typYChildrenX[i]), (node.getyPosition()+this.typYChildrenY[i]));
                } else {
                    children[i] = nodes.getNode(NodeTyp.Y, (node.getxPosition()+this.typYChildrenX[i]), (node.getyPosition()+this.typYChildrenY[i]));
                }
            }
        }
        return children;
    }
}
