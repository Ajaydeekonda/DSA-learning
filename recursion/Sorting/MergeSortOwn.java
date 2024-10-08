import java.util.Arrays;
public class MergeSortOwn {
    public static void main(String[] args) {

        int [] arr = {3,4,1,5,6,8,9};
        divide(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static void divide(int [] arr)
    {
        if(arr.length ==1)
        {
            return;
        }
        int start = 0;
        int end = arr.length-1;
        int middle = start + (end - start)/2;
        int [] left  = new int[middle+1];
        int [] right = new int[end - middle];
        int i=0;
        for(;i<=middle;i++)
        {
            left[i] = arr[i];
        }
        for(int j=0;j<right.length;j++,i++)
        {
            right[j]=arr[i];
        }

        divide(left);
        divide(right);
        Merge(left,right,arr); 
        
        
    }

    static void Merge(int[] left,int [] right,int [] arr)
    {
        int l = left.length;
        int r = right.length;
        int i=0,j=0,k=0;
        while(i<l && j<r)
        {
            if(left[i]<right[j]){arr[k++]=left[i++];}
            else{arr[k++]=right[j++];}
        }
        while(i<l)
        {
            arr[k++]=left[i++];
        }
        while(j<r)
        {
            arr[k++]=right[j++];
        }
    }

}
