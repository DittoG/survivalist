/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survivalist.frames;

import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import survivalist.control.GameControl;
import survivalist.model.Player;

/**
 *
 * @author Madison
 */
public class MainMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenuFrame() {
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
        jlPlayerName = new javax.swing.JLabel();
        jlMainMenuBanner = new javax.swing.JLabel();
        jbStartGame = new javax.swing.JButton();
        jbHowToPlay = new javax.swing.JButton();
        jbSaveGame = new javax.swing.JButton();
        jbLoadGame = new javax.swing.JButton();
        jbExit = new javax.swing.JButton();
        jlMainMenuBackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setMinimumSize(new java.awt.Dimension(748, 458));

        jlPlayerName.setFont(new java.awt.Font("Showcard Gothic", 0, 16)); // NOI18N
        jlPlayerName.setForeground(new java.awt.Color(255, 51, 51));
        jLayeredPane1.add(jlPlayerName);
        jlPlayerName.setBounds(220, 130, 460, 30);

        jlMainMenuBanner.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jlMainMenuBanner.setForeground(new java.awt.Color(48, 171, 48));
        jlMainMenuBanner.setText("Main Menu");
        jLayeredPane1.add(jlMainMenuBanner);
        jlMainMenuBanner.setBounds(220, 150, 270, 40);

        jbStartGame.setBackground(new java.awt.Color(43, 72, 130));
        jbStartGame.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jbStartGame.setForeground(new java.awt.Color(132, 193, 255));
        jbStartGame.setText("<html>Start <a style='text-decoration:underline'>G</a>ame</html>");
        jbStartGame.setToolTipText("Start a new game");
        jbStartGame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbStartGame.setFocusPainted(false);
        jbStartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbStartGameActionPerformed(evt);
            }
        });
        jbStartGame.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbStartGameKeyPressed(evt);
            }
        });
        jLayeredPane1.add(jbStartGame);
        jbStartGame.setBounds(220, 190, 160, 30);

        jbHowToPlay.setBackground(new java.awt.Color(43, 72, 130));
        jbHowToPlay.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
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

        jbSaveGame.setBackground(new java.awt.Color(43, 72, 130));
        jbSaveGame.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jbSaveGame.setForeground(new java.awt.Color(132, 193, 255));
        jbSaveGame.setText("<html><a style='text-decoration:underline'>S</a>ave Game</html>");
        jbSaveGame.setToolTipText("Save your current game");
        jbSaveGame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSaveGame.setFocusPainted(false);
        jLayeredPane1.add(jbSaveGame);
        jbSaveGame.setBounds(250, 230, 160, 30);

        jbLoadGame.setBackground(new java.awt.Color(43, 72, 130));
        jbLoadGame.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jbLoadGame.setForeground(new java.awt.Color(132, 193, 255));
        jbLoadGame.setText("<html><a style='text-decoration:underline'>L</a>oad Game</html>");
        jbLoadGame.setToolTipText("Load an existing game");
        jbLoadGame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLoadGame.setFocusPainted(false);
        jLayeredPane1.add(jbLoadGame);
        jbLoadGame.setBounds(280, 270, 160, 30);

        jbExit.setBackground(new java.awt.Color(43, 72, 130));
        jbExit.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jbExit.setForeground(new java.awt.Color(132, 193, 255));
        jbExit.setText("<html><a style='text-decoration:underline'>E</a>xit</html>");
        jbExit.setToolTipText("Exit to the Start Program Menu");
        jbExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbExit.setFocusPainted(false);
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jbExit);
        jbExit.setBounds(580, 420, 160, 30);

        jlMainMenuBackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/survivalist/images/mainMenuBackgroundImage.jpg"))); // NOI18N
        jLayeredPane1.add(jlMainMenuBackgroundImage);
        jlMainMenuBackgroundImage.setBounds(0, 0, 750, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbStartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbStartGameActionPerformed

        GameControl.startNewGame();

        GameMenuFrame gameMenuFrame = new GameMenuFrame();
        gameMenuFrame.setVisible(true);

        // dispose of this frame
        this.dispose();
    }//GEN-LAST:event_jbStartGameActionPerformed

    private void jbStartGameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbStartGameKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_G) {
            jbStartGameActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_H) {
            jbHowToPlayActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_E) {
            jbExitActionPerformed(null);
        }

    }//GEN-LAST:event_jbStartGameKeyPressed

    private void jbHowToPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHowToPlayActionPerformed

        HowToPlayFrame howToPlayFrame = new HowToPlayFrame();
        howToPlayFrame.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jbHowToPlayActionPerformed

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed

        StartProgramFrame startProgramFrame = new StartProgramFrame();
        startProgramFrame.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jbExitActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuFrame().setVisible(true);
            }
        });
    }

    // Public Getters and Setters
    public JLabel getJlPlayerName() {
        return jlPlayerName;
    }

    public void setJlPlayerName(JLabel jlPlayerName) {
        this.jlPlayerName = jlPlayerName;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbHowToPlay;
    private javax.swing.JButton jbLoadGame;
    private javax.swing.JButton jbSaveGame;
    private javax.swing.JButton jbStartGame;
    private javax.swing.JLabel jlMainMenuBackgroundImage;
    private javax.swing.JLabel jlMainMenuBanner;
    private javax.swing.JLabel jlPlayerName;
    // End of variables declaration//GEN-END:variables
}
