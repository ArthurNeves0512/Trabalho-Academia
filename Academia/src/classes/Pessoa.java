/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author arthur
 */
public class Pessoa {
    protected String nome;
    protected String senha;
    protected String cpf;
    protected String foto;
    protected String endereco;
    protected String telefone;
    protected String email;
    protected String idade;
    protected String sexo;
    protected String cep;
    
    public Pessoa(){
        
    }

    public Pessoa(String nome, String senha, String cpf, String foto, String endereco, String telefone, String email, String idade, String sexo, String cep) {
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.foto = foto;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.idade = idade;
        this.sexo = sexo;
        this.cep = cep;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
   
    
}
