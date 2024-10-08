package javacourse.DSA.Heaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class WeakestSoldier {
    static class Row implements Comparable<Row>
    {
        int soldiers;
        int idx;

        public Row(int soldiers,int idx)
        {
            this.soldiers = soldiers;
            this.idx = idx;
        }
        @Override
        public int compareTo(Row r2)
        {
            if(this.soldiers == r2.soldiers)
            {
                return this.idx - r2.idx;
            }
            else{
                return this.soldiers-r2.soldiers;
            }
        }

        public String toString()
        {
            return this.soldiers + " " + this.idx;
        }
    }

    public static void main(String[] args) {
        int [][] army = {
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,0,0,0}
        };
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for(int i=0;i<army.length;i++)
        {
            int count =0;
            for(int j =0;j<army[i].length;j++)
            {
                if(army[i][j]==1)
                {
                    count++;
                }
            }
            pq.add(new Row(count, i));
        }
        int k =2;
        for(int i =0;i<k;i++)
        {
            System.out.println(pq.remove().toString());
        }
    }


}
