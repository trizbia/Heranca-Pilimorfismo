
package ex02b;

public class Ex02b {
    public static void main(String[] args) {
     
        Rico James  = new Rico(); 
        Pobre Francisco = new Pobre();
        Mendigo Pimpolho = new Mendigo();
        
      
        James.setNome("James");
        James.setIdade(32);
        System.out.println(James.toString());
        James.compra();
        
         System.out.println("-------------------------------------------------");
        Francisco.setNome("Francisco");
        Francisco.setIdade(45);
        System.out.println(Francisco.toString());
        Francisco.trabalha();
        
         System.out.println("-------------------------------------------------");
        Pimpolho.setNome("Pimpolho");
        Pimpolho.setIdade(51);
        System.out.println(Pimpolho.toString());
        Pimpolho.mendiga();
      
    }
    
}
