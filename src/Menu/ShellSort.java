
package Menu;

/**
 *
 * @author jonhatan
 */
public class ShellSort {
     public static void main (String []args){
       int [] a = {1,63,3,12,4,4,8,81,3,23,6,4,8,1,52,6}; //array desordenado
       System.out.println("arreglo original:");
       for (int x : a){
           System.out.print(x+", ");
        }
        
        a = shellSort(a);
       System.out.println("arreglo ordenado:");
       for (int x : a){
           System.out.print(x+", ");
        }
    }
    
    public static int [] shellSort(int[] a) {
        int i = a.length/2; //seleccionamos la mitad del array
        while (i > 0) { //vamos seleccionando la mitad de la mitad hasta que sea cero (lin 29)
            for (int j = i; j < a.length; j++) {//recorre el arreglo desde la mitad hasta el final
                int k = j;
                int temp = a[j];//ponemos en una variable temporal la variable que queremos comparar
                while (k >= i && a[k - i] > temp) {//si no hemos recorrido toda la mitad y el de la posición anterior es mayor...
                    a[j] = a[k - i]; //intercambiamos los valores
                    k = k - i;
                }
                a[k] = temp;//regresamos temp a la posición adecuada
            }
                i = (int) ((float)i/2.2);
        }
        return a;
    }
}
