/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

/**
 *
 * @author MASTER
 */
public class TelaAcaoPersonal extends javax.swing.JFrame {

    /**
     * Creates new form TelaAcaoPersonal
     */
    public TelaAcaoPersonal() {
        if(TelaInicio.flag2 !=1){
            
        
        initComponents();
        }
        else{
            this.setVisible(false);
            TelaInicio.flag2 = 0;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PersonalBackgroundMenuWhite = new javax.swing.JPanel();
        btnPersonalMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnOnAndOff = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PersonalBackgroundMenuWhite.setBackground(new java.awt.Color(0, 207, 137));
        PersonalBackgroundMenuWhite.setMinimumSize(new java.awt.Dimension(600, 500));

        btnPersonalMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/4menu-three-outlined-rounded-lines-symbol.png"))); // NOI18N
        btnPersonalMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonalMenuActionPerformed(evt);
            }
        });

        jLabel1.setText("TRABALHANDO");

        btnOnAndOff.setText("Ativar");
        btnOnAndOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnAndOffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PersonalBackgroundMenuWhiteLayout = new javax.swing.GroupLayout(PersonalBackgroundMenuWhite);
        PersonalBackgroundMenuWhite.setLayout(PersonalBackgroundMenuWhiteLayout);
        PersonalBackgroundMenuWhiteLayout.setHorizontalGroup(
            PersonalBackgroundMenuWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonalBackgroundMenuWhiteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PersonalBackgroundMenuWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PersonalBackgroundMenuWhiteLayout.createSequentialGroup()
                        .addComponent(btnPersonalMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersonalBackgroundMenuWhiteLayout.createSequentialGroup()
                        .addGap(0, 254, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersonalBackgroundMenuWhiteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOnAndOff, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
        );
        PersonalBackgroundMenuWhiteLayout.setVerticalGroup(
            PersonalBackgroundMenuWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonalBackgroundMenuWhiteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPersonalMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOnAndOff, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PersonalBackgroundMenuWhite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PersonalBackgroundMenuWhite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonalMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonalMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new TelaAcaoPersonalMenu().setVisible(true);
    }//GEN-LAST:event_btnPersonalMenuActionPerformed

    private void btnOnAndOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnAndOffActionPerformed
        // TODO add your handling code here:
        
        if(btnOnAndOff.isSelected())
        {
            System.out.println("entrei no if");
            //dizer que o personal esta online
            btnOnAndOff.setText("Desativar");
            for(int i =0; i<TelaInicio.cadastrosPersonal.size(); i ++){
            if(TelaInicio.cadastrosPersonal.get(i).getCpf().equals(TelaInicio.cpfEscolhido)){
                TelaInicio.cadastrosPersonal.get(i).setTrabalhando("sim");
            }
        }
        }else
        {
            System.out.println("entrei no else");
            //dizer que o personal esta online
            btnOnAndOff.setText("Ativar");
            for(int i =0; i<TelaInicio.cadastrosPersonal.size(); i ++){
            if(TelaInicio.cadastrosPersonal.get(i).getCpf().equals(TelaInicio.cpfEscolhido)){
                TelaInicio.cadastrosPersonal.get(i).setTrabalhando("não");
            }
        }
        }
    }//GEN-LAST:event_btnOnAndOffActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAcaoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAcaoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAcaoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAcaoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAcaoPersonal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PersonalBackgroundMenuWhite;
    private javax.swing.JToggleButton btnOnAndOff;
    private javax.swing.JButton btnPersonalMenu;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
