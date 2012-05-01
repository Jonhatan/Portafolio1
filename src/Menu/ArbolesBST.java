package Menu;

/**
 *
 * @author jonhatan
 */
import java.util.*;
public class ArbolesBST {
    
    static int num[] = {15, 8, 20, 6, 22, 12, 9, 13, 10, 11};
    static Nodo arbol;
//    static Nodo buscado;
    static Nodo encontrado;
    static ArrayList lista = new ArrayList();
    static Nodo n;
    static Nodo valorEncontrado;
    static Nodo tmp = new Nodo(0);

    public static void main(String[] args) {
        for (int i = 0; i < num.length; i++) {
            Nodo x = new Nodo(num[i]);
            lista.add(x);
        }
        arbol = (Nodo) lista.get(0);
        for (int j = 1; j < lista.size(); j++) {
            n = (Nodo) lista.get(j);
            insertaNodo(arbol);//Metodo que hace que inserte los valores al metodo
        }
        enOrden(arbol);//Imprecion del arbol ordenado
        System.out.println();
         int fija = 9;//Este es el numero que busco del arreglo
         busqueda(arbol, fija);//Este me trae el info encontrado
        int eliminar = 22;
        elimina(arbol, eliminar);
        System.out.println();
         eliminar = 9;
        elimina(arbol, eliminar);
         System.out.println();
         eliminar = 20;
        elimina(arbol, eliminar);
    }

    public static void elimina(Nodo arbol, int eliminar) {
        if (arbol != null) {
            Nodo buscado = new Nodo(0);
            buscado = busqueda(arbol, eliminar);
            if (buscado.izq == null && buscado.der == null) {
                System.out.print("El valor que me elimina es "+buscado.info+": ");
                eliminaGrado0(arbol, buscado);
                enOrden(arbol);
            } else if (buscado.izq != null && buscado.der != null) {
                System.out.print("El valor que me elimina es "+buscado.info+": ");
                eliminaGrado2(arbol, buscado);
                enOrden(arbol);
            } else {
                System.out.print("El valor que me elimina es "+buscado.info+": ");
                eliminaGrado1(arbol, buscado);
                enOrden(arbol);
            }
        }
    }

    public static Nodo eliminaGrado0(Nodo arbol, Nodo buscado) {
        if (buscado.info > arbol.info) {
            if (arbol.der.info != buscado.info || arbol.der.info == buscado.info) {
                if (buscado.info == arbol.der.info) {
                    arbol.der = null;                    
                } else {
                    eliminaGrado0(arbol.der, buscado);
                }
            }
        }//Este es el fin del Primer if
        else {
            if (arbol.izq.info != buscado.info || arbol.izq.info == buscado.info) {
                if (buscado.info == arbol.izq.info) {
                    arbol.izq = null;
                } else {
                    eliminaGrado0(arbol.izq, buscado);
                }
            }
        }
        return arbol;
    }

    public static void eliminaGrado1(Nodo arbol, Nodo buscado) {
        if (buscado.info > arbol.info) {
            if (arbol.der.info != buscado.info || arbol.der.info == buscado.info) {
                if (buscado.info == arbol.der.info) {
                    if (arbol.der.der != null) {
                        Nodo escapar = arbol.der.der;//Aqui hago los cambios de los valores
                        arbol.der = null;
                        arbol.der = escapar;
                    } else {

                        Nodo escapar = arbol.der.izq;
                        arbol.der = null;
                        arbol.der = escapar;
                    }

                } else {
                    eliminaGrado1(arbol.der, buscado);
                }
            }
        }//Este es el fin del Primer if
        else {
            if (arbol.izq.info != buscado.info || arbol.izq.info == buscado.info) {
                if (buscado.info == arbol.izq.info) {
                    if (arbol.izq.der != null) {
                        Nodo escapar = arbol.izq.der;
                        arbol.izq = null;
                        arbol.izq = escapar;
                    } else {
                        Nodo escapar = arbol.izq.izq;
                        arbol.izq = null;
                        arbol.izq = escapar;
                    }
                } else {
                    eliminaGrado1(arbol.izq, buscado);
                }
            }
        }
    }

    public static void eliminaGrado2(Nodo arbol, Nodo buscado) {
        if (buscado.info > arbol.info) {
            if (arbol.der.info != buscado.info || arbol.der.info == buscado.info) {
                if (buscado.info == arbol.der.info) {
                    Nodo escaparIzq = arbol.der.izq;//Esta variable me tiene el temporal de lo que tengo en mi arbol dere izq.
                    Nodo escaparDer = arbol.der.der;//Esta variable me tiene el temporal de lo que tengo en mi arbol dere dere.
                    if (escaparIzq.der != null) {//Si no tiene nada a la dere
                        Nodo antesFinal = escaparIzq;
                        if (escaparIzq.der.der != null) {
                            while (antesFinal.der.der != null) {//Me da el ultimo valor que tengo en mi arbol
                                antesFinal = antesFinal.der;
                            }
                        }
                        arbol.der = null;//En esta area hago los cambios del que quiero eliminar y de los nuevos valores que meto
                        arbol.der = antesFinal.der;
                        antesFinal.der = null;
                        arbol.der.der = escaparDer;
                        arbol.der.izq = escaparIzq;
                    } else {
                        //El valor de escaparIzq es el valor mas grande de la dere
                       arbol.der = null;
                       arbol.der = escaparIzq;
                       arbol.der.der = escaparDer;
                    }
                } else {
                    eliminaGrado2(arbol.der, buscado);
                }
            }
        }//Este es el fin del Primer if
        else {
            if (arbol.izq.info != buscado.info || arbol.izq.info == buscado.info) {
                if (buscado.info == arbol.izq.info) {
                    Nodo escaparIzq = arbol.izq.izq;
                    Nodo escaparDer = arbol.izq.der;
                    if (escaparIzq.der != null) {//Si no tiene nada a la dere
                        Nodo antesFinal = escaparIzq;
                        if (escaparIzq.der.der != null) {
                            while (antesFinal.der.der != null) {
                                antesFinal = antesFinal.der;
                            }
                        }
                        arbol.izq = null;
                        arbol.izq = antesFinal.der;
                        antesFinal.der = null;
                        arbol.izq.der = escaparDer;
                        arbol.izq.izq = escaparIzq;
                    } else {
                        //El valor de escaparIzq es el valor mas grande de la dere
                       arbol.izq = null;
                       arbol.izq = escaparIzq;
                       arbol.izq.der = escaparDer;
                    }
                } else {
                   eliminaGrado2(arbol.izq, buscado);
                }
            }
        }
    }

    public static Nodo busqueda(Nodo arbol, int fija) {//Me busca el nodo y mando la direccion de memoria

        if (fija > arbol.info) {
            if (arbol.der.info != fija || arbol.der.info == fija) {
                if (fija == arbol.der.info) {
                    tmp = arbol.der;

                } else {
                    busqueda(arbol.der, fija);
                }
            }
        }//Este es el fin del Primer if
        else {
            if (arbol.izq.info != fija || arbol.izq.info == fija) {
                if (fija == arbol.izq.info) {
                    tmp = arbol.izq;
//                  break;
                } else {
                    busqueda(arbol.izq, fija);
                }
            }
        }
        return tmp;
    }

    public static void enOrden(Nodo arbol) {//Recorrido en orden
        if (arbol != null) {
            if (arbol.izq != null) {
                enOrden(arbol.izq);
            }
            System.out.print(arbol.info + " ");
            if (arbol.der != null) {
                enOrden(arbol.der);
            }
        }
    }

    public static Nodo insertaNodo(Nodo arbol) {   //Con esto construllo el arbol      

        if (arbol.info > n.info) {
            if (arbol.izq == null) {
                arbol.izq = n;
            } else {
                insertaNodo(arbol.izq);
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
}
