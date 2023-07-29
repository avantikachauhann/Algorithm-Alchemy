/*
Explanation of Approach:

The Knuth-Morris-Pratt (KMP) algorithm is implemented using two main functions:
1. computeLPSArray: This function computes the Longest Proper Prefix which is also Suffix (LPS) array for the given pattern. The LPS array indicates the length of the longest proper prefix of the substring that is also a suffix for each index in the pattern.
2. kmpSearch: The main KMP search function that finds all occurrences of the pattern in the text. It uses the LPS array to efficiently move through the text and pattern while avoiding unnecessary comparisons.

Time Complexity:
The time complexity of the KMP algorithm is O(N+M), where N is the length of the text and M is the length of the pattern.

Space Complexity:
The space complexity of the KMP algorithm is O(M), where M is the length of the pattern for storing the LPS array.

Sample Input and Output:
For the given sample input:
text = "ABABDABACDABABCABAB"
pattern = "ABABCABAB"

The output will be:
Pattern found at positions: 10

Here, the pattern "ABABCABAB" is found in the text at position 10.
*/

#include <iostream>
#include <vector>
using namespace std;

// Function to compute the LPS (Longest Proper Prefix which is also Suffix) array
vector<int> computeLPSArray(string pattern) {
    int m = pattern.length();
    vector<int> lps(m, 0);
    int len = 0;
    int i = 1;

    while (i < m) {
        if (pattern[i] == pattern[len]) {
            len++;
            lps[i] = len;
            i++;
        } else {
            if (len != 0) {
                len = lps[len - 1];
            } else {
                lps[i] = 0;
                i++;
            }
        }
    }
    return lps;
}

// KMP Algorithm to find occurrences of the pattern in the text
vector<int> kmpSearch(string text, string pattern) {
    int n = text.length();
    int m = pattern.length();
    vector<int> lps = computeLPSArray(pattern);
    vector<int> positions;

    int i = 0; // Index for the text
    int j = 0; // Index for the pattern

    while (i < n) {
        if (pattern[j] == text[i]) {
            i++;
            j++;
        }

        if (j == m) {
            positions.push_back(i - j);
            j = lps[j - 1];
        } else if (i < n && pattern[j] != text[i]) {
            if (j != 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }
    }
    return positions;
}

int main() {
    string text = "ABABDABACDABABCABAB";
    string pattern = "ABABCABAB";

    vector<int> positions = kmpSearch(text, pattern);

    if (positions.empty()) {
        cout << "Pattern not found in the text." << endl;
    } else {
        cout << "Pattern found at positions: ";
        for (int pos : positions) {
            cout << pos << " ";
        }
        cout << endl;
    }

    return 0;
}

