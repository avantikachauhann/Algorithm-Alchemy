/*
Identity Matrix Check: Program to check whether a given matrix is an identity matrix or not.

Explanation of Approach:
An identity matrix is a square matrix where all elements of the main diagonal (the diagonal from the top-left to bottom-right) are 1, and all other elements outside the main diagonal are 0. To check if a given matrix is an identity matrix, we need to verify the following conditions:
1. The matrix must be square, i.e., the number of rows and columns should be the same.
2. All elements on the main diagonal should be 1, and all other elements should be 0.

The `isIdentityMatrix` function takes the 2D matrix, number of rows, and number of columns as input and checks the above conditions to determine whether the given matrix is an identity matrix or not.

Time Complexity:
The time complexity of the program is O(n^2), where n is the number of rows or columns in the matrix. This is because we need to traverse all elements of the matrix to check if it satisfies the conditions for an identity matrix.

Space Complexity:
The space complexity of the program is O(n^2) as well, as we are storing the elements of the matrix in a 2D array.

Sample Input:
Enter the number of rows in the matrix: 3
Enter the number of columns in the matrix: 3
Enter the elements of the matrix:
1 0 0
0 1 0
0 0 1

Sample Output:
The given matrix is an identity matrix.
*/

import java.util.Scanner;

public class IdentityMatrixCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean isIdentity = isIdentityMatrix(matrix, rows, columns);
        if (isIdentity) {
            System.out.println("The given matrix is an identity matrix.");
        } else {
            System.out.println("The given matrix is not an identity matrix.");
        }
    }

    public static boolean isIdentityMatrix(int[][] matrix, int rows, int columns) {
        // An identity matrix is a square matrix where all elements of the main diagonal are 1
        // and all other elements are 0.

        // Check if the matrix is square
        if (rows != columns) {
            return false;
        }

        // Check if the main diagonal contains only 1's and other elements are 0's
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == j) {
                    if (matrix[i][j] != 1) {
                        return false;
                    }
                } else {
                    if (matrix[i][j] != 0) {
                        return false;
                    }
                }
            }
        }

        // If all conditions are satisfied, the matrix is an identity matrix
        return true;
    }
}

