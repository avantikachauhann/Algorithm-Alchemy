# Cyclic sort is an in-place, unstable sorting algorithm that operates in O(n) time complexity, which is optimal for sorting. It is best suited when given a range of elements, and each number is in the range of 1 to n.

# The main idea of the algorithm is that the value of the number determines its position in the array. For example, the number 1 goes to the 0th index, number 2 goes to the 1st index, and so on. 

# The algorithm traverses the array and if the current number is not at the correct index, it swaps it with the number at its target index.

# Approach:
# 1. The `cyclic_sort` function iterates over the array.
# 2. It checks if the current number is at the correct index. If not, it swaps the number to its correct index.
# 3. The process continues until the entire array is sorted.

# Time Complexity: The time complexity of cyclic sort is O(n), where 'n' is the number of elements in the input array.

# Space Complexity: The space complexity of cyclic sort is O(1), because it's an in-place sorting algorithm which doesn't require any extra space.

# Here is the implementation of the cyclic sort algorithm:

def cyclic_sort(nums):
    i = 0
    while i < len(nums):
        correct_index = nums[i] - 1
        if nums[i] != nums[correct_index]:
            nums[i], nums[correct_index] = nums[correct_index], nums[i]  # Swap numbers
        else:
            i += 1
    return nums

# Sample input
input_arr = [3, 5, 2, 1, 4]
print("Input:", input_arr)

# Sorting the input array using cyclic sort
sorted_arr = cyclic_sort(input_arr)
print("Output:", sorted_arr)

# Sample input
# input_arr = [3, 5, 2, 1, 4]

# Sample Output
# Output: [1, 2, 3, 4, 5]

# Please note that the cyclic sort only works for arrays where the numbers are within the range 1 to n, where n is the size of the array. So, ensure your input meets these criteria while using this sort.