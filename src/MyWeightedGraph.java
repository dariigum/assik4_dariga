import java.util.HashMap;
import java.util.Map;

public class MyWeightedGraph<V> {
    private Map<MyVertex<V>, MyVertex<V>> vertices;

    public MyWeightedGraph() {
        this.vertices = new HashMap<>();
    }

    public void addVertex(MyVertex<V> vertex) {
        vertices.put(vertex, vertex);
    }

    public void addEdge(MyVertex<V> source, MyVertex<V> destination, double weight) {
        if (!vertices.containsKey(source)) {
            addVertex(source);
        }
        if (!vertices.containsKey(destination)) {
            addVertex(destination);
        }
        source.addAdjacentVertex(destination, weight);
    }

    public Map<MyVertex<V>, MyVertex<V>> getVertices() {
        return vertices;
    }
}


