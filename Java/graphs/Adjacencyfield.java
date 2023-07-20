/*
Approach:
Adjacency fields can store directed graphs. Its build with 2 arrays
v = Vertices    |v| = Amount of nodes
e = Edges       |e| = Amount of edges

The index of an entry in v is the node id. The entry is an index for e
and points at the first outgoing edge from a node.

Time Complexity: O(n)
Iterate through => O(|v|+|e|)

Space Complexity: O(1)
O(|v|+|e|)

Sample Input:
v = [1,3,4]
e = [1,2,1,2]
Explanation: Node 1 is going to 1 and 2. Node 2 goes to 1 and node 3 has an edge to 2

*/
public class Adjacencyfield {
    private int[] vertices;
    private int[] edges;
    private int[] weights;

    public Adjacencyfield(){
        this.vertices = null;
        this.edges = null;
    }

    public Adjacencyfield(int[] vertices, int[] edges){
        assert vertices[vertices.length-2] == vertices[vertices.length-1];

        this.vertices = vertices;
        this.edges = edges;
    }

    public Adjacencyfield(int[] vertices, int[] edges, int[] weights){
        assert edges.length == weights.length && vertices[vertices.length-2] == vertices[vertices.length-1];

        this.vertices = vertices;
        this.edges = edges;
        this.weights = weights;
    }

    public int[] getVertices() {
        return vertices;
    }

    public void setVertices(int[] vertices) {
        this.vertices = vertices;
    }

    public int[] getEdges() {
        return edges;
    }

    public void setEdges(int[] edges) {
        this.edges = edges;
    }

    public int[] getWeights() {
        return weights;
    }

    public void setWeights(int[] weights) {
        this.weights = weights;
    }

    public String toString(){
        String tmp = "";

        tmp += "Vertices [";
        for(int i = 0; i < vertices.length; i++){
            tmp += vertices[i] + " ";
        }

        tmp += "]\nEdges [";
        for(int i = 0; i < edges.length; i++){
            tmp += edges[i] + " ";
        }
        tmp+="]";

        return tmp;
    }

    public static void main(String[]args){

    }
}
