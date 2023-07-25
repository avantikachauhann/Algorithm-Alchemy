/*
Explanation:
- The program takes two input strings, `str1` and `str2`, from the user using the `Scanner` class in Java.
- It performs string concatenation using the `+` operator to join `str1`, a space, and `str2` together, and stores the result in the `concatenated` string.
- Finally, it prints the concatenated string using `System.out.println()`.

Time Complexity: The time complexity of string concatenation using the `+` operator is O(N), where N is the total number of characters in the concatenated strings. This is because the `+` operator creates a new string by copying all the characters from the input strings to the new string.

Space Complexity: The space complexity is O(N), where N is the total number of characters in the concatenated strings. This is because a new string of length N is created to hold the concatenated result.

Sample Input:
Enter the first string: Hello
Enter the second string: World

Sample Output:
Concatenated string: Hello World

Note: In Java, using the `+` operator for string concatenation is easy and convenient, but it can be inefficient for large-scale concatenation operations due to the creation of multiple intermediate string objects. For better performance in such cases, using `StringBuilder` or `StringBuffer` classes is recommended as they provide mutable and efficient string manipulation capabilities.
*/

import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        // Sample input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        scanner.close();

        // Perform string concatenation
        String concatenated = str1 + " " + str2;

        // Print the result
        System.out.println("Concatenated string: " + concatenated);
    }
}

