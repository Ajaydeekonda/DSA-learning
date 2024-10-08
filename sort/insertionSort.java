import java.util.Arrays;

public class insertionSort {
     public static void main(String[] args) {
        int [] arr ={1,2,5,6,7,8,4};
        insertSort(arr);
        System.out.print(Arrays.toString(arr));
    }

   static void insertSort(int [] arr)
   {
    for(int i=0;i<arr.length -1;i++)
    {
        for(int j = i+1;j>0;)
        {
            if(arr[j-1]>arr[j])
            {
                int temp = arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= temp;
                j--;
            }
            else
            {
                break;
            }
        }
    }

   }
}
