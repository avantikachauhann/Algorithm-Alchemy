'''
Approach:
1. First, we need to check if the matrix is square (the number of rows is equal to the number of columns). If it's not square, it cannot be an identity matrix.
2. Next, we check if all the diagonal elements are 1 and all other elements are 0. If this condition is met, the matrix is an identity matrix.

Time Complexity: The time complexity of this program is O(n^2), where 'n' is the number of rows (or columns) in the matrix. This is because we need to traverse all the elements of the matrix once.

Space Complexity: The space complexity is O(1) because we are not using any additional data structures that grow with the input size. We are only using a few variables to keep track of the matrix dimensions and loop indices.

Sample Input:
sample_matrix = [
    [1, 0, 0],
    [0, 1, 0],
    [0, 0, 1]
]

Sample Output:
The given matrix is an identity matrix.
'''

def is_identity_matrix(matrix):
    rows = len(matrix)
    columns = len(matrix[0])

    # Check if the matrix is square
    if rows != columns:
        return False

    # Check if all diagonal elements are 1 and all other elements are 0
    for i in range(rows):
        for j in range(columns):
            if i == j and matrix[i][j] != 1:  # Check diagonal elements
                return False
            if i != j and matrix[i][j] != 0:  # Check non-diagonal elements
                return False

    return True

# Sample input
sample_matrix = [
    [1, 0, 0],
    [0, 1, 0],
    [0, 0, 1]
]

# Check if the sample matrix is an identity matrix
if is_identity_matrix(sample_matrix):
    print("The given matrix is an identity matrix.")
else:
    print("The given matrix is not an identity matrix.")

