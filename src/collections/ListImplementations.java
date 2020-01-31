package collections;

import java.util.*;

public class ListImplementations {

    public static void main(String[] x){
        System.out.println("Hello ListImplementations!!!");

        /**
         * 1) Not Synchronized
         * 2) initial capacity :10
         * 3) if you try to structurally modify the ArrayList after iterator opened, it will give ConcurrentModificationException
         * 4) Insertion order
         * 5) Allow Null values
         *
         * 6) ArrayList internally uses Object[] (Array of Objects),  it stores only Objects, don't stores primitives
         * 7) if it reaches to the maximum capacity, internally it creates the new array and copy all the elements
         *
         *              ex: Size of the ArralyList is 10, it will increment (10 + (10>>1)) = 10+5 = 15
         *
         * Time Complexity:
         *
         *   Insertion add(index, value):     O(n)        -- Need to move the all elements to right side
         *              add(value) :    O(1)        -- always add at the end of the list
         *   Delete:        O(n)        -- Need to move the all elements to left side
         *   Search:        O(n)        -- Need to iterate all the elements and find the require element
         *
         * Space Complexity: O(n)      -- Need space to store all the elements
         *
         *
         */
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("value1");
        arrayList.add("value2");
        arrayList.add("value3");
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add("value4");  // Will add at the end
        arrayList.add(0, "value5");  //it will move all the elements to right side

        arrayList.set(1, "value6");   // replace the value at the specified index
        arrayList.remove(3);   // delete the element from specified index and move the elements to left side

        System.out.println("\nArrayList: ");
        printList(arrayList);


        /**
         * 1) Synchronized
         * 2) Initial Capacity: 10
         * 3) if you try to structurally modify the ArrayList after iterator opened, it will give ConcurrentModificationException
         * 4) Insertion order
         * 5) Allow Null Values
         *
         * 6) If Vector reaches maximum size.. it increment by "capacityIncrement" ..if capacityIncrement is <=0  then it will double the size of vector
         *       Vector(initialCapacity, capacityIncrement)
         *
         * Time Complexity:
         *
         *   Insertion add(index, value):     O(n)        -- Need to move the all elements to right side
         *              add(value) :    O(1)        -- always add at the end of the list
         *   Delete:        O(n)        -- Need to move the all elements to left side
         *   Search:        O(n)        -- Need to iterate all the elements and find the require element
         *
         * Space Complexity: O(n)      -- Need space to store all the elements
         */
        Vector<String> vector = new Vector<>();
        vector.add("value1");
        vector.add("value2");
        vector.add("value3");
        vector.add(null);
        vector.add(null);

        vector.set(1, "value4");
        vector.remove(2);

        System.out.println("\nVector: ");
        printList(vector);



        /**
         *  Stack Extends Vector
         * 1) Last-in-First-Out(LIFO)
         * 2) Synchronized
         * 3) Allow Null Values
         * 4) extends vector
         *
         * 5) pop()   -- get the element from the stack and remove it
         *    peek() -- get the element from the stack and won't remove element
         *
         * Time Complexity:
         *
         *   Insertion:     O(1)        -- insert the element at the TOP of the stack
         *   Delete:        O(1)        -- Delete the element from the TOP
         *   Search:        O(n)        -- Need to POP all the elements and find the require element
         *
         * Space Complexity: O(n)
         *
         *
         */
        Stack<String> stack = new Stack<>();
        stack.push("value1");
        stack.push("value2");
        stack.push(null);
        System.out.println("\nStack: ");

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        /**
         *
         *  LinkedList implements List and Deque, Deque extends Queue. that is the reason LinkedList implemented all these methods
         * 1) Not Synchronized
         * 2) Double Linked list
         *
         * Time Complexity:
         *
         *   Insertion:     O(1)    -- unlink the element and link prev element to next.next
         *   Delete:        O(1)    -- unlink the element and link prev element to next.next
         *   Search:        O(n)    -- Need to iterate all the elements and find the require element
         *
         * Space Complexity: O(n)   -- Need space to store all the elements+ their prev and next addresses .
         *                                  that means  O(3n) , we don't consider constants that why O(n)
         */
        LinkedList<String> linkedList = new LinkedList<>();


        linkedList.add("value3");  // Add the element at the end of the list
        linkedList.add(2, "value4");  // add the element at the specified index

        linkedList.remove("value1");  // removed the first occurrence of the specified element
        linkedList.remove(2);  // removes the element from the specified location

        linkedList.addFirst("addFirstElement");  // add the element at the begining of the list
        linkedList.addLast("addLastElement");  // add the element at the end of the list

        linkedList.removeFirst();  // remove the first element from the list. NoSuchElementException if this list is empty
        linkedList.removeLast();   // remove the last element from the list. NoSuchElementException if this list is empty

        linkedList.getFirst();  // get first element from the list. NoSuchElementException if this list is empty
        linkedList.getLast();   // get last element from the list. NoSuchElementException if this list is empty

        linkedList.get(2);   // return the element from the specified position
        linkedList.set(3, "replaceElement");  // replace the element from the specified position

        //Queue Operations

        linkedList.peek();  // get the first element and wont remove the element from the list. returns NULL if list is empty
        linkedList.element(); // get the first element and wont remove the element from the list, returns NoSuchElementException  if list is empty

        linkedList.poll();  // get the first element and remove from the list, returns NULL if list is empty
        linkedList.remove(); // get the first element and remove from the list, returns NoSuchElementException  if list is empty

        linkedList.offer("offerElement");  // add the element at the end of the list

        //Deque Operations  -- Double Ended Queue

        linkedList.offerFirst("offerFirst");  // add element at the first position
        linkedList.offerLast("offerLast"); // add element at the last position

        linkedList.peekFirst();  // get the first element and wont remove the element from the list. returns NULL if list is empty
        linkedList.peekLast();  // get the lasr element and wont remove the element from the list. returns NULL if list is empty

        linkedList.pollFirst();  // get the first element and remove from the list, returns NULL if list is empty
        linkedList.pollLast();   // get the last element and remove from the list, returns NULL if list is empty

        linkedList.push("push");   //add element to stack represented by list means add the element at the first position
        linkedList.pop();    //pops the first element from the stack represented by list means removes the first element

        System.out.println("\nLinkedList: ");
        while(!linkedList.isEmpty()){
            System.out.println(linkedList.pop());
        }

    }

    private static void printList(List list){
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
