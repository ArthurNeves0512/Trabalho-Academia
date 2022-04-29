/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import classes.ConexaoBd;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author MASTER
 */
public class PagamentoCartaoCreditoCliente extends javax.swing.JFrame {
public Connection conn;
public PreparedStatement pstm;
public ResultSet rs;
    /**
     * Creates new form PagamentoCartaoCreditoFuncionario
     */
    public PagamentoCartaoCreditoCliente() {
        initComponents();
        CarregarDados(TelaInicio.cpfEscolhido);
        txtMostraCodigoSegurancaCadastrado.setEditable(false);
        txtMostraNumeroCartaoCadastrado.setEditable(false);
        txtMostraDataValidadeCadastrada.setEditable(false);
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PainelPagamento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroCartao = new javax.swing.JTextField();
        txtDataValidade = new javax.swing.JTextField();
        txtCodigoSeguranca = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        PainelPagamento1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMostraNumeroCartaoCadastrado = new javax.swing.JTextField();
        txtMostraDataValidadeCadastrada = new javax.swing.JTextField();
        txtMostraCodigoSegurancaCadastrado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cartão de Crédito");
        setMinimumSize(new java.awt.Dimension(578, 463));

        jPanel1.setBackground(new java.awt.Color(0, 130, 46));
        jPanel1.setPreferredSize(new java.awt.Dimension(578, 463));

        PainelPagamento.setBackground(new java.awt.Color(0, 130, 46));
        PainelPagamento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Cartão", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century", 1, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Número do Cartão");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data de Validade");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Código de Segurança");

        txtNumeroCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCartaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelPagamentoLayout = new javax.swing.GroupLayout(PainelPagamento);
        PainelPagamento.setLayout(PainelPagamentoLayout);
        PainelPagamentoLayout.setHorizontalGroup(
            PainelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPagamentoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PainelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelPagamentoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumeroCartao))
                    .addGroup(PainelPagamentoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtDataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigoSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelPagamentoLayout.setVerticalGroup(
            PainelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPagamentoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PainelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumeroCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(PainelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(txtDataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        btnSalvar.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        PainelPagamento1.setBackground(new java.awt.Color(0, 130, 46));
        PainelPagamento1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cartão Cadastrado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century", 1, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Número do Cartão");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Data de Validade");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Código de Segurança");

        javax.swing.GroupLayout PainelPagamento1Layout = new javax.swing.GroupLayout(PainelPagamento1);
        PainelPagamento1.setLayout(PainelPagamento1Layout);
        PainelPagamento1Layout.setHorizontalGroup(
            PainelPagamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPagamento1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PainelPagamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(PainelPagamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPagamento1Layout.createSequentialGroup()
                        .addComponent(txtMostraDataValidadeCadastrada, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtMostraCodigoSegurancaCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPagamento1Layout.createSequentialGroup()
                        .addComponent(txtMostraNumeroCartaoCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );
        PainelPagamento1Layout.setVerticalGroup(
            PainelPagamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPagamento1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PainelPagamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMostraNumeroCartaoCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(PainelPagamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(txtMostraDataValidadeCadastrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMostraCodigoSegurancaCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PainelPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelPagamento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(PainelPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(PainelPagamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnSalvar)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCartaoActionPerformed
        
    }//GEN-LAST:event_txtNumeroCartaoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        if (!(this.txtNumeroCartao.getText().isEmpty()) && !(this.txtDataValidade.getText().isEmpty())
                && !(this.txtCodigoSeguranca.getText().isEmpty())) {
            String sql = "UPDATE CARTAO_CREDITO SET NUMERO_CARTAO = ?, DATA_VALIDADE =?, CODIGO_SEGURANCA= ? WHERE CPF = ?";
            try {                
                conn = new ConexaoBd().conectaBd();
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, this.txtNumeroCartao.getText());
                pstm.setString(2, this.txtDataValidade.getText());
                pstm.setString(3, this.txtCodigoSeguranca.getText());
                pstm.setString(4, TelaInicio.cpfEscolhido);
                JOptionPane.showMessageDialog(null, "Dados Atualizados");
                pstm.execute();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else if ((this.txtMostraNumeroCartaoCadastrado.getText().isEmpty()) && this.txtMostraDataValidadeCadastrada.getText().isEmpty() && this.txtMostraCodigoSegurancaCadastrado.getText().isEmpty()) {
            if (!(this.txtCodigoSeguranca.getText().isEmpty()) && !(this.txtDataValidade.getText().isEmpty()) && !(this.txtNumeroCartao.getText().isEmpty())) {
                inserirPagamento(TelaInicio.cpfEscolhido);
                inserirCartaoCredito(TelaInicio.cpfEscolhido, this.txtNumeroCartao.getText(), this.txtDataValidade.getText(), this.txtCodigoSeguranca.getText());
                JOptionPane.showMessageDialog(null, "Dados Atualizados.");
            } else {
                JOptionPane.showMessageDialog(null, "coloque todos os dados para o cadastro");
            }
        }
        txtCodigoSeguranca.setText("");
        txtDataValidade.setText("");
        txtNumeroCartao.setText("");
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagamentoCartaoCreditoCliente().setVisible(true);
            }
        });
    }
    
    
    public void CarregarDados(String cpf) {
        System.out.println(cpf);
        String sql = "SELECT NUMERO_CARTAO, DATA_VALIDADE, CODIGO_SEGURANCA FROM CARTAO_CREDITO WHERE CPF = ?";
        try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cpf);
            rs = pstm.executeQuery();
            while (rs.next()) {
                txtMostraNumeroCartaoCadastrado.setText(rs.getString(1));
                txtMostraDataValidadeCadastrada.setText(rs.getString(2));
                txtMostraCodigoSegurancaCadastrado.setText(rs.getString(3));
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "não consegui carregar os dados da pessoa que vc quer contratar " + e);
        }

    }
    
    public void inserirPagamento(String cpf) {
        try {
            String sql = "INSERT INTO PAGAMENTOS(CPF,ID,CODIGO_PAGAMENTO) VALUES(?,0,0)";
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cpf);
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "não consegui cadastrar um pagamento " + e);
        }

    }   
    public void inserirCartaoCredito(String cpf, String numeroCartao, String dataValidade, String cod) {
        try {
            String sql = "INSERT INTO CARTAO_CREDITO(CPF,ID,CODIGO_ID,NUMERO_CARTAO,DATA_VALIDADE,CODIGO_SEGURANCA) VALUES(?,0,0,?,?,?)";
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cpf);
            pstm.setString(2, numeroCartao);
            pstm.setString(3, dataValidade);
            pstm.setString(4, cod);
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "não consegui cadastrar um cartão de crédito " + e);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPagamento;
    private javax.swing.JPanel PainelPagamento1;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodigoSeguranca;
    private javax.swing.JTextField txtDataValidade;
    private javax.swing.JTextField txtMostraCodigoSegurancaCadastrado;
    private javax.swing.JTextField txtMostraDataValidadeCadastrada;
    private javax.swing.JTextField txtMostraNumeroCartaoCadastrado;
    private javax.swing.JTextField txtNumeroCartao;
    // End of variables declaration//GEN-END:variables
}
