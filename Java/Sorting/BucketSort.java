import java.util.*;
class BucketSortAlgorithm{
static void bucketSort(float arr[], int n)
    {
        if (n <= 0)
            return;
        ArrayList<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int)arr[i] * n;
            buckets[bucketIndex].add(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }
  public static void main(String[] args){
    // TODO Auto-generated method stub
    float arr[] = { (float)0.897, (float)0.565,(float)0.656, (float)0.1234,(float)0.665, (float)0.3434 };
        int n = arr.length;
        bucketSort(arr, n);
 
        System.out.println("Sorted array is ");
        for (float el : arr) {
            System.out.print(el + " ");
        }

  }
}
