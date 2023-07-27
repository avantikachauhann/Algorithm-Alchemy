'''
What is a simple number?
A simple number is a positive integer greater than 1 that has no positive divisors other than 1 and itself.

Approach:
1. The function `is_simple_number` takes an integer `n` as input.
2. First, we check if the number is less than 2. If it is, we return `False` as numbers less than 2 are not prime numbers.
3. Next, we loop from 2 to the square root of the number (inclusive) using the `range` function.
4. For each number in the loop, we check if the number is divisible by `i`. If it is, we return `False` as it is not a prime number.
5. If the number is not divisible by any number, we return `True` as it is a prime number.

Sample Input:
number = 13

Sample Output:
13 is a simple number

Time Complexity: The time complexity of this code is O(sqrt(n)). This is because we iterate from 2 to the square root of the number, which reduces the number of iterations needed compared to checking all numbers up to n.

Space Complexity: The space complexity of this code is O(1), as it only uses a constant amount of memory to store the input number and the loop variable.
'''
  
#Determining whether a number is simple or not in Python:

def is_simple_number(n):
    # Check if the number is less than 2, which is not a prime number
    if n < 2:
        return False
    
    # Check if the number is divisible by any number from 2 to square root of the number
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    
    # If the number is not divisible by any number, it is a prime number
    return True


# Sample Input
number = 13

# Check if the number is simple or not
is_simple = is_simple_number(number)

# Print the result
if is_simple:
    print(number, "is a simple number")
else:
    print(number, "is not a simple number")

