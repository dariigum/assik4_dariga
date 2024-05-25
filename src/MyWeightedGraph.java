import java.util.HashMap;
import java.util.Map;

public class MyWeightedGraph<V> {
    private Map<Vertex<V>, Vertex<V>> vertices;
    private Map<Vertex, List<Edge<Vertex>>>map=new HashMap<>();

    public MyWeightedGraph() {
        this.vertices = new HashMap<>();
    }

    public void addVertex(Vertex<V> vertex) {
        vertices.put(vertex, vertex);
    }

    public void addEdge(Vertex<V> source, Vertex<V> destination, double weight) {
        if (!vertices.containsKey(source)) {
            addVertex(source);
        }
        if (!vertices.containsKey(destination)) {
            addVertex(destination);
        }
        source.addAdjacentVertex(destination, weight);
    }

    public Map<Vertex<V>, Vertex<V>> getVertices() {
        return vertices;
    }


    public void addEdge(V almaty, V astana, double weight) {
    }
}

