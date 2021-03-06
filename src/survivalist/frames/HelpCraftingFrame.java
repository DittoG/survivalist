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
public class HelpCraftingFrame extends javax.swing.JFrame {

    /**
     * Creates new form HelpCraftingFrame
     */
    public HelpCraftingFrame() {
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

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jlCraftingMenuBanner = new javax.swing.JLabel();
        jbExit = new javax.swing.JButton();
        jlHelpCraftingBackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(748, 458));
        setMinimumSize(new java.awt.Dimension(748, 458));

        jLayeredPane2.setMaximumSize(new java.awt.Dimension(748, 458));
        jLayeredPane2.setMinimumSize(new java.awt.Dimension(748, 458));

        jlCraftingMenuBanner.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jlCraftingMenuBanner.setForeground(new java.awt.Color(36, 97, 36));
        jlCraftingMenuBanner.setText("  How to Craft");
        jlCraftingMenuBanner.setToolTipText("");
        jLayeredPane2.add(jlCraftingMenuBanner);
        jlCraftingMenuBanner.setBounds(230, 0, 290, 50);

        jbExit.setBackground(new java.awt.Color(43, 72, 130));
        jbExit.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbExit.setForeground(new java.awt.Color(132, 193, 255));
        jbExit.setText("<html><a style='text-decoration:underline'>E</a>xit</html>");
        jbExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbExit.setFocusPainted(false);
        jbExit.setMinimumSize(new java.awt.Dimension(127, 27));
        jbExit.setPreferredSize(new java.awt.Dimension(127, 27));
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });
        jbExit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbExitKeyPressed(evt);
            }
        });
        jLayeredPane2.add(jbExit);
        jbExit.setBounds(580, 420, 160, 30);

        jlHelpCraftingBackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/survivalist/images/craftingMenuBackgroundImage.jpg"))); // NOI18N
        jlHelpCraftingBackgroundImage.setMaximumSize(new java.awt.Dimension(748, 458));
        jlHelpCraftingBackgroundImage.setMinimumSize(new java.awt.Dimension(748, 458));
        jlHelpCraftingBackgroundImage.setPreferredSize(new java.awt.Dimension(748, 458));
        jLayeredPane2.add(jlHelpCraftingBackgroundImage);
        jlHelpCraftingBackgroundImage.setBounds(0, 0, 748, 458);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed

        HowToPlayFrame howToPlayFrame = new HowToPlayFrame();
        howToPlayFrame.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jbExitActionPerformed

    private void jbExitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbExitKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_E) {
            jbExitActionPerformed(null);
        }
    }//GEN-LAST:event_jbExitKeyPressed

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
            java.util.logging.Logger.getLogger(HelpCraftingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpCraftingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpCraftingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpCraftingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpCraftingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JButton jbExit;
    private javax.swing.JLabel jlCraftingMenuBanner;
    private javax.swing.JLabel jlHelpCraftingBackgroundImage;
    // End of variables declaration//GEN-END:variables
}
