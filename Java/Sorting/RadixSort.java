import java.util.HashMap;
import java.util.LinkedList;

/*
Approach:
Radix Sort is a non-comparative sorting algorithm that sorts elements based on their individual digits,
from the least significant digit (LSD) to the most significant digit (MSD).
It processes the elements digit by digit, distributing them into different buckets based on the value of the current digit.
This process is repeated for all digits, creating a stable and sorted output.
For example the separation into the buckets will work like this:

    LSD -> h(532) = Bucket 2
        -> h(654) = Bucket 4
        -> ...

Time Complexity: O(n*k)
The time complexity of Radix Sort is O(n * k), where 'n' is the number of elements in the array,
and 'k' is the maximum number of digits in any element.

Space Complexity: O(1)
- Explain the space complexity of the code.

Sample Input:
{93, 50, 42, 83, 10, 790, 26}

Sample Output:
{10, 26, 42, 50, 83, 93, 790}

*/
public class RadixSort {

    public void radixSort(int[] sequence){
        //Create a HashTable with the LSD from all elements
        HashMap<Integer, LinkedList<Integer>> table = new HashMap<>();

        //Get the greatest amount of digits
        int k = getMaxDigitAmount(sequence);

        //for each digit go through all elements
        for(int i = 0; i < k; i++) {
            for (int element : sequence) {
                //get the digit at the actual position
                int digit = getDigitAt(element, i);

                //if the element/key is already in our table just pushFront
                if(table.containsKey(digit)) {
                    table.get(digit).addFirst(element);
                }
                //otherwise create a new LinkedList and pushFront
                else{
                    table.put(digit, new LinkedList<Integer>());
                    table.get(digit).addFirst(element);
                }
            }
            //write back all elements into the array
            sequence = writeBackToArray(sequence, table);

            //clear the Hashtable for next iteration
            table.clear();
        }
    }

    private int[] writeBackToArray(int[] sequence, HashMap<Integer, LinkedList<Integer>> map) {
        int index = 0;
        for (int i = 0; i < 10; i++) {
            try {
                while (!map.get(i).isEmpty()) {
                    sequence[index] = map.get(i).removeLast(); // Use removeLast() to maintain the correct order
                    index++;
                }
            } catch (NullPointerException e) {
                //just go on with next buckets
            }
        }
        return sequence;
    }


    private int getMaxDigitAmount(int[] sequence){
        //Store the actual maximum of digits
        int maxLength = 0;

        //go through all elements in the given array
        for(int element : sequence){
            //get the amount of digits
            int length = (""+element).length();

            //update maxLength if necessary
            if(length > maxLength)
                maxLength = length;
        }
        return maxLength;
    }

    private int getDigitAt(int number, int position) {
        try {
            String numStr = Integer.toString(number);
            int reversedPos = numStr.length() - 1 - position;
            if (reversedPos >= 0) {
                return Integer.parseInt(numStr.charAt(reversedPos) + "");
            } else {
                return 0;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return 0;
        }
    }


    public static void main(String[] args) {
        RadixSort radixSort = new RadixSort();
        int arr[] = {93, 50, 42, 83, 10, 790, 26};

        radixSort.radixSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
