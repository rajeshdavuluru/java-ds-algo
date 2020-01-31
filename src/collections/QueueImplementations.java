package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueImplementations {
    public static void main(String[] x){
        System.out.println("Hello QueueImplementations!!!");

        /**
         * 1) First in First out
         * 2) not synchronized
         * 3) no Null values
         *
         * Time Complexity:
         *
         *   Insertion:   O(log n)
         *   Delete:      O(log n)
         *   Search:      ??
         *
         * Space Complexity: O(n)
         */
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("value1");
        priorityQueue.add("value2");
        //priorityQueue.add(null);  NullPointerException
        priorityQueue.add("Add");  // add element at the tail
        priorityQueue.poll();   // get the first element and remove from the list, returns NULL if list is empty
        priorityQueue.peek();  // get the first element and wont remove the element from the list. returns NULL if list is empty
        priorityQueue.remove();  // get the first element and wont remove the element from the list.throws NoSuchElementException  if list is empty
        priorityQueue.offer("offer"); //insert the element
        priorityQueue.element(); // get the first element and wont remove the element from the list. throws NoSuchElementException if list is empty



        System.out.println("\nPriorityQueue: ");
        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }

        /**
         *  1) Not synchronized
         *  2) no null values
         */
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.push("push");  // Adds the element at the first position
        arrayDeque.pop();

        arrayDeque.pollFirst();
        arrayDeque.pollLast();
        arrayDeque.poll();

        arrayDeque.peek();
        arrayDeque.peekFirst();
        arrayDeque.peekLast();

        arrayDeque.add("add");
        arrayDeque.addFirst("addFirst");
        arrayDeque.addLast("addLast");

        arrayDeque.remove();
        arrayDeque.removeFirst();
        arrayDeque.removeLast();

       // arrayDeque.push(null); NullPointerException
        System.out.println("\nArrayDeque: ");
        while(!arrayDeque.isEmpty()){
            System.out.println(arrayDeque.poll());
        }
    }
}
