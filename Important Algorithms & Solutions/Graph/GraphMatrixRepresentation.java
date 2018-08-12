/*
* Space Complexity: O(n^2)
* Time Complexity: O(1)
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GraphMatrixRepresentation {
    public static int[][] matrix;

    public static void main(String[] args) throws IOException {
        graphMatrix(3, 2);
        printGraph();
    }

    public static void graphMatrix(int numOfVertices, int numOfEdges) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        matrix = new int[numOfVertices][numOfVertices];
        int fromVertex;
        int toVertex;

        for (int i=0; i<numOfEdges; i++) {
            System.out.println("Edge number: " + (i+1));

            System.out.print("From Vertex: ");
            fromVertex = Integer.parseInt(br.readLine());

            System.out.print("To Vertex: ");
            toVertex = Integer.parseInt(br.readLine());

            matrix[fromVertex][toVertex] = 1;
            matrix[toVertex][fromVertex] = 1;
        }
    }

    public static void printGraph() {
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

