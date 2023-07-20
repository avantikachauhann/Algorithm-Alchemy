import java.util.ArrayList;

/*
Approach:
Adjacency matrix is a representation of directed graphs. It stores a 0 for a non existing edge
and a 1 for existing edges.
On y-axe are the outgoing nodes and on x-axe are the incoming nodes. E.g.

(0 1 0)     This matrix states, that an edge from node 1 to 2 exists.
(1 0 0)     Also from 2 to 1
(0 1 0)     And from 3 to 2

Time Complexity:
Iterate through => θ(n^2)
Find Connection => O(1)
Is Matrix valid => O(n^2)

Space Complexity:
The needed space is O(n^2)

Sample Input:
    (0 1 0 1)
    (1 0 1 1)
    (1 0 0 1)
    (1 1 1 0)

*/
public class AdjacencyMatrix {

    //All entries stored in a 2 dimensional array
    private byte[][] matrix;

    public AdjacencyMatrix(byte[][] matrix){
        this.matrix = matrix;
    }

    public boolean existsEdge(int from, int to){
        return matrix[from-1][to-1] == 1;
    }

    public boolean equals(AdjacencyMatrix other){
        return this.toString().equals(other.toString());
    }

    public byte[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(byte[][] matrix) {
        this.matrix = matrix;
    }

    //Convert datatype to @Adjacencyfield.java
    public Adjacencyfield toAdjacencyField(){
        //Create the datatype
        Adjacencyfield field = new Adjacencyfield();

        //tmp list to store all vertices and edges
        ArrayList<Integer> vertices = new ArrayList<>();
        ArrayList<Integer> edges = new ArrayList<>();

        //adjacencyfield starts with index 1
        vertices.add(1);

        //go through the matrix and store every existing edge
        for(int y = 0; y < matrix.length; y++){
            for(int x = 0; x < matrix[y].length; x++){
                if(matrix[y][x] == 1)
                    edges.add(x+1);
            }
            //Adding the first out edge for the next node
            vertices.add(edges.size()+1);
        }

        //write back to arrays
        field.setVertices(convertListToArray(vertices));
        field.setEdges(convertListToArray(edges));

        return field;
    }

    public String toString(){
        String tmp = "";

        for(int y = 0; y < matrix.length; y++){
            for(int x = 0; x < matrix[y].length; x++) {
                tmp += matrix[y][x] + " ";
            }
            tmp += "\n";
        }
        return tmp;
    }

    //check all entries  = [0,1]
    public boolean valid(){
        for(int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                if(matrix[y][x] > 1 || matrix[y][x] < 0)
                    return false;
            }
        }
        return true;
    }

    private int[] convertListToArray(ArrayList<Integer> list){
        final int[] tmp = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            tmp[i] = list.get(i);
        }
        return tmp;
    }

    public static void main(String[]args){
        //byte for less storage usage
        byte[][] matrix = {  {0,1,0,1},
                {1,0,1,1},
                {1,0,0,1},
                {1,1,0,0}};

        byte[][] matrix2 = {{1, 1, 0, 1},
                {1,0,1,1},
                {1,0,0,1},
                {1,1,1,0}};

        AdjacencyMatrix adj = new AdjacencyMatrix(matrix);
        AdjacencyMatrix adj2 = new AdjacencyMatrix(matrix2);

        System.out.println(adj.toString());
        System.out.println("Equals: " + adj2.equals(adj));
        System.out.println("Exists an edge 1 -> 2: " +adj.existsEdge(1,2));
        System.out.println("Entries valid: " +adj.valid());

        System.out.println(adj.toAdjacencyField().toString());
    }
}
