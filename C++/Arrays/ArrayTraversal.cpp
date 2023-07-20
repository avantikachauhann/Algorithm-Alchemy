/*
Explanation:
- We define a function `traverseArray` that takes an array and its size as input. The function uses a `for` loop to iterate over the array elements.
- In each iteration, we print the array element at index `i`, followed by a space.
- After the loop is done, we print a newline character to move the cursor to the next line.

Sample Input:
{1, 2, 3, 4, 5}

Sample Output:
Array Elements: 1 2 3 4 5 

Time Complexity: The time complexity of the `traverseArray` function is O(N), where N is the size of the array. This is because we need to visit each element once to print it.
Space Complexity: The space complexity is O(1) since the algorithm only uses a constant amount of extra memory, regardless of the array size.
*/

#include <iostream>

// Function to traverse and print the array elements
void traverseArray(int arr[], int size) {
    for (int i = 0; i < size; i++) {
        std::cout << arr[i] << " ";
    }
    std::cout << std::endl;
}

int main() {
    // Sample input
    int arr[] = {1, 2, 3, 4, 5};
    int size = sizeof(arr) / sizeof(arr[0]);

    // Print the array elements using traversal function
    std::cout << "Array Elements: ";
    traverseArray(arr, size);

    return 0;
}

