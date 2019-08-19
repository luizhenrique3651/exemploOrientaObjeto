
package apresentajava;

import javax.swing.JOptionPane;

/**
  @author luiz
 */
public class ApresentaJava {

   
    public static void main(String[] args) {
 
        String pergunta = "qual seu veiculo? Carro ou Moto?";
        String qualVeiculo;
        qualVeiculo = JOptionPane.showInputDialog(null, pergunta);
        
        
        if(qualVeiculo.equals("carro") || qualVeiculo.equals("Carro") || qualVeiculo.equals("CARRO")){
        
        Carro marmita = new Carro();
        marmita.modelo = JOptionPane.showInputDialog("qual o modelo do Poçante?");
        marmita.tipo = qualVeiculo;
        String cilindrada = JOptionPane.showInputDialog("e a cilindrada do bichão?");
        marmita.cilindrada = (Double.parseDouble(cilindrada));
        marmita.cor = JOptionPane.showInputDialog("e a cor?");
        
        JOptionPane.showMessageDialog(null, "Seu Carro é o seguinte:\n"
                + "Modelo: "+marmita.modelo+"\n Cilindrada: "+marmita.cilindrada+"\n"
                                + "Cor: "+marmita.cor);
        
        
        Object[] opcoes = { "Acelerar", "Parar", "Drift", "Levar a galera", "Levar umas tralhas" };
        int opcaoAcao;
 opcaoAcao = JOptionPane.showOptionDialog(null, "Escolha uma opção de ação", "Escolhe ai", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[0]);
        switch(opcaoAcao){
            case 0: marmita.andar();
            break;
            case 1: marmita.parar();
            break;
            case 2: marmita.drift();
            break;
            case 3: marmita.levarAgalera();
            break;
            case 4: marmita.levarAsTralhas();
            break;
        
        
        }    
        
        
        
        }
        else if(qualVeiculo.equals("moto") || qualVeiculo.equals("motoca") || qualVeiculo.equals("Moto") || qualVeiculo.equals("MOTO")){
        
        Moto motoca = new Moto();
        motoca.modelo = JOptionPane.showInputDialog("qual o modelo do cavalo do diabo?");
        motoca.tipo = qualVeiculo;
        String cilindrada = JOptionPane.showInputDialog("e a cilindrada da bixona?");
        motoca.cilindrada = (Double.parseDouble(cilindrada));
        motoca.tipoPartida = JOptionPane.showInputDialog("Partida elétrica ou o pedal?");
        motoca.cor = JOptionPane.showInputDialog("e a cor?");
        
        
        JOptionPane.showMessageDialog(null, "Seu Cavalo do diabo é o seguinte:\n"
                + "Modelo: "+motoca.modelo+"\n Cilindrada: "+motoca.cilindrada+"\n"
                        + "Tipo de partida: "+motoca.tipoPartida+"\n"
                                + "Cor: "+motoca.cor);
        
        
        Object[] opcoes = { "Acelerar", "Parar", "Dar Grau", "Bololo", "levar enquadro" };
        int opcaoAcao;
 opcaoAcao = JOptionPane.showOptionDialog(null, "Escolha uma opção de ação", "Escolhe ai", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[0]);
        switch(opcaoAcao){
            case 0: motoca.andar();
            break;
            case 1: motoca.parar();
            break;
            case 2: motoca.darGrau();
            break;
            case 3: motoca.bololo();
            break;
            case 4: motoca.tomandoEnquadro();
            break;
        
        
        }
        
        }
        
        
        
    }
    
}
