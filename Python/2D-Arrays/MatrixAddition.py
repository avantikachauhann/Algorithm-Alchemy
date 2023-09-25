'''
Explanation:
1. The `matrix_addition` function takes two matrices (`matrix1` and `matrix2`) as input and checks if their dimensions are compatible for addition.
2. It creates a new matrix `result` with the same dimensions as the input matrices to store the result of the addition.
3. The function iterates through each element of the matrices and adds the corresponding elements, storing the result in the `result` matrix.
4. The function returns the `result` matrix, which represents the sum of the input matrices.

Time Complexity: The time complexity of matrix addition is O(N*M), where N is the number of rows and M is the number of columns in the matrix.

Space Complexity: The space complexity of this program is O(N*M), as we create a new matrix of the same size as the input matrices to store the result.

Sample Input:
matrix1 = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

matrix2 = [
    [9, 8, 7],
    [6, 5, 4],
    [3, 2, 1]
]

Sample Output:
Matrix Addition Result:
[10, 10, 10]
[10, 10, 10]
[10, 10, 10]

The output shows the element-wise addition of `matrix1` and `matrix2`.
'''

# Matrix Addition Function
def matrix_addition(matrix1, matrix2):
    if len(matrix1) != len(matrix2) or len(matrix1[0]) != len(matrix2[0]):
        raise ValueError("Matrices must be of the same size for addition.")
    
    # Create a new matrix to store the result
    result = [[0 for _ in range(len(matrix1[0]))] for _ in range(len(matrix1))]
    
    # Perform matrix addition element-wise
    for i in range(len(matrix1)):
        for j in range(len(matrix1[0])):
            result[i][j] = matrix1[i][j] + matrix2[i][j]
    
    return result

# Sample Input Matrices
matrix1 = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

matrix2 = [
    [9, 8, 7],
    [6, 5, 4],
    [3, 2, 1]
]

# Call the matrix addition function
result_matrix = matrix_addition(matrix1, matrix2)

# Sample Output Matrix
# The result will be:
# [
#    [10, 10, 10],
#    [10, 10, 10],
#    [10, 10, 10]
# ]
print("Matrix Addition Result:")
for row in result_matrix:
    print(row)

