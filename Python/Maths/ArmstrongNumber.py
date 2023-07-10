'''
Explanation of approach:
1. The program defines a function `is_armstrong_number()` to check if a number is an Armstrong number.
2. The function takes a number as input.
3. The number is converted to a string using `str()` and the length of the number is calculated using `len()` function.
4. Using a list comprehension, the sum of each digit raised to the power of the length is calculated.
5. The calculated sum is compared with the original number to determine if it is an Armstrong number.
6. The function returns `True` if the number is an Armstrong number, else it returns `False`.
7. A sample input number is given (`153` in this case) and the function is called to check if it is an Armstrong number.
8. The result is printed on the console.

Time Complexity: In this program, the time complexity is O(n), where n is the number of digits in the given number.

Space Complexity: The space complexity of this program is O(1), as the space used does not increase with the input size.

Sample Input: 153
Sample Output: 153 is an Armstrong number
'''

def is_armstrong_number(num):
    #Check if a number is an Armstrong number

    # Convert the number to string to calculate length
    num_str = str(num)

    # Calculate the length of the number
    num_len = len(num_str)

    # Calculate the sum of the digits raised to the power of the length
    armstrong_sum = sum(int(digit) ** num_len for digit in num_str)

    # Check if the sum is equal to the original number
    if armstrong_sum == num:
        return True
    else:
        return False


# Sample input
number = 153

# Check if the number is an Armstrong number
if is_armstrong_number(number):
    print(number, "is an Armstrong number")
else:
    print(number, "is not an Armstrong number")

