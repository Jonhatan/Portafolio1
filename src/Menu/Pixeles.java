package Menu;

/**
 *
 * @author jonhatan
 */
import java.util.AbstractCollection.*;
import java.util.LinkedList;
import java.util.Queue;
public class Pixeles {
    
    public static void main(String[] args) {
        Queue cola = new LinkedList();

        int[][] arreglo = {{0, 0, 0, 1, 0, 0, 0, 0, 0},
                           {0, 0, 0, 1, 1, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 1, 0, 0, 0},
                           {0, 0, 0, 0, 1, 1, 0, 0, 0},
                           {0, 0, 0, 0, 0, 1, 0, 0, 0},
                           {0, 1, 0, 0, 0, 0, 0, 0, 1},
                           {1, 1, 1, 0, 0, 0, 0, 0, 1},
                           {1, 1, 1, 0, 0, 0, 0, 0, 1},
                           {1, 1, 1, 0, 0, 0, 0, 1, 1},};
        int contador = 1;

        for (int i = 0; i < arreglo.length; i++) {//Recorro fil

            for (int j = 0; j < arreglo.length; j++) {//Recorro col
                int posx = i;
                int posy = j;

                if (arreglo[posx][posy]== 1) {
                   
                    contador++;
                    arreglo[posx][posy] = contador;//Meto a todo mi arreglo el valor del contador
                    cola.offer(posx * 10 + posy);//Introdusco a la cola el valor de dicha operacion

                     int tmp = 0;

                    do {
                        tmp = (Integer) (cola.poll());//Saco lo que hay en la cola
                        posx = tmp / 10;
                        posy = tmp % 10;

                        if (arreglo[posx][posy] == 1) {
                            arreglo[posx][posy] = contador;
                        }

                         if(posy+1 <arreglo.length && arreglo[posx][posy+1]==1){
                            cola.offer(posx*10+(posy+1));
                        }
                        
                        if(posx-1 >=0 && arreglo [posx-1][posy]==1){
                            cola.offer((posx-1)*10+posy);
                        }
                        if(posy-1 >= 0 && arreglo[posx][posy-1]==1){
                            cola.offer(posx*10+(posy-1));
                        }
                        if(posx+1 <arreglo.length && arreglo [posx+1][posy]==1){
                            cola.offer((posx+1)*10+posy);
                        }
                    } while (!cola.isEmpty());
                 }
               // System.out.print(" " + arreglo[posx][posy] + " ");
                System.out.print(" " + arreglo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
