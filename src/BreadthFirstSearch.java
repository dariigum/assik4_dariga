import java.util.*;

public class BreadthFirstSearch<V> implements Search<V> {
    private Map<MyVertex<V>, MyVertex<V>> edgeTo;
    private Set<MyVertex<V>> marked;

    public BreadthFirstSearch() {
        edgeTo = new HashMap<>();
        marked = new HashSet<>();
    }

    @Override
    public List<MyVertex<V>> getPath(MyVertex<V> source, MyVertex<V> destination) {
        bfs(source);

        if (!marked.contains(destination)) {
            return null;
        }

        List<MyVertex<V>> path = new LinkedList<>();
        for (MyVertex<V> x = destination; x != null; x = edgeTo.get(x)) {
            path.add(0, x);
        }

        return path;
    }

    private void bfs(MyVertex<V> source) {
        Queue<MyVertex<V>> queue = new LinkedList<>();
        marked.add(source);
        queue.add(source);

        while (!queue.isEmpty()) {
            MyVertex<V> v = queue.poll();

            for (MyVertex<V> w : v.getAdjacentVertices().keySet()) {
                if (!marked.contains(w)) {
                    edgeTo.put(w, v);
                    marked.add(w);
                    queue.add(w);
                }
            }
        }
    }
}
