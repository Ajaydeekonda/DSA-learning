package javacourse.DSA.llist;

public class LL
{
    private Node head;
    private Node tail;

    private int size;

    public LL()
    {
        this.size =0;
    }

    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null)
        {
            tail = head;
        }
        size+=1; 
    }

    public int getSize()
    {
        return this.size;
    }

    public void insertLast(int val)
    {
        Node node = new Node(val);
        node.next = null;
        if(head == null)
        {
            insertFirst(val);
            return;
        }

        tail.next = node;
        tail = node;
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
        Node node = new Node(val, temp.next);
        temp.next=node;
        size+=1;
    }

    public void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("END");
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

    public int deleteAt(int index)
    {
        if(index>size)
        {
            return -1;
        }
        if(index==0)
        {
            deleteFirst();
        }
        if(index==size-1)
        {
            deleteLast();
        }
        Node temp = head;
        for(int i=1;i<index;i++)
        {
            temp= temp.next;
        }
        Node temp2 = temp.next;
        temp.next = temp.next.next;
        int val = temp2.val;
        temp2.next = null;
        size-=1;
        return val;

    }

    public boolean find(int val)
    {
        if(head==null)
        {
            return false;
        }

        Node node = head;
        while(node!=null)
        {
            if(node.val == val)
            {
                return true;
            }
            node = node.next;
        }

        return false;

    }



    
    class Node
    {
        int val;
        Node next;

        public Node(int val)
        {
            this.val = val;
        }

        public Node(int val,Node next)
        {
            this.val = val;
            this.next = next;
        }

    }

    
}


