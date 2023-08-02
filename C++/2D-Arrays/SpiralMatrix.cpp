/*
Explanation of Approach:
- The `generateSpiralMatrix` function initializes an `n x n` matrix with all values as 0, which will be filled with the spiral order of numbers.
- The variable `num` keeps track of the number to be filled in the matrix, starting from 1 and incrementing up to `n * n`.
- We use four variables `top`, `bottom`, `left`, and `right` to represent the boundaries of the matrix.
- We fill the matrix in a spiral order by traversing the top row, rightmost column, bottom row, and leftmost column in a circular manner until all cells are filled.

Time Complexity:
- The time complexity of this program is O(n^2) because we need to fill all `n x n` cells of the spiral matrix.

Space Complexity:
- The space complexity of this program is O(n^2) because we are using an `n x n` matrix to store the spiral matrix.

Sample Input:
Enter the size of the spiral matrix (n x n): 4

Sample Output:
Spiral Matrix:
1       2       3       4
12      13      14      5
11      16      15      6
10      9       8       7

In the sample input, the user entered 4, and the program generated a 4x4 spiral matrix with numbers from 1 to 16 in a spiral order, as shown in the sample output.
*/

#include <iostream>
#include <vector>

using namespace std;

// Function to generate a spiral matrix of size n x n
vector<vector<int>> generateSpiralMatrix(int n) {
    vector<vector<int>> spiral(n, vector<int>(n, 0));
    int num = 1; // The starting number for the spiral
    int top = 0, bottom = n - 1, left = 0, right = n - 1;

    while (num <= n * n) {
        // Fill the top row from left to right
        for (int i = left; i <= right; ++i) {
            spiral[top][i] = num++;
        }
        top++;

        // Fill the rightmost column from top to bottom
        for (int i = top; i <= bottom; ++i) {
            spiral[i][right] = num++;
        }
        right--;

        // Fill the bottom row from right to left
        for (int i = right; i >= left; --i) {
            spiral[bottom][i] = num++;
        }
        bottom--;

        // Fill the leftmost column from bottom to top
        for (int i = bottom; i >= top; --i) {
            spiral[i][left] = num++;
        }
        left++;
    }

    return spiral;
}

// Function to print the matrix
void printMatrix(const vector<vector<int>>& matrix) {
    int n = matrix.size();
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            cout << matrix[i][j] << "\t";
        }
        cout << endl;
    }
}

int main() {
    int n;
    cout << "Enter the size of the spiral matrix (n x n): ";
    cin >> n;

    vector<vector<int>> spiralMatrix = generateSpiralMatrix(n);

    cout << "Spiral Matrix:" << endl;
    printMatrix(spiralMatrix);

    return 0;
}

