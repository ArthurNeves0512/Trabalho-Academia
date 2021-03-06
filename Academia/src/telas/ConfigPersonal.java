/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import classes.*;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.*;
import javax.imageio.ImageIO;

/**
 *
 * @author arthur
 */
public class ConfigPersonal extends javax.swing.JFrame {
    public Connection conn;
    public PreparedStatement pstm;
    public ResultSet rs;
    private File imagem;
    Funcionario fun= new Funcionario();
//    byte[] byteArray;
    
    FuncionarioDAO funcionario = new FuncionarioDAO();
    
    /**
     * Creates new form ConfigPersonal
     */
    public ConfigPersonal() {
        initComponents();
        
        System.out.println(TelaInicio.infos_login.get(1) +"meu deus do ceu linha 44");
        buscarDados(TelaInicio.infos_login.get(1));
        System.out.println("meu deus do ceu linha 46");
        txtCpf.setEditable(false);
        System.out.println("txt cpf "+ txtCpf.getText());
        System.out.println("será que vai mostrar algo? "+funcionario.carregarEspecialidadeNaConfiguracao(TelaInicio.infos_login.get(1)));
        String especialidades = funcionario.carregarEspecialidadeNaConfiguracao(TelaInicio.infos_login.get(1));
        System.out.println("meu deus do ceu linha 51 "+ especialidades);
        especialidades.length();
        if(Character.compare(especialidades.charAt(0),'1')==0)
        {
            checkBoxAbdomen.setSelected(true);
        }
        if(Character.compare(especialidades.charAt(1),'1')==0)
        {
            checkBoxPeito.setSelected(true);
        }
        if(Character.compare(especialidades.charAt(2),'1')==0)
        {
            checkBoxBracos.setSelected(true);
        }
        if(Character.compare(especialidades.charAt(3),'1')==0)
        {
            checkBoxPernas.setSelected(true);
        }
        if(Character.compare(especialidades.charAt(4),'1')==0)
        {
            checkBoxOmbros.setSelected(true);
        }
        /*      
        ImageIcon imcon = new ImageIcon(TelaInicio.cadastrosPersonal.get(i).getFoto());
        Image imFit = imcon.getImage();                
        Image imgFit = imFit.getScaledInstance(pnlFoto.getWidth(), pnlFoto.getHeight(), Image.SCALE_SMOOTH);
        pnlFoto.setIcon(new ImageIcon(imgFit));*/
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        iconBackground = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnUpload = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtAlterarSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        checkBoxAbdomen = new javax.swing.JCheckBox();
        checkBoxPeito = new javax.swing.JCheckBox();
        checkBoxBracos = new javax.swing.JCheckBox();
        checkBoxPernas = new javax.swing.JCheckBox();
        checkBoxOmbros = new javax.swing.JCheckBox();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuração Personal");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 58, 122));
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 700));

        iconBackground.setBackground(new java.awt.Color(255, 255, 255));

        image.setBackground(new java.awt.Color(102, 255, 204));

        javax.swing.GroupLayout iconBackgroundLayout = new javax.swing.GroupLayout(iconBackground);
        iconBackground.setLayout(iconBackgroundLayout);
        iconBackgroundLayout.setHorizontalGroup(
            iconBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );
        iconBackgroundLayout.setVerticalGroup(
            iconBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CPF");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Logradouro");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CEP");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefone");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Alterar Email");

        btnUpload.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        btnUpload.setText("Carregar foto");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        btnExcluir.setText("Apagar conta");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtAlterarSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtAlterarSenha.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        txtAlterarSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtAlterarSenha.setText("Alterar senha");

        btnVoltar.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cidade");

        jLabel9.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Bairro");

        jLabel10.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Especialidades");

        checkBoxAbdomen.setBackground(new java.awt.Color(0, 58, 122));
        checkBoxAbdomen.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        checkBoxAbdomen.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxAbdomen.setText("Abdomen");

        checkBoxPeito.setBackground(new java.awt.Color(0, 58, 122));
        checkBoxPeito.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        checkBoxPeito.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxPeito.setText("Peito");

        checkBoxBracos.setBackground(new java.awt.Color(0, 58, 122));
        checkBoxBracos.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        checkBoxBracos.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxBracos.setText("Braços");

        checkBoxPernas.setBackground(new java.awt.Color(0, 58, 122));
        checkBoxPernas.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        checkBoxPernas.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxPernas.setText("Pernas");

        checkBoxOmbros.setBackground(new java.awt.Color(0, 58, 122));
        checkBoxOmbros.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        checkBoxOmbros.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxOmbros.setText("Ombros");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtLogradouro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(84, 84, 84)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(txtNome)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtAlterarSenha)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel10))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                        .addComponent(txtSenha)
                                        .addComponent(txtTelefone))
                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkBoxAbdomen)
                                            .addComponent(checkBoxBracos))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkBoxPernas)
                                            .addComponent(checkBoxPeito))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnVoltar)
                                .addGap(124, 124, 124))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnUpload)
                                .addGap(108, 108, 108))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(btnSalvar)
                                .addGap(44, 44, 44)
                                .addComponent(btnExcluir)))
                        .addGap(30, 30, 30))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(checkBoxOmbros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnUpload)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(iconBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExcluir)
                        .addComponent(btnSalvar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAlterarSenha))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnVoltar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkBoxAbdomen)
                            .addComponent(checkBoxPeito))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBoxBracos)
                            .addComponent(checkBoxPernas)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkBoxOmbros)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        funcionario.excluirFuncionario(TelaInicio.infos_login.get(1));
        
        JOptionPane.showMessageDialog(null, "Sua conta foi deletada.","Concluído", JOptionPane.INFORMATION_MESSAGE);
        
        this.setVisible(false);
        new TelaInicio().setVisible(true);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        imagem = selecionarImagem();
        abrirImagem(imagem);
        fun.setImagem(getImagem());
        funcionario.atualizaNome(txtNome.getText(),TelaInicio.infos_login.get(1),fun.getImagem());
        
    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new TelaAcaoPersonalMenu().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        funcionario.atualizarCadastroFuncionario(TelaInicio.infos_login.get(1), fun.getImagem() , txtNome.getText(), txtLogradouro.getText(), txtBairro.getText(), txtCidade.getText(), txtCep.getText(), txtTelefone.getText(), txtEmail.getText(), txtSenha.getText());
        System.out.println("rodei duda");
        String ans = "";

        if (checkBoxAbdomen.isSelected() == true) {
            ans += "1";
        }
        else{ans+="0";}
        if (checkBoxPeito.isSelected() == true) {
            ans += "1";
        }
        else {
            ans += "0";
        }
        if (checkBoxBracos.isSelected() == true) {
            ans += "1";
        }
        else {
            ans += "0";
        }
        if (checkBoxPernas.isSelected() == true) {
            ans += "1";
        }
        else {
            ans += "0";
        }
        if (checkBoxOmbros.isSelected() == true) {
            ans += "1";
        }
        else {
            ans += "0";
        }

        funcionario.atualizaEspecialidade(ans, TelaInicio.infos_login.get(1));
        JOptionPane.showMessageDialog(null, "Dados Salvos com Sucesso!", "Dados Salvos", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(ConfigPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUpload;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox checkBoxAbdomen;
    private javax.swing.JCheckBox checkBoxBracos;
    private javax.swing.JCheckBox checkBoxOmbros;
    private javax.swing.JCheckBox checkBoxPeito;
    private javax.swing.JCheckBox checkBoxPernas;
    private javax.swing.JPanel iconBackground;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtAlterarSenha;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void buscarDados(String cpf) {
        String sql = "SELECT PESSOA.NOME, PESSOA.CPF, ENDERECO.LOGRADOURO, ENDERECO.BAIRRO, ENDERECO.CIDADE, ENDERECO.CEP, TELEFONES.NUMERO, CADASTRO.EMAIL , CADASTRO.SENHA, PESSOA.FOTO FROM PESSOA, CADASTRO, ENDERECO, TELEFONES, FUNCIONARIO WHERE (PESSOA.ID = 1 AND PESSOA.CPF = ?) AND (TELEFONES.ID=1 AND TELEFONES.CPF= ?) AND (FUNCIONARIO.ID=1 AND FUNCIONARIO.CPF= ?) AND (CADASTRO.ID=1 AND CADASTRO.CPF= ?) AND (ENDERECO.ID=1 AND ENDERECO.CPF = ?)";

        try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, cpf);
            pstm.setString(2, cpf);
            pstm.setString(3, cpf);
            pstm.setString(4, cpf);
            pstm.setString(5, cpf);
            rs= pstm.executeQuery();
            
            while(rs.next()){
                txtNome.setText(rs.getString(1));
                txtCpf.setText(rs.getString(2));
                txtLogradouro.setText(rs.getString(3));
                txtBairro.setText(rs.getString(4));
                txtCidade.setText(rs.getString(5));
                txtCep.setText(rs.getString(6));
                txtTelefone.setText(rs.getString(7));
                txtEmail.setText(rs.getString(8));
                txtSenha.setText(rs.getString(9));
                ImageIcon icon = new ImageIcon(rs.getBytes(10));
                icon.setImage(icon.getImage().getScaledInstance(iconBackground.getWidth(), iconBackground.getHeight(), 100));
                image.setIcon(icon);
            }
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "não consegui carregar os dados do funcionario para tela configuração " + e);
        }    
   }
    
    private void abrirImagem(Object source) {
        if (source instanceof File) {
            ImageIcon icon = new ImageIcon(imagem.getAbsolutePath());
            icon.setImage(icon.getImage().getScaledInstance(iconBackground.getWidth(), iconBackground.getHeight(), 100));
            image.setIcon(icon);
        } else if (source instanceof byte[]) {
            ImageIcon icon = new ImageIcon(fun.getImagem());
            icon.setImage(icon.getImage().getScaledInstance(iconBackground.getWidth(), iconBackground.getHeight(), 100));
            image.setIcon(icon);
        }
    }

    public File selecionarImagem() {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("IMAGEM EM JPEG E PNG", "jpeg", "png");
        fileChooser.addChoosableFileFilter(filtro);
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setDialogType(JFileChooser.OPEN_DIALOG);
        fileChooser.showOpenDialog(this);
        return fileChooser.getSelectedFile();

    }

    private byte[] getImagem() {
        boolean isPng = false;
        if (imagem != null) {
            isPng = imagem.getName().endsWith("png");
            try {
                BufferedImage image = ImageIO.read(imagem);
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                int type = BufferedImage.TYPE_INT_RGB;
                if (isPng) {
                    type = BufferedImage.BITMASK;
                }
                BufferedImage novaImagem = new BufferedImage(iconBackground.getWidth(), iconBackground.getHeight(), type);
                Graphics2D g = novaImagem.createGraphics();
                g.setComposite(AlphaComposite.Src);
                g.drawImage(image, 0, 0, iconBackground.getWidth(), iconBackground.getHeight(), null);

                if (isPng) {
                    ImageIO.write(novaImagem, "png", out);
                } else {
                    ImageIO.write(novaImagem, "jpeg", out);
                }
                out.flush();
                byte[] byteArray = out.toByteArray();
                out.close();
                return byteArray;
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return null;
    }

}