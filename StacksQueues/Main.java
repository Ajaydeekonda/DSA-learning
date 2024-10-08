package javacourse.DSA.StacksQueues;

public class Main {
    
    public static void main(String[] args) {
        stack s = new stack();
        s.push(0);
        s.push(1);
        s.push(2);
        // s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);

        // System.out.println(s.pop());
        s.display();
        System.out.println(s.peek());

        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
        System.out.println(s.Size());
        
    }
}
