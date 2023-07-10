/*
Approach:
1. Read the input number from the user.
2. Check if the number is an Armstrong number by calling the `isArmstrongNumber` function.
3. In the `isArmstrongNumber` function, count the number of digits in the given number and store it in `numberOfDigits`.
4. Calculate the Armstrong number by iterating through each digit of the number and adding the digit raised to the power of `numberOfDigits` to the `result` variable.
5. Finally, compare the calculated `result` with the original number. If they are equal, return `true`, indicating that the number is an Armstrong number.

Time Complexity: O(log10(n)). The number of digits in a number `n` can be determined in logarithmic time.

Space Complexity: O(1). Constant space is used throughout the program, irrespective of the input.

Sample Input:
Enter a number: 153

Sample Output:
153 is an Armstrong number.
*/

//program in Java to check if a number is an Armstrong number:

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        // Read the input number
        int number = scanner.nextInt();
        scanner.close();
        
        // Check if the number is an Armstrong number
        if(isArmstrongNumber(number)){
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    
    // Function to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int originalNumber, remainder, result = 0, numberOfDigits = 0;
        originalNumber = number;
        
        // Count the number of digits in the given number
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++numberOfDigits;
        }
        
        originalNumber = number;
        
        // Calculate the Armstrong number
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, numberOfDigits);
            originalNumber /= 10;
        }
        
        // Check if the calculated result is equal to the original number
        if (result == number)
            return true;
        
        return false;
    }
}
