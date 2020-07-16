
package ex01;

import javax.swing.JOptionPane;

public class Administrativo extends Assistente{
    
    private String horario;
    private double bonus_salarial;

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getBonus_salarial() {
        return bonus_salarial;
    }

    public void setBonus_salarial(double bonus_salarial) {
        this.bonus_salarial = bonus_salarial;
    }

    
    public double total(){
        if ("Noite".equals(horario)) {
            this.salario = this.salario + this.bonus_salarial;           
        }
        else if("Dia".equals(horario)){
            this.salario = this.salario;
        }   
        else{
            JOptionPane.showMessageDialog(null, "Você não digitou nenhum turno válido. A ficha será apresentada sem levar em conta um horário.");
        }
            return this.salario;
    }
}
 