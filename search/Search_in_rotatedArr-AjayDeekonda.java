package java.DSAw.search;
class Solution {
    public int search(int[] nums, int target) {
    int end =  nums.length -1;
    int pivot = findPivot(nums);
    if(pivot == -1)
    {
         return binarySearch(nums,0,nums.length-1,target,(nums[0]<nums[end])? true : false);
    }
    else
    {
        if(nums[pivot]==target)
        {
            return pivot;
        }
        else
        {
            if(nums[0]<=target)
            {
                return binarySearch(nums,0,pivot-1,target,true);
            }
            else
            {
                return binarySearch(nums,pivot+1,nums.length-1,target,true);
            }
        }
    }
}


    static int findPivot(int [] arr)
    {
        int start=0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(mid < end &&arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(mid > start && arr[mid-1] > arr[mid])
            {
               return mid -1;
            }
            else if(arr[start]>arr[mid])
            {
                end = mid -1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int [] arr,int start, int end, int target,boolean isAsc)
    {
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if( arr[mid]==target)
            {
                return mid;
            }
            if(isAsc)
            {
                if( target< arr[mid])
            {
                end= mid -1;
            }
            else
            {
                start= mid+1;
            }

            }
            else{
                
                if( target< arr[mid])
                {
                   start = mid +1;
                }
                else
                {
                    end = mid-1;;
                }

            }
           
        }
        return -1;
    }
}

public class Search_in_rotatedArr {

    public static void main(String[] args) {
        Solution s= new Solution();
        int [] nums = {1,3};

        s.search(nums, 1);

        
    }
    
}
