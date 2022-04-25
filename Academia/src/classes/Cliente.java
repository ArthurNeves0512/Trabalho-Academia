/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import javax.swing.JOptionPane;

/*
 * @author arthur
 */
public class Cliente extends Pessoa {
    private float peso;
    private float altura;

    public Cliente() {
    }


    @Override
    public void ajuda() {
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

    public float calculoImc() {
        return this.getPeso() / (this.getAltura() * this.getAltura());
    }


}