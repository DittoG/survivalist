/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survivalist.frames;

import java.awt.event.KeyEvent;
import survivalist.control.Constants;

/**
 *
 * @author Jerry
 */
public class BuildingMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form BuildingMenuFrame
     */
    public BuildingMenuFrame() {
        initComponents();

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
        jbExit = new javax.swing.JButton();
        jbHowToPlay = new javax.swing.JButton();
        jbCabin = new javax.swing.JButton();
        jbLeanTo = new javax.swing.JButton();
        jbTower = new javax.swing.JButton();
        jlBuildingMenuBanner = new javax.swing.JLabel();
        jlBuildingMenuBackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(748, 458));
        setMinimumSize(new java.awt.Dimension(748, 458));

        jLayeredPane1.setFocusTraversalPolicyProvider(true);
        jLayeredPane1.setMaximumSize(new java.awt.Dimension(748, 458));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(748, 458));

        jbExit.setBackground(new java.awt.Color(43, 72, 130));
        jbExit.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbExit.setForeground(new java.awt.Color(132, 193, 255));
        jbExit.setText("<html><a style='text-decoration:underline'>E</a>xit</html>");
        jbExit.setToolTipText("Exit to previous menu");
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
        jbHowToPlay.setText("<html><a style='text-decoration:underline'>H</a>ow to Build</html>");
        jbHowToPlay.setToolTipText("Learn how to build");
        jbHowToPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbHowToPlay.setFocusPainted(false);
        jbHowToPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHowToPlayActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jbHowToPlay);
        jbHowToPlay.setBounds(580, 380, 160, 30);

        jbCabin.setBackground(new java.awt.Color(43, 72, 130));
        jbCabin.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbCabin.setForeground(new java.awt.Color(132, 193, 255));
        jbCabin.setText("<html><a style='text-decoration:underline'>C</a>abin</html>");
        jbCabin.setToolTipText(survivalist.Survivalist.getCurrentGame().getBuildings()[Constants.CABIN].getDescription());
        jbCabin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCabin.setFocusPainted(false);
        jbCabin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCabinActionPerformed(evt);
            }
        });
        jbCabin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbCabinKeyPressed(evt);
            }
        });
        jLayeredPane1.add(jbCabin);
        jbCabin.setBounds(180, 80, 160, 30);

        jbLeanTo.setBackground(new java.awt.Color(43, 72, 130));
        jbLeanTo.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbLeanTo.setForeground(new java.awt.Color(132, 193, 255));
        jbLeanTo.setText("<html><a style='text-decoration:underline'>L</a>ean-to</html>");
        jbLeanTo.setToolTipText(survivalist.Survivalist.getCurrentGame().getBuildings()[Constants.LEANTO].getDescription());
        jbLeanTo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLeanTo.setFocusPainted(false);
        jbLeanTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLeanToActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jbLeanTo);
        jbLeanTo.setBounds(390, 80, 160, 30);

        jbTower.setBackground(new java.awt.Color(43, 72, 130));
        jbTower.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbTower.setForeground(new java.awt.Color(132, 193, 255));
        jbTower.setText("<html><a style='text-decoration:underline'>T</a>ower</html>");
        jbTower.setToolTipText(survivalist.Survivalist.getCurrentGame().getBuildings()[Constants.TOWER].getDescription());
        jbTower.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbTower.setFocusPainted(false);
        jbTower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTowerActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jbTower);
        jbTower.setBounds(180, 130, 160, 30);

        jlBuildingMenuBanner.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jlBuildingMenuBanner.setForeground(new java.awt.Color(36, 97, 36));
        jlBuildingMenuBanner.setText("Building Menu");
        jlBuildingMenuBanner.setToolTipText("");
        jLayeredPane1.add(jlBuildingMenuBanner);
        jlBuildingMenuBanner.setBounds(230, 0, 290, 50);

        jlBuildingMenuBackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/survivalist/images/buildingMenuBackgroundImage.JPG"))); // NOI18N
        jlBuildingMenuBackgroundImage.setMaximumSize(new java.awt.Dimension(748, 458));
        jlBuildingMenuBackgroundImage.setMinimumSize(new java.awt.Dimension(748, 458));
        jlBuildingMenuBackgroundImage.setPreferredSize(new java.awt.Dimension(748, 458));
        jLayeredPane1.add(jlBuildingMenuBackgroundImage);
        jlBuildingMenuBackgroundImage.setBounds(0, 0, 748, 458);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed

        GameMenuFrame gameMenuFrame = new GameMenuFrame();
        gameMenuFrame.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_jbExitActionPerformed

    private void jbHowToPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHowToPlayActionPerformed

        HowToPlayFrame howToPlayFrame = new HowToPlayFrame();
        howToPlayFrame.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jbHowToPlayActionPerformed

    private void jbCabinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbCabinKeyPressed

        // Key Binding Code
        if (evt.getKeyCode() == KeyEvent.VK_C) {
            jbCabinActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_L) {
            jbLeanToActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_T) {
            jbTowerActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_E) {
            jbExitActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_H) {
            jbHowToPlayActionPerformed(null);
        }
    }//GEN-LAST:event_jbCabinKeyPressed

    private void jbLeanToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLeanToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLeanToActionPerformed

    private void jbTowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTowerActionPerformed
        System.out.println("Tower function implemented");
    }//GEN-LAST:event_jbTowerActionPerformed

    private void jbCabinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCabinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCabinActionPerformed

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
            java.util.logging.Logger.getLogger(BuildingMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuildingMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuildingMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuildingMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuildingMenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton jbCabin;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbHowToPlay;
    private javax.swing.JButton jbLeanTo;
    private javax.swing.JButton jbTower;
    private javax.swing.JLabel jlBuildingMenuBackgroundImage;
    private javax.swing.JLabel jlBuildingMenuBanner;
    // End of variables declaration//GEN-END:variables
}
