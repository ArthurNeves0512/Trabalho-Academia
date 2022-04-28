/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import classes.FuncionarioDAO;
import classes.Funcionario;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import static telas.TelaInicio.cadastrosPersonal;

/**
 *
 * @author arthur
 */
public class RegistroPersonal extends javax.swing.JFrame {

    String cBAbdomen, cBPeito, cBBracos, cBPernas, cBOmbros;
    String getImagemSelecionada;

    /**
     * Creates new form RegistroPersonal
     */
    public RegistroPersonal() {
        initComponents();
        btnLimpar.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnNovo.setEnabled(true);
        btnUpload.setEnabled(false);

        txtNome.setEnabled(false);
        txtCpf.setEnabled(false);
        txtLogradouro.setEnabled(false);
        txtBairro.setEnabled(false);
        txtCidade.setEnabled(false);
        txtCep.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtIdade.setEnabled(false);
        cmbSexo.setEnabled(false);
        txtEmail.setEnabled(false);
        txtSenha.setEnabled(false);
        checkBoxAbdomen.setEnabled(false);
        checkBoxPeito.setEnabled(false);
        checkBoxBracos.setEnabled(false);
        checkBoxPernas.setEnabled(false);
        checkBoxOmbros.setEnabled(false);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        btnNovo = new javax.swing.JButton();
        btnUpload = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnvoltar = new javax.swing.JButton();
        checkBoxAbdomen = new javax.swing.JCheckBox();
        checkBoxPeito = new javax.swing.JCheckBox();
        checkBoxBracos = new javax.swing.JCheckBox();
        checkBoxPernas = new javax.swing.JCheckBox();
        checkBoxOmbros = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Personal");

        jPanel1.setBackground(new java.awt.Color(0, 58, 122));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CPF");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Senha");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CEP");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Logradouro");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefone");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Idade");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sexo");

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha uma opção", "Masculino", "Feminino" }));

        btnNovo.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        btnNovo.setText("Editar");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnUpload.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        btnUpload.setText("Carregar foto");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        btnSalvar.setText("Salvar dados");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        btnLimpar.setText("Apagar tudo");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        icon.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
        );

        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Bairro");

        jLabel12.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cidade");

        btnvoltar.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        btnvoltar.setText("Voltar");
        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });

        checkBoxAbdomen.setBackground(new java.awt.Color(0, 58, 122));
        checkBoxAbdomen.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        checkBoxAbdomen.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxAbdomen.setText("Abdomen");
        checkBoxAbdomen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxAbdomenActionPerformed(evt);
            }
        });

        checkBoxPeito.setBackground(new java.awt.Color(0, 58, 122));
        checkBoxPeito.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        checkBoxPeito.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxPeito.setText("Peito");
        checkBoxPeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxPeitoActionPerformed(evt);
            }
        });

        checkBoxBracos.setBackground(new java.awt.Color(0, 58, 122));
        checkBoxBracos.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        checkBoxBracos.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxBracos.setText("Braços");
        checkBoxBracos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxBracosActionPerformed(evt);
            }
        });

        checkBoxPernas.setBackground(new java.awt.Color(0, 58, 122));
        checkBoxPernas.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        checkBoxPernas.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxPernas.setText("Pernas");
        checkBoxPernas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxPernasActionPerformed(evt);
            }
        });

        checkBoxOmbros.setBackground(new java.awt.Color(0, 58, 122));
        checkBoxOmbros.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        checkBoxOmbros.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxOmbros.setText("Ombros");
        checkBoxOmbros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxOmbrosActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Century", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Especialidades");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(69, 69, 69)
                                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(59, 59, 59)
                                                .addComponent(btnLimpar))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(149, 149, 149)
                                                .addComponent(btnSalvar))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(checkBoxAbdomen)
                                        .addGap(28, 28, 28)
                                        .addComponent(checkBoxPeito)
                                        .addGap(27, 27, 27)
                                        .addComponent(checkBoxBracos)))
                                .addContainerGap(51, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnUpload)
                                .addGap(162, 162, 162))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(checkBoxPernas)
                .addGap(18, 18, 18)
                .addComponent(checkBoxOmbros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpload, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(14, 14, 14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnNovo)
                                    .addComponent(btnLimpar)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalvar)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxBracos)
                    .addComponent(checkBoxPeito)
                    .addComponent(checkBoxAbdomen))
                .addGap(3, 3, 3)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxPernas)
                    .addComponent(checkBoxOmbros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnvoltar)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        JFileChooser pegandoImagem = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("4 extenções suportadas", "jpg", "png", "jpeg", "gif");
        pegandoImagem.setFileFilter(filtro);
        int selecionado = pegandoImagem.showOpenDialog(this);
        if (selecionado == JFileChooser.APPROVE_OPTION) {
            File arquivo = pegandoImagem.getSelectedFile();
            getImagemSelecionada = arquivo.getAbsolutePath();
            JOptionPane.showMessageDialog(null, getImagemSelecionada);
            ImageIcon imIco = new ImageIcon(getImagemSelecionada);
            Image imFit = imIco.getImage();
            Image imgFit = imFit.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_SMOOTH);
            icon.setIcon(new ImageIcon(imgFit));
        }
    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        txtNome.setEnabled(true);
        txtCpf.setEnabled(true);
        txtLogradouro.setEnabled(true);
        txtBairro.setEnabled(true);
        txtCidade.setEnabled(true);
        txtCep.setEnabled(true);
        txtTelefone.setEnabled(true);
        txtIdade.setEnabled(true);
        cmbSexo.setEnabled(true);
        txtEmail.setEnabled(true);
        txtSenha.setEnabled(true);
        checkBoxAbdomen.setEnabled(true);
        checkBoxPeito.setEnabled(true);
        checkBoxBracos.setEnabled(true);
        checkBoxPernas.setEnabled(true);
        checkBoxOmbros.setEnabled(true);

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

        txtNome.setEnabled(false);
        txtCpf.setEnabled(false);
        txtLogradouro.setEnabled(false);
        txtBairro.setEnabled(false);
        txtCidade.setEnabled(false);
        txtCep.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtIdade.setEnabled(false);
        cmbSexo.setEnabled(false);
        txtEmail.setEnabled(false);
        txtSenha.setEnabled(false);
        checkBoxAbdomen.setEnabled(false);
        checkBoxPeito.setEnabled(false);
        checkBoxBracos.setEnabled(false);
        checkBoxPernas.setEnabled(false);
        checkBoxOmbros.setEnabled(false);

        if (txtCep.getText().isEmpty() || txtCpf.getText().isEmpty()
                || txtEmail.getText().isEmpty() || txtLogradouro.getText().isEmpty() || txtLogradouro.getText().isEmpty()
                || txtIdade.getText().isEmpty() || txtNome.getText().isEmpty() || txtSenha.getText().isEmpty() || txtTelefone.getText().isEmpty()
                || txtSenha.getText().isEmpty()) {

            txtNome.setEnabled(true);
            txtCpf.setEnabled(true);
            txtLogradouro.setEnabled(true);
            txtBairro.setEnabled(true);
            txtCidade.setEnabled(true);
            txtCep.setEnabled(true);
            txtTelefone.setEnabled(true);
            txtIdade.setEnabled(true);
            cmbSexo.setEnabled(true);
            txtEmail.setEnabled(true);
            txtSenha.setEnabled(true);
            checkBoxAbdomen.setEnabled(true);
            checkBoxPeito.setEnabled(true);
            checkBoxBracos.setEnabled(true);
            checkBoxPernas.setEnabled(true);
            checkBoxOmbros.setEnabled(true);

            btnNovo.setEnabled(false);
            btnLimpar.setEnabled(true);
            btnSalvar.setEnabled(true);
            btnUpload.setEnabled(true);

            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Cadastrado", JOptionPane.INFORMATION_MESSAGE);

            ////INSERINDO NO BANCO DE DADOS SÓ UM PERSONAL COM SENHA E CPF//////
            Funcionario funcionario = new Funcionario();
            FuncionarioDAO personalDao = new FuncionarioDAO();
            ////////////////////////////////////

            funcionario.setNome(txtNome.getText());
            funcionario.setCpf(txtCpf.getText());
            funcionario.setEndereco(txtLogradouro.getText(), txtBairro.getText(), txtCidade.getText(), txtCep.getText());
            funcionario.setTelefone(txtTelefone.getText());
            funcionario.setIdade(txtIdade.getText());
            funcionario.setSexo(String.valueOf(cmbSexo.getSelectedItem()));
            funcionario.setEmail(txtEmail.getText());
            funcionario.setSenha(txtSenha.getText());
            funcionario.setEspecialidade(cBAbdomen + cBPeito + cBBracos + cBPernas + cBOmbros);

            personalDao.cadastrarFuncionarioFinal(funcionario);

            txtNome.setText("");
            txtCpf.setText("");
            txtLogradouro.setText("");
            txtBairro.setText("");
            txtCidade.setText("");
            txtCep.setText("");
            txtTelefone.setText("");
            txtIdade.setText("");
            cmbSexo.setSelectedIndex(0);
            txtEmail.setText("");
            txtSenha.setText("");
            checkBoxAbdomen.setSelected(false);
            checkBoxPeito.setSelected(false);
            checkBoxBracos.setSelected(false);
            checkBoxPernas.setSelected(false);
            checkBoxOmbros.setSelected(false);
            icon.setIcon(null);

        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText("");
        txtCpf.setText("");
        txtLogradouro.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        txtCep.setText("");
        txtTelefone.setText("");
        txtIdade.setText("");
        cmbSexo.setSelectedIndex(0);
        txtEmail.setText("");
        txtSenha.setText("");
        checkBoxAbdomen.setSelected(false);
        checkBoxPeito.setSelected(false);
        checkBoxBracos.setSelected(false);
        checkBoxPernas.setSelected(false);
        checkBoxOmbros.setSelected(false);

        btnLimpar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnNovo.setEnabled(false);
        btnUpload.setEnabled(true);
        icon.setIcon(null);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new TelaInicio().setVisible(true);
    }//GEN-LAST:event_btnvoltarActionPerformed

    private void checkBoxAbdomenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAbdomenActionPerformed
        // TODO add your handling code here:

        int cBAbdomenInt;

        if (checkBoxAbdomen.isSelected()) {
            cBAbdomenInt = 1;
        } else {
            cBAbdomenInt = 0;
        }

        cBAbdomen = Integer.toString(cBAbdomenInt);
    }//GEN-LAST:event_checkBoxAbdomenActionPerformed

    private void checkBoxPeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxPeitoActionPerformed
        // TODO add your handling code here:

        int cBPeitoInt;

        if (checkBoxPeito.isSelected()) {
            cBPeitoInt = 1;
        } else {
            cBPeitoInt = 0;
        }

        cBPeito = Integer.toString(cBPeitoInt);
    }//GEN-LAST:event_checkBoxPeitoActionPerformed

    private void checkBoxBracosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxBracosActionPerformed
        // TODO add your handling code here:

        int cBBracosInt;

        if (checkBoxBracos.isSelected()) {
            cBBracosInt = 1;
        } else {
            cBBracosInt = 0;
        }

        cBBracos = Integer.toString(cBBracosInt);
    }//GEN-LAST:event_checkBoxBracosActionPerformed

    private void checkBoxPernasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxPernasActionPerformed
        // TODO add your handling code here:

        int cBPernasInt;

        if (checkBoxPernas.isSelected()) {
            cBPernasInt = 1;
        } else {
            cBPernasInt = 0;
        }

        cBPernas = Integer.toString(cBPernasInt);
    }//GEN-LAST:event_checkBoxPernasActionPerformed

    private void checkBoxOmbrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxOmbrosActionPerformed
        // TODO add your handling code here:

        int cBOmbrosInt;

        if (checkBoxOmbros.isSelected()) {
            cBOmbrosInt = 1;
        } else {
            cBOmbrosInt = 0;
        }

        cBOmbros = Integer.toString(cBOmbrosInt);
    }//GEN-LAST:event_checkBoxOmbrosActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUpload;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JCheckBox checkBoxAbdomen;
    private javax.swing.JCheckBox checkBoxBracos;
    private javax.swing.JCheckBox checkBoxOmbros;
    private javax.swing.JCheckBox checkBoxPeito;
    private javax.swing.JCheckBox checkBoxPernas;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
