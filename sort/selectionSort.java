import java.util.Arrays;

public class selectionSort {
    
    public static void main(String[] args) {
        int [] arr ={-32,32,20};
        selectSort(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void selectSort(int [] arr)
    {
        int j,i;
        for(i=0;i<arr.length -1;i++)
        {
            int pos =0;
            for( j=1;j<arr.length-i;j++)
            {
                if(arr[j]>arr[pos])
                {
                    pos = j;
                }
            }
            int temp = arr[pos];
            arr[pos]= arr[j-1];
            arr[j-1] =temp;
        }
    }

   
   
}
