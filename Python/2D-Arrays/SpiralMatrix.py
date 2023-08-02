'''
Explanation of Approach:
- We start by creating an empty matrix of size N x N, where N is the input provided by the user.
- We define four directions: right, down, left, and up. We'll move in these directions to fill the matrix in a spiral order.
- We start from the top-left corner of the matrix and fill the numbers from 1 to N*N in a spiral pattern.
- At each step, we check if the next position is within the matrix boundaries and not already filled. If yes, we move to that position; otherwise, we change the direction to the next one in a cyclic manner.
- We repeat this process until all positions in the matrix are filled.

Time Complexity:
- The time complexity of this program is O(N^2) because we need to fill N x N elements in the matrix.

Space Complexity:
- The space complexity of this program is O(N^2) because we use a 2D matrix to store the spiral numbers.

Sample Input:
Enter the size of the spiral matrix: 4

Sample Output:
Spiral Matrix:
1 2 3 4
12 13 14 5
11 16 15 6
10 9 8 7

In the sample input, the user entered 4, and the program generated a 4x4 spiral matrix filled with numbers from 1 to 16 in a spiral order. The output shows the resulting spiral matrix.
'''

def generate_spiral_matrix(N):
    # Create an empty N x N matrix filled with zeros
    matrix = [[0 for _ in range(N)] for _ in range(N)]

    # Define directions for right, down, left, and up movements
    directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]

    # Start from the top-left corner (0, 0)
    x, y = 0, 0

    # Initialize the current direction index to 0 (right)
    direction_index = 0

    # Fill the matrix with numbers from 1 to N*N in a spiral order
    for num in range(1, N * N + 1):
        matrix[x][y] = num

        # Calculate the next position using the current direction
        next_x, next_y = x + directions[direction_index][0], y + directions[direction_index][1]

        # Check if the next position is out of bounds or already filled
        if 0 <= next_x < N and 0 <= next_y < N and matrix[next_x][next_y] == 0:
            x, y = next_x, next_y
        else:
            # Change direction in a cyclic manner (right, down, left, up)
            direction_index = (direction_index + 1) % 4
            x, y = x + directions[direction_index][0], y + directions[direction_index][1]

    return matrix

def print_matrix(matrix):
    for row in matrix:
        print(" ".join(str(num) for num in row))

if __name__ == "__main__":
    N = int(input("Enter the size of the spiral matrix: "))
    spiral_matrix = generate_spiral_matrix(N)
    print("Spiral Matrix:")
    print_matrix(spiral_matrix)

