public class CheckSort {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(sorted(arr, 0));
        
    }

    static boolean sorted(int [] arr,int i)
    {
        if(i==arr.length-1)
        {
            System.out.println(i);
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            System.out.println(i);
            return false;
        }
        
        
        return sorted(arr,i+1);
    }
}
