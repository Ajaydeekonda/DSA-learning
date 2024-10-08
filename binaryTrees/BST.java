package javacourse.DSA.binaryTrees;

// import java.util.Scanner;
public class BST {
    private Node root;

    private class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value)
        {
            this.value= value;
        }

        private int getValue()
        {
            return this.value;
        }
    }

    public BST()
    {
          
    }

    public int height()
    {
        return height(root);
    }

    private int heightOf(Node node)
    {
        if(node == null)
        {
            return 0;
        }
        
        int lheight = heightOf(node.left);
        int rheight = heightOf(node.right);
        if(lheight > rheight)
        {
            return lheight+1;
        }
        else{
           return rheight+1;
        }
    }

    public int height(Node node)
    {
        if(node == null)
        {
            return -1;
        }

        return node.height;
    }

    public boolean isEmpty()
    {
        return root==null;
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

        System.out.println(details + node.getValue());

        display(node.left ,"Left child of"+ node.getValue()+":" );
        display(node.right ,"Right child of"+ node.getValue()+":" );

    }

    public void insert(int value)
    {
        root = insert(value, root);

    }

    private Node insert(int value,Node node)
    {
        if(node == null)
        {
            node = new Node(value);
            return node;
        }

        if(value<node.getValue())
        {
            node.left = insert(value, node.left);
        }
        if(value > node.getValue())
        {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left),height(node.right))+1;

        return node;
    }

    public void populate(int [] nums)
    {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public boolean Balanced()
    {
        return Balanced(root);
    }
   
    private boolean Balanced(Node node)
    {
        if(node == null)
        {
            return true;
        }

        return Math.abs(height(node.left)-height(node.right))<=1 && Balanced(node.left) && Balanced(node.right);
    } 

    public void balPopulate(int [] nums)
    {
        balPopulate(nums,0,nums.length-1);
    }

    private void balPopulate(int [] nums,int start,int end)
    {
        if(start>end)
        {
            return;
        }
        int middle =start + (end- start)/2;

        this.insert(nums[middle]);
        balPopulate(nums,start,middle-1);
        balPopulate(nums,middle+1,end);
    }

    public void preOrder()
    {
        preOrder(root);
    }

    private void preOrder(Node node)
    {
        if(node == null)
        {
            return;
        }
        System.out.println(node.getValue());
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder()
    {
        inOrder(root);
    }

    private void inOrder(Node node)
    {
        if(node == null)
        {
            return;
        }
        inOrder(node.left);
        System.out.println(node.getValue());
        inOrder(node.right);
    }

    public void postOrder()
    {
        postOrder(root);
    }

    private void postOrder(Node node)
    {
        if(node == null)
        {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.getValue());
        
    }

    public void bfs()
    {
        int h = root.height;
        for(int i=0;i<=h;i++)
        {
            printLevelOrder(root,i);
        }
    }

    private void printLevelOrder(Node node,int level)
    {
        if(node == null)
        {
            return;
        }
        if(level == 0)
        {
            System.out.println(node.value);
            return;
        }
        else{
            printLevelOrder(node.left, level-1);
            printLevelOrder(node.right, level-1);
        }
    }
    
}


// this is the insert method I have coded.

/*public void insert(int value) {
    root = insert(root, value);
}

private Node insert(Node node, int value) {
    if (node == null) {
        return new Node(value);
    }

    if (value < node.getValue()) {
        node.left = insert(node.left, value);
    } else {
        node.right = insert(node.right, value);
    }

    return node;
}*/