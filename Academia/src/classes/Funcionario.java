/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author arthur
 * 
 * Personal, a classe que irá oferecer o serviço, entao é por isso que ele tem saçdo, valor serviço
 * a chave seria relacionada a chave pix dele, o atributo trabalhando é para ele poder decidir se estará online ou não
 * o método ajuda é para mostrar na tela do personal quando no menu, ele aperta no botão de ajuda
 */
public class Funcionario extends Pessoa {
    private boolean trabalhando;
    private String chave;
    private double saldo =0;
    private double valorServico=0.00;
    private FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    private String especialidade;
    
    
    Connection conn;
    


    public Funcionario() {
    }
    
    public void especialidade(String cpf ){
        String sql = "SELECT ESPECIALIDADE FROM TABELA FUNCIONARIO WHERE CPF = ?";
        try {
            
        } catch (Exception e) {
        }
    }
    
    
    public ResultSet autenticacaoFuncionario() {
      
       return funcionarioDAO.pesquisarFuncionario();

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public boolean getTrabalhando() {
        return this.trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = this.saldo+saldo;
    }
    
    public double getValorServico()
    {
        return this.valorServico;
    }
    
    public void setValorServico(double valor)
    {
        this.valorServico = valor;
    }

    @Override
    public void ajuda(){
        JOptionPane.showMessageDialog(null, "Essa funciondalidade vai ser aprimorada!", "atenção", JOptionPane.INFORMATION_MESSAGE);
    }

}