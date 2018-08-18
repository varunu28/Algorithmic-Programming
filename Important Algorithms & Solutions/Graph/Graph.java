import java.util.LinkedList;

class Graph {
    public int V;
    public LinkedList<Integer> adjListArray[];

    Graph(int V) {
        this.V = V;
        adjListArray = new LinkedList[V];

        for (int i=0; i<V; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    public void addEdge(int fromVertex, int toVertex) {
        this.adjListArray[fromVertex].add(toVertex);
        this.adjListArray[toVertex].add(fromVertex);
    }

    public void printGraph() {
        for (int i=0; i<this.V; i++) {
            System.out.println("Adjacency list of vertex: " + i);
            System.out.print("Head");
            for (Integer p : this.adjListArray[i]) {
                System.out.print(" -> " + p);
            }

            System.out.println("\n");
        }
    }
}
