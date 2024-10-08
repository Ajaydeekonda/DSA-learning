import java.util.Arrays;

public class QuickSortOwn {

    public static void main(String[] args) {
        int [] arr = {8,7,1,2,6,9,10,2,11};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

   static void quickSort(int [] arr,int start,int end)
   {
    if(start>=end)
    {
        return;
    }
    int pivotIndex = partition(arr, start, end);
    quickSort(arr, start, pivotIndex-1);
    quickSort(arr, pivotIndex+1, end);

   }

   static int partition(int [] arr,int low,int high)
   {
    int i = -1;
    int pivot = arr[high];
    int pivotIndex = 0;
    while(i<high-1)
    {
        i++;
        if(arr[i]<= pivot)
        {
            swap(arr,i,pivotIndex);
            pivotIndex++;
        }
    }
    swap(arr,pivotIndex,high);
    return pivotIndex;
   }

   static void swap(int [] arr,int i1,int i2)
   {
    int temp = arr[i1];
    arr[i1] = arr[i2];
    arr[i2]= temp;
   }
    
    
}
