package tree;

public class AVLTreeNode {

    int data, height;
    AVLTreeNode left = null, right = null;

    public AVLTreeNode(int data) {
        this.data = data;
        height = 1;
    }
}
