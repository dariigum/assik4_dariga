public class Main {
    public static void main(String[] args) {
        MyGraph<String> graph = new MyGraph<>();

        graph.addVertex("Almaty");
        graph.addVertex("Astana");
        graph.addVertex("Shymkent");
        graph.addVertex("Pavlodar");
        graph.addVertex("Oral");

        graph.addEdge("Almaty","Astana");
        graph.addEdge("Almaty","Shymkent");
        graph.addEdge("Astana","Pavlodar");
        graph.addEdge("Astana","Oral");


        System.out.println(graph.hasEdge("Almaty", "Astana"));
        System.out.println(graph.hasEdge("Almaty", "Pavlodar"));

        System.out.println();

        System.out.println(graph.getNeighbors("Almaty"));

        graph.printGraph();
        System.out.println("_____________________________");
        graph.removeEdge("Astana", "Oral");

        graph.printGraph();



    }
}