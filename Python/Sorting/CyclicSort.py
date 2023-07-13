"""
Approach
1. Iterate through the input array.
2. For each element at index i, determine its correct position by subtracting 1 from its value.
3. If the current element is not already in its correct position, swap it with the element at its correct position.
4. Repeat steps 2 and 3 until the current element is in its correct position.
5. Move to the next element and repeat steps 2 to 4 until all elements are in their correct positions.



This algorithm has a time complexity of O(n) since each element is swapped at most once.
The space complexity of the code is O(1)"""
def cyclic_sort(nums):
    i = 0
    while i < len(nums):
        # Check if the current element is in its correct position
        if nums[i] != i + 1:
            # Swap the current element with the element at its correct position
            nums[nums[i] - 1], nums[i] = nums[i], nums[nums[i] - 1]
        else:
            i += 1

def code_example():
    # Example input
    nums = [4, 3, 2, 1]

    # Call the cyclic_sort function
    cyclic_sort(nums)

    # Print the sorted list
    print(nums)

if __name__ == "__main__":
    code_example()

 #output  [1, 2, 3, 4]
