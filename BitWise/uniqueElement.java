public class uniqueElement {
    public static void main(String[] args) {
        int [] arr = {3,2,4,5,2,3,4,6,5};
        System.out.println(unique(arr));
    }

    public static int unique(int [] arr)
    {
        int ans=0;
        for(int x:arr)
        {
            ans=ans^x;
        }
        return ans;
    }
}
