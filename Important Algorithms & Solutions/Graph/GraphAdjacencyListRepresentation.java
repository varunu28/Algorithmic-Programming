import java.util.LinkedList;

public class GraphAdjacencyListRepresentation {
    public static void main(String[] args) {
        int V = 5;
        Graph graph = new Graph(V);

        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);

        printGraph(graph);

    }

    public static class Graph {
        int V;
        LinkedList<Integer> adjListArray[];

        Graph(int V) {
            this.V = V;
            adjListArray = new LinkedList[V];

            for (int i=0; i<V; i++) {
                adjListArray[i] = new LinkedList<>();
            }
        }
    }

    public static void addEdge(Graph graph, int fromVertex, int toVertex) {
        graph.adjListArray[fromVertex].addFirst(toVertex);
        graph.adjListArray[toVertex].addFirst(fromVertex);
    }

    public static void printGraph(Graph graph) {
        for (int i=0; i<graph.V; i++) {
            System.out.println("Adjacency list of vertex: " + i);
            System.out.print("Head");
            for (Integer p : graph.adjListArray[i]) {
                System.out.print(" -> " + p);
            }

            System.out.println("\n");
        }
    }
}

