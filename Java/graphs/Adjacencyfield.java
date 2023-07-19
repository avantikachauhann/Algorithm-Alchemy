public class Adjacencyfield {
    private int[] vertices;
    private int[] edges;
    private int[] weights;

    public Adjacencyfield(int[] vertices, int[] edges){
        assert vertices[vertices.length-2] == vertices[vertices.length-1];

        this.vertices = vertices;
        this.edges = edges;
    }

    public Adjacencyfield(int[] verticies, int[] edges, int[] weights){
        assert edges.length == weights.length && verticies[verticies.length-2] == verticies[verticies.length-1];

        this.vertices = verticies;
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

    public static void main(String[]args){

    }
}
