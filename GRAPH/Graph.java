package DSA_PEP_LPU.GRAPH;
public class Graph {
    private boolean[][] adjacencyMatrix;

    private int numVertices;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjacencyMatrix = new boolean[numVertices][numVertices];
    }

    public void addEdge(int i, int j) {
        adjacencyMatrix[i][j] = true;
        adjacencyMatrix[j][i] = true;
    }

    public void printGraph() {
        for(int i = 0; i < numVertices; i++) {
            for(int j = 0; j < numVertices; j++) {
                System.out.print(
                    adjacencyMatrix[i][j] ? "1 " : "0 "
                );
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(1, 3);

         System.out.println(
            "Graph Representation (Adjacency Matrix):");
        graph.printGraph();
    }
}
