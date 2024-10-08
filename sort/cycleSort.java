import java.util.Arrays;
public class cycleSort {
    public static void main(String[] args) {
        int [] arr = {4,3,2,1};
        CycleSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static void CycleSort(int [] arr)
    {
        for(int i=0;i< arr.length;)
        {
            int actualpos = arr[i] -1;
            if(arr[i]==arr[actualpos])
            {
                i++;
            }
            else{
                swap(i,actualpos,arr);
            }

        }


            
    }

    static void swap(int index1,int index2, int[] arr)
    {
       int temp = arr[index1];
       arr[index1] = arr[index2];
       arr[index2]= temp;

    }
}
