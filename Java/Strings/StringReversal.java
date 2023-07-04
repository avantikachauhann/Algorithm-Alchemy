/*
Approach:
  - We first check if the input string is null or empty, in which case we return the input as it is.
  - Next, we convert the input string to a character array to make it easier to reverse.
  - We then initialize two pointers, `start` and `end`, pointing to the start and end of the character array, respectively.
  - Using a while loop, we swap the characters at `start` and `end` positions and increment `start` and decrement `end` until `start` becomes greater than or equal to `end`.
  - Finally, we convert the reversed character array back to a string using the `String` constructor and return it.

Time Complexity: The time complexity of this approach is O(n), where n is the length of the input string. This is because we need to iterate through the entire string to reverse it.

Space Complexity: The space complexity is O(n) as well. In this approach, we are using a character array to store the reversed string. The size of the character array is the same as the length of the input string.

Sample Input and Output:
  - Input: "Hello, World!"
  - Output: "!dlroW ,olleH"
*/

// here's a code in Java to reverse a string:

public class StringReversal {
    public static String reverseString(String input) {
        // Check if the string is null or empty
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        // Convert the string to a character array
        char[] charArray = input.toCharArray();
        
        // Initialize pointers for the start and end of the array
        int start = 0;
        int end = charArray.length - 1;
        
        // Reverse the string by swapping characters from start to end
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            
            start++;
            end--;
        }
        
        // Convert the character array back to a string
        return new String(charArray);
    }
    
    public static void main(String[] args) {
        // Testing the reverseString() method
        String input = "Hello, World!";
        String reversedString = reverseString(input);
        
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversedString);
    }
}

