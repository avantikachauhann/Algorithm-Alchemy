/*
Approach:
- The program implements the Quick Sort algorithm.
- It first partitions the array into two subarrays, one containing elements smaller than the pivot, and the other containing elements greater than the pivot.
- The subarrays are then recursively sorted.

Time Complexity:
- Best-case time complexity: O(n log n)
- Average-case time complexity: O(n log n)
- Worst-case time complexity: O(n^2)

Space Complexity:
- The space complexity of this program is O(1) because it uses a constant amount of additional memory for variables like `pivot`, `i`, and `j`.

Sample Input:
Input Array: 12 11 13 5 6

Sample Output:
Sorted Array: 5 6 11 12 13

This program takes an input array, sorts it using Quick Sort, and outputs the sorted array.
*/

#include <iostream>
#include <vector>

// Function to partition the array into two subarrays.
int partition(std::vector<int>& arr, int low, int high) {
    int pivot = arr[high];
    int i = (low - 1);

    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            std::swap(arr[i], arr[j]);
        }
    }

    std::swap(arr[i + 1], arr[high]);
    return (i + 1);
}

// Function to perform the Quick Sort.
void quickSort(std::vector<int>& arr, int low, int high) {
    if (low < high) {
        int pivotIndex = partition(arr, low, high);

        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }
}

int main() {
    // Sample Input
    std::vector<int> arr = {12, 11, 13, 5, 6};

    std::cout << "Input Array: ";
    for (int num : arr) {
        std::cout << num << " ";
    }
    std::cout << std::endl;

    int n = arr.size();
    quickSort(arr, 0, n - 1);

    std::cout << "Sorted Array: ";
    for (int num : arr) {
        std::cout << num << " ";
    }
    std::cout << std::endl;

    return 0;
}
