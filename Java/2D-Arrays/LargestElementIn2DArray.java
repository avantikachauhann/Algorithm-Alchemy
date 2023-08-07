/*
Explanation of Approach:
1. We define a 2D array `matrix` containing the input values.
2. We initialize the variable `largest` with the value at the first element of the matrix (`matrix[0][0]`).
3. We iterate through each element of the matrix using nested loops.
4. For each element, we compare it with the current `largest` value. If the element is larger, we update the `largest` value.
5. After iterating through the entire matrix, the `largest` value will hold the largest element.

Sample Input:
{{10, 23, 5},
 {7, 8, 12},
 {15, 9, 6}}

Sample Output:
The largest element in the matrix is: 23

Time Complexity:
The time complexity of this program is O(rows * cols), where `rows` is the number of rows in the matrix and `cols` is the number of columns in the matrix.

Space Complexity:
The space complexity of this program is O(1) because it uses a constant amount of extra space to store the `largest` variable and loop indices.

Note: This program assumes a non-empty matrix with at least one element. Additional checks should be added if the input matrix could be empty or have varying row/column lengths.
*/

public class LargestElementIn2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 23, 5},
            {7, 8, 12},
            {15, 9, 6}
        };

        int largestElement = findLargestElement(matrix);
        System.out.println("The largest element in the matrix is: " + largestElement);
    }

    // Function to find the largest element in a 2D array
    static int findLargestElement(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int largest = matrix[0][0];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }

        return largest;
    }
}

