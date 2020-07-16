
package ex03;
import javax.swing.JOptionPane;
public class Ex03 {

    public static void main(String[] args) {
       int operacao;
      operacao= Integer.parseInt(JOptionPane.showInputDialog
              ("1- Ingresso Normal\n"
              + "2- Ingresso VIP."));
      
    switch(operacao){
        
    case 1:
    Normal ingressonormal = new Normal();
    ingressonormal.imprimeValor();
    break;
                
        case 2:
        VIP ingressovip = new VIP();
        ingressovip.VIP();
        int escolha;
        escolha = Integer.parseInt(JOptionPane.showInputDialog
                  ("1- Camarote Inferior \n"
                  + "2- Camarote Superior"));   
       
        
        switch(escolha){
        case 1:
        CamaroteInferior inferior = new CamaroteInferior();
        inferior.imprimeValor();
        break;
        
        case 2:
        CamaroteSuperior superior = new CamaroteSuperior();
        superior.VIP();
        superior.imprimeValor();               
        break;
        }
        
       break;
                default:
                JOptionPane.showMessageDialog(null,"Digite 1 ou 2 apenas");
                System.exit(0);
                break;           
        }
    
    }
}

