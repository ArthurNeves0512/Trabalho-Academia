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
    ResultSet rs;
    //PreparedStatment ps;/*

    
    public String carregarEspecialidade(String cpf)
    {
        String especialidade="";
        String ans="";
        String sql = "SELECT ESPECIALIDADE FROM FUNCIONARIO WHERE CPF= ?";
        try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, cpf);
            rs = pstm.executeQuery();

            while (rs.next()) {

                especialidade=rs.getString("ESPECIALIDADE");
            }
            
            if(Character.compare(especialidade.charAt(0),'1')==0)
            {
                ans+="Abdomen\n";
            }
            if(Character.compare(especialidade.charAt(1),'1')==0)
            {
                ans+="Peito\n";
            }
            if(Character.compare(especialidade.charAt(2),'1')==0)
            {
                ans+="Braços\n";
            }
            if(Character.compare(especialidade.charAt(3),'1')==0)
            {
                ans+="Pernas\n";
            }
            if(Character.compare(especialidade.charAt(4),'1')==0)
            {
                ans+="Ombros";
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "nao deu pra pegar a especialidade do banco de dados" + e);
        }
        
        return ans;
    }
    
    public String carregarEspecialidadeNaConfiguracao(String cpf)
    {
        String especialidade="";
        String sql = "SELECT ESPECIALIDADE FROM FUNCIONARIO WHERE CPF= ?";
        try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, cpf);
            rs = pstm.executeQuery();

            while (rs.next()) {

                especialidade=rs.getString("ESPECIALIDADE");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "nao deu pra pegar a especialidade do banco de dados" + e);
        }
        
        return especialidade;
    }
    
    public void atualizaEspecialidade(String s, String cpf)
    {
        String sql = "UPDATE FUNCIONARIO SET ESPECIALIDADE = ? WHERE (ID=1 AND CPF= ?)";
        try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, s);
            pstm.setString(2, cpf);
            pstm.execute();
            pstm.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "nao consegui atualizar a especialidade");
        }
        
    }
    
    public String getCpfPeloNome(Object nome) {
        try {
            String sql = "SELECT PESSOA.CPF FROM PESSOA WHERE PESSOA.NOME= ?";
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, nome.toString());
            rs = pstm.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não consegui pegar o nome ");
        }
        return null;
    }

    public void cadastrarFuncionarioFinal(Funcionario objFuncionario) {
        try {
            cadastrarPessoa(objFuncionario.getCpf(), objFuncionario.getNome(), objFuncionario.getSexo());
            cadastrarEndereco(objFuncionario);
            cadastroTelefone(objFuncionario);
            cadastroFuncionario(objFuncionario);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "PersonalDao");
        }

    }

    public boolean isTrabalhando(int i, String cpf) {
        String sql = "UPDATE FUNCIONARIO SET TRABALHANDO = ? WHERE CPF= ?";
        try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, i);
            pstm.setString(2, cpf);
            pstm.execute();
            pstm.close();/* se der problema em dizer que o funcionario ta tarbalhando ou nao, foi aqui que deu erro
            if (i == 1) {
                return true;
            } else {
                return false;
            }*/
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "não consegui alterar a propriedade de trabalhar");
        }
        return false;
    }

    public boolean isTrabalhando(String cpf) {
        String sql = "SELECT TRABALHANDO FROM FUNCIONARIO WHERE CPF= ?";
        try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, cpf);
            rs = pstm.executeQuery();

            while (rs.next()) {

                if (rs.getInt(1) == 1) {
                    return true;
                } else {

                    return false;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "odeio polimorfos " + e);
        }
        return false;
    }

    public void cadastroFuncionario(Funcionario objFuncionario) {
        try {
            String sql = "INSERT INTO FUNCIONARIO(CPF,ID,ESPECIALIDADE,TRABALHANDO,METODO_RECEBIMENTO) VALUES(?,1,?,0,0)";
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objFuncionario.getCpf());
            pstm.setString(2, objFuncionario.getEspecialidade());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "não consegui cadastrar um telefone");
        }
    }

    public void cadastroTelefone(Funcionario objFuncionario) {
        try {
            String sql = "INSERT INTO TELEFONES(CPF,ID,NUMERO) VALUES(?,1,?)";
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objFuncionario.getCpf());
            pstm.setString(2, objFuncionario.getTelefone());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "não consegui cadastrar um telefone");
        }
    }

    public void cadastroCadastro(Funcionario objFuncionario) {
        try {
            System.out.println(objFuncionario.getSexo());
            String sql = "INSERT INTO CADASTRO(CPF,ID,EMAIL,SENHA) VALUES(?,1,?,?)";
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objFuncionario.getCpf());
            pstm.setString(2, objFuncionario.getEmail());
            pstm.setString(3, objFuncionario.getSenha());

            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "não consegui cadastrar ");
        }

    }

    public void cadastrarEndereco(Funcionario objFuncionario) {
        try {
            String sql = "INSERT INTO ENDERECO(CPF,ID,LOGRADOURO,BAIRRO,CIDADE,CEP) VALUES(?,1,?,?,?,?)";
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objFuncionario.getCpf());
            pstm.setString(2, objFuncionario.getEndereco().getLogradouro());
            pstm.setString(3, objFuncionario.getEndereco().getBairro());
            pstm.setString(4, objFuncionario.getEndereco().getCidade());
            pstm.setString(5, objFuncionario.getEndereco().getCep());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "não consegui cadastrar um endereço " + e);
        }

    }

    public void cadastrarPessoa(String cpf, String nome, String sexo) {
        try {
            String sql = "INSERT INTO PESSOA(CPF,ID,NOME,SEXO,SALDO_BANCARIO) VALUES(?,1,?,?,0)";
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cpf);
            pstm.setString(2, nome);
            pstm.setString(3, sexo);
            pstm.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não consegui cadastrar uma pessoa " + e);
        }

    }

    public void excluirFuncionario(Funcionario objFuncionario) {
        String sql = "DELETE FROM PESSOA WHERE CPF=? and ID=1";
        
        try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objFuncionario.getCpf());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
        }

    }

    public ResultSet pesquisarFuncionario() {
        String sql = "SELECT FUNCIONARIO.CPF,CADASTRO.SENHA FROM FUNCIONARIO JOIN CADASTRO ON FUNCIONARIO.CPF=CADASTRO.CPF;";
        conn = new ConexaoBd().conectaBd();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return rs;
    }

    public void atualizarCadastroFuncionario() {

    }
    
    public double pegaValorSessao(String cpf)
    {
        String sql = "SELECT VALOR_SESSAO FROM CATEGORIA WHERE (ID=1 AND CPF=?);";
        
        try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cpf);
            rs = pstm.executeQuery();
            
            while(rs.next())
            {
                return rs.getDouble("VALOR_SESSAO");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "deu erro na hora de pegar o valor da sessao"+e);
        }
        
        return 0.00;
    }
    
    public double pegaSaldoBancario(String cpf)
    {
        String sql = "SELECT SALDO_BANCARIO FROM PESSOA WHERE (ID=1 AND CPF=?);";
        
        try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cpf);
            rs = pstm.executeQuery();
            
            while(rs.next())
            {
                return rs.getDouble("SALDO_BANCARIO");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "deu erro na hora de pegar o saldo."+e);
        }

        return -1.00;
    }
    
    public void atualizaSaldoFuncionario(String cpf)
    {
        String sql = "UPDATE PESSOA SET SALDO_BANCARIO = ? WHERE CPF= ?";
        try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setDouble(1, pegaSaldoBancario(cpf)+pegaValorSessao(cpf));
            pstm.setString(2, cpf);
            pstm.execute();
            pstm.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "não consegui alterar a propriedade de trabalhar");
        }
    }
    
    public String pegaSenha(String cpf)
    {
        String sql = "SELECT SENHA FROM CADASTRO WHERE (ID=1 AND CPF=?);";
        
        try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cpf);
            rs = pstm.executeQuery();
            
            while(rs.next())
            {
                return rs.getString("SENHA");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "nao deu pra pegar a senha"+e);
        }
        
        return "-1";
    }

}
