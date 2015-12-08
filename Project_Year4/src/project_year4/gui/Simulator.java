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

import project_year4.maze.Maze;

/**
 *
 * @author L00131070
 */
public class Simulator extends javax.swing.JFrame {
    
    private Maze maze = new Maze();
    private DisplayMaze1 panelDisplayMaze = new DisplayMaze1();

    /**
     * Creates new form Simulator
     */
    public Simulator() {
        initComponents();
        getContentPane().add(panelDisplayMaze, java.awt.BorderLayout.CENTER);
        pack();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelConfiguration = new javax.swing.JPanel();
        buttonDoSimulation = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelAlgorithm = new javax.swing.JLabel();
        cbAlgorithm = new javax.swing.JComboBox();
        labelHeuristic = new javax.swing.JLabel();
        cbHeuristic = new javax.swing.JComboBox();
        labelSimulationMode = new javax.swing.JLabel();
        cbSimulationType = new javax.swing.JComboBox();
        labelMovementMode = new javax.swing.JLabel();
        cbMovementMode = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        logOutput = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        menuLoad = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Year 4 Algorithm Simulator");
        setResizable(false);

        buttonDoSimulation.setText("doSimulation");
        buttonDoSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDoSimulationActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new java.awt.GridLayout(8, 1));

        labelAlgorithm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAlgorithm.setText("Algorithm");
        labelAlgorithm.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(labelAlgorithm);

        cbAlgorithm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbAlgorithm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlgorithmActionPerformed(evt);
            }
        });
        jPanel2.add(cbAlgorithm);

        labelHeuristic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHeuristic.setText("Heuristic");
        labelHeuristic.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(labelHeuristic);

        cbHeuristic.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbHeuristic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHeuristicActionPerformed(evt);
            }
        });
        jPanel2.add(cbHeuristic);

        labelSimulationMode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSimulationMode.setText("Simulation Type");
        labelSimulationMode.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(labelSimulationMode);

        cbSimulationType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbSimulationType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSimulationTypeActionPerformed(evt);
            }
        });
        jPanel2.add(cbSimulationType);

        labelMovementMode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMovementMode.setText("Movement Mode");
        labelMovementMode.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(labelMovementMode);

        cbMovementMode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbMovementMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMovementModeActionPerformed(evt);
            }
        });
        jPanel2.add(cbMovementMode);

        javax.swing.GroupLayout panelConfigurationLayout = new javax.swing.GroupLayout(panelConfiguration);
        panelConfiguration.setLayout(panelConfigurationLayout);
        panelConfigurationLayout.setHorizontalGroup(
            panelConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonDoSimulation, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelConfigurationLayout.setVerticalGroup(
            panelConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConfigurationLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonDoSimulation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(panelConfiguration, java.awt.BorderLayout.LINE_END);

        logOutput.setEditable(false);
        logOutput.setColumns(20);
        logOutput.setLineWrap(true);
        logOutput.setRows(5);
        jScrollPane2.setViewportView(logOutput);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        fileMenu.setText("File");

        menuLoad.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        menuLoad.setText("Load");
        menuLoad.setActionCommand("load");
        menuLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLoadActionPerformed(evt);
            }
        });
        fileMenu.add(menuLoad);

        menuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        fileMenu.add(menuExit);

        jMenuBar1.add(fileMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLoadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuLoadActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuExitActionPerformed

    private void buttonDoSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDoSimulationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDoSimulationActionPerformed

    private void cbAlgorithmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlgorithmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAlgorithmActionPerformed

    private void cbHeuristicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHeuristicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbHeuristicActionPerformed

    private void cbSimulationTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSimulationTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSimulationTypeActionPerformed

    private void cbMovementModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMovementModeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMovementModeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDoSimulation;
    private javax.swing.JComboBox cbAlgorithm;
    private javax.swing.JComboBox cbHeuristic;
    private javax.swing.JComboBox cbMovementMode;
    private javax.swing.JComboBox cbSimulationType;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAlgorithm;
    private javax.swing.JLabel labelHeuristic;
    private javax.swing.JLabel labelMovementMode;
    private javax.swing.JLabel labelSimulationMode;
    private javax.swing.JTextArea logOutput;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuLoad;
    private javax.swing.JPanel panelConfiguration;
    // End of variables declaration//GEN-END:variables
}
