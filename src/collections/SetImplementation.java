package collections;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetImplementation {
    public static void main(String[] x){
        System.out.println("Hello SetImplementation!!!");

        /**
         * 1) Initial Capacity =16, Load Factor = .75. if you want you can change the these params
         * 2) Internally uses the HashMap, but Map required key value pairs, but we are setting only value
         *      internally HashSet creates a constant dummy object and put as a puts as a value
         *
         *      Code Snippet: private static final Object PRESENT = new Object();
         *       public boolean add(E e) {
         *         return map.put(e, PRESENT)==null;
         *     }
         * 3) No Guarantee the order of the iteration of elements over the time
         * 4) if we try to do operations except remove after iterator opened it will give ConcurrentModificationError
         * 5) how to calculate LoadFactor
         *          loadfactor = number of elements in the HashSet/ initial capacity of the hashset
         * 6) Its not synchronised
         * 7) No Duplicates allowed because value will be stored as a key in HashMap, HashMap wont allow duplicate keys
         * 8) Allows one null value
         *
         * Time Complexity:
         *
         *   Insertion:   Avg-O(1),  Worst-O(log n)
         *   Delete:      Avg-O(1),  Worst-O(log n)
         *   Search:      Avg-O(1)   Worst-O(log n)
         *
         * Space Complexity: O(n)
         */
        HashSet hashSet = new HashSet();

        hashSet.add(10);
        hashSet.add(1);
        hashSet.add(9);
        hashSet.add(21);
        hashSet.add(9);
        hashSet.add(null);
        System.out.println("HashSet:-"+hashSet);

        /**
         * 1) Initial Capacity & Load Factor is not required
         * 2) Internally uses the HashMap, but Map required key value pairs, but we are setting only value
         *      internally HashSet creates a constant dummy object and put as a puts as a value
         *
         *      Code Snippet: private static final Object PRESENT = new Object();
         *       public boolean add(E e) {
         *         return map.put(e, PRESENT)==null;
         *     }
         * 3) Elements will store in order
         * 4) if we try to do operations except remove after iterator opened it will give ConcurrentModificationException
         * 5) Its not synchronised
         * 6) No Duplicates allowed, because value will be stored as a key in HashMap, HashMap wont allow duplicate keys
         * 7) No Null values allowed
         * 8) wont use the HashCode and Equals, it uses compare &compareTO
         *
         * Time Complexity:
         *
         *   Insertion:   Avg-O(log n)
         *   Delete:      Avg-O(log n)
         *   Search:      Avg-O(log n)
         *
         * Space Complexity: O(n)
         */

        TreeSet treeSet = new TreeSet();
        treeSet.add(10);
        treeSet.add(1);
        treeSet.add(9);
        treeSet.add(21);
        treeSet.add(9);
        // treeSet.add(null);  // null pointer exception
        System.out.println("TreeSet:-"+treeSet);


        /**
         * 1) Initial Capacity =16, Load Factor = .75. if you want you can change the these params
         * 2) Internally uses the Hash table & DoubleLinkedList, but Map required key value pairs, but we are setting only value
         *      internally HashSet creates a constant dummy object and put as a puts as a value
         *
         *      Code Snippet: private static final Object PRESENT = new Object();
         *       public boolean add(E e) {
         *         return map.put(e, PRESENT)==null;
         *     }
         * 3) Guarantee the insertion order of the iteration of elements over the time
         * 4) if we try to do operations except remove after iterator opened it will give ConcurrentModificationError
         * 5) how to calculate LoadFactor
         *          loadfactor = number of elements in the HashSet/ initial capacity of the hashset
         * 6) Its not synchronised
         * 7) No Duplicates allowed because value will be stored as a key in HashMap, HashMap wont allow duplicate keys
         * 8) Allows one null value
         *
         * Time Complexity:
         *
         *   Insertion:   Avg-O(1),  Worst-O(log n)
         *   Delete:      Avg-O(1),  Worst-O(log n)
         *   Search:      Avg-O(1)   Worst-O(log n)
         *
         * Space Complexity: O(n)
         */
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(10);
        linkedHashSet.add(1);
        linkedHashSet.add(9);
        linkedHashSet.add(21);
        linkedHashSet.add(null);
        linkedHashSet.add(21);
        System.out.println("LinkedHashSet:-"+linkedHashSet);
    }
}
