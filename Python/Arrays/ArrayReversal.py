'''
Approach:
- The reverse_array function takes an array as input.
- The function reverses the array using slicing.
- Finally, it returns the reversed array.

Time Complexity: O(n)
- Reversing an array using slicing takes O(n) time, where n is the number of elements in the array.

Space Complexity: O(1)
- The space used by the program is constant as it does not depend on the input size.

Sample Input:
Original Array: [1, 2, 3, 4, 5]

Sample Output:
Reversed Array: [5, 4, 3, 2, 1]

Note: The program can be easily modified to handle arrays of different data types by changing the input argument as per requirement.
'''

def reverse_array(arr):
    return arr[::-1]  # reversing the array using slicing

# driver code
if __name__ == '__main__':
    # input
    arr = [1, 2, 3, 4, 5]
    print("Original Array:", arr)
    
    # reversing the array
    reversed_arr = reverse_array(arr)
    print("Reversed Array:", reversed_arr)
