package tree;

public class BinarySearchTree {
    public static void main(String[] x) {
        System.out.println("Hello BinarySearchTree!!!");

        int[] preOrderInput = {10, 5, 1, 7, 40, 35, 50};

        BinaryTreeNode root = constructBSTwithPreOrderData(preOrderInput, 0, preOrderInput[0]);
        printPreOrderTraversal(root, "root");
    }


    private static void printPreOrderTraversal(BinaryTreeNode root, String side) {

        if (root == null) return;

        System.out.println(side+" : "+root.val);
        printPreOrderTraversal(root.left, "left");
        printPreOrderTraversal(root.right, "right");
    }

    /**
     * 1) first value is the root
     * 2) find the first greater value in the array
     */
    private static BinaryTreeNode constructBSTwithPreOrderData(int[] preOrderInput, int startIndex, int position) {

        BinaryTreeNode root = null;
        if (startIndex < preOrderInput.length) {
            root = new BinaryTreeNode(preOrderInput[startIndex]);
            if (preOrderInput[startIndex] <= position)
                root.left = constructBSTwithPreOrderData(preOrderInput, startIndex + 1, preOrderInput[startIndex]);
            else if (preOrderInput[startIndex] > position)
                root.right = constructBSTwithPreOrderData(preOrderInput, startIndex + 1, preOrderInput[startIndex]);
        }

        return root;

    }
}
