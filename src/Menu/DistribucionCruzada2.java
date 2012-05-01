package Menu;

/**
 *
 * @author jonhatan
 */
import java.util.*;
import java.util.regex.Pattern;
public class DistribucionCruzada2 {
     static ArrayList lista = new ArrayList();
    static LinkedList valoresNoAgarrados = new LinkedList();
    
    static Nodo arbol;
    static Nodo n;
    static int residuo = 0;
    static String recOrden = "";
    static int A[] = new int[0];
    static int B[] = new int[0];
    static int C[] = new int [0];

    public static void realizaArbol(String[] algo, Nodo x, String Ki) {
        LinkedList<Integer> LT = new LinkedList<Integer>();
        int numero = 0;
        String sep = Ki.substring(1, Ki.length() - 1);
        String[] separacion = sep.split(Pattern.quote(","));
        int arreglo[] = new int[separacion.length];
        C = new int[algo.length];
        int conteo = 1;
        for (int t = 0; t < algo.length; t++) {//Recorro algo que es un arreglo de String y lo paso a un arreglo de int
            String cambio = algo[t];
            String temp = cambio.trim();
            C[t] = Integer.valueOf(temp);//Este me contiene lo de C
        }
        System.out.print("El valor de K es ");
        for (int k = 0; k < separacion.length; k++) {
            System.out.print(separacion[k]);//Imprimo los valores de K
            String cam = separacion[k];
            String parcial = cam.trim();
            arreglo[k] = Integer.valueOf(parcial);
        }
        System.out.println();
        for (int j = arreglo.length - 1; j >= 0; j--) {
            if (conteo != 0 && conteo > 0) {
                lista.add(algo[j]);
                conteo = residuo - arreglo[j];
                residuo = conteo;
            } else {//Aki debe de ir el else que me checa los numeros a los cuales no me entro
                valoresNoAgarrados.addFirst(algo[j]);
            }
        }
        int count = 1;
        for (int i = 0; i < lista.size(); i++) {
            while (count == 1) {
                arbol = new Nodo(Integer.parseInt((String) lista.get(i)));
                count++;
            }
            n = new Nodo(Integer.parseInt((String) lista.get(i)));
            insertaNodo(arbol);//Metodo que hace que inserte los valores al metodo*****
        }

        int conta = 0;
        recOrden = enOrden(arbol);//Imprecion del arbol ordenado***************************
        String paso[] = recOrden.split(Pattern.quote(" "));
        for (int z = 0; z < paso.length; z++) {//Recorro lo que me quedo del arbol
            String espera = paso[z];
            numero = Integer.valueOf(espera);
            while (numero != C[conta]) {
                conta++;
            }
            conta++;
            LT.add(conta);
            conta = 0;
        }
        for (int s = valoresNoAgarrados.size(); s > 0; s--) {//Introdusco los valores que no entraron en el arbol
            valoresNoAgarrados.get(s - 1);
            LT.addFirst(s);
        }
        
        calculaA(LT);
        System.out.println();
        calculaB(LT);
    }
        public static void calculaA(LinkedList<Integer> LtNuevo){//Esto no esta bien hay que checarlo
            System.out.print("El resultado de A es ");
            int tmp = 0;
            int i=0;
            A = new int[LtNuevo.size()];
            for(i = 1; i<=LtNuevo.size();i++){
            tmp =(Integer)LtNuevo.get(i-1);
            A[tmp-1]=i;
            }
            for(int j= 0; j<A.length;j++){
            System.out.print(A[j]+" ");
        }
        }
         public static void calculaB(LinkedList<Integer> LtNuevo){
            System.out.print("El resultado de B es ");
            int tmp = 0;
            int i=0;
            B = new int[LtNuevo.size()];
            for(i = 1; i<=LtNuevo.size();i++){
            tmp =(Integer)LtNuevo.get(i-1);
            B[i-1]=C[tmp-1];
         }
               for(int j= 0; j<B.length;j++){
            System.out.print(B[j]+" ");
        }
        }
    
    public static String enOrden(Nodo arbol) {//Recorrido en orden       
        if (arbol != null) {
            if (arbol.izq != null) {
                enOrden(arbol.izq);
            }
            recOrden += arbol.info + " ";
            if (arbol.der != null) {
                enOrden(arbol.der);
            }
        }
        return recOrden;
    }

    public static Nodo insertaNodo(Nodo arbol) {   //Con esto construllo el arbol      
        if (arbol.info > n.info) {
            if (arbol.izq == null) {
                arbol.izq = n;
            } else {
                insertaNodo(arbol.izq);//Recursividad
            }
        } else if (arbol.info < n.info) {
            if (arbol.der == null) {
                arbol.der = n;
            } else {
                insertaNodo(arbol.der);
            }
        }
        return arbol;
    }

    public static Object sacaValorK(String[] algo) {
        ArrayList<Integer> K = new ArrayList<Integer>();//Es mayuscula
        int i = 0;
        int j = 0;
        int tmp = 0;

        int conta = 0;
        while (i <= algo.length - 1) {
            int num = Integer.parseInt(algo[i]);
            while (j < algo.length - 1) {
                int num2 = Integer.parseInt(algo[j + 1]);
                if (num > num2) {
                    conta++;
                }
                j++;
            }
            K.add(conta);
            tmp += conta;
            conta = 0;
            i++;
            j = i;
        }
        residuo = tmp / 2;
        return K;
    }

    public static void captura(Nodo x) {
        Scanner lee = new Scanner(System.in);
        System.out.println("Introduce numeros para obtener el resultado de K, A, B");
        String c = lee.next();
        String[] algo = c.split(",");
        String Ki = String.valueOf(sacaValorK(algo));

        realizaArbol(algo, x, Ki);
    }

    public static void main(String[] args) {
        Nodo x = new Nodo(1);
        captura(x);
    }
    
    
}
