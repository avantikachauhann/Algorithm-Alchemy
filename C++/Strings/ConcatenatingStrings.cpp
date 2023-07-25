/*
Explanation:
- The program takes two input strings, `str1` and `str2`, from the user using `std::getline()` function to read the entire line with spaces.
- It performs string concatenation using the `+` operator to join `str1`, a space, and `str2` together, and stores the result in the `concatenated` string.
- Finally, it prints the concatenated string using `std::cout`.

Time Complexity: The time complexity of string concatenation using the `+` operator is O(N), where N is the total number of characters in the concatenated strings. This is because the `+` operator creates a new string by copying all the characters from the input strings to the new string.

Space Complexity: The space complexity is O(N), where N is the total number of characters in the concatenated strings. This is because a new string of length N is created to hold the concatenated result.

Sample Input:
Enter the first string: Hello
Enter the second string: World

Sample Output:
Concatenated string: Hello World

Note: In C++, using the `+` operator for string concatenation is easy and convenient, but it can be inefficient for large-scale concatenation operations due to the creation of multiple intermediate string objects. For better performance in such cases, using `std::string::append()` or `std::stringstream` is recommended as they provide mutable and efficient string manipulation capabilities.
*/



#include <iostream>
#include <string>

int main() {
    // Sample input
    std::string str1, str2;
    std::cout << "Enter the first string: ";
    std::getline(std::cin, str1);
    std::cout << "Enter the second string: ";
    std::getline(std::cin, str2);

    // Perform string concatenation
    std::string concatenated = str1 + " " + str2;

    // Print the result
    std::cout << "Concatenated string: " << concatenated << std::endl;

    return 0;
}
