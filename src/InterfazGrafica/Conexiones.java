
package InterfazGrafica;
import Estructuras.*;

public class Conexiones {

    private Grafo grafo, invertido;
    private Stack stack;
    private ListaVertices visitados, listaTemporal;
    private Lista conexiones;

    public Conexiones(Grafo grafo) {
        this.grafo = grafo;
        this.invertido = grafo.invertirGrafo();
        this.stack = new Stack();
        this.visitados = new ListaVertices();
        this.conexiones = new Lista();
        this.listaTemporal = new ListaVertices();
    }

    public Grafo getGrafo() {
        return grafo;
    }

    public Grafo getInvertido() {
        return invertido;
    }

    public Stack getStack() {
        return stack;
    }

    public ListaVertices getVisitados() {
        return visitados;
    }

    public Lista getConexiones() {
        return conexiones;
    }

    public ListaVertices getListaTemporal() {
        return listaTemporal;
    }

    
    
    public void resetVisitados() {
        this.visitados = new ListaVertices();
    }
    
    public void resetListaTemporal() {
        this.listaTemporal = new ListaVertices();
    }
    
    public void simpleDFS(Vertice inicio, boolean BusquedaConexiones) {
        
        this.visitados.insertBegin(inicio);
        for (Vertice i:inicio.getArcos()) {
            if (getVisitados().isInList(i.getPersona())) {continue;}
            simpleDFS(i, BusquedaConexiones);
        }
        if (BusquedaConexiones) {
            this.listaTemporal.insertBegin(inicio);
        } else {
            for (Vertice v:this.invertido) {
                if (v.getPersona() == inicio.getPersona()) {
                    this.stack.push(v);
                    break;
                }
            }
        }
    }
    
    public void fullDFS(){
        simpleDFS(getGrafo().getHead(), false);
        while (getStack().getLength() != getGrafo().getSize()) {
            for (Vertice i:getGrafo()) {
                if (!getVisitados().isInList(i.getPersona())) {
                    simpleDFS(i, false);
                    break;
                }
            }
            break;
        }
    }

    public Lista kosaraju() {
        fullDFS();
        this.stack.print();
        resetVisitados();
        int limit = getStack().getLength();
        for (int i=0; i<limit;i++) {
            Vertice current = this.stack.pop();
            if (!getVisitados().isInList(current.getPersona())) {
                simpleDFS(current, true);
                this.conexiones.insertFinal(getListaTemporal());
                resetListaTemporal();
            }
            
        }
        return getConexiones();
    }
    
}
