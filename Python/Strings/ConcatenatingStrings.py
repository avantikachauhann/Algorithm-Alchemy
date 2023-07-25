'''
Explanation:
- The program takes two input strings, `str1` and `str2`, from the user using the `input()` function.
- It performs string concatenation using the `+` operator to join `str1`, a space, and `str2` together, and stores the result in the `concatenated` variable.
- Finally, it prints the concatenated string using the `print()` function.

Time Complexity: The time complexity of string concatenation using the `+` operator is O(N), where N is the total number of characters in the concatenated strings. This is because the `+` operator creates a new string by copying all the characters from the input strings to the new string.

Space Complexity: The space complexity is O(N), where N is the total number of characters in the concatenated strings. This is because a new string of length N is created to hold the concatenated result.

Sample Input:
Enter the first string: Hello
Enter the second string: World

Sample Output:
Concatenated string: Hello World

Note: In Python, using the `+` operator for string concatenation is easy and convenient for small-scale concatenation operations. However, for larger-scale or frequent concatenations, using the `str.join()` method or `io.StringIO` class is recommended as they provide more efficient and memory-friendly ways to concatenate strings.
'''

def main():
    # Sample input
    str1 = input("Enter the first string: ")
    str2 = input("Enter the second string: ")

    # Perform string concatenation
    concatenated = str1 + " " + str2

    # Print the result
    print("Concatenated string:", concatenated)

if __name__ == "__main__":
    main()


