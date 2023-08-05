'''
Explanation of Approach:
- We represent the graph using an adjacency list, which is a dictionary where each vertex is a key, and the value for each key is a list of vertices that are adjacent to it.
- The `create_empty_graph` function initializes an empty dictionary to represent the graph.
- The `add_edge` function takes the graph, vertex1, and vertex2 as input and adds an edge between them. It first checks if the vertices exist in the graph. If not, it adds them as keys to the dictionary with an empty list as their value. Then, it appends each vertex to the other's adjacency list to represent the undirected nature of the edge.
- The `sample_graph` function provides a sample input by creating a graph with five vertices (1, 2, 3, 4) and adding edges between them.
- The sample output is the adjacency list representation of the sample graph.

Time Complexity:
- Adding an edge using the `add_edge` function takes O(1) time because dictionary operations (adding elements to a list) and list appends take constant time on average.

Space Complexity:
- The space complexity of the graph representation using an adjacency list is O(V + E), where V is the number of vertices and E is the number of edges. In the worst case, it can be O(V^2) for dense graphs.

Sample Input:
graph = sample_graph()

Sample Output:
{1: [2, 3], 2: [1, 3, 4], 3: [1, 2, 4], 4: [2, 3]}

This output represents a graph with four vertices (1, 2, 3, 4) and five edges connecting them as shown in the following structure:
     1
   /   \
  2-----3
   \   /
     4
'''

# Define a function to create an empty graph with no vertices
def create_empty_graph():
    return {}

# Define a function to add an edge between two vertices in the graph
def add_edge(graph, vertex1, vertex2):
    if vertex1 not in graph:
        graph[vertex1] = []
    if vertex2 not in graph:
        graph[vertex2] = []

    graph[vertex1].append(vertex2)
    graph[vertex2].append(vertex1)

# Sample input to create a graph
def sample_graph():
    graph = create_empty_graph()
    add_edge(graph, 1, 2)
    add_edge(graph, 1, 3)
    add_edge(graph, 2, 3)
    add_edge(graph, 2, 4)
    add_edge(graph, 3, 4)
    return graph

# Sample output for the above sample input:
# {1: [2, 3], 2: [1, 3, 4], 3: [1, 2, 4], 4: [2, 3]}

# Uncomment the following lines to test the sample input and output
# graph = sample_graph()
# print(graph)

