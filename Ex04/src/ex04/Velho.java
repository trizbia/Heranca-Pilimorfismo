
package ex04;

import javax.swing.JOptionPane;

public class Velho extends Imovel{
    
    public void info (double preco, String endereco){
    double valoradd = preco * 0.1;
    double total = preco - valoradd;
    
    JOptionPane.showMessageDialog(null, "Imóvel: \n"
            + "Endereço: " + endereco + "\n"
            + "Condição da Construção: Velha \n"
            + "Valor total: " + total);
    
}
}
