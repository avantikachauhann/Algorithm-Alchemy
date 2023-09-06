"""
Problem: Generate Pascal's Triangle

Description:
This Python program generates Pascal's Triangle and prints it to the console. Pascal's Triangle is a triangular array of binomial coefficients, where each number is the sum of the two numbers directly above it. The first row contains a single 1, and each subsequent row begins and ends with a 1.

Approach:
1. Initialize a list 'p' to store Pascal's Triangle values with the first row [1].
2. Fill the remaining 'n-1' rows of 'p' with 'None'.
3. Generate each row by looping through rows from 1 to 'n-1':
   - Create a temporary list 't' by adding 0 at the beginning and end of the previous row.
   - Create a new row 'rec' filled with 'None' to store the values for the current row.
   - Loop through columns from 0 to len(t)-2:
     - Calculate each value in 'rec' by adding adjacent values from 't'.
   - Update 'p' with the new row 'rec'.
4. Print Pascal's Triangle by looping through 'n' rows and each value in the current row of 'p'.

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
"""


def print_pascal_triangle(n):
    # Generating Pascal's Triangle
    p = [[1]] + [None] * (n - 1)
    for i in range(n - 1):
        t = [0] + p[i] + [0]
        rec = [None] * (len(t) - 1)
        for j in range(0, len(t) - 1):
            rec[j] = t[j] + t[j + 1]
        p[i + 1] = rec

    # Printing Pascal's Triangle
    for i in range(n):
        for j in range(len(p[i])):
            print(p[i][j], end=" ")
        print()


print_pascal_triangle(5)
