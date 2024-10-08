package java.DSA.search;
public class Binary_ceiling {

    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,17,19,32,55,77,78};
        System.out.println(ceiling(arr, 7));
        
    }

    public static int ceiling(int []arr,int target)
    {
        int start = 0;
        int end = arr.length -1;

        while(start<= end)
        {
            int mid  = start + (end - start)/2;
            if(arr[mid]==target)
            { 
                return arr[mid];
            }
            else if(target < arr[mid])
            {
                end = mid -1;
            }
            else
            {
                start = mid +1;
            }
        }

        return arr[start];
    }
    
}
