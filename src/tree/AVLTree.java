package tree;

//TODO: Delete a Node
public class AVLTree {

    public static void main(String[] x) {
        System.out.println("Hello AVLTree!!!");

        AVLTreeNode root = insertNode(null, 10);
        root = insertNode(root, 20);
        root = insertNode(root, 30);

        root = insertNode(root, 40);
        root = insertNode(root, 50);
        root = insertNode(root, 25);
        root = insertNode(root, 5);
        printAVLTree(root, "root");
    }

    private static AVLTreeNode insertNode(AVLTreeNode avlTreeNode, int data) {

        if (avlTreeNode == null)
            return new AVLTreeNode(data);

        if (data < avlTreeNode.data)
            avlTreeNode.left = insertNode(avlTreeNode.left, data);
        else if (data > avlTreeNode.data)
            avlTreeNode.right = insertNode(avlTreeNode.right, data);

        avlTreeNode.height = 1 + (getHeight(avlTreeNode.left) > getHeight(avlTreeNode.right)
                ? getHeight(avlTreeNode.left) : getHeight(avlTreeNode.right));

        int balance = getHeight(avlTreeNode.left) - getHeight(avlTreeNode.right);

        if (balance > 1 && data < avlTreeNode.left.data)
            return rightRotate(avlTreeNode);

        if (balance < -1 && data > avlTreeNode.right.data)
            return leftRotate(avlTreeNode);

        if (balance > 1 && data > avlTreeNode.left.data) {
            avlTreeNode.left = leftRotate(avlTreeNode.left);
            return rightRotate(avlTreeNode);
        }

        if (balance < -1 && data < avlTreeNode.right.data) {
            avlTreeNode.right = rightRotate(avlTreeNode.right);
            return leftRotate(avlTreeNode);
        }

        return avlTreeNode;
    }

    private static AVLTreeNode rightRotate(AVLTreeNode avlTreeNode) {

        AVLTreeNode leftNode = avlTreeNode.left;
        AVLTreeNode rightNode = leftNode.right;

        leftNode.right = avlTreeNode;
        avlTreeNode.left = rightNode;

        avlTreeNode.height = (getHeight(avlTreeNode.left) > getHeight(avlTreeNode.right) ? getHeight(avlTreeNode.left) : getHeight(avlTreeNode.right)) + 1;
        leftNode.height = (getHeight(leftNode.left) > getHeight(leftNode.right) ? getHeight(leftNode.left) : getHeight(leftNode.right)) + 1;

        return leftNode;
    }

    private static AVLTreeNode leftRotate(AVLTreeNode avlTreeNode) {

        AVLTreeNode rightNode = avlTreeNode.right;
        AVLTreeNode leftNode = rightNode.left;

        rightNode.left = avlTreeNode;
        avlTreeNode.right = leftNode;

        avlTreeNode.height = (getHeight(avlTreeNode.left) > getHeight(avlTreeNode.right) ? getHeight(avlTreeNode.left) : getHeight(avlTreeNode.right)) + 1;
        rightNode.height = (getHeight(rightNode.left) > getHeight(rightNode.right) ? getHeight(rightNode.left) : getHeight(rightNode.right)) + 1;

        return rightNode;
    }

    private static int getHeight(AVLTreeNode avlTreeNode) {
        if (avlTreeNode == null)
            return 0;
        return avlTreeNode.height;
    }

    private static void printAVLTree(AVLTreeNode avlTreeNode, String treeSide) {

        if (avlTreeNode == null)
            return;

        printAVLTree(avlTreeNode.left, "left");
        System.out.println("Height: " + avlTreeNode.height + " - Data:  " + avlTreeNode.data+" - Side: "+treeSide);
        printAVLTree(avlTreeNode.right, "right");


    }
}
