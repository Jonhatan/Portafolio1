package Menu;

/**
 *
 * @author jonhatan
 */
public class InsertionSort {
    
     public static void main(String[] args) {
        int [] arreglo= {2, 4, 12, 18, 43, 23, 17,8, 58, 100, 64, 78}; //Arreglo desordenado 
        insertSort(arreglo); //Llamada al método para ordenar
    }
    //Método que ordenará
    public static void insertSort (int[] v) {
      for (int i=1; i<v.length; i++) {//El ciclo empieza en la posición 1 del arreglo
         int aux = v[i]; //Variable que contendrá el número
         int j;//Variable que manejará el valor anterior a "aux"
         //Este ciclo interno siempre va una posición anterior a la pos del otro ciclo
         for (j=i-1; j>=0 && v[j]>aux; j--)//Pregunta si j es mayor o igual a cero para que no se salga del arreglo y con "v[j]" verifica el valor de esa pos y pregunta si es mayor al "aux"
            v[j+1] = v[j];//En la posicion j+1 q vendría siendo la pos i va a poner el valor que estaba en la pos j
         v[j+1] = aux; //Dependiendo del valor con que se quedó j va a poner en la posicion j+1 el valor que tenía en aux
      }
      //Simple for para recorrer al final el arreglo ya ordenado
      for (int s : v){
          System.out.print(s+" ");
      }
      System.out.println();
   }
}
