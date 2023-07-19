/*
Approach:
Adjacency matrix is a representation of directed graphs. It stores a 0 for a not existing edge
and a 1 for an existing edge.
On y-axe are the outgoing nodes and on x-axe are the incoming nodes. E.g.

(0 1 0)     This matrix states, that an edge from node 1 to 2 exists.
(1 0 0)     Also from 2 to 1
(0 1 0)     And from 3 to 2

Time Complexity:
Iterate through => θ(n^2)
Find Connection => O(1)
Is Matrix valid => O(n^2)

Space Complexity: O(1)
The needed space is O(n^2)

Sample Input:
    (0 1 0 1)
    (1 0 1 1)
    (1 0 0 1)
    (1 1 1 0)

*/
public class AdjacencyMatrix {

    private int[][] matrix;

    public AdjacencyMatrix(int[][] matrix){
        assert matrix != null;

        this.matrix = matrix;
    }

    public boolean existsEdge(int x, int y){
        assert matrix.length > y && matrix[y].length > x;

        return matrix[y][x] == 1;
    }

    public boolean equals(AdjacencyMatrix other){
        assert other != null;

        return this.toString().equals(other.toString());
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        assert matrix != null;

        this.matrix = matrix;
    }

    //TODO Pair of edges and vertices needed for simple return
    public void toAdjacencyField(){

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

    public boolean valid(){
        for(int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                if(matrix[y][x] > 1 || matrix[y][x] < 0)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[]args){
        int[][] matrix = {  {0,1,0,1},
                            {1,0,1,1},
                            {1,0,0,1},
                            {1,1,1,0}};

        int[][] matrix2 = {{1, 1, 0, 1},
                {1,0,1,1},
                {1,0,0,1},
                {1,1,1,0}};

        AdjacencyMatrix adj = new AdjacencyMatrix(matrix);
        AdjacencyMatrix adj2 = new AdjacencyMatrix(matrix2);

        System.out.println(adj.toString());
        System.out.println(adj2.equals(adj));
    }
}
