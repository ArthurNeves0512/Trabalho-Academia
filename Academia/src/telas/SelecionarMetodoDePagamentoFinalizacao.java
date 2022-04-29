/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author MASTER
 */
public class SelecionarMetodoDePagamentoFinalizacao extends javax.swing.JFrame {

    /**
     * Creates new form MetodoDePagamento
     */
    
    
    public SelecionarMetodoDePagamentoFinalizacao() {
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

        jPanel1 = new javax.swing.JPanel();
        txtMensagemSelecionarPagamento = new javax.swing.JLabel();
        btnCartaoCredito = new javax.swing.JButton();
        btnCartaoDebito = new javax.swing.JButton();
        btnPIX = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(528, 532));

        txtMensagemSelecionarPagamento.setBackground(new java.awt.Color(0, 0, 0));
        txtMensagemSelecionarPagamento.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        txtMensagemSelecionarPagamento.setText("Selecione o método de pagamento");

        btnCartaoCredito.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        btnCartaoCredito.setText("Cartão de Crédito");
        btnCartaoCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaoCreditoActionPerformed(evt);
            }
        });

        btnCartaoDebito.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        btnCartaoDebito.setText("Cartão de Débito");
        btnCartaoDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaoDebitoActionPerformed(evt);
            }
        });

        btnPIX.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        btnPIX.setText("Chave PIX");
        btnPIX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPIXActionPerformed(evt);
            }
        });

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/2cross-rounded-outline.png"))); // NOI18N
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnCartaoCredito)
                .addGap(39, 39, 39)
                .addComponent(btnCartaoDebito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnPIX)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMensagemSelecionarPagamento)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(btnFechar)
                .addGap(18, 18, 18)
                .addComponent(txtMensagemSelecionarPagamento)
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCartaoCredito)
                    .addComponent(btnCartaoDebito)
                    .addComponent(btnPIX))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCartaoCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaoCreditoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ConfirmacaoContratacaoServico().setVisible(true);
    }//GEN-LAST:event_btnCartaoCreditoActionPerformed

    private void btnCartaoDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaoDebitoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ConfirmacaoContratacaoServico().setVisible(true);
    }//GEN-LAST:event_btnCartaoDebitoActionPerformed

    private void btnPIXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPIXActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ConfirmacaoContratacaoServico().setVisible(true);
        //new ConfirmacaoContratacaoServico().setVisible(true);
    }//GEN-LAST:event_btnPIXActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new TelaAcaoCliente().setVisible(true);
    }//GEN-LAST:event_btnFecharActionPerformed

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
            java.util.logging.Logger.getLogger(SelecionarMetodoDePagamentoFinalizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelecionarMetodoDePagamentoFinalizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelecionarMetodoDePagamentoFinalizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelecionarMetodoDePagamentoFinalizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelecionarMetodoDePagamentoFinalizacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCartaoCredito;
    private javax.swing.JButton btnCartaoDebito;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnPIX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtMensagemSelecionarPagamento;
    // End of variables declaration//GEN-END:variables
}
