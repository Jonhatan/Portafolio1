package Menu;

/**
 *
 * @author jonhatan
 */
public class EjemploEratostenes {  

    public static void main(String[] args) {
        boolean[] x = new boolean[200];
        for (int i = 1; i < x.length; i++) {//Recorro el arreglo
            x[i] = true;//Los valores que meto a x los convierto a verdadero 
        }

        for (int i = 2; i < x.length; i++) {//X vale 200 de acuerdo a la matriz
            for (int j = i * 2; j < x.length; j += i) {//Multiplica el valor de i por 2 y se lo asigna a j donde j al final se va incrementado de 2 en 2
                x[j] = false;
            }
        }
        
        System.out.println("Estos son lo numeros primos");
        for (int i = 1; i < x.length; i++) {//Recorro el arreglo para sacar a los numero primos
            if (x[i] == true) {
                System.out.println("- "+i);
            }
        }
    }
}

