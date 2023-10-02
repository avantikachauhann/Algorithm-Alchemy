"""
Approach:
- Transpose the matrix by swapping elements across the diagonal.
- Reverse the elements around the rows to get the final rotated matrix.

Time Complexity: O(n^2)
- The code contains nested loops, where the outer loop runs 'n' times and the inner loop runs 'n-1', resulting in a total of n*(n-1) iterations. Therefore, the time complexity is O(n^2).

Space Complexity: O(1)
- The code uses a constant amount of additional space regardless of the size of the input matrix. Thus, the space complexity is O(1).

Sample Input:
- input_matrix = [
    [1,2,3,4],
    [5,6,7,8],
    [9,10,11,12],
    [13,14,15,16]
]

Sample Output:
- Original Matrix:
    [1, 2, 3, 4]
    [5, 6, 7, 8]
    [9, 10, 11, 12]
    [13, 14, 15, 16]

    Rotated Matrix:
    [13, 9, 5, 1]
    [14, 10, 6, 2]
    [15, 11, 7, 3]
    [16, 12, 8, 4]
"""

def rotate_matrix(matrix):
    n = len(matrix)
    # Transpose the matrix
    for i in range(n-1):
        for j in range(i+1,n):
            matrix[i][j],matrix[j][i] = matrix[j][i],matrix[i][j]
    
    # Reverse the elements around the rows
    for i in range(n//2):
        for j in range(n):
            matrix[i][j],matrix[n-1-i][j] = matrix[n-1-i][j],matrix[i][j]
    
    return matrix

if __name__ == "__main__":
    input_matrix = [
        [1,2,3,4],
        [5,6,7,8],
        [9,10,11,12],
        [13,14,15,16]
    ]

    print("Original Matrix:")
    for row in input_matrix:
        print(row)
    
    rotated_matrix = rotate_matrix(input_matrix)
    
    print("\nRotated Matrix:")
    for row in rotated_matrix:
        print(row)