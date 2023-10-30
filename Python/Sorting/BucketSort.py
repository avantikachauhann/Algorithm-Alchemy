'''Bucket Sort is a sorting algorithm that distributes elements into a finite number of buckets and then sorts the elements within each bucket. It's an efficient sorting algorithm for uniformly distributed data. Here's a Python program for Bucket Sort, along with explanations and a time complexity analysis.'''
def insertion_sort(bucket):
    for i in range(1, len(bucket)):
        key = bucket[i]
        j = i - 1
        while j >= 0 and key < bucket[j]:
            bucket[j + 1] = bucket[j]
            j -= 1
        bucket[j + 1] = key

def bucket_sort(arr):
    # Create a list of empty buckets
    n = len(arr)
    max_val = max(arr)
    min_val = min(arr)
    bucket_range = (max_val - min_val) / n
    num_buckets = n

    buckets = [[] for _ in range(num_buckets)]

    # Distribute elements into buckets
    for i in range(n):
        index = int((arr[i] - min_val) / bucket_range)
        buckets[index].append(arr[i])

    # Sort each bucket using insertion sort
    for i in range(num_buckets):
        insertion_sort(buckets[i])

    # Concatenate sorted buckets
    sorted_array = []
    for i in range(num_buckets):
        sorted_array.extend(buckets[i])

    return sorted_array

# Example usage
if __name__ == "__main__":
    arr = [3.0, 0.8, 2.5, 1.1, 1.0, 4.7, 4.2]
    sorted_arr = bucket_sort(arr)
    print("Original Array:", arr)
    print("Sorted Array:", sorted_arr)
'''Explanation:

insertion_sort is a helper function for sorting elements within a single bucket using the insertion sort algorithm.

bucket_sort is the main function. It first calculates the range of values in the input array and divides it into buckets. It then distributes elements into their respective buckets based on their values. After that, it sorts each bucket using insertion_sort and concatenates the sorted buckets to obtain the final sorted array.

Time Complexity Analysis:

The time complexity of distributing the elements into buckets is O(n), where n is the number of elements.
The insertion sort within each bucket takes O(k^2) time, where k is the average number of elements in a bucket. In the worst case, when all elements are in one bucket, it can be O(n^2).
The final concatenation step takes O(n) time.
So, the overall time complexity of Bucket Sort is O(n) in the best case (uniform distribution) and can go up to O(n^2) in the worst case.
Bucket Sort is most efficient when the input data is uniformly distributed, and the number of elements in each bucket is small.'''
