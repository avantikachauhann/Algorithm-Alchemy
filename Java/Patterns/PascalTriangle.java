/*
Problem: Generate Pascal's Triangle

Description:
This java program generates Pascal's Triangle and prints it to the console. Pascal's Triangle is a triangular array of binomial coefficients, where each number is the sum of the two numbers directly above it. The first row contains a single 1, and each subsequent row begins and ends with a 1.

Approach: Generating and Printing Pascal's Triangle

Input: Accept an integer 'n' representing the number of rows in Pascal's Triangle.
Initialize: Create a two-dimensional integer array 'p' of size 'n x n' to store the Pascal's Triangle values.
Generate First Row: Set the first element of 'p[0][0]' to 1 since the first row in Pascal's Triangle contains only one element, which is 1.
Generate Other Rows: Loop through rows from 1 to 'n-1':
Set the first and last elements of the current row 'p[i][0]' and 'p[i][i]' to 1 since they are always 1 in Pascal's Triangle.
For the remaining elements in the current row, calculate each value 'p[i][j]' by summing the corresponding values from the previous row 'p[i-1][j-1]' and 'p[i-1][j]'.
Printing: Loop through 'n' rows:
Print leading spaces to format the triangle properly.
Loop through each value in the current row of 'p' and print it along with spaces for proper alignment.
Move to the next line after each row is printed.

Time Complexity: O(n^2)
- The program uses two nested loops to generate and print Pascal's Triangle, resulting in a time complexity proportional to the square of 'n'.

Space Complexity: O(n^2)
- The program uses a list 'p' of size 'n' to store Pascal's Triangle values, resulting in a space complexity proportional to 'n^2'.

Example:
For 'n' equal to 5, the program generates and prints the following Pascal's Triangle:
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

 */
public class PascalTriangle {
    public static void PrintPascalTriangle(int n) {
        // Generating Pascal's Triangle
        int[][] p = new int[n][n];
        p[0][0] = 1;

        for (int i = 1; i < n; i++) {
            p[i][0] = 1;
            p[i][i] = 1;

            for (int j = 1; j < i; j++) {
                p[i][j] = p[i - 1][j - 1] + p[i - 1][j];
            }
        }

        // Printing Pascal's Triangle
        for (int i = 0; i < n; i++) {
            // Print leading spaces for formatting
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(p[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5; // Change 'n' to the desired number of rows
        PrintPascalTriangle(n);
    }
}
