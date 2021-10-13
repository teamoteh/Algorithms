package DijkstraAlgorithm;

public class Graph {
    private int adjMatrix[][];
    private int numOfVertices;

    public Graph (int num){
        this.numOfVertices = num;
        adjMatrix = new int[num][num];
        for (int i = 0; i < num; i++){
            for(int j =0; j < num; j ++){
                adjMatrix[i][j] = 0;
            }
        }
    }

    public void addEdge(int i, int j, int weight){
        adjMatrix[i][j] = weight;
        adjMatrix[j][i] = weight;
    }

    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = 0;
        adjMatrix[j][i] = 0;
      }

}
