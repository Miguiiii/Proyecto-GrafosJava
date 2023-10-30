
package Estructuras;


public class Main {

    public static void printIterable(ListaVertices iterable) {
        for (Object i:iterable ) {
            System.out.println(i);                    
        }
    }
    
    
    public static void main(String args[]) {
//        Lista prueba = new Lista();
//        for (int i = 1; i<6; i++ ) {
//            prueba.insertFinal(i);
//        }
//        
//        prueba.print();
//        System.out.print("\n");
//        System.out.println("Lista original:");
//        printIterable(prueba);
//        
//        prueba.deleteElement(4);
//        System.out.println("Lista sin número 4:");
//        printIterable(prueba);
//        prueba.deleteElement(6);
//        System.out.println("Lista luego de tratar de eliminar un número no existente:");
//        printIterable(prueba);
        
        String[] personas = {
            "Miguel",
            "Vincenzo",
            "Andrea",
            "Veronica",
            "Juliana",
            "Eduardo",
            "Fabian",
            "Gabriel",
            "Lina",
            "Dani"
        };
        
        Grafo test = new Grafo();
        for (String i:personas) {
            test.insertBegin(i);
        }
        
        test.addVertice("Miguel", "Vincenzo");
        test.addVertice("Miguel", "Lina");
        test.addVertice("Vincenzo", "Lina");
        test.addVertice("Lina", "Andrea");
        test.addVertice("Lina", "Veronica");
        test.addVertice("Lina", "Juliana");
        test.addVertice("Juliana", "Eduardo");
        test.addVertice("Andrea", "Fabian");
        test.addVertice("Lina", "Fabian");
        
        for (Vertice i:test){
            System.out.print(i.getPersona());
            ListaVertices arcos = i.getArcos();
            for (Vertice j:arcos) {
                System.out.print(" [ " + j.getPersona() + " ] ");
            }
            System.out.println("");
        }
    }
}
