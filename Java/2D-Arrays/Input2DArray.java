/*
Explanation of Approach:
- The program first takes the dimensions (number of rows and columns) of the 2D array as input from the user.
- It then creates a 2D array with the given dimensions using `int[][] arr = new int[rows][cols];`.
- Next, it enters a nested loop to take input for each element of the 2D array. The user is prompted to enter each element, and the program stores it in the corresponding position of the 2D array.
- Finally, the program outputs the 2D array to the console.

Time Complexity:
- The time complexity of this program is O(rows * cols), where `rows` is the number of rows and `cols` is the number of columns. This is because both the input and output loops run through all the elements of the 2D array once.

Space Complexity:
- The space complexity of this program is O(rows * cols), as it creates a 2D array of dimensions `rows` and `cols`.

Sample Input:
Enter the number of rows: 3
Enter the number of columns: 3
Enter the elements of the 2D array:
1 2 3
4 5 6
7 8 9

Sample Output:
The 2D array is:
1 2 3 
4 5 6 
7 8 9 

In the sample input, the user entered a 3x3 2D array with the elements 1, 2, 3, 4, 5, 6, 7, 8, and 9. The program then displayed the 2D array as output.
*/

import java.util.Scanner;

public class Input2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the dimensions of the 2D array
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Create the 2D array
        int[][] arr = new int[rows][cols];

        // Input the elements of the 2D array
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Output the 2D array
        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
