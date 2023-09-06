/*
Problem: Generate Floyd's Triangle

Description:
This Python program generates Floyd's Triangle pattern using integers, starting from 1 and incrementing by 1 in each row. The program takes an integer 'n' as input, which represents the number of rows in the pattern, and it prints the pattern accordingly.

Pattern Explanation:
Floyd's Triangle is a right-angled triangular array of natural numbers, used to generate a sequence of consecutive integers. Each row of the triangle starts with the next integer, incrementing by 1 from the previous row. The first row contains 1 number, the second row contains 2 numbers, and so on.

Approach:

- Input: Accept an integer 'n' representing the number of rows in the triangle.
- Initialization: Initialize a counter variable 'C' to 0.
- Loop through Rows: For each row 'i' from 1 to 'n':
- Loop through Columns: For each column 'j' from 1 to 'i':
- Increment the counter 'C' by 1.
- Print the value of 'C' followed by a space without moving to the next line.
- Move to the next line after each row is printed.
This approach involves incrementing a counter for each cell in the triangle, starting from 1, and printing the value in each cell. The number of rows in the triangle determines the size and the values in each row.

Time Complexity: O(n^2)
- The program uses two nested loops to print the pattern, one for rows and one for columns. So, the time complexity is proportional to the square of 'n'.

Space Complexity: O(1)
- The program uses a constant amount of extra space as it only uses a single variable 'C' to keep track of the count.

Sample Input: 8
Sample Output:
```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21
22 23 24 25 26 27 28
29 30 31 32 33 34 35 36
```

In this example, the input 'n' is 8, and the program generates a floyd trianlge of 8 rows.

*/

public class FloydTrianglePattern {
    public static void printFloydTriangle(int n) {
        // Initialize counter variable
        int C = 0;

        // Iterate through each row
        for (int i = 1; i <= n; i++) {
            // Iterate through each column in the row
            for (int j = 1; j <= i; j++) {
                C++; // Incrementing the counter variable
                System.out.print(C + " ");
            }

            // Move to the next line after each row is printed
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printFloydTriangle(n);
    }
}
