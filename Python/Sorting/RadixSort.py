'''
Approach:
- The `counting_sort` function is used to sort the input array based on a specific digit's position (given by `exp`).
- The `radix_sort` function repeatedly calls `counting_sort` for each digit's position, starting from the least significant digit to the most significant digit (as controlled by the `exp` variable).
- In each iteration of `counting_sort`, it counts the occurrences of digits at the current position, calculates the cumulative count, and builds the sorted output array.

Time Complexity: The time complexity of Radix Sort is O(n * k), where n is the number of elements in the array, and k is the number of digits in the largest number.

Space Complexity: The space complexity is O(n) as we use extra space for the `output` and `count` arrays.

Sample Input and Output:
Sample Input: [170, 45, 75, 90, 802, 24, 2, 66]
Sorted Output: [2, 24, 45, 66, 75, 90, 170, 802]
'''

def counting_sort(arr, exp):
    n = len(arr)
    output = [0] * n
    count = [0] * 10

    # Count occurrences of digits at the current position (exp)
    for i in range(n):
        index = (arr[i] // exp) % 10
        count[index] += 1

    # Calculate the cumulative count of digits
    for i in range(1, 10):
        count[i] += count[i - 1]

    # Build the sorted output array
    i = n - 1
    while i >= 0:
        index = (arr[i] // exp) % 10
        output[count[index] - 1] = arr[i]
        count[index] -= 1
        i -= 1

    # Copy the sorted elements back to the original array
    for i in range(n):
        arr[i] = output[i]

def radix_sort(arr):
    max_element = max(arr)
    exp = 1

    # Perform counting sort for each digit's position
    while max_element // exp > 0:
        counting_sort(arr, exp)
        exp *= 10

# Sample input
arr = [170, 45, 75, 90, 802, 24, 2, 66]

# Call radix_sort to sort the array
radix_sort(arr)

# Sample output
print("Sample Input:", [170, 45, 75, 90, 802, 24, 2, 66])
print("Sorted Output:", arr)


