package Menu;

/**
 *
 * @author jonhatan
 */
import java.util.Random;
public class SelectionSort {
    public static void main(String[] args){
        
        Random r = new Random();
        
        int[] a = new int [10];
        
        System.out.println("Arreglo Random:");
        for(int i=0; i<a.length; i++){
            a[i] = r.nextInt(20);
            System.out.print(i<a.length-1 ? a[i]+", " : a[i]+"\n\n");
        }
        
        for(int i=0; i<a.length-1; i++){        
            int min = i;
            for(int j=i+1; j<a.length; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            if(i != min){
                int aux= a[i];
                a[i] = a[min];
                a[min] = aux;
            }
            
            //Sólo Para Imprimir
            System.out.println("Ordenando Arreglo Paso... "+(i+1)+" : (Tengo el "+a[min]+" y lo cambié por "+a[i]+")");
            for(int k=0; k<a.length; k++){
                System.out.print(k<a.length-1 ? a[k]+", " : a[k]+"\n\n");
            }
            //Termina impresión
        }
        
        //Sólo Para Imprimir
        System.out.println("\nArreglo Ordenado:");
        for(int i=0; i<a.length; i++){
            System.out.print(i<a.length-1 ? a[i]+", " : a[i]+"\n");
        }
        //Termina impresión
    }
    
}
