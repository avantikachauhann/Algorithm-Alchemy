'''
Approach:
- The code performs a matrix transposition, swapping elements across the diagonal. This is achieved by iterating through the upper triangular part of the matrix (excluding the diagonal) and swapping the corresponding elements.

Time Complexity: O(n^2)
- The code contains nested loops, where the outer loop runs 'n' times and the inner loop runs 'n-1', resulting in a total of n*(n-1) iterations. Therefore, the time complexity is O(n^2).

Space Complexity: O(1)
- The code uses a constant amount of additional space regardless of the size of the input matrix. Thus, the space complexity is O(1).

Sample Input:
- matrix = [[1,2,3],[4,5,6],[7,8,9]]

Sample Output:
- The output will be the transposed matrix:
  [[1, 4, 7],
   [2, 5, 8],
   [3, 6, 9]]
'''

def transpose_matrix(matrix):
    for i in range(len(matrix)-1):
        for j in range(i+1,len(matrix)):
            matrix[i][j],matrix[j][i] = matrix[j][i],matrix[i][j]
    return matrix

if __name__ == "__main__":
    input_matrix = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ]

    print("Original Matrix:")
    for row in input_matrix:
        print(row)
    
    transposed_matrix = transpose_matrix(input_matrix)
    
    print("\nRotated Matrix:")
    for row in transposed_matrix:
        print(row)
