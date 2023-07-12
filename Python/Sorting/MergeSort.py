'''
Merge sort utilizes the divide-and-conquer strategy. It recursively splits the input array into two halves until each half contains only one element. Then, it merges these halves by comparing and inserting elements in sorted order. The process continues until the whole array is sorted.

Approach: 
1. The merge_sort function implements the merge sort algorithm. 
2. It first checks if the array has only one or zero elements, which is the base case to stop the recursion. 
3. If not, it splits the array into two halves and recursively applies merge sort to both halves. Finally, it calls the merge function to merge the sorted halves back together.
4. The merge function compares and merges the elements from the left and right halves. 
5. It uses two pointers to keep track of the current position in each half and appends the smaller element to the merged array. 
6. After exhausting one half, it appends the remaining elements from the unfinished half to the merged array.

Time Complexity: The time complexity of merge sort is O(n log n), where 'n' is the number of elements in the input array. This complexity arises from the recursive splitting of the array and the merging of sorted halves.

Space Complexity: The space complexity of merge sort is O(n), where 'n' is the number of elements in the input array. This complexity occurs due to the creation of temporary arrays during the merging process.

Sample input: [5, 4, 3, 2, 1]
Sample output: [1, 2, 3, 4, 5]
'''

def merge_sort(arr):
    if len(arr) <= 1:
        return arr

    # Splitting the array into two halves
    mid = len(arr) // 2
    left_half = arr[:mid]
    right_half = arr[mid:]

    # Recursively sort both halves
    left_half = merge_sort(left_half)
    right_half = merge_sort(right_half)

    # Merge the sorted halves
    return merge(left_half, right_half)

def merge(left, right):
    merged = []
    left_ptr, right_ptr = 0, 0

    # Compare and merge elements from both halves
    while left_ptr < len(left) and right_ptr < len(right):
        if left[left_ptr] < right[right_ptr]:
            merged.append(left[left_ptr])
            left_ptr += 1
        else:
            merged.append(right[right_ptr])
            right_ptr += 1

    # Append the remaining elements from the unfinished half
    merged.extend(left[left_ptr:])
    merged.extend(right[right_ptr:])

    return merged

# Sample input
input_arr = [5, 4, 3, 2, 1]
print("Input:", input_arr)

# Sorting the input array using merge sort
sorted_arr = merge_sort(input_arr)
print("Output:", sorted_arr)
