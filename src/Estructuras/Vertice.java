
package Estructuras;


public class Vertice {

    private final Object persona;
    private Vertice next;
    private final ListaVertices arcos;
    
    public Vertice(Object persona){
        this.persona = persona;
        this.arcos = new ListaVertices();
        this.next = null;
    }

    public Object getPersona() {
        return persona;
    }

    public Vertice getNext() {
        return next;
    }

    public void setNext(Vertice next) {
        this.next = next;
    }

    public ListaVertices getArcos() {
        return arcos;
    }
    
    public void addArco(Vertice vertice) {
        getArcos().insertFinal(vertice);
    }
    
}
