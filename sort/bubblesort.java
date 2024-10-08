
public class bubblesort {
    public static void main(String[] args) {
        int [] arr ={30,20,20,40,10};
        int [] arr1 = bubbleSort(arr);
        for (int i : arr1)
        {
            System.out.print(i+",");
            
        }
        
    }

    static int [] bubbleSort (int [] arr)
    {
        int limit = arr.length -1;
        for(int j =0;j<arr.length-1;j++)
        {
        for(int i=0;i<limit;i++)
        {
            if(arr[i]>arr[i+1])
            {
                arr[i]=arr[i]+arr[i+1];
                arr[i+1]=arr[i]-arr[i+1];
                arr[i]=arr[i]-arr[i+1];
            }
           
        }
        limit--;
    }
        return arr;
    }
    
}

