import java.util.List;

public interface Search<V> {
    List<MyVertex<V>> getPath(MyVertex<V> source, MyVertex<V> destination);

    String[] pathTo(V key);
}

