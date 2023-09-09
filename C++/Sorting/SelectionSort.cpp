/*

Explanation:
-The selectionSort function implements the Selection Sort algorithm. 
-It divides the array into two parts: the sorted part at the beginning and the unsorted part at the end. In each iteration,
-it finds the minimum element in the unsorted part and swaps it with the first element in the unsorted part, effectively expanding the sorted part by one element.
-The algorithm repeats this process until the entire array is sorted.
-It uses the minIndex variable to keep track of the index of the minimum element found in the unsorted part.


Sample Input:
{64, 34, 25, 12, 22, 11, 90}

Sample Output:
Original Array: 64 34 25 12 22 11 90 
Sorted Array: 11 12 22 25 34 64 90 

-The time complexity of Selection Sort is O(N^2) in all cases (worst-case, average-case, and best-case), where N is the size of the array. 
-The space complexity is O(1) since it uses only a constant amount of extra memory for temporary variables.

*/

#include <iostream>

// Function to perform Selection Sort
void selectionSort(int arr[], int size) {
    for (int i = 0; i < size - 1; i++) {
        // Find the minimum element in the unsorted part of the array
        int minIndex = i;

        for (int j = i + 1; j < size; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }

        // Swap the found minimum element with the first element in the unsorted part
        std::swap(arr[i], arr[minIndex]);
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

    // Sort the array using Selection Sort
    selectionSort(arr, size);

    // Print the sorted array
    std::cout << "Sorted Array: ";
    for (int i = 0; i < size; i++) {
        std::cout << arr[i] << " ";
    }
    std::cout << std::endl;

    return 0;
}