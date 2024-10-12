//Naive : Use nested loop to search for 2 elements making target - O(n^2)

public int[] twoSum(int[] arr, int target) 
{
    for(int i=0;i<arr.length;i++)
    {
        int rem=target- arr[i];
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[j]==rem)
            {
                return new int[]{i,j};
            }
        }
    }
    return new int[]{0,0};
}

//Use map to store elements parsed

public int[] twoSum(int[] arr, int target) 
{
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<arr.length;i++)
    {
        int rem=target-arr[i];
        if(map.containsKey(rem))
        {
            return new int []{i,map.get(rem)};
        }
        else
        map.put(arr[i],i);
    }
    return new int[]{0,0};
}
