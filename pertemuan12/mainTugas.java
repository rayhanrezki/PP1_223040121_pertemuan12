package pertemuan12;

public class mainTugas {
    public static void main(String[] args) {
        graph graph = new graph(4);

        //menambahkan vertex
        graph.addVertex('A'); //0
        graph.addVertex('B'); //1
        graph.addVertex('C'); //2
        graph.addVertex('D'); //3

        //menambahkan Edge
        graph.addEdge(0, 1); // A-B
        graph.addEdge(0, 2); // A-C
        graph.addEdge(0, 3); // A-D
        graph.addEdge(1, 2); // B-C
        graph.adjacencyMatrix();
        System.out.println();
    }
}