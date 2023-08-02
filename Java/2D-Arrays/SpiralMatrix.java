/*
Explanation of Approach:
- The `generateSpiralMatrix` function generates the spiral matrix of size `n x n` using a four-pointer approach. It starts by initializing the left, right, top, and bottom pointers to define the boundaries of the matrix.
- The function then enters a loop, where it traverses the matrix in four directions (left to right, top to bottom, right to left, bottom to top), filling the matrix with values in a spiral order.
- The `printMatrix` function is used to print the generated matrix in a readable format.

Time Complexity:
- The time complexity of this approach is O(n^2), where `n` is the size of the matrix. We need to fill `n x n` cells of the matrix.

Space Complexity:
- The space complexity of this approach is O(n^2) as well because we need to store `n x n` elements in the matrix.

Sample Input:
Enter the value of n: 4

Sample Output:
Spiral Matrix:
1 2 3 4 
12 13 14 5 
11 16 15 6 
10 9 8 7

In the sample input, the user entered `n = 4`, and the program generated a 4x4 spiral matrix, as shown in the sample output. The values in the matrix are filled in a spiral order starting from 1 and ending at `n x n`, where `n = 4` in this case.
*/

import java.util.Scanner;

public class SpiralMatrix {
    
    // Function to generate the spiral matrix
    public static int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int value = 1;
        
        while (value <= n * n) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;
            
            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;
            
            // Traverse from right to left
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = value++;
            }
            bottom--;
            
            // Traverse from bottom to top
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = value++;
            }
            left++;
        }
        
        return matrix;
    }
    
    // Function to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        int[][] spiralMatrix = generateSpiralMatrix(n);
        System.out.println("Spiral Matrix:");
        printMatrix(spiralMatrix);
    }
}

