/*
Problem: Java program to generate a hollow diamond pattern using asterisks ('*'). The program will take an integer 'n' as input, which represents the size of the pattern, and it will produce a hollow diamond pattern of the given size.

Approach:
- The code above prints a diamond pattern with `2*n` rows.
    The approach used is to divide the pattern into two parts and then
    to iterate through each row of the diamond pattern,
    calculate the number of spaces and asterisks in each row based on the current row number,
    and then print the spaces and asterisks accordingly.


Time Complexity: The time complexity of this code is O(n^2),where n is the input parameter representing the number of rows in the diamond pattern.
                This is because we need to loop through each row and perform a
                constant number of operations for each row.

Space Complexity: The space complexity of this code is O(1), as we are not using any additional data structures whose space requirements depend on the input size.

Sample input: `4`, the function `print_hollow_diamond_pattern(4)`

Sample Output:
   *
  * *
 *   *
*     *
*     *
 *   *
  * *
   *
 */


public class HollowDiamondPattern {
    public static void printHollowDiamondPattern(int n) {
        // Print the upper part of the diamond
        for (int i = 0; i < n; i++) {
            // Print the spaces before the starting asterisk
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print the starting asterisk
            System.out.print("*");

            // Print the spaces between asterisks
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }

            // Print the ending asterisk if i is not 0
            if (i != 0) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        // Print the lower part of the diamond
        for (int i = n - 1; i >= 0; i--) {
            // Print the spaces before the starting asterisk
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print the starting asterisk
            System.out.print("*");

            // Print the spaces between asterisks
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }

            // Print the ending asterisk if i is not 0
            if (i != 0) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4; // Change 'n' to the desired size of the pattern
        printHollowDiamondPattern(n);
    }
}
