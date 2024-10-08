import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {

        int [] arr ={4,3,2,1,5};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void cyclicsort(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(!check(arr,i))
            {
                swap(arr,i,arr[i]-1);
            }
        }
    }

    static void swap(int [] arr,int frm,int pos)
    {
        int temp = arr[frm];
        arr[frm] = arr[pos];
        arr[pos] = temp;
    }

    static boolean check(int [] arr,int index)
    {
        return (index == (arr[index]) - 1);
    }
}
