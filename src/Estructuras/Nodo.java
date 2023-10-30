
package Estructuras;

/**
 *
 * @author usuario
 */
public class Nodo {

    private ListaVertices element;
    private Nodo next;

    public Nodo(ListaVertices element) {
        this.element = element;
        this.next = null;
    }

    public ListaVertices getElement() {
        return element;
    }

    public void setElement(ListaVertices element) {
        this.element = element;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
}
