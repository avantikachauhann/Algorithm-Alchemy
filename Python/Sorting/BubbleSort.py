'''
Approach
∙ Bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order. 
∙ The pass through the list is repeated until the list is sorted.
∙ This algorithm works by repeatedly swapping adjacent elements if they are in the wrong order.

Time Complexity: O(n^2) - Quadratic time complexity since we have nested loops iterating through the list.
Space Complexity: O(1) - Bubble sort is an in-place sorting algorithm, hence no extra space is required.
'''


def bubble_sort(arr):
    n = len(arr)

    for i in range(n):
        # The last i elements are already in place
        for j in range(n - i - 1):
            # Swap if the element found is greater
            # than the next element
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

    return arr


# Sample input
arr = [64, 34, 25, 12, 22, 11, 90]
print("Original array:", arr)
print("Sorted array:", bubble_sort(arr))

# Sample Output:
# Original array: [64, 34, 25, 12, 22, 11, 90]
# Sorted array: [11, 12, 22, 25, 34, 64, 90]
