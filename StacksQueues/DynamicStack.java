package javacourse.DSA.StacksQueues;

public class DynamicStack extends stack
{
    public DynamicStack()
    {
        super();
    }

    public DynamicStack(int size)
    {
        super(size);
    }

    @Override
    public boolean push(int val) {
        if(this.isFull())
        {
            int [] temp = new int[2*getSize()];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }

        return super.push(val);
    }
}
