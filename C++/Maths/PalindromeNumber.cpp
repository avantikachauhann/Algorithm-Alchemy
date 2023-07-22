/*
Explanation:
- The `isPalindrome` function takes an integer `num` as input and checks if it is a palindrome. A palindrome number is one that reads the same backward as forward.
- We create a variable `originalNum` to store the original number for later comparison.
- Inside the `while` loop, we extract the last digit of the number using `num % 10`, and then update the `reversedNum` variable by appending this digit to the end (after shifting digits left by one position).
- We divide the `num` by 10 to remove the last digit in each iteration, eventually reducing the number to zero.
- After the loop, the `reversedNum` will contain the reverse of the original number.
- We then compare the `originalNum` with the `reversedNum` and return `true` if they are equal, indicating that the number is a palindrome, and `false` otherwise.

Time Complexity: The time complexity of the `isPalindrome` function is O(log N), where N is the number of digits in the input number. This is because the while loop runs for the number of digits in the input number, which is proportional to log(N).

Space Complexity: The space complexity is O(1) since the algorithm only uses a constant amount of extra memory for the `num`, `originalNum`, `reversedNum`, and `digit` variables, regardless of the input number.

Sample Input:
Number: 12321

Sample Output:
12321 is a palindrome.
*/

#include <iostream>

// Function to check if a number is a palindrome
bool isPalindrome(int num) {
    int originalNum = num;
    int reversedNum = 0;

    while (num > 0) {
        int digit = num % 10;
        reversedNum = reversedNum * 10 + digit;
        num /= 10;
    }

    // Compare the original number with the reversed number
    return originalNum == reversedNum;
}

int main() {
    // Sample input
    int num = 12321;

    // Check if the number is a palindrome
    bool result = isPalindrome(num);

    // Print the result
    if (result) {
        std::cout << num << " is a palindrome." << std::endl;
    } else {
        std::cout << num << " is not a palindrome." << std::endl;
    }

    return 0;
}

