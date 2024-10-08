package DSA.search;
/**
 * // This is MountainArrayArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
interface MountainArray {
    public int get(int index);

    public int length();
}
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndex(mountainArr);int start =0;
        int end = mountainArr.length()-1;
        int index1 = binarySearch(mountainArr,start,peak,target);
        int index2 = binarySearch(mountainArr,peak,end,target);int result=0;
        if(index1 == -1 && index2 == -1)
        {
            return -1;
        }
        else if(index1==-1)
        {
            return index2;
        }
        else if(index2 == -1)
        {
            return index1;
        }
        return Math.min(index1,index2);
    }

    public static int peakIndex(MountainArray mountainArr)
    {
        int start=0;
        int end=mountainArr.length()-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
             if(mountainArr.get(mid)<mountainArr.get(mid+1))
            {
                start=mid+1;
            }
            else
            end=mid;
        }
        return end;
    }

    public static int binarySearch(MountainArray mountainArr, int start,int end, int target )
    {

        while(start<= end)
        {
            int mid  = start + (end - start)/2;
            if(mountainArr.get(mid)==target)
            { 
                return mid;
            }
            else if(target < mountainArr.get(mid))
            {
                end = mid -1;
            }
            else
            {
                start = mid +1;
            }
        }
        return -1;
    }
}