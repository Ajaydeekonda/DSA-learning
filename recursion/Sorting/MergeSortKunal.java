

import java.util.Arrays;

public class MergeSortKunal {
    public static void main(String[] args) {

        int [] arr = {5,4,3,2,1};
        System.err.println(Arrays.toString(mergeSort(arr)));
        
    }

    static int [] mergeSort(int [] arr)
    {
        if(arr.length == 1)
        {
            return arr;
        }

        int mid = arr.length /2 ;
        int [] left = mergeSort(Arrays.copyOfRange(arr, 0,mid));
        int [] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }

    static int [] merge(int [] first,int [] second)
    {
        int n1 = first.length;
        int n2 = second.length;
        int [] mix = new int[n1+n2];
        int i =0,j=0,k=0;
        while (i < n1 && j < n2) {
            if (first[i] < second[j]) {
                mix[k++] = first[i++];
            } else {
                mix[k++] = second[j++];
            }
        }
        while(i<n1)
        {
            mix[k++]=first[i++];
        }
        while(j<n2)
        {
            mix[k++]=second[j++];
        }
        
        
        return mix;
    }
}
