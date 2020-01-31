package tree;

import java.util.Stack;

/**
 * 1) In-Order (Left, Root, Right)
 * 2) Pre-Order (Root, Left, Right)
 * 3) Post-Order (Left, Right, Root)
 */
public class BinaryTree {

    public static void main(String[] x) {
        System.out.println("Hello BinaryTree!!!");

        BinaryTreeNode root = new BinaryTreeNode(1);

        BinaryTreeNode left = new BinaryTreeNode(2);
        root.left = left;
        left.right = left.left = null;

        BinaryTreeNode right = new BinaryTreeNode(3);
        root.right = right;
        right.right = right.left = null;

        System.out.println("Recursive In-Order Data: ");
        inOrderTraversal(root);

        System.out.println("Pre-Order Data: ");
        preOrderTraversal(root);

        System.out.println("Post-Order Data: ");
        postOrderTraversal(root);

        System.out.println("Non-Recursive In-Order Data: ");
        inOrderTraversalNonRecursive(root);

        System.out.println("Non-Recursive Pre-Order Data: ");
        preOrderTraversalNonRecursive(root);

        System.out.println("Non-Recursive Post-Order Data: ");
        postOrderTraversalNonRecursive(root);
    }

    /**
     * this is recursive approach
     * In-Order(Left, Root, Right)
     *
     * @param root
     */
    private static void inOrderTraversal(BinaryTreeNode root) {

        if (root == null) return;

        inOrderTraversal(root.left);
        System.out.println(root.val);
        inOrderTraversal(root.right);

    }

    /**
     * this is recursive approach
     * Pre-Order (Root, Left, Right)
     *
     * @param root
     */
    private static void preOrderTraversal(BinaryTreeNode root) {

        if (root == null) return;

        System.out.println(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }

    /**
     * this is recursive approach
     * Post Order(Ledt, Right, Root)
     *
     * @param root
     */
    private static void postOrderTraversal(BinaryTreeNode root) {

        if (root == null) return;

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.val);
    }

    private static void inOrderTraversalNonRecursive(BinaryTreeNode root) {

        Stack<BinaryTreeNode> nodeStack = new Stack<BinaryTreeNode>();
        BinaryTreeNode current = root;

        while (current != null || nodeStack.size() > 0) {
            while (current != null) {
                nodeStack.push(current);
                current = current.left;
            }
            current = nodeStack.pop();
            System.out.println(current.val);

            current = current.right;
        }
    }

    private static void preOrderTraversalNonRecursive(BinaryTreeNode root) {
        Stack<BinaryTreeNode> nodeStack = new Stack<BinaryTreeNode>();
        BinaryTreeNode current = root;

        while (current != null || nodeStack.size() > 0) {
            while (current != null) {
                System.out.println(current.val);
                nodeStack.push(current);
                current = current.left;
            }
            current = nodeStack.pop();
            current = current.right;
        }
    }

    private static void postOrderTraversalNonRecursive(BinaryTreeNode root) {
        Stack<BinaryTreeNode> nodeStack = new Stack<BinaryTreeNode>();
        BinaryTreeNode current = root;

        while (current != null || nodeStack.size() > 0) {


            while (current != null) {
                nodeStack.push(current);
                nodeStack.push(current);
                current = current.left;
            }
            if (nodeStack.empty()) return;
            current = nodeStack.pop();

            if (nodeStack.size() > 0 && nodeStack.peek() == current) {
                current = current.right;
            } else {
                System.out.println(current.val);
                current = null;
            }


        }
    }
}
