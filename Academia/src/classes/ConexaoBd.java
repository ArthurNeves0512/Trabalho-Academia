/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author arthur
 */ 
public class ConexaoBd {

    public ConexaoBd() {
    }
    
   public Connection conectaBd(){
        Connection conn = null;
        try {
            //primeiro parâmetro é uma referência para o nosso drive de conexão     
            
            String url="jdbc:mysql://localhost:3306/ACADEMIA?user=root&password=root";
            conn = DriverManager.getConnection(url);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"ConexaoBd " +e.getMessage());
        }
        return conn;
    }
    


}
