package doubleLinkedLists;

public class CircularDoubleLinkedList {
    public static void main(String[] x) {
        System.out.println("Hello CircularDoubleLinkedList!!");

        DoubleLinkedListNode head = new DoubleLinkedListNode(1);


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
        head.prev = node5;
        node5.next = head;

        printDoubleLinkedList(head);

        System.out.println("Insert node at first postion: ");
        insertNodeInNthPosition(head, 6, 0);

        System.out.println("Insert node at Nth postion: ");
        insertNodeInNthPosition(head, 7, 2);
    }

    private static void printDoubleLinkedList(DoubleLinkedListNode head) {
        DoubleLinkedListNode node = head;
        do {
            System.out.println(node.val);
            node = node.next;
        } while (node != head);

    }

    private static void insertNodeInNthPosition(DoubleLinkedListNode head, int val, int postion) {

        DoubleLinkedListNode newNode = new DoubleLinkedListNode(val);
        DoubleLinkedListNode current = head;
        if (postion == 0) head = newNode;

        while (current != head && postion >= 0) {
            if (postion == 0) {
                current.prev.next = newNode;
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev = newNode;
            }

            current = current.next;
            postion--;
        }
        printDoubleLinkedList(head);
    }
}
