package javacourse.DSA.StacksQueues;

public class QueueMain {
    public static void main(String[] args) {
        CustomQueue que = new CustomQueue();
        que.insert(0);
        que.insert(1);
        que.insert(2);
        que.insert(3);
        que.display();
        System.out.println();
        try{
            que.remove();
        }
        catch(Exception e)
        {

        }
        que.display();

    }
}
