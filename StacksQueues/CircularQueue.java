package javacourse.DSA.StacksQueues;

public class CircularQueue {
    private int [] data;
    private static final int DEFAULT_SIZE = 10;
    private static int size =0;

    int end =0;
    int front =0;
    public CircularQueue()
    {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size)
    {
        this.data = new int[size];
    }

    public boolean isFull()
    {
        return size == data.length;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public boolean insert(int item)
    {
        if(isFull())
        {
            return false;
        }
        if(end==data.length)
        {
            end = end%data.length;
        }
        data[end++] = item;
        size+=1;
        return true;
        
    }

    public int remove(){
        if(isEmpty())
        {
           return -1;
        }

        int removed = data[front++];
        size-=1;
        return removed;
    }

    public int front() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is Empty");
        }
        return data[front];
    }

    public void display()
    {
        for (int i = front; i <end; i++) {
            System.out.print(data[i]+" ");
        }

    }

    
}
