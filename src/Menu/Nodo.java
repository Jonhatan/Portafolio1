package Menu;

/**
 *
 * @author jonhatan
 */
public class Nodo {
    
    //int s;//Distancia entre nodo mas cercanos
    int info;
    Nodo izq;
    Nodo der;

    public Nodo(int x) {
        izq = null;
        der = null;
        info = x;
    }
}
