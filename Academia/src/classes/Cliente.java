/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.*;

public class Cliente extends Pessoa {
    private float peso;
    private float altura;
    Connection conn;
    private byte[] imagem;
    private ClienteDao clienteDAO = new ClienteDao();
    public Cliente() {
    }

 
    public ResultSet autenticacaoCliente() {
            
        return clienteDAO.pesquisarCliente();
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public Cliente(float peso, float altura, Connection conn, byte[] imagem) {
        this.peso = peso;
        this.altura = altura;
        this.conn = conn;
        this.imagem = imagem;
    }
    
    
    

@Override
public void ajuda(){
    JOptionPane.showMessageDialog(null, "Você vai descobrir um segredo se carregar a 'Ajuda' do Personal", "atenção", JOptionPane.INFORMATION_MESSAGE);

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
        //retorna o valor do IMC da pessoa.
        return this.getPeso()/(this.getAltura()*this.getAltura());
    }
    public float calculoImc(float peso, float altura){
        return peso/(altura*altura);
    }







}