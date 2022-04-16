/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author arthur
 */
public class Funcionario extends Pessoa {
    private String trabalhando ;
    private String chave;    
    private String saldo;

    public Funcionario() {
    }

    public Funcionario( String nome, String senha, String cpf, String foto, String endereco, String telefone, String email, String idade, String sexo, String cep) {
        super(nome, senha, cpf, foto, endereco, telefone, email, idade, sexo, cep);
    }

    
    public String getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(String trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
    
}
