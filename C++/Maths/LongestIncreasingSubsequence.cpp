/*
Approach:
- The program uses dynamic programming to find the Longest Increasing Subsequence (LIS) of the given array. It maintains a dynamic programming array `dp`, where `dp[i]` represents the length of the LIS ending at index `i`.

Time Complexity:
- The time complexity of the code is O(n^2), where `n` is the size of the input array. This is because it uses a nested loop to compute the LIS.

Space Complexity:
- The space complexity is O(n) because of the `dp` array, which stores the length of the LIS for each index.

Sample Input:
Sample Input: 10 22 9 33 21 50 41 60 80

Sample Output:
Sample Output: 6

This code finds and prints the length of the Longest Increasing Subsequence (LIS) of the given input array. In this example, the LIS is `[10, 22, 33, 50, 60, 80]`, and its length is 6.
*/

#include <iostream>
#include <vector>
using namespace std;

// Function to find the length of the Longest Increasing Subsequence
int findLISLength(vector<int>& nums) {
    int n = nums.size();
    vector<int> dp(n, 1);

    for (int i = 1; i < n; i++) {
        for (int j = 0; j < i; j++) {
            if (nums[i] > nums[j] && dp[i] < dp[j] + 1) {
                dp[i] = dp[j] + 1;
            }
        }
    }

    int maxLength = 0;
    for (int length : dp) {
        if (length > maxLength) {
            maxLength = length;
        }
    }

    return maxLength;
}

int main() {
    vector<int> input = {10, 22, 9, 33, 21, 50, 41, 60, 80};

    cout << "Sample Input: ";
    for (int num : input) {
        cout << num << " ";
    }
    cout << endl;

    int lisLength = findLISLength(input);

    cout << "Sample Output: " << lisLength << endl;

    return 0;
}

