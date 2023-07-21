'''
Explanation of approach:
1. The function 'palindrome_permutation' takes a string as input.
2. It copies the input string to 'new_string', removing all spaces and making all characters lowercase
3. A set 'oddCharacters' is initialized to track characters that appear an odd number of times in the string.
    - To understand why we do this, lets define a palindrome as a string that reads the same backwards as it does forward and a permutation as a rearrangement of letters.
    - In order for a string to be a permutation of a palindrome, it must be true that either:
        A) Every character appears an even number of times in the string.
            or
        B) One character appears an odd number of times while all other characters appear an even number of times.
    - Example for case A: "abccba" is a palindrome. "ccbbaa" is a permutation of that palindrome. All characters appear an even number of times.
    - Example for case B: "abcxcba" is a palindrome. "xccbbaa" is a permutation of that palindrome.
    - Counter example (when more than one character appears an odd number of times): "abcxycba" is not a palindrome.
4. The function then iterates through each character in 'new_string' where it adds characters that are not currently in the set (meaning that this is the
    first appearance of this character or it has previously appeared an even number of times already making this appearance odd) and removes characters that are currently in the set (meaning
    the character previously appeared an odd number of times making this appearance even).
5. Finally, if the length of the set 'oddCharacters' is less than 1, it is a permutation of a palindrome and returns True. If the length is more than 1,
    it is not and returns False.


Time Complexity: The time complexity of this approach is O(n), where n is the length of the string. The function iterates through the entire string once.

Space Complexity: The space complexity of this apprach is O(n), where n is the length of the string. Since it is possible that all characters in the string
    are unique and stored in the set.

Sample Input:
input_string = "Taco cat"

Sample Output:
True
'''

# Here's a function for checking if a string is a permutation of a palindrome in Python with comments explaining the approach:

def palindrome_permutation(string):
    # Remove all spaces in the string and make all characters lowercase
    new_string = string.replace(" ", "").lower()

    # Initialize a set to track characters that appear in the string an odd number of times
    oddCharacters = set()

    # Iterate through new_string
    for char in new_string:
        # If char has never been seen before or previously appeared an even amount of times, add to set
        if char not in oddCharacters:
            oddCharacters.add(char)
        # If char is in the set (meaning it had an odd number of appearances before this current appearance), remove from set
        else:
            oddCharacters.remove(char)

    # If length of set is less than 1, then the string is a permutation of a palindrome. Else, it is not a permutation of a palindrome.
    return len(oddCharacters) <= 1
    

if __name__ == "__main__":
    # Test the function with a sample input
    input_string = "Taco cat"
    print(palindrome_permutation(input_string)) # Output: True