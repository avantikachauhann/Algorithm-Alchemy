/*
Approach:
1. We create a function `createAdjMatrix` that takes in the number of nodes and a vector of edges as input.
2. The function initializes an adjacency matrix with all zeros.
3. It then iterates through the provided edges and marks the appropriate cells in the adjacency matrix as 1 to indicate the presence of an edge.
4. The function returns the adjacency matrix.
5. In the `main` function, we define the number of nodes and the edges of the graph.
6. We then call the `createAdjMatrix` function to create the adjacency matrix.
7. Finally, we print the adjacency matrix.

Time Complexity: O(V + E), where V is the number of nodes (vertices) and E is the number of edges in the graph.

Space Complexity: O(V^2), as we are creating a 2D matrix of size VxV to represent the adjacency matrix.

Sample Input:
Number of nodes: 5
Edges: {{0, 1}, {0, 4}, {1, 2}, {1, 3}, {1, 4}, {2, 3}, {3, 4}}

Sample Output:
0 1 0 0 1 
1 0 1 1 1 
0 1 0 1 0 
0 1 1 0 1 
1 1 0 1 0 
*/

#include <iostream>
#include <vector>

using namespace std;

// Function to create the adjacency matrix
vector<vector<int>> createAdjMatrix(int nodes, vector<vector<int>>& edges) {
    // Initialize the adjacency matrix with all zeros
    vector<vector<int>> adjMatrix(nodes, vector<int>(nodes, 0));

    // Fill the adjacency matrix based on the provided edges
    for (auto& edge : edges) {
        int u = edge[0];  // Starting node of the edge
        int v = edge[1];  // Ending node of the edge

        // Add the edge to the adjacency matrix by marking the appropriate cells as 1
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;  // Uncomment this line for undirected graph
    }

    return adjMatrix;
}

int main() {
    // Number of nodes in the graph
    int nodes = 5;

    // Edges of the graph represented as pairs of nodes
    vector<vector<int>> edges = {{0, 1}, {0, 4}, {1, 2}, {1, 3}, {1, 4}, {2, 3}, {3, 4}};

    // Creating the adjacency matrix
    vector<vector<int>> adjMatrix = createAdjMatrix(nodes, edges);

    // Displaying the adjacency matrix
    for (int i = 0; i < nodes; i++) {
        for (int j = 0; j < nodes; j++) {
            cout << adjMatrix[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}

