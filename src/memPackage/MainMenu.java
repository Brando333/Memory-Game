

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package memPackage;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author avih2
 */
public class MainMenu extends javax.swing.JFrame {

    private static MainMenu mainMenu;

    /**
     * Creates new form mainMenu
     */
    private MainMenu() {
        //Nobody should be able tu construct a new menu, just this class, once.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        playButton = new javax.swing.JButton();
        highscoreButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        aboutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 248, 201));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel1.setText("MEMORY GAME");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        playButton.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        playButton.setText("PLAY");
        playButton.setToolTipText("");
        playButton.setAlignmentY(0.0F);
        playButton.setFocusPainted(false);
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        highscoreButton.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        highscoreButton.setText("HIGHSCORE");
        highscoreButton.setFocusPainted(false);
        highscoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highscoreButtonActionPerformed(evt);
            }
        });

        quitButton.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        quitButton.setText("QUIT");
        quitButton.setFocusPainted(false);
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        aboutButton.setFont(new java.awt.Font("French Script MT", 3, 48)); // NOI18N
        aboutButton.setText("i");
        aboutButton.setBorderPainted(false);
        aboutButton.setContentAreaFilled(false);
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(113, 113, 113).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER).addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel1).addComponent(highscoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE).addComponent(aboutButton).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(45, 45, 45).addComponent(jLabel1).addGap(55, 55, 55).addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(highscoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(68, 68, 68).addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(111, 111, 111)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(aboutButton).addGap(75, 75, 75)))));

        setSize(new java.awt.Dimension(500, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        // TODO add your handling code here:
        JFrame quitConfirm = new JFrame();
        if (JOptionPane.showConfirmDialog(quitConfirm, "Are you sure you want to quit?", "QUIT", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_quitButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        // TODO add your handling code here:
        close();
        InstructionsMenu instructions = new InstructionsMenu();
        instructions.setVisible(true);

    }//GEN-LAST:event_playButtonActionPerformed

    private void highscoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highscoreButtonActionPerformed
        // TODO add your handling code here:
        close();
        HighScoreMenu highscore = new HighScoreMenu();
        highscore.setVisible(true);
    }//GEN-LAST:event_highscoreButtonActionPerformed

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this.aboutButton, "Made By Aviare & Wasfee", "ABOUT", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aboutButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(MainMenu::showMenu);
    }

    public static void showMenu() {
        //Since the creation of a menu is expensive, let's not instantiate a new one everytime we want to display it
        //let's create it just once
        Color colour = new Color(255, 248, 201);
        if (mainMenu == null) {
            MainMenu menu = new MainMenu();
            menu.setVisible(true);
            menu.initComponents();
            menu.getContentPane().setBackground(colour);

            mainMenu = menu;
        } else {
            System.out.println("Using the already created menu");
            mainMenu.setVisible(true);
            mainMenu.initComponents();
            mainMenu.initComponents();
            mainMenu.getContentPane().setBackground(colour);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutButton;
    private javax.swing.JButton highscoreButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton playButton;
    private javax.swing.JButton quitButton;
    // End of variables declaration//GEN-END:variables
}