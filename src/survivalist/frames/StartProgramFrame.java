/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survivalist.frames;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import survivalist.control.GameControl;
import survivalist.control.ProgramControl;
import survivalist.model.Player;

/**
 *
 * @author Madison
 */
public class StartProgramFrame extends javax.swing.JFrame {

    /**
     * Creates new form StartProgramFrame
     */
    public StartProgramFrame() {
        initComponents();

        // center the window relative to the screen
        setLocationRelativeTo(null);
    }
    public static String playerName;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jbQuit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPlayerName = new javax.swing.JTextPane();
        jlEnterYourName = new javax.swing.JLabel();
        jbStart = new javax.swing.JButton();
        jlStartProgramBackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLayeredPane1.setFocusCycleRoot(true);

        jbQuit.setBackground(new java.awt.Color(43, 72, 130));
        jbQuit.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbQuit.setForeground(new java.awt.Color(132, 193, 255));
        jbQuit.setText("Exit");
        jbQuit.setToolTipText("Exit the program");
        jbQuit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbQuit.setFocusPainted(false);
        jbQuit.setMaximumSize(new java.awt.Dimension(57, 23));
        jbQuit.setMinimumSize(new java.awt.Dimension(57, 23));
        jbQuit.setPreferredSize(new java.awt.Dimension(57, 23));
        jbQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jbQuit);
        jbQuit.setBounds(620, 370, 100, 30);

        jtPlayerName.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jtPlayerName.setToolTipText("Enter your name here");
        jtPlayerName.setMinimumSize(new java.awt.Dimension(6, 21));
        jtPlayerName.setPreferredSize(new java.awt.Dimension(6, 21));
        jtPlayerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtPlayerNameKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtPlayerName);

        jLayeredPane1.add(jScrollPane1);
        jScrollPane1.setBounds(490, 330, 230, 30);

        jlEnterYourName.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jlEnterYourName.setForeground(new java.awt.Color(132, 193, 255));
        jlEnterYourName.setText("Enter Your Name");
        jLayeredPane1.add(jlEnterYourName);
        jlEnterYourName.setBounds(490, 300, 230, 30);

        jbStart.setBackground(new java.awt.Color(43, 72, 130));
        jbStart.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jbStart.setForeground(new java.awt.Color(132, 193, 255));
        jbStart.setText("Start");
        jbStart.setToolTipText("Start the program");
        jbStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbStart.setFocusPainted(false);
        jbStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbStartActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jbStart);
        jbStart.setBounds(490, 370, 100, 30);

        jlStartProgramBackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/survivalist/images/startProgramBackgroundImage.jpg"))); // NOI18N
        jLayeredPane1.add(jlStartProgramBackgroundImage);
        jlStartProgramBackgroundImage.setBounds(0, 0, 750, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbStartActionPerformed

        // get name of player entered
        String playerName = this.jtPlayerName.getText();

        playerName = playerName.trim();
        // trim off excess blanks from name
        // if players name < 1 character
        if (playerName.length() < 1) {
            JOptionPane.showMessageDialog(this,
                    "The name must be at least one character long",
                    "Invalid Players Name", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Player player = ProgramControl.createPlayer(playerName);

        // show the main menu frame
        MainMenuFrame mainMenuFrame = new MainMenuFrame();
        mainMenuFrame.setVisible(true);

        // dispose of this frame
        this.dispose();

        // show personalized message on the next frame
        mainMenuFrame.getJlPlayerName().setText("Welcome to the Wild, " + playerName + ".");
    }//GEN-LAST:event_jbStartActionPerformed

    private void jbQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbQuitActionPerformed

    private void jtPlayerNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPlayerNameKeyPressed
        // if the key that is pressed is ENTER,
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // call the start button function
            jbStartActionPerformed(null);
        }
    }//GEN-LAST:event_jtPlayerNameKeyPressed

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
            java.util.logging.Logger.getLogger(StartProgramFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartProgramFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartProgramFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartProgramFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartProgramFrame().setVisible(true);
            }
        });
    }

    //public getters and setters
    public String getPlayerName() {
        playerName = this.jtPlayerName.getText();
        return playerName;
    }

    public void setPlayerName(JTextPane playerName) {
        this.jtPlayerName = playerName;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbQuit;
    private javax.swing.JButton jbStart;
    private javax.swing.JLabel jlEnterYourName;
    private javax.swing.JLabel jlStartProgramBackgroundImage;
    private javax.swing.JTextPane jtPlayerName;
    // End of variables declaration//GEN-END:variables

}
