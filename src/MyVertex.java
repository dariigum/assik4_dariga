import java.util.HashMap;
import java.util.Map;

public class MyVertex<V> {
    private V data;
    private Map<MyVertex<V>, Double> adjacentVertices;

    public Vertex(V data) {
        this.data = data;
        this.adjacentVertices = new HashMap<>();
    }

    public V getData() {
        return data;
    }

    public void addAdjacentVertex(MyVertex<V> destination, double weight) {
        adjacentVertices.put(destination, weight);
    }

    public Map<MyVertex<V>, Double> getAdjacentVertices() {
        return adjacentVertices;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}



