/*
Explanation:
- The `linearSearch` function takes an array, its size, and a key as input. It performs a linear search by iterating through each element of the array using a `for` loop.
- In each iteration, it checks if the current element matches the key. If the key is found, it returns the index of that element.
- If the key is not found after scanning the entire array, the function returns -1 to indicate that the key is not present in the array.
- The main function contains a sample input array, a key to search for, calls the `linearSearch` function, and prints the result.

Sample Input:
Array: {10, 5, 3, 7, 2, 8}
Key: 7

Sample Output:
Key 7 found at index 3

Time Complexity: The time complexity of linear search is O(N), where N is the size of the array. In the worst case, the algorithm may need to traverse the entire array to find the key or determine that it is not present.
Space Complexity: The space complexity is O(1) since the algorithm only uses a constant amount of extra memory for the `i`, `size`, and `key` variables, regardless of the array size.
*/

#include <iostream>

// Function to perform linear search
int linearSearch(int arr[], int size, int key) {
    for (int i = 0; i < size; i++) {
        if (arr[i] == key) {
            // If key is found, return its index
            return i;
        }
    }

    // If key is not found, return -1
    return -1;
}

int main() {
    // Sample input
    int arr[] = {10, 5, 3, 7, 2, 8};
    int size = sizeof(arr) / sizeof(arr[0]);
    int key = 7;

    // Perform linear search to find the key in the array
    int index = linearSearch(arr, size, key);

    // Check if the key was found and print the result
    if (index != -1) {
        std::cout << "Key " << key << " found at index " << index << std::endl;
    } else {
        std::cout << "Key " << key << " not found in the array." << std::endl;
    }

    return 0;
}

