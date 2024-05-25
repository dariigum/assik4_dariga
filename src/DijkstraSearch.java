import java.util.*;

public class DijkstraSearch<V> implements Search<V> {
    private Map<MyVertex<V>, Double> distTo;
    private Map<MyVertex<V>, MyVertex<V>> edgeTo;
    private PriorityQueue<MyVertex<V>> pq;
}