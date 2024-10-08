
public class BinaryRecursion {
    public static void main(String[] args) {

        int [] arr ={1,2,3,4,55,66,78};
        System.out.println(search(arr, 61, 0, arr.length));        
    }

    static int search(int [] arr,int target,int start, int end)
    {
        if(start>end)
        {
            return -1;
        }
        int mid = start +(end-start)/2;
        if(target == arr[mid])
        {
            return mid;
        }
        else if(target > arr[mid])
        {
            return search(arr,target,mid+1,end);
        }
        else
        {
            return search(arr,target,start,mid-1);
        }

    }

    
}
