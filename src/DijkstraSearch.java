import java.util.*;

public class DijkstraSearch<V> implements Search<V> {
    private Map<MyVertex<V>, Double> distTo;
    private Map<MyVertex<V>, MyVertex<V>> edgeTo;
    private PriorityQueue<MyVertex<V>> pq;

    public DijkstraSearch() {
        distTo = new HashMap<>();
        edgeTo = new HashMap<>();
        pq = new PriorityQueue<>(Comparator.comparingDouble(distTo::get));
    }

    @Override
    public List<MyVertex<V>> getPath(MyVertex<V> source, MyVertex<V> destination) {
        dijkstra(source);

        if (!distTo.containsKey(destination)) {
            return null;
        }

        List<Vertex<V>> path = new LinkedList<>();
        for (MyVertex<V> x = destination; x != null; x = edgeTo.get(x)) {
            path.add(0, x);
        }

        return path;
    }

    private void dijkstra(MyVertex<V> source) {
        distTo.put(source, 0.0);
        pq.add(source);

        while (!pq.isEmpty()) {
            MyVertex<V> v = pq.poll();

            for (Map.Entry<MyVertex<V>, Double> entry : v.getAdjacentVertices().entrySet()) {
                relax(v, entry.getKey(), entry.getValue());
            }
        }
    }

    private void relax(MyVertex<V> v, MyVertex<V> w, double weight) {
        double dist = distTo.getOrDefault(v, Double.POSITIVE_INFINITY) + weight;

        if (dist < distTo.getOrDefault(w, Double.POSITIVE_INFINITY)) {
            distTo.put(w, dist);
            edgeTo.put(w, v);

            if (pq.contains(w)) {
                pq.remove(w);
            }
            pq.add(w);
        }
    }
}
