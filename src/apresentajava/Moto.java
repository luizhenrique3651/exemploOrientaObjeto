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
public class Moto extends Veículo{
   
    String tipoPartida;
    boolean grau;
    boolean cortaGiro;
    String arrego = "sou estudante sinhô :( ";
    
    
    
    public void darGrau(){
    
       JOptionPane.showMessageDialog(null, "Eu  não sei qual Onomatopeia pra\n "
               + " representar um grau...mas aqui tem um Grau top, blz?");
        grau = true;
        
    }
    
    public void bololo(){
    JOptionPane.showMessageDialog(null, "É O BOLOLOLO...CHAMANDO NO GRAU");
        cortaGiro = true;
    
    }
    
    public void tomandoEnquadro(){
    
    cortaGiro = false;
    grau = false;
    JOptionPane.showMessageDialog(null, arrego);
        
     
    }
  
    
    
}
