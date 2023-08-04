'''
Explanation of Approach:
The approach to rotating a matrix by 90 degrees clockwise involves two steps:

1. Transpose the matrix: Swap each element at (i, j) with the element at (j, i).
2. Reverse each row: Reverse each row of the transposed matrix to get the final rotated matrix.

Time Complexity: The time complexity of this approach is O(N^2), where N is the number of rows (or columns) of the square matrix.

Space Complexity: The space complexity is O(1) as we are performing the rotation in-place without using any additional data structures.

Sample Input:
1 2 3
4 5 6
7 8 9

Sample Output:
Original Matrix:
[1, 2, 3]
[4, 5, 6]
[7, 8, 9]

Rotated Matrix:
[7, 4, 1]
[8, 5, 2]
[9, 6, 3]

The output is the given matrix rotated by 90 degrees clockwise.
'''

def rotate_matrix(matrix):
    """
    Function to rotate the given matrix by 90 degrees clockwise.
    """
    if not matrix or len(matrix) != len(matrix[0]):
        # The matrix should be square (number of rows = number of columns) for rotation.
        return

    n = len(matrix)

    # Transpose the matrix (rows become columns).
    for i in range(n):
        for j in range(i + 1, n):
            matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

    # Reverse each row of the transposed matrix to get the rotated matrix.
    for i in range(n):
        matrix[i] = matrix[i][::-1]

    return matrix


# Sample Input
input_matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

# Rotate the matrix
rotated_matrix = rotate_matrix(input_matrix)

# Sample Output
print("Original Matrix:")
for row in input_matrix:
    print(row)

print("\nRotated Matrix:")
for row in rotated_matrix:
    print(row)

