/*
 * Copyright (C) 2015 L00131070.
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
package project_year4.gui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseEvent;
import project_year4.maze.Maze;
import project_year4.maze.MazeCell;
import project_year4.maze.Node;
import project_year4.maze.NodeTyp;

/**
 *
 * @author L00131070
 */
public class DisplayMaze1 extends javax.swing.JPanel {

    /**
     * Creates new form DisplayMaze1
     */
    public DisplayMaze1(MazeCell[][] cells, Node[][] xNodes, Node[][] yNodes) {
        int mazesize = Maze.mazeSize;
        initComponents();
        DisplayGridCell cell = null;
        DisplayNode node = null;
        for (int i = 0; i < mazesize; i++) {
            for (int j = 0; j < mazesize; j++) {
                cell = new DisplayGridCell(j + "/" + (mazesize - 1 - i));
                cells[j][i].addListener(cell);
                gridPanel.add(cell);
                if (j < (mazesize - 1)) {
                    node = new DisplayNode(j+"/"+i, NodeTyp.X);
                    xNodes[j][i].addListener(node);
                    xNodePanel.add(node);
                }
                if (i < (mazesize - 1)) {
                    node = new DisplayNode(j+"/"+(mazesize - 2 - i), NodeTyp.Y);
                    yNodes[j][mazesize - 2 - i].addListener(node);
                    yNodePanel.add(node);
                }
            }
        }
        ((GridLayout) gridPanel.getLayout()).setColumns(mazesize);
        ((GridLayout) gridPanel.getLayout()).setRows(mazesize);
        Dimension dim = new Dimension(mazesize * DisplayGridCell.CELLSIZE, mazesize * DisplayGridCell.CELLSIZE);
        System.out.println("size: " + dim + " size: " + DisplayGridCell.CELLSIZE);
        mazeLayeredPane.setSize(dim);
        mazeLayeredPane.setPreferredSize(dim);
        gridPanel.setPreferredSize(dim);
        xNodePanel.setPreferredSize(new Dimension((mazesize - 1) * DisplayGridCell.CELLSIZE, mazesize * DisplayGridCell.CELLSIZE));
        yNodePanel.setPreferredSize(new Dimension((mazesize) * DisplayGridCell.CELLSIZE, (mazesize - 1) * DisplayGridCell.CELLSIZE));
        System.out.println("gridnode pref. size: " + mazeLayeredPane.getPreferredSize());
        System.out.println("gridnode size: " + mazeLayeredPane.getSize());
        System.out.println("P1: " + gridPanel.getPreferredSize() + " " + gridPanel.getLocation());
        System.out.println("P2: " + xNodePanel.getPreferredSize() + " " + xNodePanel.getLocation());
        System.out.println("P3: " + yNodePanel.getPreferredSize() + " " + yNodePanel.getLocation());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mazeLayeredPane = new javax.swing.JLayeredPane();
        gridPanel = new javax.swing.JPanel();
        xNodePanel = new javax.swing.JPanel();
        yNodePanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        mazeLayeredPane.setBackground(new java.awt.Color(51, 51, 51));
        mazeLayeredPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gridPanel.setBackground(new java.awt.Color(51, 51, 51));
        gridPanel.setPreferredSize(new java.awt.Dimension(800, 800));
        gridPanel.setLayout(new java.awt.GridLayout(16, 16, 2, 2));
        mazeLayeredPane.add(gridPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        xNodePanel.setBackground(new java.awt.Color(153, 255, 0));
        xNodePanel.setOpaque(false);
        xNodePanel.setPreferredSize(new java.awt.Dimension(725, 800));
        xNodePanel.setLayout(new java.awt.GridLayout(16, 15, 2, 2));
        mazeLayeredPane.add(xNodePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 0, -1, -1));
        mazeLayeredPane.setLayer(xNodePanel, javax.swing.JLayeredPane.MODAL_LAYER);

        yNodePanel.setOpaque(false);
        yNodePanel.setPreferredSize(new java.awt.Dimension(800, 775));
        yNodePanel.setLayout(new java.awt.GridLayout(15, 16, 0, 13));
        mazeLayeredPane.add(yNodePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 26, -1, -1));
        mazeLayeredPane.setLayer(yNodePanel, javax.swing.JLayeredPane.POPUP_LAYER);

        add(mazeLayeredPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel gridPanel;
    private javax.swing.JLayeredPane mazeLayeredPane;
    private javax.swing.JPanel xNodePanel;
    private javax.swing.JPanel yNodePanel;
    // End of variables declaration//GEN-END:variables
}
