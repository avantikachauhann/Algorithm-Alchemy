"""
Approach
1. Iterate through the input array.
2. For each element at index i, determine its correct position by subtracting 1 from its value.
3. If the current element is not already in its correct position, swap it with the element at its correct position.
4. Repeat steps 2 and 3 until the current element is in its correct position.
5. Move to the next element and repeat steps 2 to 4 until all elements are in their correct positions.



This algorithm has a time complexity of O(n) since each element is swapped at most once."""
def cyclic_sort():
    nums = [3, 5, 2, 1, 4]  # Input array
    i = 0
    while i < len(nums):
        correct_index = nums[i] - 1  # index where nums[i] should be placed
        if nums[i] != nums[correct_index]:
            nums[i], nums[correct_index] = nums[correct_index], nums[i]  # swap
        else:
            i += 1  # move to the next element if it is already in the correct position

    return nums

sorted_arr = cyclic_sort()
print(sorted_arr)  # Output: [1, 2, 3, 4, 5]