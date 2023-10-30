
package Estructuras;

/**
 *
 * @author usuario
 */
public class Stack{
    
    private NodoVertice tope;
    private int length;

    public Stack() {
        this.tope = null;
        this.length = 0;
    }

    public NodoVertice getTope() {
        return tope;
    }

    public void setTope(NodoVertice peak) {
        this.tope = peak;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void push(Vertice element) {
        NodoVertice nodo = new NodoVertice(element);
        if (isEmpty()) {
            setTope(nodo);
        } else {
            nodo.setNext(getTope());
            setTope(nodo);
        }
        length++;
    }

    public Vertice pop() {
        if (isEmpty()) {
            System.out.println("La lista se encuentra vacia");
            return null;
        } else {
            NodoVertice pointer = getTope();
            setTope(pointer.getNext());
            pointer.setNext(null);
            length--;
            return pointer.getElement();
        }
    }

    public boolean isEmpty() {
        return getTope() == null;
    }
    
    public void print(){
        NodoVertice pointer = getTope();
        while (pointer != null) {
            System.out.println("[ " + pointer.getElement().getPersona() + " ]");
            pointer = pointer.getNext();
        } 
    }
    
}