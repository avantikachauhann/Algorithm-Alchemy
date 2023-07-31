'''
Explanation of Approach:
- The program defines a function `sum_of_numbers` that takes a list of numbers as input.
- Inside the function, it initializes a variable `total_sum` to 0, which will store the sum of the numbers.
- It then iterates through each number in the input list using a `for` loop and adds each number to the `total_sum`.
- After processing all the numbers, the function returns the final `total_sum`.
- In the main part of the program, we provide a sample input list `numbers_list` containing `[2, 4, 6, 8, 10]`.
- We call the `sum_of_numbers` function with this input list and store the result in `result_sum`.
- Finally, the program outputs the result as "Sum: 30".

Time Complexity:
- The time complexity of this program is O(N), where N is the number of elements in the input list. The `for` loop iterates through each element once, and the time taken is directly proportional to the size of the input list.

Space Complexity:
- The space complexity of this program is O(1) because it only uses a constant amount of additional memory, regardless of the size of the input list. The memory usage remains constant as the program only uses a single variable (`total_sum`) to store the result.

Sample Input:
numbers_list = [2, 4, 6, 8, 10]

Sample Output:
Sum: 30

In the sample input, the function `sum_of_numbers` calculates the sum of the numbers in the list `[2, 4, 6, 8, 10]`, and the output is `Sum: 30`.
'''

def sum_of_numbers(numbers):
    """
    Function to calculate the sum of numbers in a list.

    Parameters:
    numbers (list): A list of numbers.

    Returns:
    int: The sum of the numbers in the list.
    """
    total_sum = 0

    # Iterate through each number in the list and add it to the total_sum
    for num in numbers:
        total_sum += num

    return total_sum

# Sample Input
numbers_list = [2, 4, 6, 8, 10]

# Calculate the sum of numbers in the list
result_sum = sum_of_numbers(numbers_list)

# Sample Output
print("Sum:", result_sum)

