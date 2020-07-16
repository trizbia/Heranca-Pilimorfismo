
package ex03;

public class CamaroteInferior extends VIP{
    
    private double valor = 20;
    public String parte = "Inferior";
    public double total;
    
    @Override
    public double VIP(){
        this.valor = this.valor + 60;
        return this.valor;

    } 
    
    
    @Override
    public void imprimeValor(){
         System.out.println
                 ("+-------------NOTA FISCAL-------------+" + "\n"
                + "\n Ingresso normal_______________________R$"+this.valor
                + "\n Add Camarote "+this.parte+"_________________R$60.0"
                + "\n TOTAL VIP_____________________________R$"+this.VIP());
    }
}
