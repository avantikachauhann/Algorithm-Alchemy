'''
Explanation of Approach:
1. We start by initializing the `largest` variable to negative infinity (`float('-inf')`) to make sure that any element in the matrix will be greater than this initial value.
2. We iterate through each row of the matrix using a nested loop.
3. Inside the nested loop, we iterate through each element in the current row and compare it with the current largest element. If the current element is greater than the current largest, we update the `largest` variable.
4. After iterating through all the elements in the matrix, the `largest` variable will hold the largest element.

Sample Input:
3  7  1
8  5  2
9  4  6

Sample Output:
The largest element in the matrix is: 9

Time Complexity: The time complexity of this program is O(m * n), where m is the number of rows and n is the number of columns in the matrix.

Space Complexity: The space complexity is O(1) as we are using a constant amount of extra space regardless of the input size.
'''

def find_largest_element(matrix):
    # Initialize the variable to store the largest element
    largest = float('-inf')
    
    # Iterate through each row in the matrix
    for row in matrix:
        # Iterate through each element in the current row
        for element in row:
            # Compare the current element with the largest element found so far
            if element > largest:
                largest = element
    
    return largest

# Sample input matrix
sample_matrix = [
    [3, 7, 1],
    [8, 5, 2],
    [9, 4, 6]
]

# Call the function to find the largest element
result = find_largest_element(sample_matrix)

# Print the result
print("The largest element in the matrix is:", result)

