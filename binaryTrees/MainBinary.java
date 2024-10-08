package javacourse.DSA.binaryTrees;


public class MainBinary {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // BinaryTree tree = new BinaryTree();
        // tree.populate(scanner);
        // // tree.display();
        // tree.prettyDisplay();

        BST bst = new BST();
        bst.insert(15);
        bst.insert(10);
        bst.insert(20);
        bst.insert(5);
        bst.insert(12);
        System.out.println(bst.height());
        bst.bfs();


        // int [] arr = {1,2,3,4,5,6,7};
        // bst.balPopulate(arr);
        // bst.display();
        // System.out.println(bst.Balanced());
        // bst.preOrder();
        // bst.inOrder();
        // bst.postOrder();

        // AVL tree = new AVL();
        // for (int i = 0; i < 1000; i++) {
        //     tree.insert(i);
        // }

        // System.out.println(tree.height());


    }
}
