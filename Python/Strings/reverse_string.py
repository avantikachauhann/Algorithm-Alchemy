'''
Explanation of approach:
1. The function `reverse_string` takes a string as input.
2. It initializes a list `string_list` by converting the input string into a list of characters.
3. Two pointers, `start` and `end`, are initialized to the beginning and end of the list, respectively.
4. The function then enters a loop where it swaps the characters at the `start` and `end` positions using tuple unpacking. The pointers are then incremented/decremented accordingly.
5. This swapping process continues until the `start` pointer is no longer less than the `end` pointer, meaning they have met in the middle of the list.
6. Finally, the reversed list is converted back into a string using the `join` method and returned as the output.

Time Complexity: The time complexity of this approach is O(n), where n is the length of the string. The function iterates through half of the string (the characters before the middle) to perform the swapping operation.

Space Complexity: The space complexity of this approach is O(n) because the input string is converted into a list of characters.

Sample Input:
input_string = "Hello, World!"

Sample Output:
!dlroW ,olleH

Please note that this code snippet can be further improved by using extended slicing (`string[::-1]`) to directly reverse the input string without converting it to a list. However, This is another method to solve the question
'''

# Here's a code for reversing a string in Python with comments explaining the approach:

def reverse_string(string):
    # Convert the string into a list
    string_list = list(string)

    # Initialize pointers for the beginning and end of the list
    start = 0
    end = len(string_list) - 1

    # Swap the characters at the start and end pointers until they meet in the middle
    while start < end:
        string_list[start], string_list[end] = string_list[end], string_list[start]
        start += 1
        end -= 1

    # Convert the reversed list back into a string
    reversed_string = "".join(string_list)
    
    return reversed_string

# Test the function with a sample input
input_string = "Hello, World!"
print(reverse_string(input_string))  # Output: !dlroW ,olleH
