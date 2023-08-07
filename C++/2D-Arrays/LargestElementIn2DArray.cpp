/*
Explanation of Approach:

1. Input the number of rows and columns for the 2D array.
2. Create a 2D array `matrix` with the specified dimensions.
3. Input the elements of the matrix from the user.
4. Initialize `largest` with the value of the first element of the matrix (`matrix[0][0]`).
5. Iterate through each element of the matrix and update `largest` if a larger element is found.
6. Output the largest element.

Time Complexity: The time complexity of this program is O(rows * cols) as it iterates through each element once.

Space Complexity: The space complexity is O(rows * cols) as we are storing the elements in a 2D array.

Sample Input:
Enter the number of rows: 3
Enter the number of columns: 4
Enter the elements of the matrix:
4 9 2 8
1 5 3 7
6 0 9 2

Sample Output:
The largest element in the matrix is: 9

This program takes user input for the dimensions and elements of the 2D array and then finds the largest element in the array by iterating through each element. Finally, it outputs the largest element.
*/

#include <iostream>
using namespace std;

int main() {
    int rows, cols;

    // Input the number of rows and columns
    cout << "Enter the number of rows: ";
    cin >> rows;
    cout << "Enter the number of columns: ";
    cin >> cols;

    int matrix[rows][cols];

    // Input the elements of the matrix
    cout << "Enter the elements of the matrix:\n";
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            cin >> matrix[i][j];
        }
    }

    int largest = matrix[0][0];

    // Find the largest element in the matrix
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (matrix[i][j] > largest) {
                largest = matrix[i][j];
            }
        }
    }

    // Output the largest element
    cout << "The largest element in the matrix is: " << largest << endl;

    return 0;
}

