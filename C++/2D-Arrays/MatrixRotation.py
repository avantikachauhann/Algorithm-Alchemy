/*
Explanation of the approach:
1. To rotate a matrix by 90 degrees clockwise, we first take the transpose of the matrix.
2. Next, we reverse each row of the transposed matrix.

For example, let's take a 4x4 matrix:
1  2  3  4
5  6  7  8
9  10 11 12
13 14 15 16

After taking the transpose, we get:
1  5  9  13
2  6  10 14
3  7  11 15
4  8  12 16

Finally, after reversing each row, we get the matrix rotated by 90 degrees clockwise:
4  3  2  1
8  7  6  5
12 11 10 9
16 15 14 13

Time Complexity: The program takes O(N^2) time, where N is the size of the matrix. We need to visit each element of the matrix at least once to perform the transpose and reverse operations.

Space Complexity: The program uses a constant amount of extra space, so the space complexity is O(1).

Sample Input:
1  2  3  4
5  6  7  8
9  10 11 12
13 14 15 16

Sample Output:
4  3  2  1
8  7  6  5
12 11 10 9
16 15 14 13
*/

#include <iostream>
using namespace std;

const int N = 4; // Size of the matrix (change this as per your requirement)

// Function to rotate the matrix by 90 degrees clockwise
void rotateMatrix(int mat[N][N]) {
    // Transpose the matrix
    for (int i = 0; i < N; i++) {
        for (int j = i + 1; j < N; j++) {
            swap(mat[i][j], mat[j][i]);
        }
    }

    // Reverse each row
    for (int i = 0; i < N; i++) {
        int start = 0;
        int end = N - 1;
        while (start < end) {
            swap(mat[i][start], mat[i][end]);
            start++;
            end--;
        }
    }
}

// Function to print the matrix
void printMatrix(int mat[N][N]) {
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            cout << mat[i][j] << " ";
        }
        cout << endl;
    }
}

int main() {
    int mat[N][N] = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}
    };

    cout << "Original Matrix:" << endl;
    printMatrix(mat);

    rotateMatrix(mat);

    cout << "Matrix after 90 degrees clockwise rotation:" << endl;
    printMatrix(mat);

    return 0;
}

