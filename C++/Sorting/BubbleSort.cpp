/*
Explanation:
- The `bubbleSort` function implements the Bubble Sort algorithm. It iterates through the array and compares adjacent elements. If the current element is greater than the next element, it swaps them, effectively "bubbling" the larger elements towards the end of the array.
- The algorithm repeats this process multiple times until the entire array is sorted. In each pass, the largest unsorted element "bubbles" to its correct position at the end of the array.
- We also use a flag `swapped` to check if any swaps occurred during a pass. If no swaps are made in a pass, it means the array is already sorted, and the function breaks early, improving the algorithm's efficiency in the best-case scenario.

Sample Input:
{64, 34, 25, 12, 22, 11, 90}

Sample Output:
Original Array: 64 34 25 12 22 11 90 
Sorted Array: 11 12 22 25 34 64 90 

Time Complexity: The worst-case and average time complexity of Bubble Sort is O(N^2), where N is the size of the array. In the worst case, we need to perform N passes, and for each pass, we compare and swap elements, resulting in quadratic time complexity.
Space Complexity: The space complexity is O(1) since the algorithm only uses a constant amount of extra memory for temporary variables, regardless of the array size.
*/

#include <iostream>

// Function to perform Bubble Sort
void bubbleSort(int arr[], int size) {
    for (int i = 0; i < size - 1; i++) {
        // Flag to check if any swaps occurred in the current pass
        bool swapped = false;

        for (int j = 0; j < size - i - 1; j++) {
            // Compare adjacent elements and swap if necessary
            if (arr[j] > arr[j + 1]) {
                std::swap(arr[j], arr[j + 1]);
                swapped = true;
            }
        }

        // If no swaps occurred in this pass, the array is already sorted
        if (!swapped)
            break;
    }
}

int main() {
    // Sample input
    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    int size = sizeof(arr) / sizeof(arr[0]);

    // Print the original array
    std::cout << "Original Array: ";
    for (int i = 0; i < size; i++) {
        std::cout << arr[i] << " ";
    }
    std::cout << std::endl;

    // Sort the array using Bubble Sort
    bubbleSort(arr, size);

    // Print the sorted array
    std::cout << "Sorted Array: ";
    for (int i = 0; i < size; i++) {
        std::cout << arr[i] << " ";
    }
    std::cout << std::endl;

    return 0;
}


