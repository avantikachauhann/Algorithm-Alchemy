/*
Explanation:
- The `findMax` function is used to find the maximum element in the array to determine the number of digits in the maximum element.
- `countingSort` is a helper function that performs counting sort for a specific place value (e.g., units, tens, hundreds).
- The `radixSort` function uses counting sort to sort the array for all place values, starting from the least significant digit to the most significant digit.

Time Complexity:
- The time complexity of Radix Sort is O(n * k), where k is the number of digits in the maximum number.

Space Complexity:
- The space complexity is O(n) as it uses additional space to store the output array and counting arrays.

Sample Input:
Sample Input: 170 45 75 90 802 24 2 66

Sample Output:
Sample Output: 2 24 45 66 75 90 170 802

This code performs Radix Sort on the input array and prints the sorted array.
*/

#include <iostream>
#include <vector>
using namespace std;

// A utility function to find the maximum element in the array
int findMax(vector<int>& arr) {
    int max = arr[0];
    for (int i = 1; i < arr.size(); i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}

// A function to perform counting sort based on the place value
void countingSort(vector<int>& arr, int exp) {
    const int base = 10; // Base 10 for decimal numbers
    int n = arr.size();
    vector<int> output(n);
    vector<int> count(base, 0);

    // Count occurrences of digits at the specified place value
    for (int i = 0; i < n; i++) {
        count[(arr[i] / exp) % base]++;
    }

    // Calculate the cumulative count
    for (int i = 1; i < base; i++) {
        count[i] += count[i - 1];
    }

    // Build the output array
    for (int i = n - 1; i >= 0; i--) {
        output[count[(arr[i] / exp) % base] - 1] = arr[i];
        count[(arr[i] / exp) % base]--;
    }

    // Copy the sorted elements back to the original array
    for (int i = 0; i < n; i++) {
        arr[i] = output[i];
    }
}

// Radix Sort function
void radixSort(vector<int>& arr) {
    int max = findMax(arr);

    for (int exp = 1; max / exp > 0; exp *= 10) {
        countingSort(arr, exp);
    }
}

int main() {
    vector<int> arr = {170, 45, 75, 90, 802, 24, 2, 66};
    
    cout << "Sample Input: ";
    for (int num : arr) {
        cout << num << " ";
    }
    cout << endl;

    radixSort(arr);

    cout << "Sample Output: ";
    for (int num : arr) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}
