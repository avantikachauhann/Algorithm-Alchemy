'''
Approach:
- The program defines a function called `is_palindrome` that takes a number as input.
- The number is converted to a string using `str()` function for easy comparison.
- The string is reversed using the slicing technique `[::-1]`.
- The original and reversed strings are compared to check if they are the same.
- If they are the same, the number is considered a palindrome, and `True` is returned; otherwise, `False` is returned.
- Finally, the program checks if the given number is a palindrome or not using the `is_palindrome` function and prints the appropriate message.

Time Complexity: O(n), where n is the number of digits in the given number. Converting the number to a string and reversing it both requires iterating over the digits.

Space Complexity: O(1), as the program only uses a constant amount of space for storing the reversed string.

Sample input:
num = 12321

Sample output:
12321 is a palindrome number
'''

def is_palindrome(num):
    # Convert the number to a string for easy comparison
    num_str = str(num)
    
    # Reverse the string
    reversed_str = num_str[::-1]
    
    # Check if the original and reversed strings are the same
    if num_str == reversed_str:
        return True
    else:
        return False

# Sample input
num = 12321

# Check if the number is a palindrome
if is_palindrome(num):
    print(f"{num} is a palindrome number")
else:
    print(f"{num} is not a palindrome number")


