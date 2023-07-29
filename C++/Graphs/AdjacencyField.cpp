/*
Explanation of Approach:
- We represent the graph as an Adjacency List, which is an array of vectors.
- Each vector in the array represents a vertex and contains a list of its adjacent vertices.
- We use an undirected graph representation, so for every edge (u, v), we add both (u -> v) and (v -> u) to the adjacency list.

Time Complexity:
- Adding an edge takes O(1) time since it involves only inserting an element into the vector.
- Printing the adjacency list takes O(V + E) time, where V is the number of vertices and E is the number of edges, as we need to traverse through the entire adjacency list.

Space Complexity:
- The space complexity of the adjacency list is O(V + E), where V is the number of vertices and E is the number of edges, as we store all the edges in the adjacency list.

Sample Input:
```
Enter the number of vertices: 5
Enter the number of edges: 4
Enter edges (u, v):
0 1
0 2
1 3
3 4
```

Sample Output:
Adjacency List:
Adjacency list of vertex 0: 1 2 
Adjacency list of vertex 1: 0 3 
Adjacency list of vertex 2: 0 
Adjacency list of vertex 3: 1 4 
Adjacency list of vertex 4: 3 

In the sample input, we created a graph with 5 vertices and 4 edges, and the output shows the adjacency list representation of the graph.
*/


#include <iostream>
#include <vector>

using namespace std;

// Function to add an edge to the adjacency list
void addEdge(vector<vector<int>>& adjList, int u, int v) {
    adjList[u].push_back(v);
    adjList[v].push_back(u); // For undirected graph, add both edges
}

// Function to print the adjacency list
void printAdjacencyList(const vector<vector<int>>& adjList) {
    int V = adjList.size();
    for (int i = 0; i < V; ++i) {
        cout << "Adjacency list of vertex " << i << ": ";
        for (int v : adjList[i]) {
            cout << v << " ";
        }
        cout << endl;
    }
}

int main() {
    int V, E; // Number of vertices and edges
    cout << "Enter the number of vertices: ";
    cin >> V;
    cout << "Enter the number of edges: ";
    cin >> E;

    // Create an adjacency list of size V
    vector<vector<int>> adjList(V);

    cout << "Enter edges (u, v):" << endl;
    for (int i = 0; i < E; ++i) {
        int u, v;
        cin >> u >> v;
        addEdge(adjList, u, v);
    }

    // Print the adjacency list
    cout << "Adjacency List:" << endl;
    printAdjacencyList(adjList);

    return 0;
}

