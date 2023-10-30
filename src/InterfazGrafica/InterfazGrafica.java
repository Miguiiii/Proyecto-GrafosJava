
package InterfazGrafica;
import Estructuras.*;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import javax.swing.*;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;
public class InterfazGrafica {
    public void selectFile() {
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");
        fc.setFileFilter(filtro);
        int seleccion = fc.showOpenDialog(null);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            readFile(file.getPath());
        }
    }

    public void readFile(String file) {
    Graph graph = new SingleGraph("Grafos");

    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] nodes = line.split(", ");
            if (nodes.length == 2) {
                Edge edge = graph.addEdge(nodes[0] + "-" + nodes[1], nodes[0], nodes[1], true);
                Node node1 = graph.getNode(nodes[0]);
                Node node2 = graph.getNode(nodes[1]);
                node1.setAttribute("ui.label", node1.getId());
                node2.setAttribute("ui.label", node2.getId());
            } else if (nodes.length == 1) {
                graph.addNode(nodes[0]);
                Node node = graph.getNode(nodes[0]);
                node.setAttribute("ui.label", node.getId());
            }
        }

//        for (Node node1 : graph) {
//            for (Node node2 : graph) {
//                if (node1 != node2 && sonFuertementeEnlazados(node1, node2)) {
//                    Edge edge = graph.getEdge(node1.getId() + "-" + node2.getId());
//                    if(edge != null){
//                        node1.setAttribute("ui.style", "fill-color: red;");
//                        node2.setAttribute("ui.style", "fill-color: red;");
//                        edge.setAttribute("ui.style", "fill-color: red;");
//                    }
//                }
//            }
//        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    graph.display();
}
//    public boolean sonFuertementeEnlazados(Node node1,Node node2){
//        boolean path1to2 = existsPath(node1, node2);
//        boolean path2to1 = existsPath(node2, node1);
//        return path1to2 && path2to1;
//    }
//    public boolean existsPath(Node start, Node end) {
//    DepthFirstIterator<Node> dfsIterator = new DepthFirstIterator<>(start);
//
//    while (dfsIterator.hasNext()) {
//        Node nextNode = dfsIterator.next();
//        if (nextNode.equals(end)) {
//            return true;
//        }
//    }
//    return false;
//}
}