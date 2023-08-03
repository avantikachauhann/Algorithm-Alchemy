/*
Explanation of Approach:
1. The program first takes the number of rows and columns for the matrices as input from the user.
2. Two 2D arrays, matrix1 and matrix2, are initialized to store the elements of the two matrices to be added.
3. The user is asked to input the elements of both matrices.
4. The `addMatrices` function is called to compute the sum of the two matrices and store it in a new 2D array called `result`.
5. Finally, the `printMatrix` function is called to display the resultant matrix, which is the sum of the two input matrices.

Time Complexity: The time complexity of this program is O(n^2), where 'n' is the number of rows or columns in the input matrices. The program iterates through each element of the matrices once.

Space Complexity: The space complexity of this program is also O(n^2) because we use additional memory to store the resultant matrix.

Sample Input:
Enter the number of rows for the matrices: 3
Enter the number of columns for the matrices: 3
Enter elements of matrix1:
1 2 3
4 5 6
7 8 9
Enter elements of matrix2:
9 8 7
6 5 4
3 2 1

Sample Output:
Resultant Matrix (Matrix1 + Matrix2):
10 10 10
10 10 10
10 10 10

In this example, the program takes two 3x3 matrices as input and computes their sum, which results in a 3x3 matrix where each element is 10.
*/

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the matrices: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns for the matrices: ");
        int columns = sc.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];

        System.out.println("Enter elements of matrix1:");
        inputMatrixElements(sc, matrix1);

        System.out.println("Enter elements of matrix2:");
        inputMatrixElements(sc, matrix2);

        int[][] result = addMatrices(matrix1, matrix2);

        System.out.println("Resultant Matrix (Matrix1 + Matrix2):");
        printMatrix(result);
    }

    public static void inputMatrixElements(Scanner sc, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

