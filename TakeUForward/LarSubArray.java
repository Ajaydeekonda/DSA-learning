package javacourse.DSA.TakeUForward;

import java.util.HashMap;

public class LarSubArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,1,1,1,1};
        System.out.println(larSubArray(arr, 3));
    }

    // public static int larSubArray(int [] arr,int target)
    // {
    //     int len =arr.length;
    //     int length =0;
    //     for(int i =0;i<len;i++)
    //     {
    //         int sum =0;
    //         for(int j=i;j<len;j++)
    //         {
    //             sum+=arr[j];
    //             if(sum == target)
    //             {
    //                length= Math.max(length, sum);
    //             }
    //         }
    //     }

    //     return length;
    // }
    // public static int larSubArray(int [] arr,int target)
    // {
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     int prefixSum = 0;
    //     int len =0;
    //     map.put(0,-1);
    //     for(int i =0;i<arr.length;i++)
    //     {
    //         prefixSum += arr[i];
    //         if(map.containsKey(prefixSum-target))
    //         {
    //             len = Math.max(i - map.get(prefixSum-target), len);
    //         }
    //         map.put(prefixSum,i);
    //     }
    //     return len;
    // }
    public static int larSubArray(int [] a,int target)
    {
        // HashMap<Integer,Integer> map = new HashMap<>();
       int left =0;int right =0;
       int sum = a[0];
       int maxLen =0;
       int n =a.length;
       while(right<n)
        {
            while(left<=right && sum>target)
            {
                sum-=a[left];
                left++;
            }
            if(sum == target)
            {
                maxLen = Math.max(maxLen,right-left+1);
            }
            right++;
            if(right<n) sum+=a[right];
            
        }
        return maxLen;
    }


    
}
