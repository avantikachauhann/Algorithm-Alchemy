/* 
Explanation:
- The binarySearch function takes an array `arr` and a target value `target` as parameters.
- It initializes `left` and `right` variables to keep track of the search range within the array.
- The while loop continues until the `left` pointer is less than or equal to the `right` pointer.
- Inside the loop, it calculates the `mid` index using `(left + right) / 2` to divide the search range into two halves.
- If the target value is found at the `mid` index, it returns the index.
- If the target value is greater than the value at the `mid` index, it updates the `left` pointer to `mid + 1` to search in the right half.
- If the target value is smaller than the value at the `mid` index, it updates the `right` pointer to `mid - 1` to search in the left half.
- If the loop is completed without finding the target, it returns -1.
- In the main method, we create an example array `arr` and a target value `target`.
- We call the `binarySearch` function with these parameters and store the returned index in the `index` variable.
- Finally, we check if the index is not -1 and print the appropriate message.

Time Complexity: O(log n) - Binary search runs in logarithmic time, as it halves the search range with each step.

Space Complexity: O(1) - Binary search has a constant space complexity as it does not require any additional space that grows with the input size.

Sample Input:
arr = [1, 2, 3, 4, 5, 6, 7]
target = 4

Sample Output:
Element found at index 3

*/

//Here's the code for Binary Search in Java:

public class BinarySearch {
    // Binary Search function
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at the mid index
            if (arr[mid] == target) {
                return mid;
            }

            // If target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        //  Return -1 if the target is not found
        return -1;
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 4;
        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}


