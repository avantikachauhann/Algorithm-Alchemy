'''
Explanation:
1. The `heapify` function takes three parameters: the array `arr`, the size of the heap `n`, and the index of the current node `i`.
2. It first assumes the largest element is at the current index `i`.
3. It calculates the indices of the left and right children of the current node.
4. It checks if the left child exists and is greater than the current largest element.
5. If so, it updates the index of the largest element.
6. It then checks if the right child exists and is greater than the current largest element.
7. If so, it updates the index of the largest element.
8. If the largest element is not the current node, it swaps the values and recursively calls `heapify` on the affected subtree.
9. The `heap_sort` function takes an array `arr` and performs the Heap Sort algorithm.
10. It initializes the size of the heap `n` to the length of the array.
11. It builds a max-heap from the array by calling `heapify` on each non-leaf node in reverse order.
12. It extracts elements from the heap one by one by swapping the root (maximum element) with the last unsorted element.
13. After each swap, it calls `heapify` on the reduced heap size to ensure the max-heap property is maintained.
14. Finally, it returns the sorted array.
15. In the sample usage, an input array `[12, 11, 13, 5, 6, 7]` is sorted using heap sort.
16. The sorted array `[5, 6, 7, 11, 12, 13]` is printed.

Time Complexity:
The time complexity of heap sort is O(n log n) in all cases, where n is the number of elements in the array. Both the `heapify` function and the repeated swapping take O(log n) time, and they are performed n times.

Space Complexity:
The space complexity of heap sort is O(1) since the sorting is performed in-place, without using any additional data structures that depend on the input size.

Sample Input:
input_array = [12, 11, 13, 5, 6, 7]

Sample Output:
Sorted array: [5, 6, 7, 11, 12, 13]

In the above example, the input array `[12, 11, 13, 5, 6, 7]` is sorted using heap sort, and the resulting sorted array is `[5, 6, 7, 11, 12, 13]`.
'''

def heapify(arr, n, i):
    largest = i  # Initialize the largest element as the root
    left = 2 * i + 1  # Left child
    right = 2 * i + 2  # Right child

    # Check if the left child of the root exists and is greater than the root
    if left < n and arr[i] < arr[left]:
        largest = left

    # Check if the right child of the root exists and is greater than the root and left child
    if right < n and arr[largest] < arr[right]:
        largest = right

    # Swap the root with the largest element, if necessary
    if largest != i:
        arr[i], arr[largest] = arr[largest], arr[i]  # Swap
        heapify(arr, n, largest)

def heap_sort(arr):
    n = len(arr)

    # Build a max-heap from the array
    for i in range(n // 2 - 1, -1, -1):
        heapify(arr, n, i)

    # Extract elements one by one from the heap
    for i in range(n - 1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i]  # Swap
        heapify(arr, i, 0)

    return arr

# Sample usage
input_array = [12, 11, 13, 5, 6, 7]
sorted_array = heap_sort(input_array)
print("Sorted array:", sorted_array)

