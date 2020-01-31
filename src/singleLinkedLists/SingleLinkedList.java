package singleLinkedLists;

public class SingleLinkedList {

    public static void main(String[] x) {
        System.out.println("Hello SingleLinkedList!!!");

        SingleLinkedListNode node1 = new SingleLinkedListNode(1);

        SingleLinkedListNode node2 = new SingleLinkedListNode(2);
        node1.next = node2;
        SingleLinkedListNode node3 = new SingleLinkedListNode(3);
        node2.next = node3;
        SingleLinkedListNode node4 = new SingleLinkedListNode(4);
        node3.next = node4;
        SingleLinkedListNode node5 = new SingleLinkedListNode(5);
        node4.next = node5;
        node5.next = null;

        System.out.println("Original List: ");
        printLinkedList(node1);

        System.out.println("List after removed an element: ");
        removeNthNode(node1, 3);

        System.out.println("List after added an element: ");
        addNodeNthPlace(node1, 2, 0);

        System.out.println("Reverse the Linked List: ");
        reverseLinkedList(node1);

    }

    private static void addNodeNthPlace(SingleLinkedListNode head, int n, int val) {

        SingleLinkedListNode newNode = new SingleLinkedListNode(val);


        if (n == 0) {
            newNode.next = head;
            head = newNode;
        } else if (n > 0) {
            SingleLinkedListNode cur = head;
            while (cur != null && n >= 0) {
                if (n == 0) {
                    newNode.next = cur.next;
                    cur.next = newNode;
                } else {
                    cur = cur.next;
                }

                n--;
            }
        }

        printLinkedList(head);
    }

    private static void printLinkedList(SingleLinkedListNode node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    private static void removeNthNode(SingleLinkedListNode head, int n) {

        SingleLinkedListNode cur = head, prev = head;
        while (n-- > 0) {
            cur = cur.next;
        }

        while (cur.next != null) {
            cur = cur.next;
            prev = prev.next;
        }

        prev.next = prev.next.next;

        printLinkedList(head);
    }

    private static void reverseLinkedList(SingleLinkedListNode head) {

        SingleLinkedListNode prev = null, cur = head, next = null;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        head = prev;
        printLinkedList(head);
    }

}
