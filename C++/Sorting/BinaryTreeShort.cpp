#include <iostream>

// Explanation:
// - The following code demonstrates the construction of a Binary Search Tree (BST).
// - A BST is a binary tree where each node has a value, and for each node:
//   - All nodes in its left subtree have values less than the node's value.
//   - All nodes in its right subtree have values greater than or equal to the node's value.

/*Sample Input:
{64, 34, 25, 12, 22, 11, 90}

Sample Output:
Original Array: 64 34 25 12 22 11 90 
Sorted Array: 11 12 22 25 34 64 90 

Time Complexity:
The time complexity of the BST operations depends on the structure of the tree. In the best case, where the tree is perfectly balanced, the time complexity for most operations is O(log N), where N is the number of nodes in the tree. This is because with each comparison or traversal, the search space is reduced by half, leading to a logarithmic time complexity.
However, in the worst case, where the tree is completely unbalanced (resembles a linked list), the time complexity for BST operations can be O(N), where N is the number of nodes. This happens when nodes are inserted in a way that does not maintain the balanced property of the BST.

Space Complexity:
The space complexity of BST operations is primarily determined by the function call stack during recursion. In the best and average cases, when the tree is reasonably balanced, the space complexity for the function call stack is O(log N), where N is the number of nodes. This is because the maximum depth of the call stack is limited by the height of the tree, which is logarithmic in the number of nodes.
In the worst case, when the tree is completely unbalanced, the space complexity for the function call stack can be O(N), where N is the number of nodes. This occurs when the tree degenerates into a linked list.
Overall, the time complexity of BST operations can vary from O(log N) in the best case to O(N) in the worst case, while the space complexity ranges from O(log N) to O(N) depending on the tree's balance.





*/
// Definition of a BST node
struct Node {
    int data;       // Data stored in the current node
    Node* left;     // Pointer to the left subtree
    Node* right;    // Pointer to the right subtree

    Node(int value) : data(value), left(nullptr), right(nullptr) {}
};

// Function to insert a value into the BST
void insert(Node*& root, int value) {
    if (!root) {
        // If the current node is null, create a new node with the given value
        root = new Node(value);
        return;
    }

    if (value < root->data) {
        // If the value is less than the current node's data, insert it into the left subtree
        insert(root->left, value);
    } else {
        // If the value is greater or equal to the current node's data, insert it into the right subtree
        insert(root->right, value);
    }
}

// Function to perform an inorder traversal of the BST
void inorderTraversal(Node* root) {
    if (!root) return;

    // Traverse the left subtree (recursively)
    inorderTraversal(root->left);

    // Print the current node's data
    std::cout << root->data << " ";

    // Traverse the right subtree (recursively)
    inorderTraversal(root->right);
}

int main() {
    Node* root = nullptr;
    int values[] = {64, 34, 25, 12, 22, 11, 90};
    int size = sizeof(values) / sizeof(values[0]);

    for (int i = 0; i < size; i++) {
        // Insert each value into the BST using the insert function
        insert(root, values[i]);
    }

    // Perform an inorder traversal to print the sorted values
    std::cout << "Inorder Traversal (Sorted Values): ";
    inorderTraversal(root);
    std::cout << std::endl;

    return 0;
}
