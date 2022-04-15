/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author MASTER
 */
public class TelaAcaoPersonalMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaAcaoPersonalMenu
     */
    public TelaAcaoPersonalMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PersonalMenuBackground = new javax.swing.JPanel();
        PersonalMenuBar = new javax.swing.JPanel();
        btnPersonalExit = new javax.swing.JButton();
        PersonalIconImage = new javax.swing.JLabel();
        PersonalName = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        PersonalConfigIcon = new javax.swing.JLabel();
        PersonalConfigText = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        PersonalPaymentIcon = new javax.swing.JLabel();
        PersonalPaymentText = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        PersonalFeedbackIcon = new javax.swing.JLabel();
        PersonalFeedbackText = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        PersonalHelpIcon = new javax.swing.JLabel();
        PersonalHelpText = new javax.swing.JLabel();
        btnExitPersonal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PersonalMenuBackground.setBackground(new java.awt.Color(0, 0, 0));
        PersonalMenuBackground.setMinimumSize(new java.awt.Dimension(600, 500));

        PersonalMenuBar.setBackground(new java.awt.Color(255, 255, 255));

        btnPersonalExit.setBackground(new java.awt.Color(255, 255, 255));
        btnPersonalExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/2cross-rounded-outline.png"))); // NOI18N
        btnPersonalExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonalExitActionPerformed(evt);
            }
        });

        PersonalIconImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/circle-icon-magenta_bckgnd.png"))); // NOI18N

        PersonalName.setText("Nome_Personal_Mudar");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        PersonalConfigIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/settings-icon(1).png"))); // NOI18N

        PersonalConfigText.setText("Configuração");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(PersonalConfigIcon)
                .addGap(28, 28, 28)
                .addComponent(PersonalConfigText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PersonalConfigIcon)
                    .addComponent(PersonalConfigText))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        PersonalPaymentIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/debit-card.png"))); // NOI18N

        PersonalPaymentText.setText("Pagamento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(PersonalPaymentIcon)
                .addGap(27, 27, 27)
                .addComponent(PersonalPaymentText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PersonalPaymentText)
                    .addComponent(PersonalPaymentIcon))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        PersonalFeedbackIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/chat-bubbles-couple-hand-drawn-outlines.png"))); // NOI18N

        PersonalFeedbackText.setText("Feedback");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(PersonalFeedbackIcon)
                .addGap(33, 33, 33)
                .addComponent(PersonalFeedbackText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PersonalFeedbackText)
                    .addComponent(PersonalFeedbackIcon))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        PersonalHelpIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ask-round-button.png"))); // NOI18N

        PersonalHelpText.setText("Ajuda");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(PersonalHelpIcon)
                .addGap(42, 42, 42)
                .addComponent(PersonalHelpText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PersonalHelpText)
                    .addComponent(PersonalHelpIcon))
                .addContainerGap())
        );

        btnExitPersonal.setBackground(new java.awt.Color(255, 255, 255));
        btnExitPersonal.setText("Sair");

        javax.swing.GroupLayout PersonalMenuBarLayout = new javax.swing.GroupLayout(PersonalMenuBar);
        PersonalMenuBar.setLayout(PersonalMenuBarLayout);
        PersonalMenuBarLayout.setHorizontalGroup(
            PersonalMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PersonalMenuBarLayout.createSequentialGroup()
                .addGroup(PersonalMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PersonalMenuBarLayout.createSequentialGroup()
                        .addGroup(PersonalMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PersonalMenuBarLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnPersonalExit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PersonalMenuBarLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(PersonalMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PersonalName)
                                    .addComponent(PersonalIconImage))))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersonalMenuBarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExitPersonal)))
                .addContainerGap())
        );
        PersonalMenuBarLayout.setVerticalGroup(
            PersonalMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonalMenuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPersonalExit)
                .addGap(18, 18, 18)
                .addComponent(PersonalIconImage)
                .addGap(18, 18, 18)
                .addComponent(PersonalName)
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(btnExitPersonal)
                .addContainerGap())
        );

        javax.swing.GroupLayout PersonalMenuBackgroundLayout = new javax.swing.GroupLayout(PersonalMenuBackground);
        PersonalMenuBackground.setLayout(PersonalMenuBackgroundLayout);
        PersonalMenuBackgroundLayout.setHorizontalGroup(
            PersonalMenuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonalMenuBackgroundLayout.createSequentialGroup()
                .addComponent(PersonalMenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 463, Short.MAX_VALUE))
        );
        PersonalMenuBackgroundLayout.setVerticalGroup(
            PersonalMenuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PersonalMenuBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PersonalMenuBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PersonalMenuBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonalExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonalExitActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new TelaAcaoPersonal().setVisible(true);
    }//GEN-LAST:event_btnPersonalExitActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAcaoPersonalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAcaoPersonalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAcaoPersonalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAcaoPersonalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAcaoPersonalMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PersonalConfigIcon;
    private javax.swing.JLabel PersonalConfigText;
    private javax.swing.JLabel PersonalFeedbackIcon;
    private javax.swing.JLabel PersonalFeedbackText;
    private javax.swing.JLabel PersonalHelpIcon;
    private javax.swing.JLabel PersonalHelpText;
    private javax.swing.JLabel PersonalIconImage;
    private javax.swing.JPanel PersonalMenuBackground;
    private javax.swing.JPanel PersonalMenuBar;
    private javax.swing.JLabel PersonalName;
    private javax.swing.JLabel PersonalPaymentIcon;
    private javax.swing.JLabel PersonalPaymentText;
    private javax.swing.JButton btnExitPersonal;
    private javax.swing.JButton btnPersonalExit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
