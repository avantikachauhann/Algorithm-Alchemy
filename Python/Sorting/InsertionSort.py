'''
Approach
∙ Start with the second element (index 1) and consider it as the key.
∙ Compare the key with each element to the left of it and shift elements greater than the key to the right.
∙ Insert the key into its correct position in the sorted portion.

Time Complexity: The time complexity of the implementation: O(n^2) in the worst and average cases, and O(n) in the best case.
Space Complexity: The space complexity : O(1).

Sample Input: arr = [5, 2, 8, 12, 3]
Sample Output: Sorted array: [2, 3, 5, 8, 12]

'''

def insertion_sort(arr):
    # Traverse through 1 to len(arr)
    for i in range(1, len(arr)):
        key = arr[i]  # Current element to be inserted
        j = i - 1     # Index of the previous element
        
        # Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]  # Shift elements to the right
            j -= 1
        
        arr[j + 1] = key  # Insert the key into its correct position

# Sample usage
arr = [5, 2, 8, 12, 3]
insertion_sort(arr)
print("Sorted array:", arr)
