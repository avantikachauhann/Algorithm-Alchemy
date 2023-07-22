/*
Explanation:
- The `binarySearch` function takes a sorted array, its size, and a key as input. It performs binary search, which works by repeatedly dividing the array in half and comparing the middle element (mid) with the key.
- We initialize two pointers `low` and `high` to mark the range of the search. Initially, `low` points to the first element of the array, and `high` points to the last element.
- In each iteration of the `while` loop, we calculate the middle index (`mid`) using `(low + high) / 2` to avoid integer overflow. If the element at the middle index is equal to the key, we return the mid index.
- If the element at `mid` is less than the key, it means the key lies in the right half of the array, so we update `low` to `mid + 1` to search the right half.
- If the element at `mid` is greater than the key, it means the key lies in the left half of the array, so we update `high` to `mid - 1` to search the left half.
- We repeat this process until the `low` and `high` pointers cross each other. If the key is not found, we return -1.

Time Complexity: The time complexity of binary search is O(log N), where N is the size of the array. This is because in each iteration, we reduce the search space by half, which results in a much faster search compared to linear search for large arrays.

Space Complexity: The space complexity is O(1) since the algorithm only uses a constant amount of extra memory for the `low`, `high`, `mid`, `size`, and `key` variables, regardless of the array size.

Sample Input:
Sorted Array: {2, 5, 7, 10, 12, 15, 18}
Key: 12

Sample Output:
Key 12 found at index 4
*/

#include <iostream>

// Function to perform binary search
int binarySearch(int arr[], int size, int key) {
    int low = 0;
    int high = size - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] == key) {
            // If key is found, return its index
            return mid;
        } else if (arr[mid] < key) {
            // If key is greater, search the right half of the array
            low = mid + 1;
        } else {
            // If key is smaller, search the left half of the array
            high = mid - 1;
        }
    }

    // If key is not found, return -1
    return -1;
}

int main() {
    // Sample input (sorted array)
    int arr[] = {2, 5, 7, 10, 12, 15, 18};
    int size = sizeof(arr) / sizeof(arr[0]);
    int key = 12;

    // Perform binary search to find the key in the array
    int index = binarySearch(arr, size, key);

    // Check if the key was found and print the result
    if (index != -1) {
        std::cout << "Key " << key << " found at index " << index << std::endl;
    } else {
        std::cout << "Key " << key << " not found in the array." << std::endl;
    }

    return 0;
}

