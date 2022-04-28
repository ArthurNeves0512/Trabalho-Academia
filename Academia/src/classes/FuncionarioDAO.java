/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.sql.*;
import javax.swing.JOptionPane;
import telas.RegistroPersonal;
import java.util.ArrayList;

/**
 *
 * @author arthur
 */
public class FuncionarioDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;/*
    ArrayList<Personal> tabelaPersonal = new ArrayList<>();*/
    
    
    public void cadastrarFuncionario(Funcionario objFuncionario){
        try {
            String sql = "INSERT INTO PESSOA(CPF,ID) VALUES(?,?)";
            conn  = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objFuncionario.getCpf());
            pstm.setString(2, objFuncionario.getSenha()); /* TEM QUE TROCAR PRO ID */
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "PersonalDao");
        }
        
        
        
        
    }
    public void excluirFuncionario (Funcionario objFuncionario){
        String sql = "DELETE FROM PESSOA WHERE CPF=? and ID=?";
              try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objFuncionario.getCep());
            pstm.setString(2, objFuncionario.getSenha()); /* tem que trocar isso aqui pra pegar o id */
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
        }
                
    }
    public ResultSet pesquisarFuncionario(){
        String sql = "SELECT FUNCIONARIO.CPF,CADASTRO.SENHA FROM FUNCIONARIO JOIN CADASTRO ON FUNCIONARIO.CPF=CADASTRO.CPF;";
        conn  = new ConexaoBd().conectaBd();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();/*
            
            while(rs.next()){
                
                Personal personal = new Personal();
                personal.setCpf(rs.getString("cpf"));
                personal.setTrabalhando(true);
                tabelaPersonal.add(personal);*/
        }
            /*System.out.println(tabelaPersonal.size());*/
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e );
        }
        
        return rs;
    }
    
    public void atualizarCadastroFuncionario()
    {
        
    }
   
    
}
