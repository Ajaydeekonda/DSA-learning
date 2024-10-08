package java.DSA.search;
public class BinarySearch {

    public static void main(String[] args) {

        int [] arr ={ 1,2,3,4,5,6,7,7,8,9,10};

        int [] arr2 ={9,8,7,6,5,4,3,2,1,1};
        

        System.out.println(binarySearch(arr,10));
        
    }

    static boolean binarySearch(int [] arr, int target)
    {
        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[start] <= arr[end];
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if( arr[mid]==target)
            {
                return true;
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
        
       
        return false;
    }





}
