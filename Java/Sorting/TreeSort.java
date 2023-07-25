/*Approach:
-Tree sort,also known as binary tree sort,is a sorting algorithm that builds a binary search tree from the elements to be sorted and then performs an in-order traversal on the tree to retrieve the elements in sorted order.
-Define a private inner class Node to represent a node in the binary search tree with an integer value, height, left, and right references.
-Implement the height() method to calculate the height of a node, returning -1 for a null node.
-Implement the isEmpty() method to check if the tree is empty (root is null).
-Implement the populate(int[] arr) method to build the binary search tree by inserting each element from the input array using the insert method.
-Implement the insert(int value) method to insert a new integer value into the binary search tree recursively, updating the node heights for balancing.
-Implement the inOrder() method to perform an in-order traversal and print the values of the nodes in ascending order.

Note:The time complexity and space complexity of the Tree Sort approach depends on how the binary search tree looks like,which is determined by whether the tree is balanced or unbalanced.

TimeComplexity:
    -Best-case time complexity(when the tree is highly balanced):O(n log n)
    -Average-case time complexity:O(n log n)
    -Worst-case time complexity(when the tree be comes a linear chain):O(n^2)
SpaceComplexity:
    -Best-case space complexity (balanced tree): O(log n)
    -Average-case space complexity: O(log n) to O(n) (depending on the balance)
    -Worst-case space complexity (unbalanced tree): O(n)

SampleInput:
Array before sorting: 15 10 5 8 12 20

SampleOutput:
Array after sorting: 5 8 10 12 15 20
 */

public class TreeSort {
    private class Node{
        int value;
        int height;
        Node left;
        Node right;

        public Node(int value){
            this.value=value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void populate(int[] arr){
        for(int i=0;i< arr.length;i++){
            this.insert(arr[i]);
        }
    }
    //insertion of the element in binary tree search format
    //smaller elements go to the left subtree,and larger elements go to the right subtree.If an element is already present in the BST(duplicate value),
    // it is usually placed in the right subtree.
    public void insert(int value){
        root=insert(value,root);
    }

    private Node insert(int value, Node node){
        if(node==null){
            node=new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(value,node.left);
        }
        if(value>node.value)
        {
            node.right=insert(value,node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }
    //in-order traversal,the left subtree is explored first,then the current node,and finally,the right subtree.
    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    public static void main(String[] args){
        // Sample input
        int arr[]={15,10,5,8,12,20};
        TreeSort sort=new TreeSort();
        sort.populate(arr);
        sort.inOrder();
    }
}
