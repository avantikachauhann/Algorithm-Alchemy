'''
Explanation:
1. We start by defining the constant `MAX_SIZE`, which represents the maximum size of the matrices (100 in this case).
2. The `matrixAddition` function takes two input matrices `mat1` and `mat2`, and their dimensions `rows` and `cols`. It computes the sum of corresponding elements of the two matrices and stores the result in the `result` matrix.
3. In the `main` function, we take input for the number of rows and columns of the matrices.
4. We create three 2D arrays to store the input matrices (`matrix1`, `matrix2`) and the result matrix (`result`).
5. Input is taken for both matrices from the user.
6. We call the `matrixAddition` function to compute the sum of the matrices and store the result in the `result` matrix.
7. Finally, we display the resultant matrix.

Time Complexity:
The time complexity of the matrix addition algorithm is O(rows * cols) as we need to visit every element in both matrices once.

Space Complexity:
The space complexity of the program is O(rows * cols) as we need to store the elements of all three matrices.

Sample Input:
Enter the number of rows and columns of the matrices: 2 3
Enter the elements of Matrix 1:
1 2 3
4 5 6
Enter the elements of Matrix 2:
7 8 9
10 11 12

Sample Output:
Resultant Matrix:
8 10 12
14 16 18

This output is obtained by adding the corresponding elements of Matrix 1 and Matrix 2. For example, `8 = 1 + 7`, `10 = 2 + 8`, `12 = 3 + 9`, and so on.
'''
  
#include <iostream>
using namespace std;

const int MAX_SIZE = 100;

// Function to add two matrices and store the result in 'result' matrix
void matrixAddition(int mat1[][MAX_SIZE], int mat2[][MAX_SIZE], int result[][MAX_SIZE], int rows, int cols) {
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            // Adding the corresponding elements of both matrices and storing in the 'result' matrix
            result[i][j] = mat1[i][j] + mat2[i][j];
        }
    }
}

int main() {
    int rows, cols;
    cout << "Enter the number of rows and columns of the matrices: ";
    cin >> rows >> cols;

    int matrix1[MAX_SIZE][MAX_SIZE], matrix2[MAX_SIZE][MAX_SIZE], result[MAX_SIZE][MAX_SIZE];

    // Input for Matrix 1
    cout << "Enter the elements of Matrix 1:" << endl;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            cin >> matrix1[i][j];
        }
    }

    // Input for Matrix 2
    cout << "Enter the elements of Matrix 2:" << endl;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            cin >> matrix2[i][j];
        }
    }

    // Adding the matrices
    matrixAddition(matrix1, matrix2, result, rows, cols);

    // Displaying the result
    cout << "Resultant Matrix:" << endl;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            cout << result[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}

