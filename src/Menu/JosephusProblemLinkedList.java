package Menu;

/**
 *
 * @author jonhatan
 */
import java.util.*;
public class JosephusProblemLinkedList {
    public static void gente() {
        Scanner lee = new Scanner(System.in);

        System.out.println("Introduce el numero de personas en el circulo");
        int personas = lee.nextInt();
        LinkedList lista = new LinkedList();
        
        for (int i = 1; i <= personas; i++) {
            lista.add(i);//Agrego el numero de personas
        }
        for (int i = 0; i <lista.size(); i++) {//Recorro mi lista
            System.out.print(lista.get(i) + ", ");//Imprimo los numeros
        }
        System.out.println("\n"+"Introduce el numero donde se va a empezar");
        int inicio = lee.nextInt();
        int ini = inicio;//Paso a una variable el inicio
             System.out.println(ini);
        
        System.out.println("Introduce el numero de salto de personas");

                int salto = lee.nextInt();
       int numeroF = -1;

         int j=inicio-1;//J es mi variable que conendra un valor menor al de mi inicio
         while(j <=personas){
                j+=salto;
             while(j>=personas){
                 j = j-personas;
             }
            System.out.print(lista.remove(j)+",");
            
            personas = lista.size();
            if(personas==1){
                break;
            }
         }
         System.out.println(lista);//Imprimo la lista

    }
    public static void main(String[] args) {
        gente();
    }
}
