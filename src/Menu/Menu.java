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
        ArbolesBST arb= new ArbolesBST();
        arb.main(args);
        }else
        if(numero == 2){
         DistribucionCruzada distribucionCruzada= new DistribucionCruzada();
         distribucionCruzada.main(args);
        }else
        if(numero == 3){
        EjemploEratostenes ejemploEratostenes= new EjemploEratostenes();
        ejemploEratostenes.main(args);
        }else
        if(numero == 4){
        InsertionSort insertionSort= new InsertionSort();
        insertionSort.main(args);
        }else
        if(numero == 5){
        JosephusProblemLinkedList josephusProblemLinkedList = new JosephusProblemLinkedList();
        josephusProblemLinkedList.main(args);
        }else
        if(numero == 6){
        OrdenamientoPorCubetas ordenamientoPorCubetas= new OrdenamientoPorCubetas();
        ordenamientoPorCubetas.main(args);
        }else
        if(numero == 7){
        Pixeles pixeles= new Pixeles();
        pixeles.main(args);
        }else
        if(numero == 8){
        SelectionSort selectionSort=new SelectionSort();
        selectionSort.main( args);
        }else
        if(numero == 9){
            ShellSort shellSort= new ShellSort();
            shellSort.main(args);
        }else
        if(numero == 10){
            TercerExamen tercerExamen= new TercerExamen();
            tercerExamen.main(args);
        }else
        if(numero == 11){
            Compresor compresor=new Compresor();
            compresor.main(args);
        }else
        if(numero == 12){
            ConcidenciaParentesis concidenciaParentesis= new ConcidenciaParentesis();
            concidenciaParentesis.main(args);
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
         
         System.out.println("\n\n\nINTRODUCE EL NUMERO PARA EJECUTAR EL PROGRAMA CORRESPONDIENTE,SI NO QUIERES EJECUTAR NINGUN PROGRAMA, introduce 0\n\t1) Arboles BST \n"
                + "\t2) Distribucion Cruzada \n\t3) Ejemplo Eratostenes\n\t4) InsertionSort \n"
                + "\t5) JosephusProblem\n\t6) Ordenamiento por Cubetas\n\t7) Pixeles \n\t8) SelectionSort \n\t"
                + "9) ShellSort\n\t10) Tercer Examen\n\t11) compresor\n\t12) Coincidencia de Parentesis");
    
         
         numero = lee.nextInt();
         }
         
    
    }
    public static void main(String[] args) {
        menu(); 
        
    }
}
