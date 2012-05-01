package Menu;
/**
 *
 * @author jonhatan
 */
import java.util.*;
public class TercerExamen {
     LinkedList <Character>listaT = new <Character>LinkedList();//Declaro una lista de caracteres
    public static void main(String[] args) {
        TercerExamen t = new TercerExamen();
        Brazo arbol=null;//Hago una variable de tipo Nodo con valor null
        Scanner lee = new Scanner(System.in);
        String entrada;
        do{
            entrada = lee.next();
            if(!entrada.equals("*") && !entrada.equals("$")){//Checa que no sean iguales
                for(int i=0; i < entrada.length();i++){//Recorre la entrada
                    char letra = entrada.charAt(i);
                    if(!Character.isLowerCase(letra)){//Checa que sean mayusculas las letras
                        t.listaT.add(letra);   //Agrega a esa instancia de la clase
                    }
                }
            }else{
                while(t.listaT.size()>0){
                    Brazo nodo = new Brazo (t.listaT.removeLast());
                    arbol = t.armado(arbol, nodo);
                }
                t.recorrido(arbol);
                t.listaT = new <Character>LinkedList();
                arbol = null;
                System.out.println();
            }         
            
        }while(!entrada.equals("$"));
    }
    public Brazo armado(Brazo arbol, Brazo n){
        if(arbol==null){
            arbol = n;
            return arbol;
        }else{
            if(n.data < arbol.data){
                if(arbol.izq==null){//Checa que lo que hay en el brazo izquiero del arbol sea null 
                    arbol.izq = n;//Agrega el dato a el lado izq del arbol
                }else{
                    armado(arbol.izq, n);//va armando el arbol con el valor de n
                }
            }else{
                if(arbol.der==null){//Checa que lo que hay en el brazo derecho del arbol sea null 
                    arbol.der = n;//Agrega el dato a el lado izq del arbol
                }else{
                    armado(arbol.der,n);//va armando el arbol con el valor de n
                }
            }
            return arbol;
        }
    }
    public void recorrido(Brazo arbol){
        
        if(arbol!=null){//Hago un recorrido en preorden
            System.out.print(arbol.data);//Imprimo la raiz
            if(arbol.izq!=null){//Checo el lado izq si es diferente de null entra 
                //System.out.print(arbol.data);
                recorrido(arbol.izq);//Asigna el valor de raiz del arbol en ese momento
                
            }
            if(arbol.der!=null){//Checo el lado der si es diferente de null entra 
                recorrido(arbol.der);//Asigna el valor de raiz del arbol en ese momento
            }
            
        }
    }
    
}
/*
HOLA
$
 */