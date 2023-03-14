import java.util.List;
import java.util.ArrayList;

/**
 * Clasa Network contine o lista de obiecte de tip Node.
 */
public class Network {
    private List<Node> nodes = new ArrayList<>();

    /**
     * Metoda addNode e utilizata pentru a adauga obiecte Node in lista.
     * @param node
     */
    public void addNode(Node node) {
        nodes.add(node);
    }


}