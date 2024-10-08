package javacourse.DSA.llist;

public class DblList {

    private Node head;
    private Node tail;
    private int size;

    DblList()
    {
        this.size =0;
    }

    public int getSize()
    {
        return size;
    }
    
    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.prev=null;
        if(head == null)
        {
            node.next =null;
            head = node;
            tail = node;
            return;
        }
        node.next= head;
        head.prev=node;
        head=node;
        size+=1;
    }

    public void insertLast(int val)
    {
        Node node = new Node(val);
        if(tail == null)
        {
            insertFirst(val);
            return;
        }
        node.next=null;
        tail.next=node;
        node.prev = tail;
        tail = tail.next;
        size+=1;
    }

    public void insertAt(int val,int index)
    {
        if(index>size)
        {
            System.out.println("Out of bounds");
            return;
        }
        if(index ==0)
        {
            insertFirst(val);
            return;
        }
        if(index==size)
        {
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++)
        {
            temp= temp.next;
        }
        Node node = new Node(val, temp.next,temp);
        temp.next.prev=node;
        temp.next = node;
        size+=1;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public int deleteFirst()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
            return -1;
        }
        int val = head.val;
        if(head.next==null)
        {
            head = null;
            tail = null;
            size-=1;
            return val;
        }
        head = head.next;
        head.prev = null;
        size-=1;
        return val;
    }

    public int deleteLast()
    {
        if(head == null)
        {
            System.out.println("List is Empty");
            return -1;
        }
        Node temp = head;
        while(temp.next.next!=null)
        {
            temp= temp.next;
        }
        int val =temp.next.val;
        temp.next=null;
        tail=temp;
        size-=1;
        return val;
    }

    // public int deleteAt(int index)
    // {
    //     if(index>size)
    //     {
    //         return -1;
    //     }
    //     if(index==0)
    //     {
    //         deleteFirst();
    //     }
    //     if(index==size-1)
    //     {
    //         deleteLast();
    //     }
    //     Node temp = head;
    //     for(int i=1;i<index;i++)
    //     {
    //         temp= temp.next;
    //     }
    //     Node temp2 = temp.next;
        
    //     size-=1;
    //     return val;

    // }
    


    class Node
    {
        int val;
        Node next;
        Node prev;

        public Node(int val)
        {
            this.val = val;
        }

        public Node(int val,Node next,Node prev)
        {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }
}
