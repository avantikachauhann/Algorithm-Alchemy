'''
Explanation of Approach:
1. We define a function `create_adjacency_matrix(vertices, edges)` that takes the number of vertices and a list of edges as input.
2. We initialize an empty matrix with dimensions `vertices x vertices` and fill it with all 0s. This matrix will represent the adjacency matrix.
3. For each edge in the input `edges` list, we extract the source (`src`) and destination (`dest`) vertices.
4. We mark the entry at `adjacency_matrix[src][dest]` as 1, indicating an edge from source to destination.
5. For undirected graphs (where edges have no direction), we also mark the entry at `adjacency_matrix[dest][src]` as 1.
6. Finally, the function returns the completed adjacency matrix.

Time Complexity: The creation of the adjacency matrix involves iterating through the edges once, so the time complexity is O(E), where E is the number of edges in the graph.

Space Complexity: The space complexity is O(V^2), where V is the number of vertices. We store the adjacency matrix in a 2D list of size V x V.

Sample Input:
num_vertices = 5
edge_list = [(0, 1), (0, 4), (1, 2), (1, 3), (1, 4), (2, 3), (3, 4)]

Sample Output:
Adjacency Matrix:
0 1 0 0 1
1 0 1 1 1
0 1 0 1 0
0 1 1 0 1
1 1 0 1 0

This output represents the adjacency matrix for a graph with 5 vertices and the given edges. For example, there is an edge between vertices 0 and 1, as indicated by the value 1 in the (0, 1) and (1, 0) positions of the matrix. Similarly, there is an edge between vertices 0 and 4, as indicated by the value 1 in the (0, 4) and (4, 0) positions. The diagonal elements (e.g., [0][0], [1][1], etc.) are all 0 because there are no self-loops in this graph.
'''

# Function to create an adjacency matrix for a given graph
def create_adjacency_matrix(vertices, edges):
    # Initialize an empty matrix with all elements as 0
    adjacency_matrix = [[0 for _ in range(vertices)] for _ in range(vertices)]

    # Populate the matrix based on the edges
    for edge in edges:
        src, dest = edge
        adjacency_matrix[src][dest] = 1
        adjacency_matrix[dest][src] = 1  # For undirected graphs, mark both entries as 1

    return adjacency_matrix

# Sample input: Number of vertices and list of edges in the graph
num_vertices = 5
edge_list = [(0, 1), (0, 4), (1, 2), (1, 3), (1, 4), (2, 3), (3, 4)]

# Create the adjacency matrix
adj_matrix = create_adjacency_matrix(num_vertices, edge_list)

# Sample output: The adjacency matrix for the given graph
#     0  1  2  3  4
# 0   0  1  0  0  1
# 1   1  0  1  1  1
# 2   0  1  0  1  0
# 3   0  1  1  0  1
# 4   1  1  0  1  0
print("Adjacency Matrix:")
for row in adj_matrix:
    print(" ".join(str(val) for val in row))

