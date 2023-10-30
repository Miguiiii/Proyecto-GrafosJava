
package Estructuras;

import java.util.Iterator;
/**
 *
 * @author usuario
 */
public class Lista implements Iterable<ListaVertices>{

    private Nodo head, tail;
    private int length;

    public Lista() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void insertFinal(ListaVertices element) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setHead(nodo);
            setTail(nodo);
        } else {
            getTail().setNext(nodo);
            setTail(nodo);
        }
        length++;
    }


    public boolean isEmpty() {
        return getHead() == null && getTail() == null;
    }

    @Override
    public Iterator<ListaVertices> iterator() {
        return new ListaIterator(this);
    }

    
}

class ListaIterator implements Iterator {
    
    Nodo pointer;

    public ListaIterator(Lista list) {
        pointer = list.getHead();
    }
    
    @Override
    public boolean hasNext() {
        return pointer != null;
    }

    @Override
    public ListaVertices next() {
        ListaVertices current = pointer.getElement();
        pointer = pointer.getNext();
        return current;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}