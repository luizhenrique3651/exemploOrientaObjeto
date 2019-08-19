/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentajava;

import javax.swing.JOptionPane;

/**
 *
 * @author luiz
 */
public class Veículo {
    String modelo;
    String tipo;
    double cilindrada;
    String cor;
    boolean acelerar;
    boolean frear;
    
    
    
    
    public void andar(){
        
    acelerar = true;
        JOptionPane.showMessageDialog(null, "VRUUUUUUUUUUUUUUUMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
    
    
    }
    
    public void parar(){
    
        frear = true;
        JOptionPane.showMessageDialog(null, "parô");
              
               
    }
    
    
    
    
}
