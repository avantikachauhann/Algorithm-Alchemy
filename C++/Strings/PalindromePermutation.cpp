/*
Explanation:
- The `isPermutationOfPalindrome` function counts the frequency of each character in the input string while ignoring non-alphabet characters.
- It then counts the number of characters with odd frequencies and checks if there is at most one character with an odd frequency.

Time Complexity:
- The time complexity of this algorithm is O(n), where n is the length of the input string.

Space Complexity:
The space complexity of the provided code is O(c), where c is the number of distinct characters (i.e., the size of the character set) in the input string.

Sample Input:
Input String: "tact coa"

Sample Output:
The string is a permutation of a palindrome.

This code checks if the given input string is a permutation of a palindrome and provides the corresponding output. In this example, the input "tact coa" is a permutation of the palindrome "taco cat."
*/

#include <iostream>
#include <string>
#include <unordered_map>
using namespace std;

// Function to check if a string is a permutation of a palindrome
bool isPermutationOfPalindrome(const string& s) {
    // Create a map to store character frequencies
    unordered_map<char, int> charCount;

    // Count the frequency of each character
    for (char c : s) {
        if (isalpha(c)) {
            charCount[c]++;
        }
    }

    // Count the number of characters with odd frequencies
    int oddCount = 0;
    for (const auto& pair : charCount) {
        if (pair.second % 2 != 0) {
            oddCount++;
        }
    }

    // If there is at most one character with an odd frequency, it's a permutation of a palindrome
    return oddCount <= 1;
}

int main() {
    string input = "tact coa";
    // Remove spaces and convert to lowercase for consistency
    for (char& c : input) {
        if (c != ' ') {
            c = tolower(c);
        }
    }

    cout << "Input String: " << input << endl;
    bool result = isPermutationOfPalindrome(input);
    
    if (result) {
        cout << "The string is a permutation of a palindrome." << endl;
    } else {
        cout << "The string is not a permutation of a palindrome." << endl;
    }

    return 0;
}

