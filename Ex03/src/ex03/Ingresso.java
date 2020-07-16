
package ex03;

public class Ingresso {
    
    public double valor = 150; 
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void imprimeValor(){
        System.out.println
                 ("+-------------NOTA FISCAL-------------+" + "\n"
                + "\nTotal a pagar______________R$"+this.valor);
    }
}
