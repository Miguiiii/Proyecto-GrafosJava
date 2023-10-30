
package Estructuras;

import java.util.Iterator;

public class ListaVertices implements Iterable<Vertice> {
    
    private NodoVertice head, tail;
    private int length;

    public ListaVertices() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    
    public NodoVertice getHead() {
        return head;
    }

    public void setHead(NodoVertice head) {
        this.head = head;
    }

    public NodoVertice getTail() {
        return tail;
    }

    public void setTail(NodoVertice tail) {
        this.tail = tail;
    }
    
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public boolean isEmpty() {
        return getHead() == null;
    }
  
    public void insertBegin(Vertice vertice) {
        NodoVertice nodoVertice = new NodoVertice(vertice);
        if (isEmpty()){
            setHead(nodoVertice);
            setTail(nodoVertice);
        } else {
            nodoVertice.setNext(getHead());
            setHead(nodoVertice);
        }
        length++;
    }

    public void insertFinal(Vertice vertice) {
        if (isEmpty()){
            insertBegin(vertice);
            
        } else {
            NodoVertice nodoVertice = new NodoVertice(vertice);
            NodoVertice pointer = getTail();
            pointer.setNext(nodoVertice);
            setTail(nodoVertice);
            length++;
        }
    } 
/*
    public void insertAtIndex(Object element, int index) {
        Nodo nodo = new Nodo(element);
        if (isEmpty() || index == 0){
            insertBegin(element);
        } else {
            if (index < getLength()) {
                Nodo pointer = getHead();
                int cont = 0;
                while (cont < index - 1) {
                    pointer = pointer.getNext();
                    cont++;
                }
                Nodo temp = pointer.getNext();
                nodo.setNext(temp);
                pointer.setNext(nodo);
                length++;
            } else if (index == getLength()) {
                insertFinal(element);
            } else {
                System.out.println("Index not valid");
            }
        }
    }
    */
    public NodoVertice deleteBegin() {
        if(isEmpty()) {
            System.out.println("La lista esta vacia");
            return null;
        } else {
            NodoVertice pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            length--;
            return pointer;
        }
    }
    
    public NodoVertice deleteFinal() {
        if(isEmpty()) {
            System.out.println("La lista esta vacia");
            return null;
        } else {
            NodoVertice pointer = getHead();
            while (pointer.getNext().getNext() != null) {
                pointer = pointer.getNext();
            }
            NodoVertice temp = pointer.getNext();
            pointer.setNext(null);
            length--;
            return temp;
        }
    }


    public NodoVertice deleteElement(Object element) {
        if(isEmpty()) {
            System.out.println("La lista esta vacia");
            return null;
        } else if (element == getHead().getElement().getPersona()) {
            return deleteBegin();
        } else {
            NodoVertice pointer = getHead();
            while (element != pointer.getNext().getElement().getPersona()) {
                pointer = pointer.getNext();
                if (pointer.getNext() == null) {
                    return null;
                }
            }
            NodoVertice temp = pointer.getNext();
            pointer.setNext(temp.getNext());
            temp.setNext(null);
            length--;
            return temp;
        }
    }
    
    public NodoVertice deleteAtIndex(int index) {
        if(isEmpty()) {
            System.out.println("La lista esta vacia");
            return null;
        } else {
            if (index == 0){
            return deleteBegin();
            } else {
                if (index < getLength()) {
                    NodoVertice pointer = getHead();
                    int cont = 0;
                    while (cont < index - 1) {
                        pointer = pointer.getNext();
                        cont++;
                    }
                    NodoVertice temp = pointer.getNext();
                    pointer.setNext(temp.getNext());
                    temp.setNext(null);
                    length--;
                    return temp;
                } else if (index == getLength()) {
                    return deleteFinal();
                } else {
                    System.out.println("Index not valid");
                    return null;
                }
            }
        }
    }

    public boolean isInList(Object element) {
        for (Vertice i:this) {
            if (i.getPersona() == element) {return true;}
        }
        return false;
    }
    
    @Override
    public Iterator iterator() {
        return new ListaVerticesIterator(this);
    }
    
    public void print() {
        NodoVertice pointer = getHead();
        while (pointer != null) {
            System.out.print(" [ " + pointer.getElement().getPersona() + " ] ");
            pointer = pointer.getNext();
        }
    }
}

class ListaVerticesIterator implements Iterator {
    
    NodoVertice pointer;

    public ListaVerticesIterator(ListaVertices list) {
        pointer = list.getHead();
    }
    
    @Override
    public boolean hasNext() {
        return pointer != null;
    }

    @Override
    public Vertice next() {
        Vertice current = pointer.getElement();
        pointer = pointer.getNext();
        return current;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}