/*
Explanation of Approach:
The Knuth-Morris-Pratt (KMP) algorithm is a string-searching algorithm that efficiently finds all occurrences of a pattern in a given text. The core idea behind KMP is to avoid unnecessary comparisons by utilizing information from the previously matched characters to determine the next possible matching position.
  1. computeLPSArray: This function computes the Longest Proper Prefix which is also Suffix (LPS) array for the given pattern. The LPS array indicates the length of the longest proper prefix of the substring that is also a suffix for each index in the pattern.
  2. kmpSearch: The main KMP search function that finds all occurrences of the pattern in the text. It uses the LPS array to efficiently move through the text and pattern.

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
*/

Here, the pattern "ABABCABAB" is found in the text at position 10.

import java.util.*;

public class KMPAlgorithm {
    
    // Function to compute the LPS (Longest Proper Prefix which is also Suffix) array
    private static int[] computeLPSArray(String pattern) {
        int n = pattern.length();
        int[] lps = new int[n];
        
        int len = 0;
        int i = 1;
        while (i < n) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
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
    public static List<Integer> kmpSearch(String text, String pattern) {
        List<Integer> positions = new ArrayList<>();
        int m = pattern.length();
        int n = text.length();
        
        int[] lps = computeLPSArray(pattern);
        
        int i = 0; // Index for the text
        int j = 0; // Index for the pattern
        
        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            
            if (j == m) {
                positions.add(i - j);
                j = lps[j - 1];
            } else if (i < n && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return positions;
    }

    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";

        List<Integer> positions = kmpSearch(text, pattern);
        
        if (positions.isEmpty()) {
            System.out.println("Pattern not found in the text.");
        } else {
            System.out.println("Pattern found at positions: " + positions);
        }
    }
}
