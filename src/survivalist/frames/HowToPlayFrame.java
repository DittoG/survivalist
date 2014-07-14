/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survivalist.frames;

import java.awt.event.KeyEvent;

/**
 *
 * @author Jerry
 */
public class HowToPlayFrame extends javax.swing.JFrame {

    /**
     * Creates new form HowToPlayFrame
     */
    public HowToPlayFrame() {
        initComponents();
        
        // set focus on button
        jbGoal.requestFocus();
        
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
        jlHowToPlayBanner = new javax.swing.JLabel();
        jbGoal = new javax.swing.JButton();
        jbExit = new javax.swing.JButton();
        jbHowToHuntAndGather = new javax.swing.JButton();
        jbHowToCraft = new javax.swing.JButton();
        jbHowToUseTheMap = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jlHowToPlayBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(748, 460));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(748, 460));

        jlHowToPlayBanner.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jlHowToPlayBanner.setForeground(new java.awt.Color(0, 0, 204));
        jlHowToPlayBanner.setText("How to play");
        jlHowToPlayBanner.setToolTipText("");
        jLayeredPane1.add(jlHowToPlayBanner);
        jlHowToPlayBanner.setBounds(250, 20, 340, 50);

        jbGoal.setBackground(new java.awt.Color(43, 72, 130));
        jbGoal.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbGoal.setForeground(new java.awt.Color(132, 193, 255));
        jbGoal.setText("What is the goal of the game?");
        jbGoal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbGoal.setFocusPainted(false);
        jbGoal.setMinimumSize(new java.awt.Dimension(127, 27));
        jbGoal.setPreferredSize(new java.awt.Dimension(127, 27));
        jbGoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGoalActionPerformed(evt);
            }
        });
        jbGoal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbGoalKeyPressed(evt);
            }
        });
        jLayeredPane1.add(jbGoal);
        jbGoal.setBounds(500, 260, 240, 30);

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
        jLayeredPane1.add(jbExit);
        jbExit.setBounds(580, 420, 160, 30);

        jbHowToHuntAndGather.setBackground(new java.awt.Color(43, 72, 130));
        jbHowToHuntAndGather.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbHowToHuntAndGather.setForeground(new java.awt.Color(132, 193, 255));
        jbHowToHuntAndGather.setText("How to hunt and gather");
        jbHowToHuntAndGather.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbHowToHuntAndGather.setFocusPainted(false);
        jbHowToHuntAndGather.setMinimumSize(new java.awt.Dimension(127, 27));
        jbHowToHuntAndGather.setPreferredSize(new java.awt.Dimension(127, 27));
        jbHowToHuntAndGather.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHowToHuntAndGatherActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jbHowToHuntAndGather);
        jbHowToHuntAndGather.setBounds(500, 340, 240, 30);

        jbHowToCraft.setBackground(new java.awt.Color(43, 72, 130));
        jbHowToCraft.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbHowToCraft.setForeground(new java.awt.Color(132, 193, 255));
        jbHowToCraft.setText("How to Craft");
        jbHowToCraft.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbHowToCraft.setFocusPainted(false);
        jbHowToCraft.setMinimumSize(new java.awt.Dimension(127, 27));
        jbHowToCraft.setPreferredSize(new java.awt.Dimension(127, 27));
        jbHowToCraft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHowToCraftActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jbHowToCraft);
        jbHowToCraft.setBounds(500, 380, 240, 30);

        jbHowToUseTheMap.setBackground(new java.awt.Color(43, 72, 130));
        jbHowToUseTheMap.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbHowToUseTheMap.setForeground(new java.awt.Color(132, 193, 255));
        jbHowToUseTheMap.setText("How to use the map");
        jbHowToUseTheMap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbHowToUseTheMap.setFocusPainted(false);
        jbHowToUseTheMap.setMinimumSize(new java.awt.Dimension(127, 27));
        jbHowToUseTheMap.setPreferredSize(new java.awt.Dimension(127, 27));
        jbHowToUseTheMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHowToUseTheMapActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jbHowToUseTheMap);
        jbHowToUseTheMap.setBounds(500, 300, 240, 30);

        jScrollPane1.setOpaque(false);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Trajan Pro", 0, 13)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(132, 193, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome to the wild... You are a college student going to canada with your uncle for\nthe fall and winter. He is flying you there in a small bushplane when suddenly a violent\nstorm hits, and he loses control of the plane; forced to make a crash landing, he brings\nthe plane down on a lake between two large mountains, slamming forcefully into the icy \nwater. As the plane begins to sink, you look over at your uncle and see that he is \nunconcious. Unable to save him, you swim towards the surface, and drag yourself to the \nshore, shivering from the cold. Looking around, you realize that you are in the middle of\nnowhere, it will soon be dark, and all your belongings are at the bottom of the lake,\nexcept your wet clothes which are quickly freezing solid.");
        jTextArea1.setBorder(null);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        jLayeredPane1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 720, 180);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(132, 193, 255));
        jLabel1.setText("You are alone.");
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(220, 280, 140, 30);

        jlHowToPlayBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/survivalist/images/howToPlayBackgroundImage.jpg"))); // NOI18N
        jLayeredPane1.add(jlHowToPlayBackground);
        jlHowToPlayBackground.setBounds(0, 0, 748, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed

        MainMenuFrame mainMenuFrame = new MainMenuFrame();
        mainMenuFrame.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_jbExitActionPerformed

    private void jbGoalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbGoalKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_G) {
            jbGoalActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_M) {
            jbHowToUseTheMapActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_H) {
            jbHowToHuntAndGatherActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_C) {
            jbHowToCraftActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_E) {
            jbExitActionPerformed(null);
        }
            
    }//GEN-LAST:event_jbGoalKeyPressed

    private void jbHowToCraftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHowToCraftActionPerformed
        
        HelpCraftingFrame helpCraftingFrame = new HelpCraftingFrame();
        helpCraftingFrame.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_jbHowToCraftActionPerformed

    private void jbHowToHuntAndGatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHowToHuntAndGatherActionPerformed
        
        HelpHuntingGatheringFrame helpHuntingGatheringFrame = new HelpHuntingGatheringFrame();
        helpHuntingGatheringFrame.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_jbHowToHuntAndGatherActionPerformed

    private void jbGoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGoalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbGoalActionPerformed

    private void jbHowToUseTheMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHowToUseTheMapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbHowToUseTheMapActionPerformed

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
            java.util.logging.Logger.getLogger(HowToPlayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HowToPlayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HowToPlayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HowToPlayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HowToPlayFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbGoal;
    private javax.swing.JButton jbHowToCraft;
    private javax.swing.JButton jbHowToHuntAndGather;
    private javax.swing.JButton jbHowToUseTheMap;
    private javax.swing.JLabel jlHowToPlayBackground;
    private javax.swing.JLabel jlHowToPlayBanner;
    // End of variables declaration//GEN-END:variables
}