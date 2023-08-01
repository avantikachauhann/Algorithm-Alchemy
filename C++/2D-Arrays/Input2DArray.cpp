/*
Explanation of Approach:
- This program takes two integer inputs `rows` and `cols`, which represent the number of rows and columns of the 2D array, respectively.
- It then creates a 2D array `arr` of size `rows` x `cols` to store the elements entered by the user.
- The program uses nested loops to iterate through each element of the 2D array and takes input from the user for each element.
- After taking input, it then outputs the entered 2D array.

Time Complexity:
- The time complexity of this program is O(rows * cols), as we need to input and output each element of the 2D array.

Space Complexity:
- The space complexity of this program is O(rows * cols), as we need to allocate memory for the 2D array of size `rows` x `cols`.

Sample Input:
Enter the number of rows: 3
Enter the number of columns: 4
Enter the elements of the 2D array:
1 2 3 4
5 6 7 8
9 10 11 12

Sample Output:
The entered 2D array is:
1 2 3 4 
5 6 7 8 
9 10 11 12 

In the sample input, the user entered a 3x4 2D array, and the program displayed the entered elements as output.
*/

#include <iostream>

int main() {
    int rows, cols;

    // Input the number of rows and columns
    std::cout << "Enter the number of rows: ";
    std::cin >> rows;
    std::cout << "Enter the number of columns: ";
    std::cin >> cols;

    // Create a 2D array of size rows x cols
    int arr[rows][cols];

    // Input the elements of the 2D array
    std::cout << "Enter the elements of the 2D array:" << std::endl;
    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            std::cin >> arr[i][j];
        }
    }

    // Output the 2D array
    std::cout << "The entered 2D array is:" << std::endl;
    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            std::cout << arr[i][j] << " ";
        }
        std::cout << std::endl;
    }

    return 0;
}

