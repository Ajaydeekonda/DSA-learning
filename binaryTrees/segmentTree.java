package javacourse.DSA.binaryTrees;

public class segmentTree {

        public static void main(String[] args) {
            int [] arr = {1,2,3,4,5};

            segmentTree tree = new segmentTree(arr);
            // tree.display();
            // System.out.println();
            // System.out.println();
            // System.out.println();
            // System.out.println();

            // tree.update(1,5);
            // tree.display();
            System.out.println(tree.query(-0, 4));
        }

   private static class Node
    {
        int data;
        int start;
        int end;
        Node left;
        Node right;

        public Node(int start,int end)
        {
            this.start = start;
            this.end = end;
        }

        public int getData()
        {
            return this.data;
        }

        public String toString()
        {
            return "Data : "+ this.data + " "+ " start:"+ this.start + " "+ "end:"+ this.end;
        }
        
    }

    private Node root;

    public segmentTree(int [] arr)
    {
        this.root = constructTree(arr,0,arr.length-1,root);
    }

    private Node constructTree(int [] arr,int start,int end,Node node)
    {
        if(start == end)
        {
            node = new Node(start,end);
            node.data = arr[start];
            return node;
        }

        node = new Node(start,end);
        int middle = start + (end - start )/2;

        node.left = constructTree(arr, start, middle, node.left);
        node.right = constructTree(arr, middle+1, end, node.right);

        node.data = (node.left.data)+ (node.right.data);
        
        return node;
    }



    public void display()
    {
        display(root,"Root Node:");
    }
    
    private void display(Node node,String details)
    {
        if(node == null)
        {
            return;
        }

        System.out.println(details + node.toString());

        display(node.left ,"Left child of"+ node.getData()+":" );
        display(node.right ,"Right child of"+ node.getData()+":" );

    }

    public int query( int start, int end)
    {
        return this.query(this.root,start, end);
    }

    private int query(Node node, int start , int end)
    {
        if(node.start>= start && end<= node.end)
        {
            return node.data;
        }
        else if(start < node.start || end > node.end)
        {
            return 0;
        }
        else{
            return this.query(node.left,start,end)+ this.query(node.right,start,end);
        }
    }

    public void update( int index,int value)
    {
        this.root.data = update(this.root, index, value);
    }

    private int update(Node node, int index,int value)
    {
        if(index >=node.start && index <= node.end)
        {
            if(index == node.start && index == node.end)
            {
                node.data = value;
                return node.data;
            }
            else
            {
                int leftAns = update(node.left,index,value);
                int rightAns = update(node.right,index,value);
                node.data = leftAns + rightAns;
                return node.data;
            }
        }

        return node.data;
    }
    
}


/*public void update( int value,int index)
    {
        this.root = update(value,this.root,index);
    }

    private Node update ( int value , Node node ,int index)
    {

        int middle = node.start + (node.start - node.end)/2;

        if(index == middle)
        {
            node.data = value;
            return node;
        }

        if(index < middle)
        {
            node.left = update(value,node.left,index);
        }
        else
        {
            node.right = update(value, node.right,index);
        }

        node.data = node.left.data + node.right.data;

        return node;
        
    }*/