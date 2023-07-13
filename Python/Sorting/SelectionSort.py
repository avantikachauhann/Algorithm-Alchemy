'''
Approach
∙ Start with the first index and find the index smallest element from the unsorted array
∙ Replace the value at the smallest index with the current index
∙ Move the current index one step to the right

Time Complexity: The time complexity of the implementation: O(n^2) in the worst, average and best cases.
Space Complexity: The space complexity : O(1).

Sample Input: arr = [5, 2, 8, 12, 3]
Sample Output: Sorted array: [2, 3, 5, 8, 12]

'''

def selection_sort(arr):
    # Traverse through 0 to len(arr) - 1
    for i in range(len(arr) - 1):
        # Initialize min_ind to the current index
        min_ind = i 
        # Iterate through the unsorted array to find the min value index
        for j in range(i + 1, len(arr)):
            # If jth index element is less than element at min_ind, make j the min_ind
            if arr[j] < arr[min_ind]:
                min_ind = j 

        # Replace the elements at current_ind and min_ind
        arr[min_ind], arr[i] = arr[i], arr[min_ind]


# Sample usage
if __name__ == "__main__":
    arr = [5, 2, 8, 12, 3]
    selection_sort(arr)
    print("Sorted array:", arr)
