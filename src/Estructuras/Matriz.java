
package Estructuras;


public class Matriz {

    private Lista head;
    private Lista vertices;
    private int length;
    
    public Matriz(){
        this.head=null;
        this.vertices=new Lista();
        this.length=0;
    }

    public Lista getHead() {
        return head;
    }

    public void setHead(Lista head) {
        this.head = head;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Lista getVertices() {
        return vertices;
    }
    
    
}
