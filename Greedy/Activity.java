import java.util.ArrayList;

public class Activity
{
    static ArrayList<Integer> act = new ArrayList<>();
    public static void main(String[] args) {
        int [] start = {1,3,0,5,8,5};
        int [] end = {2,4,6,7,9,9};
        System.out.println(count(start,end));
        System.out.println(act);
    }

    static int count(int [] start,int [] end)
    {
        if(end.length == 0)
        {
            return 0;
        }
        if(end.length == 1)
        {
            return 1;
        }
        int count =1;
        int e = end[0];
        act.add(0);
        for( int i =1;i<start.length;i++)
        {
            
            if(start[i] >= e)
            {
                act.add(i);
                e = end [i];
                count ++;
            }

        }

        return count;



    }
}
