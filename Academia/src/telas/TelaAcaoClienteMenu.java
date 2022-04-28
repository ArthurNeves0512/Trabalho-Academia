/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.awt.Image;
import javax.swing.ImageIcon;
import classes.*;
/**
 *
 * @author MASTER
 */

public class TelaAcaoClienteMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaAcaoClienteMenu
     */
    public TelaAcaoClienteMenu() {
        if(TelaInicio.flag1!=1){
        ClienteDao cd = new ClienteDao();/*
        TelaInicio.cadastrosClientes = cd.pesquisarCliente();*/
        initComponents();
       
         for(int i =0; i<TelaInicio.cadastrosClientes.size(); i ++){
            if(TelaInicio.cadastrosClientes.get(i).getCpf().equals(TelaInicio.cpfEscolhido)){
         
                NomeCliente.setText(TelaInicio.cadastrosClientes.get(i).getNome());
                ImageIcon imcon = new ImageIcon(TelaInicio.cadastrosClientes.get(i).getFoto());
                Image imFit = imcon.getImage();
                Image imgFit = imFit.getScaledInstance(ImageIcon.getWidth(), ImageIcon.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon.setIcon(new ImageIcon(imgFit));
            }
        }
        }
        else{
            this.setVisible(false);
            TelaInicio.flag1 = 0;
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

        BackgroundPanelBlack = new javax.swing.JPanel();
        MenuSideBar = new javax.swing.JPanel();
        ImageIcon = new javax.swing.JLabel();
        NomeCliente = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ConfigText = new javax.swing.JLabel();
        SettIcon = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        HelpIcon = new javax.swing.JLabel();
        HelpText = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        PaymentIcon = new javax.swing.JLabel();
        txtPayment = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");

        BackgroundPanelBlack.setBackground(new java.awt.Color(0, 0, 0));
        BackgroundPanelBlack.setPreferredSize(new java.awt.Dimension(600, 500));

        MenuSideBar.setBackground(new java.awt.Color(255, 255, 255));

        ImageIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/muscular male torso outline inside a circle_128.png"))); // NOI18N

        NomeCliente.setText("Nome_Cliente");
        NomeCliente.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                NomeClientePropertyChange(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        ConfigText.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        ConfigText.setText("Configurações");
        ConfigText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfigTextMouseClicked(evt);
            }
        });

        SettIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/settings-icon(1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(SettIcon)
                .addGap(26, 26, 26)
                .addComponent(ConfigText)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SettIcon)
                    .addComponent(ConfigText))
                .addGap(13, 13, 13))
        );

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/2cross-rounded-outline.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        btnExit.setText("Sair");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        HelpIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ask-round-button.png"))); // NOI18N

        HelpText.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        HelpText.setText("Ajuda");
        HelpText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HelpTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(HelpIcon)
                .addGap(51, 51, 51)
                .addComponent(HelpText)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(HelpText)
                    .addComponent(HelpIcon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        PaymentIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/debit-card.png"))); // NOI18N

        txtPayment.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        txtPayment.setText("Pagamento");
        txtPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPaymentMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(PaymentIcon)
                .addGap(37, 37, 37)
                .addComponent(txtPayment)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPayment)
                    .addComponent(PaymentIcon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MenuSideBarLayout = new javax.swing.GroupLayout(MenuSideBar);
        MenuSideBar.setLayout(MenuSideBarLayout);
        MenuSideBarLayout.setHorizontalGroup(
            MenuSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuSideBarLayout.createSequentialGroup()
                .addGroup(MenuSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuSideBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuSideBarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExit)))
                .addContainerGap())
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuSideBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(MenuSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuSideBarLayout.createSequentialGroup()
                        .addComponent(ImageIcon)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuSideBarLayout.createSequentialGroup()
                        .addComponent(NomeCliente)
                        .addGap(64, 64, 64))))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenuSideBarLayout.setVerticalGroup(
            MenuSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuSideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ImageIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NomeCliente)
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addContainerGap())
        );

        javax.swing.GroupLayout BackgroundPanelBlackLayout = new javax.swing.GroupLayout(BackgroundPanelBlack);
        BackgroundPanelBlack.setLayout(BackgroundPanelBlackLayout);
        BackgroundPanelBlackLayout.setHorizontalGroup(
            BackgroundPanelBlackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelBlackLayout.createSequentialGroup()
                .addComponent(MenuSideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 462, Short.MAX_VALUE))
        );
        BackgroundPanelBlackLayout.setVerticalGroup(
            BackgroundPanelBlackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuSideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanelBlack, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanelBlack, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new TelaAcaoCliente().setVisible(true);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void ConfigTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfigTextMouseClicked
        // TODO add your handling code here:
        
        new ConfigCliente().setVisible(true);
    }//GEN-LAST:event_ConfigTextMouseClicked

    private void HelpTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpTextMouseClicked
        // TODO add your handling code here:
        TelaInicio.cadastrosClientes.get(0).ajuda();
    }//GEN-LAST:event_HelpTextMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.setVisible(false);
        new TelaInicio().setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPaymentMouseClicked
        // TODO add your handling code here:
        this.setVisible(true);
        new MetodoDePagamento().setVisible(true);
    }//GEN-LAST:event_txtPaymentMouseClicked

    private void NomeClientePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_NomeClientePropertyChange
        // TODO add your handling code here:
        
        PessoaDao pessoa = new PessoaDao();
        
        try 
        {
            NomeCliente.setText(pessoa.pesquisarPessoaTerNome(TelaInicio.cpfEscolhido));
        } catch (Exception e) 
        {
            NomeCliente.setText("deu ruim");
        }
    }//GEN-LAST:event_NomeClientePropertyChange

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
            java.util.logging.Logger.getLogger(TelaAcaoClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAcaoClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAcaoClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAcaoClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new TelaAcaoClienteMenu().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanelBlack;
    private javax.swing.JLabel ConfigText;
    private javax.swing.JLabel HelpIcon;
    private javax.swing.JLabel HelpText;
    private javax.swing.JLabel ImageIcon;
    private javax.swing.JPanel MenuSideBar;
    private javax.swing.JLabel NomeCliente;
    private javax.swing.JLabel PaymentIcon;
    private javax.swing.JLabel SettIcon;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnExit;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel txtPayment;
    // End of variables declaration//GEN-END:variables
}
