/*
Cycle sort is an in-place, unstable sorting algorithm that minimizes the number of writes or swaps needed to sort an array. It works by dividing the array into cycles, where each cycle represents a permutation cycle of the elements. The algorithm moves each element to its correct position within its cycle, ensuring that every element is eventually placed in its final sorted position.

The time complexity of cycle sort = O(n^2),

Sample Input:
Array before sorting: 64 34 25 12 22 11 90

Sample Output:
Array after sorting: 11 12 22 25 34 64 90

*/

public class CycleSortExample {
    public static void cycleSort(int[] nums) {
        int n = nums.length;
        for (int cycleStart = 0; cycleStart < n - 1; cycleStart++) {
            int value = nums[cycleStart];
            int position = cycleStart;

            // Find the correct position for the current element
            for (int i = cycleStart + 1; i < n; i++) {
                if (nums[i] < value) {
                    position++;
                }
            }

            // Skip elements that are already in their correct positions
            if (position == cycleStart) {
                continue;
            }

            // Move the current element to its correct position
            while (value == nums[position]) {
                position++;
            }
            int temp = nums[position];
            nums[position] = value;
            value = temp;

            // Rotate the remaining elements in the cycle
            while (position != cycleStart) {
                position = cycleStart;
                for (int i = cycleStart + 1; i < n; i++) {
                    if (nums[i] < value) {
                        position++;
                    }
                }
                while (value == nums[position]) {
                    position++;
                }
                temp = nums[position];
                nums[position] = value;
                value = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {64,34,25,12,22,11,90};  // Unsorted array
        cycleSort(nums);
        System.out.println("Sorted Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

