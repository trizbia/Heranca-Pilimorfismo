
package ex03;

public class Normal extends Ingresso{
    
    private double valor = 20;
    
    @Override
    public void imprimeValor(){
         System.out.println
                 ("+-------------NOTA FISCAL-------------+" + "\n"
                  + "\nTotal a pagar______________R$"+this.valor);
                
    }
}
