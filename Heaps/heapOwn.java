package javacourse.DSA.Heaps;

import java.util.ArrayList;

public class heapOwn<T extends Comparable<T>> {
    
    private ArrayList<T> list;
    private int count;
    public heapOwn()
    {
        list = new ArrayList<>();
        this.count =0;
    }

    public void insert( T value)
    {

        list.add(count,value);
        count +=1;
        MinHeapify();
    }

    private void MinHeapify()
    {
        int i = count -1;
        while(i>0 && list.get(i).compareTo(list.get((i-1)/2)) < 0)
        {
            swap(i,(i-2)/2);
            i=(i-1)/2;
        }
    }

    private void swap(int first,int second)
    {
        T temp = list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }
}
