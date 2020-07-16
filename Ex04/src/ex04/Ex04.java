
package ex04;

import javax.swing.JOptionPane;

public class Ex04 {

    public static void main(String[] args) {
       Imovel casa = new Imovel();
       
    casa.setEndereco(JOptionPane.showInputDialog("Digite o endereço do imóvel:"));
    casa.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do imóvel:")));
    int construcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a condicão da construcão: \n"
            + "1-Novo \n"
            + "2- Velho"));
    
    switch(construcao){
        case 1:
        Novo larnovo = new Novo();
        
        larnovo.info(casa.getPreco(), casa.getEndereco());
        break;
      
        case 2:
            Velho larvelho = new Velho();
            
        larvelho.info(casa.getPreco(), casa.getEndereco());
        break;
        
        default:
            JOptionPane.showMessageDialog(null, "Escolha entre 1 e 2 apenas.");
            break;
    
                    }
    }
    
}
