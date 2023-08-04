/*
Approach Explanation:

The approach involves two steps:
1. Transpose the matrix: In this step, we swap the elements at matrix[i][j] and matrix[j][i] for all i, j pairs where i is less than j. This operation converts rows into columns and vice versa.
2. Reverse each row: After transposing the matrix, we reverse each row to get the final 90-degree clockwise rotation.

Time Complexity: The time complexity of this approach is O(N^2), where N is the number of elements in the matrix.

Space Complexity: The space complexity is O(1) since we are performing the rotation in-place without using any additional data structures.

Sample Input:
Enter the number of rows: 3
Enter the number of columns: 3
Enter the elements of the matrix:
1 2 3
4 5 6
7 8 9

Sample Output:
Original Matrix:
1 2 3
4 5 6
7 8 9

Matrix after 90-degree clockwise rotation:
7 4 1
8 5 2
9 6 3

After running the program, you can enter your own matrix and observe the 90-degree clockwise rotation of the input matrix.
*/

import java.util.Scanner;

public class MatrixRotation {
    // Function to rotate the matrix by 90 degrees clockwise
    public static void rotateMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Transpose the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < cols; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row to get the 90-degree clockwise rotation
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][cols - 1 - j];
                matrix[i][cols - 1 - j] = temp;
            }
        }
    }

    // Function to print the matrix
    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotateMatrix(matrix);

        System.out.println("Matrix after 90-degree clockwise rotation:");
        printMatrix(matrix);
    }
}


