# A happy number is defined as a number that leads to 1 after a sequence of steps, where each step involves replacing the number with the sum of the squares of its digits. To determine if a number is a happy number, we can follow these steps:

# Approach:
# Initialize a set called seen to keep track of numbers encountered during the process to detect cycles.
# Repeat the following steps until either n becomes 1 (which makes it a happy number) or n is encountered again (indicating a cycle, and the number is not happy):
#     a. Add the current value of n to the seen set.
#     b. Calculate the sum of the squares of its digits by repeatedly taking the last digit of n, squaring it, and adding it to sum. Update n by dividing it by 10.
#     c. Update n with the calculated sum.
# If n eventually becomes 1, it's a happy number. If it enters a cycle and is encountered again, it's not a happy number.

# Time Complexity:
#     The time complexity of this algorithm depends on the number of iterations required to determine whether the number is happy or not. In the worst case, the algorithm will run until 'n' becomes 1 or until it enters a cycle. The number of iterations is not fixed and can vary from input to input, so the time complexity is not easily expressed in Big O notation.

# Space Complexity:
#     The space complexity is determined by the space used to store the seen set, which can contain at most all distinct numbers encountered during the process. In the worst case, this set could contain up to 81 distinct numbers (as the sum of the squares of digits of a number is at most 81 for a 3-digit number). Therefore, the space complexity can be considered O(1) for practical purposes, as the number of distinct numbers stored is limited. 

# Sample Input and Output:
# Enter a number to find if it is a Happy Number or Not: 19
# 19 is a Happy number

# Enter a number to find if it is a Happy Number or Not: 4
# 4 is not a Happy number

def is_happy_number(n):
    def get_next(num):
        total_sum = 0
        while num > 0:
            num, digit = divmod(num, 10)
            total_sum += digit ** 2
        return total_sum

    seen = set()
    while n != 1 and n not in seen:
        seen.add(n)
        n = get_next(n)

    return n == 1

if __name__ == "__main__":
    n = int(input("Enter number to find Happy Number or Not: "))
    if is_happy_number(n):
        print(f"{n} is a Happy number")
    else:
        print(f"{n} is not a Happy number")
