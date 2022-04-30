/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JOptionPane;
import telas.RegistroPersonal;
import java.util.ArrayList;
    
/**
 *
 * @author arthur
 */
public class PessoaDao {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;/*
    ArrayList<Personal> tabelaPersonal = new ArrayList<>();*/
    
    /*
    public void cadastrarPessoa(Pessoa objPessoa){}
    public void excluirPessoa (Pessoa objPessoa){}*/
    
    public ArrayList<String> pegaInfosLogin(String cpf) {
        ArrayList<String> infos_login = new ArrayList<String>();

        String sql = "SELECT * FROM INFOS_LOGIN";

        try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                if (rs.getString("CPF").equals(cpf)) {
                    infos_login.add(Integer.toString(rs.getInt(1)));
                    infos_login.add(rs.getString(2));
                    infos_login.add(rs.getString(3));

                    return infos_login;
                }
            }
        } catch (Exception e) {
        }

        infos_login.add("-1");
        infos_login.add("-1");
        infos_login.add("-1");

        return infos_login;
    }
    
    
    public int pesquisarPessoa(String s) throws SQLException{
        String sql = "SELECT ID FROM PESSOA WHERE CPF=?;";
        conn  = new ConexaoBd().conectaBd();
        int id=-1;
        
        try
        {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, s);
            rs = pstm.executeQuery();

            while(rs.next())
            {
                id = rs.getInt("ID");
            }
                
        }catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null,"deu ruim aqui fia, volte duas casas." + e);
        }       
        
        return id;
    }
    
    
    public String pesquisarPessoaTerNome(String s) throws SQLException{
        String sql = "SELECT NOME FROM PESSOA WHERE CPF=?;";
        conn  = new ConexaoBd().conectaBd();
        String nome="";
        
        try
        {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, s);
            rs = pstm.executeQuery();

            while(rs.next())
            {
                nome = rs.getString("NOME");
            }
                
        }catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null,"deu ruim aqui fia, volte duas casas." + e);
        }       
        
        return nome;
    }
   
}
