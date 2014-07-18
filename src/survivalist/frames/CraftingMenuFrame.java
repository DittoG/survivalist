/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survivalist.frames;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import survivalist.Survivalist;
import survivalist.control.Constants;
import survivalist.control.InventoryControl;
import survivalist.model.Item;
import survivalist.model.RequiredItem;

/**
 *
 * @author Jerry
 */
public class CraftingMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form CraftingMenuFrame
     */
    public CraftingMenuFrame() {
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
        jlCraftingMenuBanner = new javax.swing.JLabel();
        jbExit = new javax.swing.JButton();
        jbHowToPlay = new javax.swing.JButton();
        jbKnife = new javax.swing.JButton();
        jbBow = new javax.swing.JButton();
        jbArrows = new javax.swing.JButton();
        jbMachete = new javax.swing.JButton();
        jbAxe = new javax.swing.JButton();
        jbHammer = new javax.swing.JButton();
        jbFlintAndStone = new javax.swing.JButton();
        jbGrapplingHook = new javax.swing.JButton();
        jlCraftingMenuBackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(748, 458));
        setMinimumSize(new java.awt.Dimension(748, 458));

        jLayeredPane1.setDoubleBuffered(true);
        jLayeredPane1.setMaximumSize(new java.awt.Dimension(748, 458));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(748, 458));

        jlCraftingMenuBanner.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jlCraftingMenuBanner.setForeground(new java.awt.Color(36, 97, 36));
        jlCraftingMenuBanner.setText("Crafting Menu");
        jlCraftingMenuBanner.setToolTipText("");
        jLayeredPane1.add(jlCraftingMenuBanner);
        jlCraftingMenuBanner.setBounds(230, 0, 290, 50);

        jbExit.setBackground(new java.awt.Color(43, 72, 130));
        jbExit.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbExit.setForeground(new java.awt.Color(132, 193, 255));
        jbExit.setText("<html><a style='text-decoration:underline'>E</a>xit</html>");
        jbExit.setToolTipText("Exit to the previous Menu");
        jbExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbExit.setFocusPainted(false);
        jbExit.setMinimumSize(new java.awt.Dimension(127, 27));
        jbExit.setPreferredSize(new java.awt.Dimension(127, 27));
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
        jbHowToPlay.setText("<html><a style='text-decoration:underline'>H</a>ow to craft</html>");
        jbHowToPlay.setToolTipText("Get help on how to craft");
        jbHowToPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbHowToPlay.setFocusPainted(false);
        jbHowToPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHowToPlayActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jbHowToPlay);
        jbHowToPlay.setBounds(580, 380, 160, 30);

        jbKnife.setBackground(new java.awt.Color(43, 72, 130));
        jbKnife.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbKnife.setForeground(new java.awt.Color(132, 193, 255));
        jbKnife.setText("<html><a style='text-decoration:underline'>K</a>nife</html>");
        jbKnife.setToolTipText(Survivalist.getCurrentGame().getInventory()[Constants.KNIFE].getDescription()
        );
        jbKnife.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbKnife.setFocusPainted(false);
        jbKnife.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbKnifeActionPerformed(evt);
            }
        });
        jbKnife.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbKnifeKeyPressed(evt);
            }
        });
        jLayeredPane1.add(jbKnife);
        jbKnife.setBounds(180, 60, 160, 30);

        jbBow.setBackground(new java.awt.Color(43, 72, 130));
        jbBow.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbBow.setForeground(new java.awt.Color(132, 193, 255));
        jbBow.setText("<html><a style='text-decoration:underline'>B</a>ow</html>");
        jbBow.setToolTipText(Survivalist.getCurrentGame().getInventory()[Constants.BOW].getDescription()

        );
        jbBow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBow.setFocusPainted(false);
        jbBow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBowActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jbBow);
        jbBow.setBounds(390, 60, 160, 30);

        jbArrows.setBackground(new java.awt.Color(43, 72, 130));
        jbArrows.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbArrows.setForeground(new java.awt.Color(132, 193, 255));
        jbArrows.setText("<html><a style='text-decoration:underline'>A</a>rrows</html>");
        jbArrows.setToolTipText(Survivalist.getCurrentGame().getInventory()[Constants.ARROW].getDescription()

        );
        jbArrows.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbArrows.setFocusPainted(false);
        jbArrows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbArrowsActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jbArrows);
        jbArrows.setBounds(180, 110, 160, 30);

        jbMachete.setBackground(new java.awt.Color(43, 72, 130));
        jbMachete.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbMachete.setForeground(new java.awt.Color(132, 193, 255));
        jbMachete.setText("<html><a style='text-decoration:underline'>M</a>achete</html>");
        jbMachete.setToolTipText(Survivalist.getCurrentGame().getInventory()[Constants.MACHETE].getDescription()

        );
        jbMachete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMachete.setFocusPainted(false);
        jbMachete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMacheteActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jbMachete);
        jbMachete.setBounds(390, 110, 160, 30);

        jbAxe.setBackground(new java.awt.Color(43, 72, 130));
        jbAxe.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbAxe.setForeground(new java.awt.Color(132, 193, 255));
        jbAxe.setText("<html>A<a style='text-decoration:underline'>x</a>e</html>");
        jbAxe.setToolTipText(survivalist.Survivalist.getCurrentGame().getInventory()[Constants.AXE].getDescription()

        );
        jbAxe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAxe.setFocusPainted(false);
        jbAxe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAxeActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jbAxe);
        jbAxe.setBounds(180, 160, 160, 30);

        jbHammer.setBackground(new java.awt.Color(43, 72, 130));
        jbHammer.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbHammer.setForeground(new java.awt.Color(132, 193, 255));
        jbHammer.setText("<html>Hamme<a style='text-decoration:underline'>r</a></html>");
        jbHammer.setToolTipText(Survivalist.getCurrentGame().getInventory()[Constants.HAMMER].getDescription()

        );
        jbHammer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbHammer.setFocusPainted(false);
        jbHammer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHammerActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jbHammer);
        jbHammer.setBounds(390, 160, 160, 30);

        jbFlintAndStone.setBackground(new java.awt.Color(43, 72, 130));
        jbFlintAndStone.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbFlintAndStone.setForeground(new java.awt.Color(132, 193, 255));
        jbFlintAndStone.setText("<html><a style='text-decoration:underline'>F</a>lint and Stone</html>");
        jbFlintAndStone.setToolTipText(survivalist.Survivalist.getCurrentGame().getInventory()[Constants.FLINTANDSTONE].getDescription()

        );
        jbFlintAndStone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbFlintAndStone.setFocusPainted(false);
        jbFlintAndStone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFlintAndStoneActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jbFlintAndStone);
        jbFlintAndStone.setBounds(180, 210, 160, 30);

        jbGrapplingHook.setBackground(new java.awt.Color(43, 72, 130));
        jbGrapplingHook.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbGrapplingHook.setForeground(new java.awt.Color(132, 193, 255));
        jbGrapplingHook.setText("<html><a style='text-decoration:underline'>G</a>rappling Hook</html>");
        jbGrapplingHook.setToolTipText(Survivalist.getCurrentGame().getInventory()[Constants.GRAPPLINGHOOK].getDescription()

        );
        jbGrapplingHook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbGrapplingHook.setFocusPainted(false);
        jbGrapplingHook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGrapplingHookActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jbGrapplingHook);
        jbGrapplingHook.setBounds(390, 210, 160, 30);

        jlCraftingMenuBackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/survivalist/images/craftingMenuBackgroundImage.jpg"))); // NOI18N
        jlCraftingMenuBackgroundImage.setMaximumSize(new java.awt.Dimension(748, 458));
        jlCraftingMenuBackgroundImage.setMinimumSize(new java.awt.Dimension(748, 458));
        jlCraftingMenuBackgroundImage.setPreferredSize(new java.awt.Dimension(748, 458));
        jLayeredPane1.add(jlCraftingMenuBackgroundImage);
        jlCraftingMenuBackgroundImage.setBounds(0, 0, 760, 458);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
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

    private void jbKnifeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbKnifeKeyPressed

        // Key Binding Code
        if (evt.getKeyCode() == KeyEvent.VK_K) {
            jbKnifeActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_H) {
            jbHowToPlayActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_E) {
            jbExitActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_B) {
            jbBowActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_A) {
            jbArrowsActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_M) {
            jbMacheteActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_X) {
            jbAxeActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_R) {
            jbHammerActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_F) {
            jbFlintAndStoneActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_G) {
            jbGrapplingHookActionPerformed(null);
        }
    }//GEN-LAST:event_jbKnifeKeyPressed

    private void jbBowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBowActionPerformed
        this.craftItem(Survivalist.getCurrentGame().getInventory()[Constants.BOW]);
    }//GEN-LAST:event_jbBowActionPerformed

    private void jbArrowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbArrowsActionPerformed
        this.craftItem(Survivalist.getCurrentGame().getInventory()[Constants.ARROW]);
    }//GEN-LAST:event_jbArrowsActionPerformed

    private void jbMacheteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMacheteActionPerformed
        this.craftItem(Survivalist.getCurrentGame().getInventory()[Constants.MACHETE]);
    }//GEN-LAST:event_jbMacheteActionPerformed

    private void jbAxeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAxeActionPerformed
        this.craftItem(Survivalist.getCurrentGame().getInventory()[Constants.AXE]);
    }//GEN-LAST:event_jbAxeActionPerformed

    private void jbHammerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHammerActionPerformed
        this.craftItem(Survivalist.getCurrentGame().getInventory()[Constants.HAMMER]);
    }//GEN-LAST:event_jbHammerActionPerformed

    private void jbFlintAndStoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFlintAndStoneActionPerformed
        this.craftItem(Survivalist.getCurrentGame().getInventory()[Constants.FLINTANDSTONE]);
    }//GEN-LAST:event_jbFlintAndStoneActionPerformed

    private void jbGrapplingHookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGrapplingHookActionPerformed
        this.craftItem(Survivalist.getCurrentGame().getInventory()[Constants.GRAPPLINGHOOK]);
    }//GEN-LAST:event_jbGrapplingHookActionPerformed

    private void jbKnifeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbKnifeActionPerformed
        this.craftItem(Survivalist.getCurrentGame().getInventory()[Constants.KNIFE]);
    }//GEN-LAST:event_jbKnifeActionPerformed

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
            java.util.logging.Logger.getLogger(CraftingMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CraftingMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CraftingMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CraftingMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CraftingMenuFrame().setVisible(true);
            }
        });
    }

    private void craftItem(Item item) {

        // get required resources and quantities from item
        RequiredItem[] requiredResources = item.getRequiredResources();

        // check to see if required resources are available
        boolean adequateResources = InventoryControl.checkAvailableResources(requiredResources);

        // IF required resources are available
        if (adequateResources) {
            double actualQuantity = item.getActualQuantity();
            actualQuantity++;
            item.setActualQuantity(actualQuantity);

            // craft item AND print "item has been crafted"
            JOptionPane.showMessageDialog(null, "You have crafted a(n) " + item.getName() + ".");
        } // ELSE resources are not available
        // print "you don't have the required resources"
        else {
            if (item.getName() != "Flint and Stone") {
                JOptionPane.showMessageDialog(null, "You do not have the required resources."
                        + "\nTo craft a(n) "
                        + item.getName()
                        + " , you need the following"
                        + "\namounts of the listed resources:"
                        + "\n  ->Item: "
                        + item.getRequiredResources()[0].getInventoryItem().getName()
                        + "  Quantity: " + item.getRequiredResources()[0].getRequiredAmount()
                        + "\n  ->Item: " + item.getRequiredResources()[1].getInventoryItem().getName()
                        + "  Quantity: " + item.getRequiredResources()[1].getRequiredAmount()
                        + "\n  ->Item: " + item.getRequiredResources()[2].getInventoryItem().getName()
                        + "  Quantity: " + item.getRequiredResources()[2].getRequiredAmount());
            } else if (item.getName() == "Flint and Stone") {
                JOptionPane.showMessageDialog(null, "You do not have the required resources."
                        + "\nTo craft a(n) "
                        + item.getName()
                        + " , you need the following"
                        + "\namounts of the listed resources:"
                        + "\n  ->Item: "
                        + item.getRequiredResources()[0].getInventoryItem().getName()
                        + "  Quantity: " + item.getRequiredResources()[0].getRequiredAmount()
                        + "\n  ->Item: " + item.getRequiredResources()[1].getInventoryItem().getName()
                        + "  Quantity: " + item.getRequiredResources()[1].getRequiredAmount());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton jbArrows;
    private javax.swing.JButton jbAxe;
    private javax.swing.JButton jbBow;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbFlintAndStone;
    private javax.swing.JButton jbGrapplingHook;
    private javax.swing.JButton jbHammer;
    private javax.swing.JButton jbHowToPlay;
    private javax.swing.JButton jbKnife;
    private javax.swing.JButton jbMachete;
    private javax.swing.JLabel jlCraftingMenuBackgroundImage;
    private javax.swing.JLabel jlCraftingMenuBanner;
    // End of variables declaration//GEN-END:variables
}
