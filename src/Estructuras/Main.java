
package Estructuras;

import InterfazGrafica.*;

public class Main {
  
    
    public static void main(String args[]) {
        System.out.println("HOLA");
        System.setProperty("org.graphstream.ui", "swing");
        GUI pantalla = new GUI();
        pantalla.setSize(720, 420);
        pantalla.setDefaultCloseOperation(GUI.EXIT_ON_CLOSE);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        
        
        
        
        
        
        /*
        Lista prueba = new Lista();
        for (int i = 1; i<6; i++ ) {
            prueba.insertFinal(i);
        }
        
        prueba.print();
        System.out.print("\n");
        System.out.println("Lista original:");
        printIterable(prueba);
        
        prueba.deleteElement(4);
        System.out.println("Lista sin número 4:");
        printIterable(prueba);
        prueba.deleteElement(6);
        System.out.println("Lista luego de tratar de eliminar un número no existente:");
        printIterable(prueba);

        
        Grafo test = new Grafo();
        for (int i=0; i<9; i++) {
            test.insertFinal(i);
        }
        
        test.addArista(0, 1);
        test.addArista(1,2);
        test.addArista(2,3);
        test.addArista(2,4);
        test.addArista(3, 0);
        test.addArista(4, 5);
        test.addArista(5, 6);
        test.addArista(6, 4);
        test.addArista(7, 8);
        test.addArista(7, 6);
        
        for (Vertice i:test){
            System.out.print(i.getPersona());
            ListaVertices arcos = i.getArcos();
            for (Vertice j:arcos) {
                System.out.print(" [ " + j.getPersona() + " ] ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        Grafo invertido = test.invertirGrafo();
        for (Vertice i:invertido){
            System.out.print(i.getPersona());
            ListaVertices arcos = i.getArcos();
            for (Vertice j:arcos) {
                System.out.print(" [ " + j.getPersona() + " ] ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        Conexiones prueba = new Conexiones(test);
        
        
        
        Lista conexiones = prueba.kosaraju();
        
        int count = 1;
        System.out.println("Conexiones del grafo:");
        for (ListaVertices i:conexiones) {
            System.out.print(count+".- ");
            for (Vertice j:i) {
                System.out.print(j.getPersona());
            }
            System.out.println("");
            count++;
        }
        */
        
    }
}
