/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author arthur
 */
public class FuncionarioDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    //PreparedStatment ps;/*

    
    public void atualizaNome(String nome, String cpf, byte[]foto)
    {  System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        String sql = "UPDATE PESSOA SET NOME = ?, FOTO=? WHERE (ID=1 AND CPF= ?)";
        try {
            System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.setBytes(2, foto);
            pstm.setString(3, cpf);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "DEU TUDO CERTO AQUI NO ATUALIZA NOME");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "nao consegui atualizar o nome");
        }
    }
    
    public void atualizaEndereco(String cpf, String log, String bairro, String cidade, String cep)
    {
        String sql = "UPDATE ENDERECO SET LOGRADOURO=?,BAIRRO=?, CIDADE=?, CEP=? WHERE (ID=1 AND CPF= ?)";
        try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, log);
            pstm.setString(2, bairro);
            pstm.setString(3, cidade);
            pstm.setString(4, cep);
            pstm.setString(5, cpf);
            pstm.execute();
            pstm.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "nao consegui atualizar o endereco");
        }
    }
    
    public void atualizaTelefone(String cpf, String telefone)
    {
        String sql = "UPDATE TELEFONES SET NUMERO=? WHERE (ID=1 AND CPF= ?)";
        try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, telefone);
            pstm.setString(2, cpf);
            pstm.execute();
            pstm.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "nao consegui atualizar o telefone");
        }
    }
    
    public void atualizaEmail(String cpf, String email)
    {
        String sql = "UPDATE CADASTRO SET EMAIL=? WHERE (ID=1 AND CPF= ?)";
        try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, email);
            pstm.setString(2, cpf);
            pstm.execute();
            pstm.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "nao consegui atualizar o email");
        }
    }
    
    public void atualizaSenha(String cpf, String senha)
    {
        String sql = "UPDATE CADASTRO SET SENHA=? WHERE (ID=1 AND CPF= ?)";
        try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, senha);
            pstm.setString(2, cpf);
            pstm.execute();
            pstm.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "nao consegui atualizar a senha");
        }
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
    

    public String carregarEspecialidade2(String e){
        String ans= new String(); 
        if (e.charAt(0) =='1') {
            System.out.println("abdomen do pai");
            ans += "Abdomen\n";
        }
        if (e.charAt(1)== '1') {
            System.out.println("peito do pai");
            ans += "Peito\n";
        }
        if (e.charAt(2) == '1') {
            System.out.println("braço do pai");
            ans += "Braços\n";
        }
        if (e.charAt(3) == '1') {
            System.out.println("pernas do pai");
            ans += "Pernas\n";
        }
        if (e.charAt(4) == '1') {
            System.out.println("ombras do pai");
            ans += "Ombros";
        }
        return ans;
    }
    
    public String carregarEspecialidadeNaConfiguracao(String cpf)
    {
        String especialidade="";
        String sql = "SELECT ESPECIALIDADE FROM FUNCIONARIO WHERE CPF= ?";
        System.out.println("fiquei bem aqui meu cumpade");
        try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, cpf);
            rs = pstm.executeQuery();

            while (rs.next()) {
                especialidade= rs.getString(1);
            }
            return especialidade;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "nao deu pra pegar a especialidade do banco de dados" + e);
        }
        
        return especialidade;
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
    public void inserirCategoria(String cpf, String regiaoTreinada) {
        String sql = "INSERT INTO CATEGORIA(CPF,ID,VALOR_SESSAO,REGIAO_TREINADA) VALUES(?,1,0,?);";
        try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cpf);
            pstm.setString(2, regiaoTreinada);
            pstm.execute();
            pstm.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "nao consegui cadastrar a categoria");
        }

    }
    
    public void cadastrarFuncionarioFinal(Funcionario objFuncionario) {
        try {
            cadastrarPessoa(objFuncionario.getCpf(), objFuncionario.getNome(), objFuncionario.getSexo(), objFuncionario.getImagem());
            cadastrarEndereco(objFuncionario);
            cadastroTelefone(objFuncionario);
            cadastroCadastro(objFuncionario);
            cadastroFuncionario(objFuncionario);
            inserirCategoria(objFuncionario.getCpf(), objFuncionario.getEspecialidade());
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
            pstm.close();
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

    public void cadastrarPessoa(String cpf, String nome, String sexo, byte[]foto) {
        try {
            String sql = "INSERT INTO PESSOA(CPF,ID,NOME,SEXO,FOTO,SALDO_BANCARIO) VALUES(?,1,?,?,?,0)";
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cpf);
            pstm.setString(2, nome);
            pstm.setString(3, sexo);
            pstm.setBytes(4, foto);
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
    
    public void excluirFuncionario(String cpf) {
        String sql = "DELETE FROM PESSOA WHERE CPF=? and ID=1";
        
        try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cpf);
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

    public void atualizarCadastroFuncionario(String cpf, byte[]foto, String nome, String log, String bairro, String cidade, String cep, String telefone, String email, String senha) {
      atualizaNome(cpf,nome, foto);
        System.out.println("1");
        atualizaEndereco(cpf,log,bairro,cidade,cep);
        System.out.println("2");
        atualizaTelefone(cpf,telefone);
        System.out.println("3");
        atualizaEmail(cpf,email);
        System.out.println("4");
        atualizaSenha(cpf,senha);
        System.out.println("5");
    }
    
    public void atualizaValorSessao(double valorNovo, String cpf)
    {
        String sql = "UPDATE CATEGORIA SET VALOR_SESSAO = ? WHERE CPF= ? AND ID=1";
        try {
            conn = new ConexaoBd().conectaBd();
            pstm = conn.prepareStatement(sql);  
            pstm.setDouble(1, valorNovo);
            pstm.setString(2, cpf);
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "não consegui alterar o valor da sessao");
        }
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
            JOptionPane.showMessageDialog(null, "não consegui alterar o saldo bancario");
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
