/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package survivalist.frames;

import java.awt.event.KeyEvent;

/**
 *
 * @author Madison
 */
public class GameMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form GameMenuFrame
     */
    public GameMenuFrame() {
        initComponents();

        // center the window relative to the screen
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jlGameMenuBanner = new javax.swing.JLabel();
        jbExit = new javax.swing.JButton();
        jbHowToPlay = new javax.swing.JButton();
        jbViewMap = new javax.swing.JButton();
        jbInventory = new javax.swing.JButton();
        jbHuntGather = new javax.swing.JButton();
        jbCrafting = new javax.swing.JButton();
        jbBuilding = new javax.swing.JButton();
        jbSaveGame = new javax.swing.JButton();
        jlGameMenuBackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setResizable(false);

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(748, 460));

        jlGameMenuBanner.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jlGameMenuBanner.setForeground(new java.awt.Color(110, 162, 239));
        jlGameMenuBanner.setText("Game Menu");
        jLayeredPane1.add(jlGameMenuBanner);
        jlGameMenuBanner.setBounds(350, 90, 230, 60);

        jbExit.setBackground(new java.awt.Color(43, 72, 130));
        jbExit.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbExit.setForeground(new java.awt.Color(132, 193, 255));
        jbExit.setText("<html><a style='text-decoration:underline'>E</a>xit</html>");
        jbExit.setToolTipText("Exit to the main menu");
        jbExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbExit.setFocusPainted(false);
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jbExit);
        jbExit.setBounds(580, 420, 160, 30);

        jbHowToPlay.setBackground(new java.awt.Color(43, 72, 130));
        jbHowToPlay.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbHowToPlay.setForeground(new java.awt.Color(132, 193, 255));
        jbHowToPlay.setText("<html><a style='text-decoration:underline'>H</a>ow to Play</html>");
        jbHowToPlay.setToolTipText("How to play the game");
        jbHowToPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbHowToPlay.setFocusPainted(false);
        jbHowToPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHowToPlayActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jbHowToPlay);
        jbHowToPlay.setBounds(580, 380, 160, 30);

        jbViewMap.setBackground(new java.awt.Color(43, 72, 130));
        jbViewMap.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbViewMap.setForeground(new java.awt.Color(132, 193, 255));
        jbViewMap.setText("<html><a style='text-decoration:underline'>V</a>iew Map</html>");
        jbViewMap.setToolTipText("View the map or travel");
        jbViewMap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbViewMap.setFocusPainted(false);
        jLayeredPane1.add(jbViewMap);
        jbViewMap.setBounds(470, 150, 160, 30);

        jbInventory.setBackground(new java.awt.Color(43, 72, 130));
        jbInventory.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbInventory.setForeground(new java.awt.Color(132, 193, 255));
        jbInventory.setText("<html><a style='text-decoration:underline'>I</a>nventory</html>");
        jbInventory.setToolTipText("View your inventory");
        jbInventory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbInventory.setFocusPainted(false);
        jbInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInventoryActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jbInventory);
        jbInventory.setBounds(470, 190, 160, 30);

        jbHuntGather.setBackground(new java.awt.Color(43, 72, 130));
        jbHuntGather.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbHuntGather.setForeground(new java.awt.Color(132, 193, 255));
        jbHuntGather.setText("<html>Hunt/<a style='text-decoration:underline'>G</a>ather</html>");
        jbHuntGather.setToolTipText("Hunt and gather food and materials");
        jbHuntGather.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbHuntGather.setFocusPainted(false);
        jbHuntGather.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbHuntGatherKeyPressed(evt);
            }
        });
        jLayeredPane1.add(jbHuntGather);
        jbHuntGather.setBounds(290, 150, 160, 30);

        jbCrafting.setBackground(new java.awt.Color(43, 72, 130));
        jbCrafting.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbCrafting.setForeground(new java.awt.Color(132, 193, 255));
        jbCrafting.setText("<html><a style='text-decoration:underline'>C</a>rafting</html>");
        jbCrafting.setToolTipText("Craft useful items");
        jbCrafting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCrafting.setFocusPainted(false);
        jbCrafting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCraftingActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jbCrafting);
        jbCrafting.setBounds(290, 190, 160, 30);

        jbBuilding.setBackground(new java.awt.Color(43, 72, 130));
        jbBuilding.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbBuilding.setForeground(new java.awt.Color(132, 193, 255));
        jbBuilding.setText("<html><a style='text-decoration:underline'>B</a>uilding</html>");
        jbBuilding.setToolTipText("Build a structure");
        jbBuilding.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBuilding.setFocusPainted(false);
        jbBuilding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuildingActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jbBuilding);
        jbBuilding.setBounds(290, 230, 160, 30);

        jbSaveGame.setBackground(new java.awt.Color(43, 72, 130));
        jbSaveGame.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbSaveGame.setForeground(new java.awt.Color(132, 193, 255));
        jbSaveGame.setText("<html><a style='text-decoration:underline'>S</a>ave Game</html>");
        jbSaveGame.setToolTipText("Save your current game");
        jbSaveGame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSaveGame.setFocusPainted(false);
        jLayeredPane1.add(jbSaveGame);
        jbSaveGame.setBounds(470, 230, 160, 30);

        jlGameMenuBackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/survivalist/images/gameMenuBackgroundImage.jpg"))); // NOI18N
        jlGameMenuBackgroundImage.setName(""); // NOI18N
        jLayeredPane1.add(jlGameMenuBackgroundImage);
        jlGameMenuBackgroundImage.setBounds(0, 0, 748, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbHowToPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHowToPlayActionPerformed
        
        HowToPlayFrame howToPlayFrame = new HowToPlayFrame();
        howToPlayFrame.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_jbHowToPlayActionPerformed
    
    private void jbBuildingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuildingActionPerformed
        BuildingMenuFrame buildingMenuFrame = new BuildingMenuFrame();
        buildingMenuFrame.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jbBuildingActionPerformed
        
    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
        
        MainMenuFrame mainMenuFrame = new MainMenuFrame();
        mainMenuFrame.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_jbExitActionPerformed

    private void jbHuntGatherKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbHuntGatherKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_H) {
            jbHowToPlayActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_E) {
            jbExitActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_C) {
            jbCraftingActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_I) {
            jbInventoryActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_B) {
            jbBuildingActionPerformed(null);
        }
    }//GEN-LAST:event_jbHuntGatherKeyPressed

    private void jbCraftingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCraftingActionPerformed
        
        CraftingMenuFrame craftingMenuFrame = new CraftingMenuFrame();
        craftingMenuFrame.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jbCraftingActionPerformed

    private void jbInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInventoryActionPerformed
        InventoryFrame inventoryFrame = new InventoryFrame();
        inventoryFrame.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jbInventoryActionPerformed

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
            java.util.logging.Logger.getLogger(GameMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameMenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton jbBuilding;
    private javax.swing.JButton jbCrafting;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbHowToPlay;
    private javax.swing.JButton jbHuntGather;
    private javax.swing.JButton jbInventory;
    private javax.swing.JButton jbSaveGame;
    private javax.swing.JButton jbViewMap;
    private javax.swing.JLabel jlGameMenuBackgroundImage;
    private javax.swing.JLabel jlGameMenuBanner;
    // End of variables declaration//GEN-END:variables
}
