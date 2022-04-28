/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
import telas.TelaInicio;
import java.util.ArrayList;

/*
 * @author arthur
maioria dos atributos herdados pela classe mae pessoa e depois tem esses atributos
peso e altura para poder calcular o imc
Cliente que irá contratar 
o método ajuda é para mostrar pro cliente quando ele aperta no botao ajuda na tela de menu
 */
public class Cliente extends Pessoa {
    private float peso;
    private float altura;
    Connection conn;
    private ClienteDao clienteDAO = new ClienteDao();
    public Cliente() {
    }

 
    public ResultSet autenticacaoCliente() {
            
        return clienteDAO.pesquisarCliente();
    }
    
    
    
    
    

@Override
public void ajuda(){
    JOptionPane.showMessageDialog(null, "nas configurações você pode alterar e excluir seu perfil\n Você pode escolher um personal para contratar e logo depois colocar o valor e a chave do pix do personal", "atenção", JOptionPane.INFORMATION_MESSAGE);

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







}