
package Estructuras;

/**
 *
 * @author usuario
 */
public class Stack{
    
    private Nodo tope;
    private int length;

    public Stack() {
        this.tope = null;
        this.length = 0;
    }

    public Nodo getTope() {
        return tope;
    }

    public void setTope(Nodo peak) {
        this.tope = peak;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void push(Object element) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setTope(nodo);
        } else {
            nodo.setNext(getTope());
            setTope(nodo);
        }
        length++;
    }

    public Nodo pop() {
        if (isEmpty()) {
            System.out.println("La lista se encuentra vacia");
            return null;
        } else {
            Nodo pointer = getTope();
            setTope(pointer.getNext());
            pointer.setNext(null);
            length--;
            return pointer;
        }
    }

    public boolean isEmpty() {
        return getTope() == null;
    }
    
    public void print(){
        Nodo pointer = getTope();
        while (pointer != null) {
            System.out.println("[ " + pointer.getElement() + " ]");
            pointer = pointer.getNext();
        } 
    }
    
}