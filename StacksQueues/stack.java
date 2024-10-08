package javacourse.DSA.StacksQueues;

public class stack
{
    protected int [] data;
    private static final int DEFAULT_SIZE = 10;
    private static int size =0;
    
    int ptr = -1;

    public stack()
    {
        this(DEFAULT_SIZE);
    }

    public stack(int size)
    {
        this.data = new int[size];
    }

    public boolean push(int val)
    {
        if(isFull())
        {

            return false;
        }
        ptr++;
        data[ptr]= val;
        size+=1;
        return true;
        
         
    }

    public int pop()
    {
        if(isEmpty())
        {
            return -1;
        }
        int val = data[ptr];
        ptr--;
        size-=1;
        return val;

    }

    public int peek()
    {
        if(isEmpty())
        {
            return -1;
        }
        return data[ptr];
    }

    public boolean isEmpty()
    {
        return ptr == -1;
    }

    public boolean isFull()
    {
        return ptr == data.length -1;
    }
    public void display()
    {
        int temp = ptr;
        while(temp!=-1)
        {
            System.out.println(data[temp--]);
        }
    }

    public static int getSize()
    {
        return size;
    }



}
