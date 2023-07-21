/*
Explanation:
- We define a function `reverseString` that takes a reference to a string as input. The function uses two pointers, `start` and `end`, initialized to the first and last characters of the string, respectively.
- We use a `while` loop that runs until the `start` pointer is less than the `end` pointer. In each iteration, we swap the characters at the `start` and `end` positions and then move both pointers inward towards the center of the string.
- The main function contains a sample input string, prints the original string, calls the `reverseString` function, and then prints the reversed string.

Sample Input:
"Hello, World!"

Sample Output:
Original String: Hello, World!
Reversed String: !dlroW ,olleH

Time Complexity: The `reverseString` function runs in linear time O(N), where N is the length of the string. This is because we traverse half of the string to perform the character swapping.
Space Complexity: The space complexity is O(1) since the algorithm only uses a constant amount of extra memory for the `start`, `end`, and `temp` variables, regardless of the string length.
*/

#include <iostream>
#include <string>

// Function to reverse the string
void reverseString(std::string& str) {
    int start = 0;
    int end = str.length() - 1;

    while (start < end) {
        // Swap characters at start and end positions
        std::swap(str[start], str[end]);

        // Move the start and end pointers inward
        start++;
        end--;
    }
}

int main() {
    // Sample input
    std::string str = "Hello, World!";

    // Print the original string
    std::cout << "Original String: " << str << std::endl;

    // Reverse the string
    reverseString(str);

    // Print the reversed string
    std::cout << "Reversed String: " << str << std::endl;

    return 0;
}
