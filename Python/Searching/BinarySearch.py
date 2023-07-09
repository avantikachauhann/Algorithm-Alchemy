'''
Approach:
1. Start with a sorted array and the target value to be searched.
2. Set the lower boundary (`left`) to the first index of the array and the upper boundary (`right`) to the last index.
3. Divide the search space in half by calculating the middle index (`mid`).
4. If the target value is equal to the value at the middle index, return the index.
5. If the target value is greater than the middle value, ignore the left half by moving the `left` boundary to `mid + 1`.
6. If the target value is smaller than the middle value, ignore the right half by moving the `right` boundary to `mid - 1`.
7. Repeat steps 3-6 until the target value is found or the search space is empty (left > right).
8. If the target value is not found, return -1.

Time Complexity: O(log n) - Binary search has a logarithmic time complexity as it repeatedly halves the search space.

Space Complexity: O(1) - Binary search has a constant space complexity as it only uses a few variables to keep track of the boundaries and the middle index.

Sample Input:
arr = [2, 4, 6, 8, 10, 12, 14]
target = 8

Sample Output:
Index found: 3

This indicates that the target value 8 is found at index 3 in the array.
'''

#Binary Search implemented in Python:

def binary_search(arr, target):
    # Set the lower and upper boundaries
    left = 0
    right = len(arr) - 1

    while left <= right:
        mid = (left + right) // 2

        # If target is found, return the index
        if arr[mid] == target:
            return mid

        # If target is greater, ignore left half
        elif arr[mid] < target:
            left = mid + 1

        # If target is smaller, ignore right half
        else:
            right = mid - 1

    # If target is not found, return -1
    return -1

