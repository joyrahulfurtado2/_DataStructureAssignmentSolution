package question_2;

public class Driver {

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.root = binarySearchTree.newNode(50);
        binarySearchTree.root.left = binarySearchTree.newNode(30);
        binarySearchTree.root.right = binarySearchTree.newNode(60);
        binarySearchTree.root.left.left = binarySearchTree.newNode(10);
        binarySearchTree.root.right.left = binarySearchTree.newNode(55);

        binarySearchTree.GenerateSkewedTree(binarySearchTree.root);
        binarySearchTree.DisplaySkewedTree();

    }

}
