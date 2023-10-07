/* 
A happy number is defined as a number that leads to 1 after a sequence of steps, where each step involves replacing the number with the sum of the squares of its digits. To determine if a number is a happy number, we can follow these steps:

Approach:
Initialize a set called seen to keep track of numbers encountered during the process to detect cycles.
Repeat the following steps until either n becomes 1 (which makes it a happy number) or n is encountered again (indicating a cycle, and the number is not happy):
    a. Add the current value of n to the seen set.
    b. Calculate the sum of the squares of its digits by repeatedly taking the last digit of n, squaring it, and adding it to sum. Update n by dividing it by 10.
    c. Update n with the calculated sum.
If n eventually becomes 1, it's a happy number. If it enters a cycle and is encountered again, it's not a happy number.

Time Complexity: O(n)
    The time complexity of this algorithm depends on the number of iterations required to determine whether the number is happy or not. In the worst case, the algorithm will run until 'n' becomes 1 or until it enters a cycle. The number of iterations is not fixed and can vary from input to input, so the time complexity is not easily expressed in Big O notation.

Space Complexity: O(1)
    The space complexity is determined by the space used to store the seen set, which can contain at most all distinct numbers encountered during the process. In the worst case, this set could contain up to 81 distinct numbers (as the sum of the squares of digits of a number is at most 81 for a 3-digit number). Therefore, the space complexity can be considered O(1) for practical purposes, as the number of distinct numbers stored is limited. 

Sample Input and Output:
Enter a number to find if it is a Happy Number or Not: 19
19 is a Happy number

Enter a number to find if it is a Happy Number or Not: 4
4 is not a Happy number
*/

import java.util.Scanner;

class Happynumber {
    static boolean isHappynumber(int n) {
        if (n == 1 || n == 7)
            return true;
        int sum = n, x = n;
        while (sum > 9) {
            sum = 0;
            while (x > 0) {
                int d = x % 10;
                sum += d * d;
                x /= 10;
            }
            if (sum == 1)
                return true;
            x = sum;
        }
        if (sum == 7)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find Happy Number or Not: ");
        n = sc.nextInt();
        if (isHappynumber(n))
            System.out.println(n + " is a Happy number");
        else
            System.out.println(n + " is not a Happy number");
        sc.close();
    }
}