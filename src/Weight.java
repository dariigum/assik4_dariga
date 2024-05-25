import java.util.HashMap;
import java.util.Map;

public class WeightedGraph<V> {
    private Map<Vertex<V>, Vertex<V>> vertices;

    public WeightedGraph() {
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

    public void setVertices(Map<Vertex<V>, Vertex<V>> vertices) {
        this.vertices = vertices;
    }

    public void printGraph() {
        for (Vertex<V> vertex : vertices.keySet()) {
            System.out.println(vertex);

        }
    }
}

