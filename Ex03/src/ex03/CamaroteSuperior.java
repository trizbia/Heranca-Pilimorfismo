
package ex03;

public class CamaroteSuperior extends VIP{
    
    private double valor = 20;
    public String parte = "Superior";
    public double total;
    
    @Override
    public double VIP(){
        this.total = this.valor + 80;
        return this.total;
    } 
    
    @Override
    public void imprimeValor(){
         System.out.println
                 ("+-------------NOTA FISCAL-------------+" + "\n"
                + "\n Ingresso Normal_______________________R$"+this.valor
                + "\n Add Camarote "+this.parte+"_________________R$80.0"
                 + "\n TOTAL VIP_____________________________R$"+this.total);
    }
}
