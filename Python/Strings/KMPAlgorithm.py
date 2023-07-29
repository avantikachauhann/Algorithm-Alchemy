'''
Explanation of Approach:

The Knuth-Morris-Pratt (KMP) algorithm is implemented using two main functions:

1. compute_lps_array: This function computes the Longest Proper Prefix which is also Suffix (LPS) array for the given pattern. The LPS array indicates the length of the longest proper prefix of the substring that is also a suffix for each index in the pattern.

2. kmp_search: The main KMP search function that finds all occurrences of the pattern in the text. It uses the LPS array to efficiently move through the text and pattern while avoiding unnecessary comparisons.

Time Complexity:
The time complexity of the KMP algorithm is O(N+M), where N is the length of the text and M is the length of the pattern.

Space Complexity:
The space complexity of the KMP algorithm is O(M), where M is the length of the pattern for storing the LPS array.

Sample Input and Output:
For the given sample input:
text = "ABABDABACDABABCABAB"
pattern = "ABABCABAB"

The output will be:
Pattern found at positions: [10]

Here, the pattern "ABABCABAB" is found in the text at position 10.
'''

def compute_lps_array(pattern):
    m = len(pattern)
    lps = [0] * m
    length = 0
    i = 1

    while i < m:
        if pattern[i] == pattern[length]:
            length += 1
            lps[i] = length
            i += 1
        else:
            if length != 0:
                length = lps[length - 1]
            else:
                lps[i] = 0
                i += 1

    return lps

def kmp_search(text, pattern):
    n = len(text)
    m = len(pattern)
    lps = compute_lps_array(pattern)
    positions = []

    i = j = 0
    while i < n:
        if pattern[j] == text[i]:
            i += 1
            j += 1

            if j == m:
                positions.append(i - j)
                j = lps[j - 1]
        else:
            if j != 0:
                j = lps[j - 1]
            else:
                i += 1

    return positions

# Sample input
text = "ABABDABACDABABCABAB"
pattern = "ABABCABAB"

positions = kmp_search(text, pattern)

if not positions:
    print("Pattern not found in the text.")
else:
    print("Pattern found at positions:", positions)


