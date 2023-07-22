/*
Explanation:
- The `isArmstrong` function takes an integer `num` as input and checks if it is an Armstrong number. An Armstrong number (also known as a narcissistic number) is a number that is equal to the sum of its digits raised to the power of the number of digits in the number.
- We first find the number of digits in the `num` by counting the number of times we can divide it by 10 (i.e., the number of digits in the number).
- We then reset the original number to its initial value and calculate the sum of the nth power of each digit. In each iteration of the loop, we extract the last digit using `num % 10`, raise it to the power of `n`, and add it to the `sum`. We then remove the last digit using `num /= 10`.
- After the loop, the `sum` will contain the sum of the nth power of each digit in the number.
- Finally, we compare the `sum` with the original `num` and return `true` if they are equal, indicating that the number is an Armstrong number, and `false` otherwise.

Time Complexity: The time complexity of the `isArmstrong` function is O(log N), where N is the number of digits in the input number. This is because the while loop runs for the number of digits in the input number, which is proportional to log(N).

Space Complexity: The space complexity is O(1) since the algorithm only uses a constant amount of extra memory for the `num`, `originalNum`, `n`, `sum`, and `digit` variables, regardless of the input number.

Sample Input:
Number: 153

Sample Output:
153 is an Armstrong number.
*/

#include <iostream>
#include <cmath>

// Function to check if a number is an Armstrong number
bool isArmstrong(int num) {
    int originalNum = num;
    int n = 0;
    int sum = 0;

    // Count the number of digits in the number
    while (originalNum != 0) {
        originalNum /= 10;
        n++;
    }

    // Reset the originalNum to its original value
    originalNum = num;

    // Calculate the sum of the nth power of each digit
    while (originalNum != 0) {
        int digit = originalNum % 10;
        sum += pow(digit, n);
        originalNum /= 10;
    }

    // Check if the sum is equal to the original number
    return sum == num;
}

int main() {
    // Sample input
    int num = 153;

    // Check if the number is an Armstrong number
    bool result = isArmstrong(num);

    // Print the result
    if (result) {
        std::cout << num << " is an Armstrong number." << std::endl;
    } else {
        std::cout << num << " is not an Armstrong number." << std::endl;
    }

    return 0;
}

