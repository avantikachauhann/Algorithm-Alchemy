/*
Explanation:
1. The main method initializes a sample input array `arr` with values `[1, 2, 3, 4, 5]`.
2. The `traverseArray` method takes an integer array as input and iterates through each element using a `for` loop. The loop runs from index 0 to index `arr.length - 1`.
3. Inside the loop, each element of the array is accessed using the index `i` and printed.
4. In the `main` method, we call the `traverseArray` method passing the sample input array `arr` to initiate the traversal.

Time Complexity: The time complexity of this traversal algorithm is O(n), where n is the number of elements in the input array. Since we are iterating through each element once, the time complexity is linear to the array size.

Space Complexity: The space complexity of this algorithm is O(1), as we are not using any additional data structures that grow with the input size.

Sample Input:
[1, 2, 3, 4, 5]

Sample Output:
1
2
3
4
5

Note: The code is organized in a standalone class `ArrayTraversal`. It includes a separate method `traverseArray` for array traversal, and the main method for running the code and providing a sample input.
*/

//Here's a code traversal of an array in Java that iterates through each element and prints its value:
public class ArrayTraversal {

    public static void traverseArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        // Sample input
        int[] arr = {1, 2, 3, 4, 5};

        // Traversing the array
        traverseArray(arr);
    }
}
