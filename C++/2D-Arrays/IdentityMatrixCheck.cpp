/*
Approach:
1. To check if a matrix is an identity matrix, it needs to be a square matrix, i.e., the number of rows should be equal to the number of columns.
2. Loop through the main diagonal (i.e., elements where row index == column index) and check if they are equal to 1. If any diagonal element is not 1, the matrix is not an identity matrix.
3. Loop through the non-diagonal elements (i.e., elements where row index != column index) and check if they are equal to 0. If any non-diagonal element is not 0, the matrix is not an identity matrix.
4. If all conditions are met, the matrix is an identity matrix.

Time Complexity: The time complexity of this program is O(n^2), where 'n' is the size of the square matrix.

Space Complexity: The space complexity of this program is O(n^2) because we are using a 2D array to store the input matrix.

Sample Input:
Enter the size of the square matrix: 3
Enter the elements of the matrix:
1 0 0
0 1 0
0 0 1

Sample Output:
The given matrix is an Identity Matrix.

Sample Input:
Enter the size of the square matrix: 3
Enter the elements of the matrix:
1 0 0
0 2 0
0 0 1

Sample Output:
The given matrix is NOT an Identity Matrix.

In the first sample input, all the diagonal elements are 1, and all non-diagonal elements are 0, making it an identity matrix. In the second sample input, the element at mat[1][1] is 2, making it not an identity matrix.
*/

#include <iostream>
using namespace std;

bool isIdentityMatrix(int mat[][100], int n) {
    // Check for square matrix
    for (int i = 0; i < n; i++) {
        if (mat[i][i] != 1) {
            return false;
        }
    }

    // Check for non-diagonal elements
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i != j && mat[i][j] != 0) {
                return false;
            }
        }
    }

    return true;
}

int main() {
    int n;
    cout << "Enter the size of the square matrix: ";
    cin >> n;

    int mat[100][100];
    cout << "Enter the elements of the matrix:" << endl;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cin >> mat[i][j];
        }
    }

    if (isIdentityMatrix(mat, n)) {
        cout << "The given matrix is an Identity Matrix." << endl;
    } else {
        cout << "The given matrix is NOT an Identity Matrix." << endl;
    }

    return 0;
}


