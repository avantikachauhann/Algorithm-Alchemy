/*
Explanation:
- We define a function `reverseArray` that takes an array and its size as input. The function uses two pointers, `start` and `end`, initialized to the first and last elements of the array, respectively.
- We use a `while` loop that runs until the `start` pointer is less than the `end` pointer. In each iteration, we swap the elements at the `start` and `end` positions and then move both pointers inward towards the center of the array.
- The main function contains a sample input array, prints the original array, calls the `reverseArray` function, and then prints the reversed array.

Sample Input:
{1, 2, 3, 4, 5}

Sample Output:
Original Array: 1 2 3 4 5 
Reversed Array: 5 4 3 2 1 

Time Complexity: The `reverseArray` function runs in linear time O(N), where N is the size of the array, since we traverse half of the array to perform the swapping.
Space Complexity: The space complexity is O(1) since the algorithm only uses a constant amount of extra memory for the `start`, `end`, and `temp` variables, regardless of the array size.
*/

#include <iostream>
// Function to reverse the array
void reverseArray(int arr[], int size) {
    int start = 0;
    int end = size - 1;

    while (start < end) {
        // Swap elements at start and end positions
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Move the start and end pointers inward
        start++;
        end--;
    }
}

int main() {
    // Sample input
    int arr[] = {1, 2, 3, 4, 5};
    int size = sizeof(arr) / sizeof(arr[0]);

    // Print the original array
    std::cout << "Original Array: ";
    for (int i = 0; i < size; i++) {
        std::cout << arr[i] << " ";
    }
    std::cout << std::endl;

    // Reverse the array
    reverseArray(arr, size);

    // Print the reversed array
    std::cout << "Reversed Array: ";
    for (int i = 0; i < size; i++) {
        std::cout << arr[i] << " ";
    }
    std::cout << std::endl;

    return 0;
}

