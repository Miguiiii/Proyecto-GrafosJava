
package Estructuras;

/**
 *
 * @author usuario
 */
public class NodoVertice {

    private final Vertice element;
    private NodoVertice next;

    public NodoVertice(Vertice element) {
        this.element = element;
        this.next = null;
    }

    public void setNext(NodoVertice next) {
        this.next = next;
    }

    public Vertice getElement() {
        return element;
    }

    public NodoVertice getNext() {
        return next;
    }    
}
