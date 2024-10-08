import java.util.Comparator;
import java.util.TreeMap;

public class KnapSack {
    public static void main(String[] args) {
        int [][]items ={
            {50,600},
            {30,120},
            {10,60}
        };
        int capacity = 50;
        System.out.println(value(items,capacity));
    }

    static int value(int[][] items, int capacity) {
        TreeMap<Integer, Integer> ratio = new TreeMap<>(Comparator.reverseOrder());
        int i = 0;
        for (int[] row : items) {
            ratio.put(row[1] / row[0], i);
            i++;
        }
        int value = 0;
        while (capacity != 0 && !ratio.isEmpty()) {
            int index = ratio.get(ratio.firstKey());
            int w = items[index][0]; // Retrieve weight from the items array
            if (w <= capacity) {
                value += items[index][1]; // Add value of the item
                capacity -= w;
            } else {
                value += (items[index][1] * capacity) / w; // Calculate value based on weight and value of item
                capacity = 0;
            }
            ratio.remove(ratio.firstKey());
        }
        return value;
    }
    
}
