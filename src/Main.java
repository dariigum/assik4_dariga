public class Main {
    public static void main(String[] args) {
        // Create vertices
        MyVertex<String> vA = new MyVertex<>("A");
        MyVertex<String> vB = new MyVertex<>("B");
        MyVertex<String> vC = new MyVertex<>("C");
        MyVertex<String> vD = new MyVertex<>("D");
        MyVertex<String> vE = new MyVertex<>("E");

        // Create graph and add edges
        MyWeightedGraph<String> graph = new MyWeightedGraph<>();
        graph.addEdge(vA, vB, 1);
        graph.addEdge(vA, vC, 4);
        graph.addEdge(vB, vC, 2);
        graph.addEdge(vB, vD, 5);
        graph.addEdge(vC, vE, 3);
        graph.addEdge(vD, vE, 1);

        // Perform BFS
        Search<String> bfs = new BreadthFirstSearch<>();
        System.out.println("BFS Path from A to E:");
        for (MyVertex<String> vertex : bfs.getPath(vA, vE)) {
            System.out.print(vertex + " ");
        }
        System.out.println();

        // Perform Dijkstra
        Search<String> dijkstra = new DijkstraSearch<>();
        System.out.println("Dijkstra Path from A to E:");
        for (MyVertex<String> vertex : dijkstra.getPath(vA, vE)) {
            System.out.print(vertex + " ");
        }
        System.out.println();
    }
}
