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
public class Carro extends Veículo{
    
    double tamanhoMala;
    String tracao;
    String cambio;
    boolean carroLotado;
    boolean malaCheia;
    
    
    
    
    public void drift(){
       JOptionPane.showMessageDialog(null, "finge que aqui tem uma sonoplastia de drift.");
        andar();
        parar();
    
    }
    
    
    public void levarAgalera(){
        JOptionPane.showMessageDialog(null, "TUTS TUTS TUTS QUERO VER!!!");
        andar();
         carroLotado = true;
         
    
    }
    
    
    public void levarAsTralhas(){
           
        JOptionPane.showMessageDialog(null, "SIMBORA CASTRALHA");
        andar();
        malaCheia = true;
    
    }
    
    
    
    
}
