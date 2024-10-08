package javacourse.DSA.StacksQueues;

public class MainCircular {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();
        cq.insert(0);
        cq.insert(1);
        cq.insert(2);
        cq.insert(3);
        cq.insert(4);
        cq.display();
        System.out.println();
        System.out.println(cq.remove());
        System.out.println(cq.remove());
        System.out.println(cq.remove());

        cq.display();

        
    }
}
