/*
Explanation of the approach:
1. The `isPalindrome` method takes an integer as input and returns a boolean value indicating whether the number is a palindrome or not.
2. Inside the method, we initialize two variables: `reverse` and `temp`. The `reverse` variable will store the reverse of the given number and the `temp` variable will be used to manipulate the given number without modifying its value. 
3. We then use a while loop to reverse the number. In each iteration, we extract the last digit (remainder of dividing the number by 10), multiply the `reverse` variable by 10 and add the remainder to it. Then we divide `temp` by 10 to remove the last digit from it. This process is repeated until the `temp` becomes zero.
4. After reversing the number, we check if the reversed number is equal to the original number. If they are equal, we return `true`, indicating that the number is a palindrome. Otherwise, we return `false`.
5. In the `main` method, we prompt the user to enter a number and call the `isPalindrome` method with the given number. We then display the appropriate message based on the return value of the method.

Time Complexity: The time complexity of this program is O(log N), where N is the given number. This is because the number of times the while loop executes is equal to the number of digits in the given number, which is log N.

Space Complexity: The space complexity of this program is O(1) as we are using only a few additional integer variables.

Sample input:
Enter a number: 12321
  
Sample output:
12321 is a palindrome number.
*/


//program in Java to check if a number is a palindrome:

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int temp = number;
        
        // Reversing the given number
        while (temp > 0) {
            int remainder = temp % 10;
            reverse = (reverse * 10) + remainder;
            temp = temp / 10;
        }
        
        // Checking if the reversed number is equal to the original number
        if (reverse == number) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }
}

