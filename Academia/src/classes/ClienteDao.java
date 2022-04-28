/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.*;
import classes.Cliente;
import java.util.ArrayList;
/**
 *
 * @author arthur
 */
public class ClienteDao {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Cliente> tabelaClientes = new ArrayList();
    
    public void cadastrarClienteFinal(Cliente objCliente){
        try {
            cadastrarPessoa(objCliente.getCpf(), objCliente.getNome(), objCliente.getSexo());
            cadastrarEndereco(objCliente);
            cadastroCadastro(objCliente);
            cadastroTelefone(objCliente);
            cadastroCliente(objCliente);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "CLienteDao");
        }
        
    }
    
    
    public void cadastroCliente(Cliente objCliente){
        try {
            String sql = "INSERT INTO CLIENTE(CPF,ID,METODO_PAGAMENTO,PESO,ALTURA) VALUES(?,0,0,?,?)";
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCliente.getCpf());
            pstm.setFloat(2, objCliente.getPeso());
            pstm.setFloat(3, objCliente.getAltura());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "não consegui cadastrar um telefone");
        }
    }
    public void cadastroTelefone(Cliente objCliente){
        try {
            String sql = "INSERT INTO TELEFONES(CPF,ID,NUMERO) VALUES(?,0,?)";
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCliente.getCpf());
            pstm.setString(2, objCliente.getTelefone());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "não consegui cadastrar um telefone");
        }
    }
            
    public void cadastroCadastro(Cliente objCliente){
        try {
            String sql = "INSERT INTO CADASTRO(CPF,ID,EMAIL,SENHA) VALUES(?,0,?,?)";
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCliente.getCpf());
            pstm.setString(2, objCliente.getEmail());
            pstm.setString(3, objCliente.getSenha());
            

            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "não consegui cadastrar ");
        }
        
    }
    public void cadastrarEndereco(Cliente objCliente){
        try {
            String sql = "INSERT INTO ENDERECO(CPF,ID,LOGRADOURO,BAIRRO,CIDADE,CEP) VALUES(?,0,?,?,?,?)";
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCliente.getCpf());
            pstm.setString(2, objCliente.getEndereco().getLogradouro());
            pstm.setString(3, objCliente.getEndereco().getBairro());
            pstm.setString(4, objCliente.getEndereco().getCidade());
            pstm.setString(5, objCliente.getEndereco().getCep());

            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "não consegui cadastrar um endereço "+ e);
        }
        
    }
    public void cadastrarPessoa(String cpf, String nome, String sexo ){
        try {
            String sql = "INSERT INTO PESSOA(CPF,ID,NOME,SEXO,SALDO_BANCARIO) VALUES(?,0,?,?,0)";
            conn= new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,cpf);
//            pstm.setString(2,"0");
            pstm.setString(2, nome);
            pstm.setString(3, sexo);
            
            pstm.execute();
                       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não consegui cadastrar uma pessoa "+ e);
        }
        
        
    }
    
    
    
    
    public void excluirCLiente(Cliente objCliente){
       
        String sql= "DELETE FROM PESSOA WHERE CPF= ? AND ID = 0";
        try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCliente.getCpf());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o cadastro do cliente");
        }
                
    }
    public ResultSet pesquisarCliente(){ 
        String sql = "SELECT CLIENTE.CPF,CADASTRO.SENHA FROM CLIENTE JOIN CADASTRO ON CLIENTE.CPF=CADASTRO.CPF";
        
        conn  = new ConexaoBd().conectaBd();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs =pstm.executeQuery();
                
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar o  cliente");
        }
        return rs;
    }
    
    
}
