import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(countSort(arr)));
    }

    public static int [] countSort(int [] arr)
    {
        int [] freqArr = new int [max(arr)+1];
        for(int i=0;i<arr.length;i++)
        {
            freqArr[arr[i]]++;
        }
        int i = 0,j=0;
        while (i < arr.length) 
        {
            if (freqArr[j] > 0) 
            {
                arr[i] = j;
                freqArr[j]--;
                i++;
            } 
            else 
            {
                j++; // Reset j to search for the next non-zero frequency
            }
        }
        return arr;
    }

    public static int max(int []arr)
    {
        int max = 0;
        for(int x:arr)
        {
            if(x> max) max=x;
        }
        return max;
    }
    
}
