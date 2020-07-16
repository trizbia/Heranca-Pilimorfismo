
package ex01;

public class Tecnico extends Assistente{
    
    private double bonus_salarial;
    public double total;

    public double getBonus_salarial() {
        return bonus_salarial;
    }

    public void setBonus_salarial(double bonus_salarial) {
        this.bonus_salarial = bonus_salarial;
    }  
        public double total(){
        this.salario = this.salario + this.bonus_salarial;
        return this.salario;
    
    }
}
