
package ex02;

public class Ex02 {
 
     public  static  void  main ( String [] args ) {
        
        Cachorro max =  new  Cachorro ();
        Gato nino =  new  Gato ();
        
        max.setNome("Max");
        max.setRaca("Pastor Alemão");
        System.out.println(max.toString());
        max . late();
        max.caminha();
        
         System.out.println("-------------------------------------------------");
        
        nino.setNome("Nino");
        nino.setRaca("Siamês");
        System.out.println(nino.toString());
        nino . mia();
        nino.caminha();
     
    }
    
}
