/*
What is a simple number?
A simple number is a positive integer greater than 1 that has no positive divisors other than 1 and itself.

Explanation of Approach:
- We first check if the given number is less than or equal to 1. If yes, then it is not simple.
- Otherwise, we iterate from 2 to the square root of the given number and check if it is divisible by any number in that range. If yes, then it is not simple.
- If the number is not divisible by any number in the above range, then it is simple.

Time Complexity: The time complexity of this code is O(sqrt(n)), where n is the given number.

Space Complexity: The space complexity is O(1) as we are not using any extra space that depends on the input.

Sample Input: 17

Sample Output: 17 is a simple number
*/

public class SimpleNumber {

    public static boolean isSimple(int number) {
        // Numbers less than or equal to 1 are not simple
        if (number <= 1) {
            return false;
        }
        
        // Check if number is divisible by any number from 2 to square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int input = 17; // Sample input
        
        if (isSimple(input)) {
            System.out.println(input + " is a simple number");
        } else {
            System.out.println(input + " is not a simple number");
        }
    }
}

