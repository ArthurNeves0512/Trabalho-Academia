/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author arthur
 */
public class Cliente extends Pessoa {
    private float peso;
    private float altura;

    public Cliente() {
    }

    public Cliente(float peso, float altura, String nome, String senha, String cpf, String foto, String endereco, String telefone, String email, String idade, String sexo, String cep) {
        super(nome, senha, cpf, foto, endereco, telefone, email, idade, sexo, cep);
        this.peso = peso;
        this.altura = altura;
    }


    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float calculoImc(){
        return this.getPeso()/(this.getAltura()*this.getAltura());
    }
  

    
    
   
    
    
}
