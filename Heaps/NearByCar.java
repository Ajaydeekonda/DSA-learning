package javacourse.DSA.Heaps;

import java.util.PriorityQueue;

public class NearByCar {
    public static void main(String[] args) {
        System.out.println(cost(new int []{2,3,3,4,6}));
        
    }

    public static int cost(int [] arr)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }
        int cost=0;
        while(pq.size()>1)
        {
            int min = pq.remove();
            int min2 = pq.remove();
            cost+=min + min2;
            pq.add(min+min2);
        }

        return cost;
    }
}
