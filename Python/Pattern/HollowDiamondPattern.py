"""
Problem: Python program to generate a hollow diamond pattern using asterisks ('*'). The program will take an integer 'n' as input, which represents the size of the pattern, and it will produce a hollow diamond pattern of the given size.

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
"""


def print_hollow_diamond_pattern(n):
    # Print the upper part of diamond
    for i in range(n):
        # Print the spaces before the starting asterisk
        for _ in range(n - i - 1):
            print(" ", end="")

        # Print the starting asterisk
        print("*", end="")

        # Print the spaces after the starting asterisk
        for _ in range(2 * i - 1):
            print(" ", end="")

        if not i:
            print("")  # move to next line
            continue
        print("*")  # Print the ending asterick if i is not 0

    # Print the lower part of diamond
    for i in range(n - 1, -1, -1):
        # Print the spaces before the starting asterisk
        for _ in range(n - i - 1):
            print(" ", end="")

        # Print the starting asterisk
        print("*", end="")

        # Print the spaces after the starting asterisk
        for _ in range(2 * i - 1):
            print(" ", end="")

        if not i:
            print("")  # move to next line
            continue
        print("*")  # Print the ending asterick if i is not 0


# Testing the function with a sample input
print_hollow_diamond_pattern(4)
