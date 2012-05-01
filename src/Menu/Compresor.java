package Menu;
/**
 *
 * @author jonhatan
 */
import java.util.HashMap;
import java.util.Scanner;
public class Compresor {
    
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        System.out.println("Introduce la frase a comprimir");
        String frase = lee.nextLine();
        int contador = 0;
        String sp = " ";

        HashMap contenido = new HashMap();
        //Hacer un recorrido de mi abecedario
        
        for (int i = 97; i <= 122; i++) {

            char abc = (char) (i);
            if (frase.contains(String.valueOf(abc))) {
                contenido.put(String.valueOf(abc), contador);
                contador++;
                 // System.out.println(contenido);//Este me imprime el K y el V
            }
        }

        //Esto es para el espacio
        if (frase.contains(sp)) {
            contenido.put(" ", contador);
             contador++;
        }
        //Recorrido de la frase ya con el diccionario lleno
        int j = 0;
        int tmpCambio =-1;
        int k = 0;
        String cambio = "";
        while (k < frase.length()) {
            cambio += frase.charAt(k);//Agarro la letra de la frase
          if (contenido.containsKey(cambio)) {//checo si esa letra esta en el diccionario
            tmpCambio = (Integer)contenido.get(cambio);
            k++;
          }else{
            contenido.put(cambio, contador);//Meto lo que esta en la variable cambio
            System.out.print(tmpCambio);
            contador++;
            cambio = "";
          }
        }
         contenido.put(cambio, contador);
            System.out.print(tmpCambio);
    }
}

// Hola Jonhatan