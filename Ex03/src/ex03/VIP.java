
package ex03;

public class VIP extends Ingresso{
   
    public double VIP;
    private double valor = 20;
    
    public double VIP(){
        this.valor = this.valor + 0;
        return this.valor;
    }
    
    @Override
    public void imprimeValor(){
        System.out.println
                 ("+-------------NOTA FISCAL-------------+" + "\n"
                  + "\nValor do Ingresso VIP______________R$"+this.valor);
    }
}
