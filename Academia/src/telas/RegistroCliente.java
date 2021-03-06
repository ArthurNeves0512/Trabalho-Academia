/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import classes.Cliente;
import classes.ClienteDao;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;


/**
 *
 * @author arthur
 */
public class RegistroCliente extends javax.swing.JFrame {
String getImagemSelecionada;
private Cliente cli;
private File imagem;

    
    public RegistroCliente() {
        initComponents();
        btnLimpar.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnNovo.setEnabled(true);
        btnUpload.setEnabled(false);
        
        txtAltura.setEnabled(false);
        txtCep.setEnabled(false);
        txtCpf.setEnabled(false);
        txtEmail.setEnabled(false);
        txtLogradouro.setEnabled(false);
        
        txtNome.setEnabled(false);
        txtPeso.setEnabled(false);
        cmbSexo.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtSenha.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnUpload = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        iconBackground = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtBairroEsccrita = new javax.swing.JLabel();
        txtCidadeEscrita = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Cliente");
        setIconImages(getIconImages());
        setMinimumSize(new java.awt.Dimension(731, 585));
        setPreferredSize(new java.awt.Dimension(731, 500));
        setSize(new java.awt.Dimension(731, 600));

        jPanel1.setBackground(new java.awt.Color(0, 130, 46));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));

        btnUpload.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        btnUpload.setText("Carregar Foto");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        btnLimpar.setText("Apagar tudo");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        iconBackground.setBackground(new java.awt.Color(255, 255, 255));
        iconBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout iconBackgroundLayout = new javax.swing.GroupLayout(iconBackground);
        iconBackground.setLayout(iconBackgroundLayout);
        iconBackgroundLayout.setHorizontalGroup(
            iconBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        );
        iconBackgroundLayout.setVerticalGroup(
            iconBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );

        btnNovo.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        btnNovo.setText("Editar");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        btnSalvar.setText("Salvar dados");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Senha");

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha uma op????o", "Masculino", "Feminino" }));
        cmbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSexoActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sexo");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Peso");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefone");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Logradouro");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CEP");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Altura");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome ");

        txtBairroEsccrita.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        txtBairroEsccrita.setForeground(new java.awt.Color(255, 255, 255));
        txtBairroEsccrita.setText("Bairro");

        txtCidadeEscrita.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        txtCidadeEscrita.setForeground(new java.awt.Color(255, 255, 255));
        txtCidadeEscrita.setText("Cidade");

        btnVoltar.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBairroEsccrita)
                            .addComponent(txtCidadeEscrita)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel12)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel9)))
                        .addGap(44, 44, 44)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(165, 165, 165)
                                .addComponent(btnUpload)
                                .addGap(169, 169, 169))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(157, 157, 157)
                                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel8)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(35, 35, 35)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel7)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(15, 15, 15))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(81, 81, 81))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtLogradouro, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                                        .addComponent(txtCpf))
                                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(iconBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(59, 59, 59))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpload, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iconBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBairroEsccrita))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCidadeEscrita)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovo)
                        .addComponent(btnLimpar))
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnSalvar))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtAltura.setText("");
        txtCep.setText("");
        txtCpf.setText("");
        txtEmail.setText("");
        txtLogradouro.setText("");
        
        txtNome.setText("");
        txtPeso.setText("");
        txtTelefone.setText("");
        txtSenha.setText("");
        
        btnLimpar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnNovo.setEnabled(false);
        btnUpload.setEnabled(true);
        image.setIcon(null);
         
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtAltura.setEnabled(true);
        txtCep.setEnabled(true);
        txtCpf.setEnabled(true);
        txtEmail.setEnabled(true);
        txtLogradouro.setEnabled(true);
        
        txtNome.setEnabled(true);
        txtPeso.setEnabled(true);
        txtTelefone.setEnabled(true);
        txtSenha.setEnabled(true);
        cmbSexo.setEnabled(true);
        btnNovo.setEnabled(false);
        btnLimpar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnUpload.setEnabled(true);
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        btnNovo.setEnabled(true);
        btnLimpar.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnUpload.setEnabled(false);
        
        txtAltura.setEnabled(false);
        txtCep.setEnabled(false);
        txtCpf.setEnabled(false);
        txtEmail.setEnabled(false);
        txtLogradouro.setEnabled(false);
        
        txtNome.setEnabled(false);
        txtPeso.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtSenha.setEnabled(false);
        
        if(txtAltura.getText().isEmpty() || txtCep.getText().isEmpty() || txtCpf.getText().isEmpty()||
                txtEmail.getText().isEmpty() || txtLogradouro.getText().isEmpty() || txtLogradouro.getText().isEmpty() 
                 || txtNome.getText().isEmpty() || txtPeso.getText().isEmpty() || txtTelefone.getText().isEmpty()||
                txtSenha.getText().isEmpty())
        {
            
            txtAltura.setEnabled(true);
            txtCep.setEnabled(true);
            txtCpf.setEnabled(true);
            txtEmail.setEnabled(true);
            txtLogradouro.setEnabled(true);
            
            txtSenha.setEnabled(true);
            txtNome.setEnabled(true);
            txtPeso.setEnabled(true);
            txtTelefone.setEnabled(true);
            
            btnNovo.setEnabled(false);
            btnLimpar.setEnabled(true);
            btnSalvar.setEnabled(true);
            btnUpload.setEnabled(true);
      
            JOptionPane.showMessageDialog(null, "Por Favor, Insira Todos os Campos!!!", "Aten????o", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            
            Cliente cliente = new Cliente();
            
            cliente.setNome(txtNome.getText());
            cliente.setCpf(txtCpf.getText());
            
            
            cliente.setEndereco(txtLogradouro.getText(),txtBairro.getText(),txtCidade.getText(),txtCep.getText());
            cliente.setTelefone(txtTelefone.getText());
            
            cliente.setEmail(txtEmail.getText());
            cliente.setSenha(txtSenha.getText());
            cliente.setAltura(Float.parseFloat(txtAltura.getText()));
            cliente.setPeso(Float.parseFloat(txtPeso.getText()));
            
            cliente.setImagem(getImagem());
            //COLOCAR NO BANCO DE DADOS CLIENTES APENAS COM SENHA E CPF
            
            
            ClienteDao clienteDao = new ClienteDao();
            clienteDao.cadastrarClienteFinal(cliente);
           
           JOptionPane.showMessageDialog(null, "Cadastro Realizado Com Sucesso!!", "Cadastrado", JOptionPane.INFORMATION_MESSAGE);
            
            
            image.setIcon(null);
            txtAltura.setText("");
            txtCep.setText("");
            txtCpf.setText("");
            txtEmail.setText("");
            txtLogradouro.setText("");
            
            txtNome.setText("");
            txtPeso.setText("");
            txtTelefone.setText("");
            txtSenha.setText("");
        
        }
    }//GEN-LAST:event_btnSalvarActionPerformed
    private void abrirImagem(Object source){
        if ( source instanceof File){
            ImageIcon icon = new ImageIcon(imagem.getAbsolutePath());
            icon.setImage(icon.getImage().getScaledInstance(iconBackground.getWidth(), iconBackground.getHeight(), 100));
            image.setIcon(icon);
        }
        else if(source instanceof byte[]){
            ImageIcon icon = new ImageIcon(cli.getImagem());
            icon.setImage(icon.getImage().getScaledInstance(iconBackground.getWidth(), iconBackground.getHeight(), 100));
            image.setIcon(icon);
        }
    }
    private void cmbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSexoActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        imagem =  selecionarImagem();
        abrirImagem(imagem);
 
        
    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new TelaInicio().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroCliente().setVisible(true);
            }
        });
    }
private void setDados(){
    abrirImagem(cli.getImagem());
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUpload;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JPanel iconBackground;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JLabel txtBairroEsccrita;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JLabel txtCidadeEscrita;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

public File selecionarImagem(){
    JFileChooser fileChooser=  new JFileChooser();
    FileNameExtensionFilter filtro = new FileNameExtensionFilter("IMAGEM EM JPEG E PNG", "jpeg", "png");
    fileChooser.addChoosableFileFilter(filtro);
    fileChooser.setAcceptAllFileFilterUsed(false);
    fileChooser.setDialogType(JFileChooser.OPEN_DIALOG);
    fileChooser.showOpenDialog(this);
    return fileChooser.getSelectedFile();
           
}

private byte[] getImagem(){
    boolean isPng = false;
    if(imagem !=null){
        isPng = imagem.getName().endsWith("png");
        try {
            BufferedImage image = ImageIO.read(imagem);
            ByteArrayOutputStream out =  new ByteArrayOutputStream();
            int type = BufferedImage.TYPE_INT_RGB;
             if(isPng){
               type = BufferedImage.BITMASK;  
             }
            BufferedImage novaImagem = new BufferedImage(iconBackground.getWidth(), iconBackground.getHeight(), type);
            Graphics2D g = novaImagem.createGraphics();
            g.setComposite(AlphaComposite.Src);
            g.drawImage(image,0,0, iconBackground.getWidth(), iconBackground.getHeight(),null);
            
            if(isPng){
                ImageIO.write(novaImagem, "png", out);
            }
            else{
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
