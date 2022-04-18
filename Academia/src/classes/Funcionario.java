/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author arthur
 */
public class Funcionario extends Pessoa {
    private boolean trabalhando;
    private String chave;
    private double saldo =0;
    private double valorServico=0.00;

    public Funcionario() {
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = this.saldo+saldo;
    }
    
    public double getValorServico()
    {
        return this.valorServico;
    }
    
    public void setValorServico(double valor)
    {
        this.valorServico = valor;
    }

    @Override
    public void ajuda(){
        JOptionPane.showMessageDialog(null, "nas configurações você pode alterar e excluir seu perfil\n "
                + "você no pagamento poderá checar seu saldo e a chave do pix cadastrada, não é possível ter mais de uma", "atenção", JOptionPane.INFORMATION_MESSAGE);
    }

}