/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;
import classes.*;
/**
 *
 * @author MASTER
 */
public class TelaContratacaoServico extends javax.swing.JFrame {
public Connection conn;
public PreparedStatement pstm;
public ResultSet rs;
public FuncionarioDAO fd;
    
    public TelaContratacaoServico() {
        fd= new FuncionarioDAO();
        initComponents();
        CarregarDados(TelaAcaoCliente.cpfFuncionarioEscolhido);
        
    }
    
    public void CarregarDados(String cpf){
        String sql = "SELECT c.VALOR_SESSAO, g.NOME, e.LOGRADOURO, e.BAIRRO, e.CIDADE, t.NUMERO, j.ESPECIALIDADE, g.SEXO , g.FOTO FROM PESSOA g  JOIN FUNCIONARIO j on g.CPF =j.CPF join CATEGORIA c on c.CPF = g.CPF join ENDERECO e on e.CPF =g.CPF join TELEFONES t on t.CPF = c.CPF WHERE g.CPF= ?";
        try {
            conn =  new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cpf);
            rs = pstm.executeQuery();
            while(rs.next()){
                
                
                
                InputNomePersonalContratacaoTexto.setText(rs.getString(2));
                InputLogradouro.setText(rs.getString(3));
                InputBairro.setText(rs.getString(4));
                InputCidade.setText(rs.getString(5));
                InputValorPersonalContratacaoTexto.setText(rs.getString(1));
                
                InputTelefoneContratacaoTexto.setText(rs.getString(6));
                InputSexoPersonalContratacaoTexto.setText(rs.getString(8));
                
                ImageIcon icon= new ImageIcon(rs.getBytes(9));
                icon.setImage(icon.getImage().getScaledInstance(iconBackground.getWidth(), iconBackground.getHeight(), 100));
                image.setIcon(icon);
                System.out.println(rs.getString(7));      
                
                InputEspecialidade.setText(fd.carregarEspecialidade2(rs.getString(7)));
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "n??o consegui carregar os dados da pessoa que vc quer contratar "+ e);
        }    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContratacaoServicoWhiteBackground = new javax.swing.JPanel();
        ConfirmacaoServicoText = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        InformacoesPersonalcontratadoText = new javax.swing.JLabel();
        NomePersonalContratacaoTexto = new javax.swing.JLabel();
        EnderecoPersonalContratacaoTexto = new javax.swing.JLabel();
        TelefonePersonalContratacaoTexto = new javax.swing.JLabel();
        SexoPersonalContratacaoTexto = new javax.swing.JLabel();
        IdadePersonalContratacaoTexto = new javax.swing.JLabel();
        InputNomePersonalContratacaoTexto = new javax.swing.JLabel();
        InputLogradouro = new javax.swing.JLabel();
        InputTelefoneContratacaoTexto = new javax.swing.JLabel();
        InputEspecialidade = new javax.swing.JLabel();
        InputSexoPersonalContratacaoTexto = new javax.swing.JLabel();
        ValorPersonalContratacaoTexto = new javax.swing.JLabel();
        InputValorPersonalContratacaoTexto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        InputBairro = new javax.swing.JLabel();
        InputCidade = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        iconBackground = new javax.swing.JPanel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Contratar servi??o");
        setPreferredSize(new java.awt.Dimension(650, 600));

        ContratacaoServicoWhiteBackground.setBackground(new java.awt.Color(255, 255, 255));
        ContratacaoServicoWhiteBackground.setMinimumSize(new java.awt.Dimension(600, 500));

        ConfirmacaoServicoText.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        ConfirmacaoServicoText.setText("Voc?? tem certeza de que quer contratar o servi??o?");

        btnConfirmar.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        InformacoesPersonalcontratadoText.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        InformacoesPersonalcontratadoText.setText("Informa????es");

        NomePersonalContratacaoTexto.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        NomePersonalContratacaoTexto.setText("Nome");

        EnderecoPersonalContratacaoTexto.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        EnderecoPersonalContratacaoTexto.setText("Logradouro");

        TelefonePersonalContratacaoTexto.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        TelefonePersonalContratacaoTexto.setText("Telefone");

        SexoPersonalContratacaoTexto.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        SexoPersonalContratacaoTexto.setText("Sexo");

        IdadePersonalContratacaoTexto.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        IdadePersonalContratacaoTexto.setText("Especilidade");

        InputNomePersonalContratacaoTexto.setText("jLabel1");
        InputNomePersonalContratacaoTexto.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                InputNomePersonalContratacaoTextoPropertyChange(evt);
            }
        });

        InputLogradouro.setText("jLabel1");
        InputLogradouro.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                InputLogradouroPropertyChange(evt);
            }
        });

        InputTelefoneContratacaoTexto.setText("jLabel1");
        InputTelefoneContratacaoTexto.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                InputTelefoneContratacaoTextoPropertyChange(evt);
            }
        });

        InputEspecialidade.setText(".");
        InputEspecialidade.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                InputEspecialidadePropertyChange(evt);
            }
        });

        InputSexoPersonalContratacaoTexto.setText("jLabel1");
        InputSexoPersonalContratacaoTexto.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                InputSexoPersonalContratacaoTextoPropertyChange(evt);
            }
        });

        ValorPersonalContratacaoTexto.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        ValorPersonalContratacaoTexto.setText("Valor do Servi??o");

        InputValorPersonalContratacaoTexto.setText("jLabel1");
        InputValorPersonalContratacaoTexto.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                InputValorPersonalContratacaoTextoPropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel1.setText("Bairro");

        jLabel2.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel2.setText("Cidade");

        InputBairro.setText("jLabel3");
        InputBairro.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                InputBairroPropertyChange(evt);
            }
        });

        InputCidade.setText("jLabel3");
        InputCidade.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                InputCidadePropertyChange(evt);
            }
        });

        javax.swing.GroupLayout iconBackgroundLayout = new javax.swing.GroupLayout(iconBackground);
        iconBackground.setLayout(iconBackgroundLayout);
        iconBackgroundLayout.setHorizontalGroup(
            iconBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
        );
        iconBackgroundLayout.setVerticalGroup(
            iconBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ContratacaoServicoWhiteBackgroundLayout = new javax.swing.GroupLayout(ContratacaoServicoWhiteBackground);
        ContratacaoServicoWhiteBackground.setLayout(ContratacaoServicoWhiteBackgroundLayout);
        ContratacaoServicoWhiteBackgroundLayout.setHorizontalGroup(
            ContratacaoServicoWhiteBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContratacaoServicoWhiteBackgroundLayout.createSequentialGroup()
                .addGroup(ContratacaoServicoWhiteBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContratacaoServicoWhiteBackgroundLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(InformacoesPersonalcontratadoText))
                    .addGroup(ContratacaoServicoWhiteBackgroundLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(ContratacaoServicoWhiteBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ContratacaoServicoWhiteBackgroundLayout.createSequentialGroup()
                                .addComponent(NomePersonalContratacaoTexto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(InputNomePersonalContratacaoTexto))
                            .addComponent(jLabel2)
                            .addGroup(ContratacaoServicoWhiteBackgroundLayout.createSequentialGroup()
                                .addComponent(IdadePersonalContratacaoTexto)
                                .addGap(18, 18, 18)
                                .addComponent(InputEspecialidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(ContratacaoServicoWhiteBackgroundLayout.createSequentialGroup()
                                .addGroup(ContratacaoServicoWhiteBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ValorPersonalContratacaoTexto)
                                    .addComponent(jLabel1)
                                    .addComponent(EnderecoPersonalContratacaoTexto))
                                .addGap(34, 34, 34)
                                .addGroup(ContratacaoServicoWhiteBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InputLogradouro)
                                    .addComponent(InputBairro)
                                    .addComponent(InputCidade)
                                    .addComponent(InputValorPersonalContratacaoTexto))))
                        .addGap(40, 40, 40)
                        .addGroup(ContratacaoServicoWhiteBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContratacaoServicoWhiteBackgroundLayout.createSequentialGroup()
                                .addComponent(TelefonePersonalContratacaoTexto)
                                .addGap(27, 27, 27)
                                .addComponent(InputTelefoneContratacaoTexto)
                                .addGap(47, 47, 47)
                                .addComponent(SexoPersonalContratacaoTexto)
                                .addGap(27, 27, 27)
                                .addComponent(InputSexoPersonalContratacaoTexto))
                            .addComponent(iconBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContratacaoServicoWhiteBackgroundLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btnCancelar)
                        .addGap(37, 37, 37)
                        .addComponent(btnConfirmar))
                    .addGroup(ContratacaoServicoWhiteBackgroundLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(ConfirmacaoServicoText)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        ContratacaoServicoWhiteBackgroundLayout.setVerticalGroup(
            ContratacaoServicoWhiteBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContratacaoServicoWhiteBackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(InformacoesPersonalcontratadoText)
                .addGap(30, 30, 30)
                .addGroup(ContratacaoServicoWhiteBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContratacaoServicoWhiteBackgroundLayout.createSequentialGroup()
                        .addGroup(ContratacaoServicoWhiteBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NomePersonalContratacaoTexto)
                            .addComponent(InputNomePersonalContratacaoTexto))
                        .addGap(18, 18, 18)
                        .addGroup(ContratacaoServicoWhiteBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EnderecoPersonalContratacaoTexto)
                            .addComponent(InputLogradouro))
                        .addGap(18, 18, 18)
                        .addGroup(ContratacaoServicoWhiteBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(InputBairro))
                        .addGap(18, 18, 18)
                        .addGroup(ContratacaoServicoWhiteBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(InputCidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(ContratacaoServicoWhiteBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ValorPersonalContratacaoTexto)
                            .addComponent(InputValorPersonalContratacaoTexto))
                        .addGap(29, 29, 29))
                    .addGroup(ContratacaoServicoWhiteBackgroundLayout.createSequentialGroup()
                        .addComponent(iconBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(ContratacaoServicoWhiteBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdadePersonalContratacaoTexto)
                    .addComponent(InputEspecialidade)
                    .addComponent(TelefonePersonalContratacaoTexto)
                    .addComponent(InputTelefoneContratacaoTexto)
                    .addComponent(SexoPersonalContratacaoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputSexoPersonalContratacaoTexto))
                .addGap(85, 85, 85)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ConfirmacaoServicoText)
                .addGap(40, 40, 40)
                .addGroup(ContratacaoServicoWhiteBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnConfirmar))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContratacaoServicoWhiteBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContratacaoServicoWhiteBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InputValorPersonalContratacaoTextoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_InputValorPersonalContratacaoTextoPropertyChange
        // TODO add your handling code here:

//        InputValorPersonalContratacaoTexto.setText(Double.toString(TelaInicio.cadastrosPersonal.get(TelaAcaoCliente.personalEscolhido).getValorServico()));
    }//GEN-LAST:event_InputValorPersonalContratacaoTextoPropertyChange

    private void InputSexoPersonalContratacaoTextoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_InputSexoPersonalContratacaoTextoPropertyChange
        // TODO add your handling code here:

//        InputSexoPersonalContratacaoTexto.setText(TelaInicio.cadastrosPersonal.get(TelaAcaoCliente.personalEscolhido).getSexo());
    }//GEN-LAST:event_InputSexoPersonalContratacaoTextoPropertyChange

    private void InputEspecialidadePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_InputEspecialidadePropertyChange
        // TODO add your handling code here:

//        InputEspecialidade.setText(TelaInicio.cadastrosPersonal.get(TelaAcaoCliente.personalEscolhido).getIdade());
    }//GEN-LAST:event_InputEspecialidadePropertyChange

    private void InputTelefoneContratacaoTextoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_InputTelefoneContratacaoTextoPropertyChange
        // TODO add your handling code here:

//        InputTelefoneContratacaoTexto.setText(TelaInicio.cadastrosPersonal.get(TelaAcaoCliente.personalEscolhido).getTelefone());
    }//GEN-LAST:event_InputTelefoneContratacaoTextoPropertyChange

    private void InputLogradouroPropertyChange(java.beans.PropertyChangeEvent evt) {                                               
        // TODO add your handling code here:
                                                                 

//        InputLogradouro.setText(TelaInicio.cadastrosPersonal.get(TelaAcaoCliente.personalEscolhido).getEndereco().getLogradouro());
    }                                              


    private void InputNomePersonalContratacaoTextoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_InputNomePersonalContratacaoTextoPropertyChange
        // TODO add your handling code here:

//        InputNomePersonalContratacaoTexto.setText(TelaInicio.cadastrosPersonal.get(TelaAcaoCliente.personalEscolhido).getNome());
    }//GEN-LAST:event_InputNomePersonalContratacaoTextoPropertyChange

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:

        int ans = JOptionPane.showConfirmDialog(null, "Voc?? tem certeza de que quer cancelar esta a????o?","Aviso",JOptionPane.YES_NO_OPTION);

        if(ans==0) //o usuario quer cancelar a operacao
        {
            this.setVisible(false);
            new TelaAcaoCliente().setVisible(true);
        }else //o usuario nao quer cancelar a operacao
        {
            this.setVisible(true);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
//        AQUI EST?? DANDO ERRO
//        TelaInicio.cadastrosPersonal.get(TelaAcaoCliente.personalEscolhido).setSaldo(TelaInicio.cadastrosPersonal.get(TelaAcaoCliente.personalEscolhido).getValorServico());

        this.setVisible(false);
        new SelecionarMetodoDePagamentoFinalizacao().setVisible(true);
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void InputBairroPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_InputBairroPropertyChange
        // TODO add your handling code here:
        
//        InputLogradouro.setText(TelaInicio.cadastrosPersonal.get(TelaAcaoCliente.personalEscolhido).getEndereco().getBairro());
    }//GEN-LAST:event_InputBairroPropertyChange

    private void InputCidadePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_InputCidadePropertyChange
        // TODO add your handling code here:
        
//        InputLogradouro.setText(TelaInicio.cadastrosPersonal.get(TelaAcaoCliente.personalEscolhido).getEndereco().getCidade());
    }//GEN-LAST:event_InputCidadePropertyChange

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
            java.util.logging.Logger.getLogger(TelaContratacaoServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaContratacaoServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaContratacaoServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaContratacaoServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaContratacaoServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConfirmacaoServicoText;
    private javax.swing.JPanel ContratacaoServicoWhiteBackground;
    private javax.swing.JLabel EnderecoPersonalContratacaoTexto;
    private javax.swing.JLabel IdadePersonalContratacaoTexto;
    private javax.swing.JLabel InformacoesPersonalcontratadoText;
    private javax.swing.JLabel InputBairro;
    private javax.swing.JLabel InputCidade;
    private javax.swing.JLabel InputEspecialidade;
    private javax.swing.JLabel InputLogradouro;
    private javax.swing.JLabel InputNomePersonalContratacaoTexto;
    private javax.swing.JLabel InputSexoPersonalContratacaoTexto;
    private javax.swing.JLabel InputTelefoneContratacaoTexto;
    private javax.swing.JLabel InputValorPersonalContratacaoTexto;
    private javax.swing.JLabel NomePersonalContratacaoTexto;
    private javax.swing.JLabel SexoPersonalContratacaoTexto;
    private javax.swing.JLabel TelefonePersonalContratacaoTexto;
    private javax.swing.JLabel ValorPersonalContratacaoTexto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JPanel iconBackground;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables




}
