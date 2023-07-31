/*
Explanation of Approach:
- This program takes the number of elements `n` as input from the user to determine how many numbers they want to add.
- It then takes `n` numbers as input from the user and stores them in an integer array `numbers`.
- The program then iterates through the array to calculate the sum of all the numbers and stores the result in the variable `sum`.
- Finally, it outputs the sum using `System.out.println()`.

Time Complexity:
- The time complexity of this program is O(n) because the time taken to read `n` numbers and calculate their sum is directly proportional to the number of elements `n`.

Space Complexity:
- The space complexity of this program is O(n) because it uses an integer array `numbers` of size `n` to store the input elements.

Sample Input:
Enter the number of elements: 5
Enter 5 numbers:
10 20 30 40 50

Sample Output:
Sum: 150

In the sample input, the user enters 5 numbers (10, 20, 30, 40, and 50), and the program calculates their sum, which is 150, and displays the result as output.
*/

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Input the numbers
        System.out.println("Enter " + n + " numbers:");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Output the result
        System.out.println("Sum: " + sum);
    }
}
