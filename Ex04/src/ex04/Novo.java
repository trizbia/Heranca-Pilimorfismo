
package ex04;

import javax.swing.JOptionPane;

public class Novo  extends Imovel{
    
    public void info (double preco, String endereco){
    double valoradd = preco * 0.1;
    double total = valoradd + preco;
    
    JOptionPane.showMessageDialog(null, "Imóvel: \n"
            + "Endereço: " + endereco + "\n"
            + "Condição da Construção: Nova \n"
            + "Valor total: R$" + total);
    
    }   
}
