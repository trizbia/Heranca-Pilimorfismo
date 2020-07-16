
package ex01;

import javax.swing.JOptionPane;

public class Ex01 {

    public static void main(String[] args) {
        
        Tecnico tecno = new Tecnico();
        Administrativo admin = new Administrativo();
        
        
        tecno.setNome("Eduardo");
        tecno.setMatricula(2020);
        tecno.setIdade(39);
        tecno.setSalario(3500);
        tecno.setBonus_salarial(200);
        
        
        admin.setNome("Betina");
        admin.setHorario(JOptionPane.showInputDialog("Digite o Turno do Assistente Administrativo: Noite ou Dia"));//Escreva exatamente como está pedindo "Noite" ou "Dia"
        admin.setMatricula(2021);
        admin.setIdade(22);
        admin.setSalario(2500);
        admin.setBonus_salarial(300);
        
        JOptionPane.showMessageDialog
          (null, "+----------Assistente Administrativo----------+ \n" 
                    + "Nome: " + admin.getNome() + "\n"
                    + "Turno: " + admin.getHorario() + "\n"
                    + "Matrícula: " + admin.getMatricula() + "\n"
                    + "Idade: " + admin.getIdade() + " anos \n"
                    + "Salário: R$" + admin.getSalario() + "\n"
                    + "Bonus: " + admin.getBonus_salarial() + "\n"
                    + "Total: R$" + admin.total() + "\n"
                    + "\n"
                + "+----------------------Técnico----------------------+ \n" 
                    + "Nome: " + tecno.getNome() + "\n"
                    + "Matrícula: " + tecno.getMatricula() + "\n"
                    + "Idade: " + tecno.getIdade() + " anos \n"
                    + "Salário: R$" + tecno.getSalario() + "\n"
                    + "Bonus: " + tecno.getBonus_salarial() + "\n"
                    + "Total: R$" + tecno.total() + "\n");
     
    }
    
}
