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
    
    public void cadastrarCliente(Cliente objCLiente){
        try {
            String sql = "INSERT INTO cliente(cpf,senha) values(?,?)";
            conn  = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCLiente.getCpf());
            pstm.setString(2, objCLiente.getSenha());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "CLienteDao");
        }
        
        
        
        
    }
    
    public void cadastrarPessoa(){
        try {
            
        } catch (Exception e) {
        }
        
        
    }
    
    
    
    
    public void excluirCLiente(String a){
       
        String sql= "delete from cliente where cpf = ?";
        try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, a);
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o cadastro do cliente");
        }
                
    }
    public ResultSet pesquisarCliente(){ 
        String sql = "SELECT CLIENTE.CPF,CADASTRO.SENHA FROM CLIENTE JOIN CADASTRO ON CLIENTE.CPF=CADASTRO.CPF;";
        
        conn  = new ConexaoBd().conectaBd();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs =pstm.executeQuery();
            
            /*
            while(rs.next()){
                
                Cliente cliente = new Cliente();
                cliente.setCpf(rs.getString("CPF"));
                cliente.setSenha(rs.getString("SENHA"));
                tabelaClientes.add(cliente);*/
                
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar o  cliente");
        }
        return rs;
    }
    
    
}
