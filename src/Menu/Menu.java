package Menu;
/**
 *
 * @author jonhatan
 */
import java.util.*;
public class Menu {
    static String [] args= new String[0];
    
    public static void ejecutaPrograma(int numero){
    if(numero == 1){
    //programa.main(String[] args).ArbolesBST;
        ArbolesBST arb= new ArbolesBST();
        arb.main(args);
        }else
        if(numero == 2){
        //programa.main(String[] args).DistribucionCruzada;
         DistribucionCruzada distribucionCruzada= new DistribucionCruzada();
         distribucionCruzada.main(args);
        }else
        if(numero == 3){
        //programa.main(String[] args).EjemploEratostenes;
        }else
        if(numero == 4){
        //programa.main(String[] args).InsertionSort;
        }else
        if(numero == 5){
        //programa.main(String[] args).JosephusProblemLinkedList;
        }else
        if(numero == 6){
        //programa.main(String[] args).OrdenamientoPorCubetas;
        }else
        if(numero == 7){
        //programa.main(String[] args).Pixeles;
        }else
        if(numero == 8){
        //programa.main(String[] args).SelectionSort;
        }else
        if(numero == 9){
        //programa.main(String[] args).ShellSort;
        }else
        if(numero == 10){
        //programa.main(String[] args).TercerExamen;
        }else
        if(numero == 11){
        //programa.main(String[] args).compresor1;
        }else
        if(numero == 12){
        //programa.main(String[] args).coincidenciaParentesis;
        }
    }
    
    public static void menu(){
    Scanner lee = new Scanner(System.in);
     
         System.out.println("INTRODUCE EL NUMERO PARA EJECUTAR EL PROGRAMA CORRESPONDIENTE,SI NO QUIERES EJECUTAR NINGUN PROGRAMA, introduce 0\n\t1) Arboles BST \n"
                + "\t2) Distribucion Cruzada \n\t3) Ejemplo Eratostenes\n\t4) InsertionSort \n"
                + "\t5) JosephusProblem\n\t6) Ordenamiento por Cubetas\n\t7) Pixeles \n\t8) SelectionSort \n\t"
                + "9) ShellSort\n\t10) Tercer Examen\n\t11) compresor\n\t12) Coincidencia de Parentesis");
    
         int numero = lee.nextInt();
         
         while(numero != 0){
         ejecutaPrograma(numero);   
         numero = lee.nextInt();
         }
         
    
    }
    public static void main(String[] args) {
        menu(); 
        
    }
}
