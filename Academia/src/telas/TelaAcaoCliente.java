/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import classes.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;


/**
 *
 * @author MASTER
 */
public class TelaAcaoCliente extends javax.swing.JFrame {
    public static FuncionarioDAO fd = new FuncionarioDAO();
        
    /**
     * Creates new form TelaAcaoCliente
     */
    public Connection conn ;
    public PreparedStatement pstm ;
    static int indicePersonalEscolhido;
    static String cpfFuncionarioEscolhido;
    ResultSet rs;
    
    
    
    public TelaAcaoCliente() {
        initComponents();
        carregarDadosBd();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaAcaoClienteBackground = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        ScrollPanelTable = new javax.swing.JScrollPane();
        TabelaPersonalOnline = new javax.swing.JTable();
        btnSelecionarServico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Contratação");

        TelaAcaoClienteBackground.setBackground(new java.awt.Color(255, 255, 255));
        TelaAcaoClienteBackground.setPreferredSize(new java.awt.Dimension(600, 500));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/4menu-three-outlined-rounded-lines-symbol.png"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        ScrollPanelTable.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPanelTable.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N

        TabelaPersonalOnline.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Preço", "Nome", "Endereço", "Telefone", "Especialidades"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaPersonalOnline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaPersonalOnlineMouseClicked(evt);
            }
        });
        ScrollPanelTable.setViewportView(TabelaPersonalOnline);
        if (TabelaPersonalOnline.getColumnModel().getColumnCount() > 0) {
            TabelaPersonalOnline.getColumnModel().getColumn(1).setResizable(false);
        }

        btnSelecionarServico.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        btnSelecionarServico.setText("Selecionar");
        btnSelecionarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaAcaoClienteBackgroundLayout = new javax.swing.GroupLayout(TelaAcaoClienteBackground);
        TelaAcaoClienteBackground.setLayout(TelaAcaoClienteBackgroundLayout);
        TelaAcaoClienteBackgroundLayout.setHorizontalGroup(
            TelaAcaoClienteBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaAcaoClienteBackgroundLayout.createSequentialGroup()
                .addGroup(TelaAcaoClienteBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaAcaoClienteBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TelaAcaoClienteBackgroundLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(ScrollPanelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaAcaoClienteBackgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSelecionarServico)
                .addGap(29, 29, 29))
        );
        TelaAcaoClienteBackgroundLayout.setVerticalGroup(
            TelaAcaoClienteBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaAcaoClienteBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(ScrollPanelTable, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(btnSelecionarServico)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaAcaoClienteBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaAcaoClienteBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new TelaAcaoClienteMenu().setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void TabelaPersonalOnlineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaPersonalOnlineMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TabelaPersonalOnlineMouseClicked

    private void btnSelecionarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarServicoActionPerformed
        //pegar a linha selecionada da tabela para pedir o serviço 
        if(TabelaPersonalOnline.getSelectedRow()==-1)
        {
            JOptionPane.showMessageDialog(null, "Você deve selecionar ao menos 1 funcionário.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }else
        {
            indicePersonalEscolhido = TabelaPersonalOnline.getSelectedRow();
            Object nomePersonalEscolhido = TabelaPersonalOnline.getValueAt(indicePersonalEscolhido, 1);
            
           cpfFuncionarioEscolhido = fd.getCpfPeloNome(nomePersonalEscolhido);
            
            this.setVisible(false);
            new TelaContratacaoServico().setVisible(true);
        }
    }//GEN-LAST:event_btnSelecionarServicoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAcaoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAcaoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAcaoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAcaoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAcaoCliente().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPanelTable;
    private javax.swing.JTable TabelaPersonalOnline;
    private javax.swing.JPanel TelaAcaoClienteBackground;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSelecionarServico;
    // End of variables declaration//GEN-END:variables

public ResultSet carregarDadosBd(){
    String sql= "SELECT CATEGORIA.VALOR_SESSAO, PESSOA.NOME, ENDERECO.LOGRADOURO, ENDERECO.BAIRRO, ENDERECO.CIDADE, TELEFONES.NUMERO, FUNCIONARIO.ESPECIALIDADE\n"
            + "FROM PESSOA, CATEGORIA, ENDERECO, TELEFONES, FUNCIONARIO WHERE FUNCIONARIO.TRABALHANDO = 1 AND PESSOA.CPF = ENDERECO.CPF AND PESSOA.CPF = TELEFONES.CPF AND PESSOA.CPF = FUNCIONARIO.CPF; ";
    try {
        conn= new ConexaoBd().conectaBd();
        pstm= conn.prepareStatement(sql);
        rs= pstm.executeQuery();
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Preço", "Nome", "Endereço", "Telefone", "Especialidades"}, 0);
        while(rs.next()){
            
            Object linha [] = new Object[]{rs.getString(1), rs.getString(2), rs.getString(3) +"\n" + rs.getString(4)+
                    "\n"+ rs.getString(5), rs.getString(6), fd.carregarEspecialidade(fd.getCpfPeloNome(rs.getString(2)))};// O 7 É O DO ESPECIALIDADE
            modelo.addRow(linha);
        }
        TabelaPersonalOnline.setModel(modelo);
    } 
    catch (Exception e) {
        JOptionPane.showMessageDialog(null,"deu erro pra carregar a tabela"+ e);
    }
    return null;
}        
    
}
