'''
Approach
∙ Begin with the second element (index 1) and set it as the current element.
∙ Compare the current element with each of the elements to its left and shift the elements that is greater than
  it to the right (ie. we are moving the current towards the left)
∙ Put the current element into its correct position in the array.

Time Complexity: Worst cases and average cases: O(n^2), and best cases: O(n).
Space Complexity: O(1).

Sample Input: arr = [64, 34, 25, 12, 22, 11, 90]
Sample Output: Sorted array: [11, 12, 22, 25, 34, 64, 90]
'''

// Insertion Sort in Java
public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int len = arr.length;
        // start at index i and go through the array until the last element
        for (int i = 1; i < len; i++) {
            int current = arr[i]; // set current element
            int j = i - 1; // index of previous element

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current; // put current element into the correct position
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array before sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        insertionSort(arr);

        System.out.println("\n\nArray after sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}