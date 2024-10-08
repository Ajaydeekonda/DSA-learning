package javacourse.DSA.llist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(0);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(4);
        list.insertLast(5);
        list.insertAt(3, 5);
        list.display();
        // System.out.println(list.getSize());
        // // System.out.println( list.deleteLast());
        // // System.out.println(list.deleteFirst()); 
        // // list.deleteAt();
        System.out.println(list.deleteAt(5)); 
        list.display();
        // System.out.println(list.getSize());

        // System.out.println(list.find(0));

        // DblList dblist = new DblList();
        // dblist.insertFirst(0);
        // dblist.insertFirst(1);
        // dblist.insertFirst(2);
        // dblist.insertLast(4);
        // dblist.insertLast(5);
        // dblist.insertAt(3, 3);
        // dblist.insertAt(6, 3);
        // System.out.println(dblist.deleteFirst());
        // System.out.println(dblist.deleteFirst());
        // System.out.println(dblist.deleteLast());
        // System.out.println(dblist.deleteAt(2));






        // dblist.display();
        
    }
    
}
