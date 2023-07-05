'''
Approach:
- The `traverse_array` function takes an array as input.
- It uses a for loop to iterate over each element in the array.
- The elements are printed one by one using the print statement.

Comments:
- The `traverse_array` function is a helper function that can be called from other parts of the code.
- It takes an array as input, allowing flexibility for different arrays.
- The use of the `range(len(arr))` expression in the for loop ensures that we iterate over each index of the array.
- The elements are accessed using index `i` and printed using the `print` statement.

Time Complexity: O(n), where n is the size of the input array. This is because we are visiting each element of the array exactly once in the for loop.

Space Complexity: O(1), as we are not using any additional space that depends on the size of the input array.

Sample Input: 
arr = [1, 2, 3, 4, 5]

Sample Output:
1
2
3
4
5
'''

# Here's the code for traversing an array in Python:

def traverse_array(arr):
    """
    Traverses an array and prints its elements.
    
    :param arr: The array to be traversed.
    """
    for i in range(len(arr)):
        print(arr[i])

# Sample input
arr = [1, 2, 3, 4, 5]

# Calling the traverse_array function
traverse_array(arr)
