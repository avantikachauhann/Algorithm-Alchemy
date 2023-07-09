/*
Explanation:
1. We start by defining the `reverseArray` method that takes an array `arr` as input and reverses its elements in-place.
2. We use two pointers, `start` and `end`, pointing to the beginning and end of the array respectively.
3. In each iteration, we swap the elements at `arr[start]` and `arr[end]`.
4. After swapping, we move `start` one step forward and `end` one step backward.
5. We repeat this process until `start` becomes greater than or equal to `end`.
6. In the `main` method, we define a sample input array `arr` and print its original state.
7. We then call the `reverseArray` method to reverse the array in-place.
8. Finally, we print the reversed array.

Time Complexity: The time complexity of this program is O(n), where n is the number of elements in the array. This is because we need to iterate through half of the array to perform the swapping operation.

Space Complexity: The space complexity of this program is O(1) since we are only using a constant amount of extra space to store variables `start`, `end`, and `temp`.

Sample Input:
Original array: [1, 2, 3, 4, 5]

Sample Output:
Reversed array: [5, 4, 3, 2, 1]
*/


import java.util.Arrays;

public class ArrayReversal {
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        // Swap elements from start to end until both pointers meet in the middle
        while (start < end) {
            // Swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move to the next elements
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        reverseArray(arr);
        
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
