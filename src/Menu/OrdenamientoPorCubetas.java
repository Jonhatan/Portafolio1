package Menu;

/**
 *
 * @author jonhatan
 */
import java.util.*;
public class OrdenamientoPorCubetas {
    
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.println("Introduce numeros del 0 al 9 dandole enter a cada numero \n Cuando Termines pon -1");
        ArrayList lista = new ArrayList();
        boolean salir = false;


        //captura de todos los numeros hasta que el usuario meta -1
        while (salir == false) {
            int numero = lee.nextInt();
            if (numero == -1) {
                salir = true;
            } else{
             lista.add(numero);
            }
        }


        //creo las cubetas
        ArrayList[] cubeta = new ArrayList[10];
        for(int i =0; i < cubeta.length; i++){
            cubeta[i] = new ArrayList();
        }


        //sacamos todos los elementos de la lista original y los ponemos en las cubetas
        while(!lista.isEmpty()){
            int numero = (int)(Integer)lista.remove(0);

            cubeta[numero].add(numero);
        }


        //sacar todo lo que hay en las cubetas y pasarlo a las listas

        for(int i =0; i < cubeta.length; i++){
            while(!cubeta[i].isEmpty()){
                 lista.add(cubeta[i].remove(0));
            }
        }

        System.out.println(lista);


        }
}
