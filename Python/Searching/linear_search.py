'''
Approach Explanation:
- In linear search, we iterate through each element of the given array/list and compare it with the target element.
- If the target element is found, we return its index.
- If the entire array is traversed and the target element is not found, we return -1.

Time Complexity: 
- The time complexity of linear search is O(n), where n is the number of elements in the array. This is because, in the worst case scenario, we may have to traverse through all the elements in the array.

Space Complexity:
- The space complexity of linear search is O(1). This is because it only requires a constant amount of additional space to store the target element and loop variables.

Sample Input:
arr = [11, 45, 87, 23, 41, 92, 79]
target = 41


Sample Output:
Element 41 found at index 4
'''

#Here's a code for linear search in Python:

def linear_search(arr, target):
    """
    Function to perform a linear search in an array.
    
    Parameters:
    arr (list): List of elements
    target: Element to search
    
    Returns:
    int: Index of the target element if found, otherwise -1
    """
    
    # Traverse through each element of the array
    for i in range(len(arr)):
        # If the target element is found, return its index
        if arr[i] == target:
            return i
    
    # If the target element is not found, return -1
    return -1

