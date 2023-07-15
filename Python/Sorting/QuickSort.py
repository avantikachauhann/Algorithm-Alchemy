# Quick Sort is a widely used sorting algorithm that follows the divide and conquer paradigm. It's an efficient, in-place method offering superior performance in real-world sorting applications. 

# The worst-case time complexity is O(n^2), however, on average, it performs impressively with a time complexity of O(n log n).

# The algorithm operates by choosing a 'pivot' from the array and partitioning the remaining elements into two sub-arrays, according to whether they are less than or greater than the pivot. 
# The pivot selection and partitioning steps occur in-place, meaning they require minimal additional space.
# After partitioning, the algorithm recursively applies the same logic to the sub-arrays. Over several iterations, this results in a fully sorted array.

# Algorithm:
# 1. The quick_sort function initially selects a pivot element from the array.
# 2. Using the partition function, it organizes the array such that elements lesser than the pivot come before it and those greater come after it.
# 3. The quick_sort function is then recursively applied to the sub-arrays formed by the partitioning step.

# Time Complexity: On average, Quick Sort operates in O(n log n), where 'n' is the number of elements. In the worst-case scenario, its performance degrades to O(n^2).

# Space Complexity: The space complexity of Quick Sort is O(log n), due to the recursive nature of the algorithm storing function calls on the call stack.

# Implementation of Quick Sort in Python:

def partition(array, low, high):
    # Choose the rightmost element as pivot
    pivot = array[high]

    i = low - 1

    # Partitioning: move all elements smaller than pivot to the left, greater to the right
    for j in range(low, high):
        if array[j] <= pivot:
            i = i + 1
            (array[i], array[j]) = (array[j], array[i])

    # Swap pivot element with the element at the i-th position
    (array[i + 1], array[high]) = (array[high], array[i + 1])

    # Return the position of the pivot
    return i + 1

def quick_sort(array, low, high):
    if low < high:
        # Find pivot position
        pi = partition(array, low, high)

        # Recursively perform quicksort on the partitioned sub-arrays
        quick_sort(array, low, pi - 1)
        quick_sort(array, pi + 1, high)

# Sample Input
input_array = [8, 7, 2, 1, 0, 9, 6]
size = len(input_array)

print("Original Array: ", input_array)
quick_sort(input_array, 0, size - 1)

print("Sorted Array: ", input_array)

# Sample Input
# input_array = [8, 7, 2, 1, 0, 9, 6]


# Sample Output
# input_array = [0, 1, 2, 6, 7, 8, 9]

# Note: Quick Sort algorithm works by manipulating the input array in-place and doesn't work well with arrays that are already sorted or nearly sorted.