/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author arthur
 * Classe abstrata mae ,os atributos que estão aqui são os atributos que são necessários em basicamente
 * todos os cadastros, e aqui também tem os get e setters de cada
 * o método ajuda é porque a depender de quem pede ajuda, ele terá uma mensagem diferente.
 * 
 */
public abstract class  Pessoa {
    protected String nome;
    protected String senha;
    protected String cpf;
    protected String foto;
    protected Endereco endereco;
    protected String telefone;
    protected String email;
    protected String idade;
    protected String sexo;
    protected String cep;


    public abstract void  ajuda();
    
    public Pessoa(){}
    
    
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(String logradouro, String bairro, String cidade, String cep) {
        this.endereco = new Endereco(logradouro, bairro, cidade, cep);
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
