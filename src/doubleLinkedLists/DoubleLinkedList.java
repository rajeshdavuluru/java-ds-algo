package doubleLinkedLists;

public class DoubleLinkedList {

    public static void main(String[] x) {
        System.out.println("Hello DoubleLinkedList!!!");

        DoubleLinkedListNode head = new DoubleLinkedListNode(1);
        head.prev = null;

        DoubleLinkedListNode node2 = new DoubleLinkedListNode(2);
        node2.prev = head;
        head.next = node2;

        DoubleLinkedListNode node3 = new DoubleLinkedListNode(3);
        node3.prev = node2;
        node2.next = node3;

        DoubleLinkedListNode node4 = new DoubleLinkedListNode(4);
        node4.prev = node3;
        node3.next = node4;

        DoubleLinkedListNode node5 = new DoubleLinkedListNode(5);
        node5.prev = node4;
        node4.next = node5;

        node5.next = null;

        System.out.println("Original List: ");
        printDoubleLinkedList(head);
        System.out.println("Node added at first: ");
        insertNodeInNthPosition(head, 6, 0); // Start Postion
        System.out.println("Node added at Nth Position: ");
        insertNodeInNthPosition(head, 7, 2);

        System.out.println("Node delete at first Position: ");
        deleteNodeInNthPosition(head, 0);

        System.out.println("Node delete at Nth Position: ");
        deleteNodeInNthPosition(head, 2);
    }

    private static void printDoubleLinkedList(DoubleLinkedListNode head) {
        DoubleLinkedListNode node = head;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    private static void insertNodeInNthPosition(DoubleLinkedListNode head, int val, int position) {

        DoubleLinkedListNode newNode = new DoubleLinkedListNode(val);
        DoubleLinkedListNode current = head;
        if (position == 0) head = newNode;

        while (current != null && position >= 0) {
            if (position == 0) {
                if (current.prev != null) current.prev.next = newNode;
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev = newNode;
            }

            current = current.next;
            position--;

        }
        printDoubleLinkedList(head);
    }

    private static void deleteNodeInNthPosition(DoubleLinkedListNode head, int position) {

        DoubleLinkedListNode current = head;

        if (position == 0) head = current.next;

        while (current != null && position >= 0) {

            if (position == 0) {
                if (current.prev != null) current.prev.next = current.next;
                current.next.prev = current.prev;
            }

            current = current.next;
            position--;

        }
        printDoubleLinkedList(head);

    }
}
