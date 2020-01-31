package tree;

public class BinaryTreeDiameter {

    public static void main(String[] x){
        System.out.println("Hello BinaryTreeDiameter!!!");


        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.right = new BinaryTreeNode(4);
        root.right.left = new BinaryTreeNode(5);
        root.right.right = new BinaryTreeNode(6);
        root.right.left.left = new BinaryTreeNode(7);
        root.right.left.right = new BinaryTreeNode(8);
        root.right.left.right.left = new BinaryTreeNode(9);

        getDiameter(root);
    }

    private static void getDiameter(BinaryTreeNode root){

        int diameter = 0;

        diameter = maxTreeHeight(root.left)+maxTreeHeight(root.right)+1;
        System.out.println("diameter:- "+ diameter);
    }

    private static int maxTreeHeight(BinaryTreeNode node){

        if(node == null) return 0;
        int leftHeight = maxTreeHeight(node.left);
        int rightHeight = maxTreeHeight(node.right);

        return Math.max(leftHeight, rightHeight)+1;
    }
}
