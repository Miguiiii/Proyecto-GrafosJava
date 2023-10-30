
package Estructuras;

import java.util.Iterator;

public class Grafo implements Iterable<Vertice> {
    
    private Vertice head;
    private int size;

    public Grafo() {
        this.head = null;
        this.size = 0;
    }

    public Vertice getHead() {
        return head;
    }

    public void setHead(Vertice head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    

    public boolean isEmpty() {
        return getHead() == null;
    }
    
    public void addVertice(Object start, Object end){
        boolean StartFound = false;
        boolean EndFound = false;
        Vertice inicio = null, fin = null;
        for (Vertice i:this) {
            if (i.getPersona() == start) {
                inicio = i;
                StartFound = true;
            } else if (i.getPersona() == end) {
                fin = i;
                EndFound = true;
            }
            if (StartFound && EndFound) {
                inicio.addArco(fin);
                break;
            }
        }
    }
    

    
    /**
     *
     * @param element
     */
    public void insertBegin(Object element) {
        Vertice vertice = new Vertice(element);
        if (isEmpty()){
            setHead(vertice);
        } else {
            vertice.setNext(getHead());
            setHead(vertice);
        }
        size++;
    }
    
    public void insertFinal(Object element) {
        Vertice vertice = new Vertice(element);
        if (isEmpty()){
            setHead(vertice);
        } else {
            Vertice pointer = getHead();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(vertice);
        }
        size++;
    } 

    public Vertice deleteBegin() {
        if(isEmpty()) {
            System.out.println("La lista esta vacia");
            return null;
        } else {
            Vertice pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            size--;
            return pointer;
        }
    }
    

    public Vertice deleteElement(Object element) {
        if(isEmpty()) {
            System.out.println("La lista esta vacia");
            return null;
        } else if (element == getHead().getPersona()) {
            return deleteBegin();
        } else {
            Vertice pointer = getHead();
            while (element != pointer.getNext().getPersona()) {
                pointer = pointer.getNext();
                if (pointer.getNext() == null) {
                    return null;
                }
            }
            Vertice temp = pointer.getNext();
            pointer.setNext(temp.getNext());
            temp.setNext(null);
            size--;
            return temp;
        }
    }
    
    public boolean isInGraph(Object element) {
        for (Vertice i:this) {
            if (i.getPersona() == element) {return true;}
        }
        return false;
    }
    
    @Override
    public Iterator iterator() {
        return new VerticeIterator(this);
    }

}

class VerticeIterator implements Iterator {
    
    Vertice pointer;

    public VerticeIterator(Grafo graph) {
        pointer = graph.getHead();
    }
    
    @Override
    public boolean hasNext() {
        return pointer != null;
    }

    @Override
    public Vertice next() {
        Vertice current = pointer;
        pointer = pointer.getNext();
        return current;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}