/*
Cycle sort is an in-place, unstable sorting algorithm that minimizes the number of writes or swaps needed to sort an array. It works by dividing the array into cycles, where each cycle represents a permutation cycle of the elements. The algorithm moves each element to its correct position within its cycle, ensuring that every element is eventually placed in its final sorted position.

Approach:
1. Start with the first element in the array.
2. Find the correct position (index) for the current element.
3. If the current element is already in its correct position, move to the next element.
4. If the current element is not in its correct position, swap it with the element at its correct position.
5. Increment the number of writes or swaps.
6. Continue steps 2-5 until the current element is in its correct position.
7. Repeat steps 2-6 for the remaining elements in the array.
8. The cycle sort algorithm repeats this process until all elements are in their correct sorted positions.

Time Complexity: The time complexity of cycle sort = O(n^2).
Space Complexity: The space complexity of cycle sort = O(1).

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

