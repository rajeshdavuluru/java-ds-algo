package singleLinkedLists;

public class SingleLinkedListOps {

    public static void main(String[] x) {
        System.out.println("Hello SingleLinkedListOps !!!");

        SingleLinkedListNode head = new SingleLinkedListNode(1);

        SingleLinkedListNode node1 = new SingleLinkedListNode(2);
        head.next = node1;

        SingleLinkedListNode node2 = new SingleLinkedListNode(3);
        node1.next = node2;

        SingleLinkedListNode node3 = new SingleLinkedListNode(4);
        node2.next = node3;

        SingleLinkedListNode node4 = new SingleLinkedListNode(5);
        node3.next = node4;

        SingleLinkedListNode node5 = new SingleLinkedListNode(6);
        node4.next = node5;

        SingleLinkedListNode node6 = new SingleLinkedListNode(7);
        node5.next = node6;

        SingleLinkedListNode node7 = new SingleLinkedListNode(8);
        node6.next = node7;

        SingleLinkedListNode node8 = new SingleLinkedListNode(9);
        node7.next = node8;

        node8.next = null;

       // reverseLinkedList(head);

        getMiddleElement(head);
    }

    private static void reverseLinkedList(SingleLinkedListNode head) {

        SingleLinkedListNode prev = null, next = null, node = head;

        while (node != null) {
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }

        head = prev;
        node = head;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

    }

    private static void getMiddleElement(SingleLinkedListNode head) {

        SingleLinkedListNode node = head, prev = head, mid = null;
        int count = 1;

        while (node != null) {
            if (count % 2 != 0) {
                mid = prev;
                prev = prev.next;
            }

            node = node.next;
            count++;
        }

        System.out.println(mid.val);
    }
}
