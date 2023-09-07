"""
Approach:
- Tree sort is a sorting algorithm that builds a binary search tree from the elements to be sorted and
  then performs an in-order traversal of the tree to retrieve the elements in sorted order.

Time Complexity:
- The time complexity of the Tree Sort algorithm depends on how balanced the binary search tree is.
  In the worst case, when the tree is highly unbalanced and resembles a linked list, the time complexity of Tree Sort
  is O(n^2), but in the average and best cases (when the tree is approximately balanced), it's O(n * log(n)).

Space Complexity:
- The space complexity of the Tree Sort algorithm primarily depends on the space required for the
  binary search tree (BST) and any additional data structures used for recursion. Here's a breakdown of the space
  complexity components:

  Binary Search Tree (BST): The space required for the binary search tree is determined by the number of nodes in the
  tree. In the worst case (highly unbalanced tree), the tree can have up to n nodes, where n is the number of
  elements in the input array. Therefore, in the worst case, the space complexity for the BST is O(n).

  Recursion Stack: During the in-order traversal of the BST, the algorithm uses recursion to visit nodes. The space
  complexity of the recursion stack is determined by the maximum depth of the recursion. In the worst case,
  when the tree is highly unbalanced, the recursion stack can have a depth of n (all elements in the tree are in a
  single path). In the average and best cases (balanced tree), the depth of recursion is limited to O(log(n)).
  Therefore, in the worst case, the space complexity for the recursion stack is O(n), and in the average/best cases,
  it's O(log(n)).
  Overall, the dominant factor in the space complexity of Tree Sort is typically the space required
  for the binary search tree. So, the space complexity is O(n) in the worst case and O(log(n)) in the average and
  best cases, considering both the BST and recursion stack.

Sample Input:
- arr = [5, 2, 9, 1, 5, 6]

Sample Output:
- Sorted array: [1, 2, 5, 5, 6, 9]
"""


class TreeNode:
    def __init__(self, key):
        self.left = None
        self.right = None
        self.val = key


def insert(root, key):
    # Function to insert a new element into the binary search tree.
    if root is None:
        return TreeNode(key)
    else:
        if root.val < key:
            root.right = insert(root.right, key)
        else:
            root.left = insert(root.left, key)
    return root


def in_order_traversal(root):
    # Function to perform an in-order traversal of the binary search tree.
    result = []
    if root:
        result = in_order_traversal(root.left)
        result.append(root.val)
        result = result + in_order_traversal(root.right)
    return result


def tree_sort(array):
    # Function to sort an array using Tree Sort.
    root = None
    for item in array:
        root = insert(root, item)  # Insert each element into the BST.
    sorted_array = in_order_traversal(root)  # Traverse the BST in-order to get the sorted elements.
    return sorted_array


if __name__ == "__main__":
    # Example usage:
    arr = [5, 2, 9, 1, 5, 6]
    sorted_arr = tree_sort(arr)
    print("Sorted array:", sorted_arr)
