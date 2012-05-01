package Menu;

/**
 *
 * @author jonhatan
 */
import java.util.*;
public class concidenciaParentesis {
    public static boolean Coincidencia () {
    System.out.println("Introduce una cadena de parentesis, el programa te dira en que posicion abre el parentesis y te dira en cual cierra");
        Scanner lee = new Scanner(System.in);
        Stack pila = new Stack();

       String frase = lee.nextLine();
        char abr = '(';
        char cer = ')';
        int x;
        for (int i = 0; i < frase.length(); i++) {//Recorro la frase
            char letra = frase.charAt(i);
            if (letra == abr) {//checo si el caracter es igual a (
                pila.push(i);

            } else if (!pila.empty()) {
                x = (int) (Integer) pila.pop();
               System.out.println("El parentesis " + x + " corresponde con " + i);

            }else{
          System.out.println("Hay error en el parentesis "+i);
            }
            
        }
         while(!pila.empty()){
         System.out.println("Hay error en el parentesis "+pila.pop());

         return false;}

   return true; }

     public static void main(String []args){
     Coincidencia();
     }
}
 
/*
 (((())))
 */
    

