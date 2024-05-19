package pertemuan12;

public class graph {
    private vertex vertexList[]; //array dari vertex
    private int adjMat[][]; //array adjency
    private int nVerts; //angka vertex saat ini

    public graph(int maxVerts){ //konstruktor
        vertexList = new vertex[maxVerts];

        //matriks adjacency
        adjMat = new int[maxVerts][maxVerts];
        nVerts = 0;

        for(int i=0; i < maxVerts; i++){ //set adjacency
            for(int j=0; j < maxVerts; j++){ //matriks 0
                adjMat[i][j] = 0;
            }
        }
    }

    public void addVertex(char lab){ //argumen mengisi label
        vertexList[nVerts++] = new vertex(lab);
    }

    public void addEdge(int start, int end){
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void adjacencyMatrix(){
        for(int i =0; i < adjMat.length; i++){
            for(int j = 0; j < adjMat[0].length; j++){
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}