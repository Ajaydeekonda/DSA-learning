package javacourse.DSA.Heaps;
import java.util.*;

public class HeapSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(7);
        System.out.println(list);
        heapSort(list);
        System.out.println(list);

    }

    public static void heapSort(ArrayList<Integer> list)
    {
        int n = list.size();
        for(int i = n/2;i>=0;i--)
        {
            heapify(list, i,n);
        }

        for(int i =n-1;i>0;i--)
        {
            swap(0,i,list);
            heapify(list, 0, i);
        }


    }

    private static void heapify(ArrayList<Integer> list,int i,int size)
    {
        int leftIndex = i*2+1;
        int rightIndex = i*2+2;
        int maxIndex = i;
        if(leftIndex < size && list.get(maxIndex)< list.get(leftIndex))
        {
            maxIndex = leftIndex;
        }
        if(rightIndex < size && list.get(maxIndex)< list.get(rightIndex) )
        {
            maxIndex = rightIndex;
        }
        
        if(maxIndex != i)
        {
            swap(i,maxIndex,list);
            heapify(list, maxIndex,size);
        }

    }

    private static void swap(int index1,int index2,ArrayList<Integer> list)
    {
        int temp = list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2,temp);

    }
}
