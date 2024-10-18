/*
Approach:
- Use a HashMap to store each number and its index as we iterate through the array.
- For each number, calculate the complement (target - current number).
- If the complement exists in the HashMap, we've found a solution.
- If not, add the current number and its index to the HashMap.

Time Complexity: O(n)
- We iterate through the array once, and HashMap operations are O(1) on average.

Space Complexity: O(n)
- In the worst case, we might need to store all elements in the HashMap.

Sample Input:
int[] nums = {2, 7, 11, 15};
int target = 9;

Sample Output:
[0, 1] (indices of numbers 2 and 7, which sum up to 9)
*/

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1}; // No solution found
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
