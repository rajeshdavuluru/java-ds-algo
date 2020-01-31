package collections;

import java.awt.event.ItemEvent;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class MapImplementations {

    public static void main(String[] x){

        System.out.println("Hello MapImplementations!!!");

        /**
         * 1) not Synchronized
         * 2) accepts null values and one null key
         * 3) initial capacity : 16, load factor: .75
         * 4) order is not guarantee
         *
         *  Time Complexity:
         *
         *   Insertion:   Avg-O(1),  Worst-O(log n)
         *   Delete:      Avg-O(1),  Worst-O(log n)
         *   Search:      Avg-O(1)   Worst-O(log n)
         *
         * Space Complexity: O(n)
         */
        HashMap<String, String> hashMap = new HashMap<>(2);
        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");
        hashMap.put("key3", "value3");
        hashMap.put(null, "value4");
        hashMap.put("key4", null);
        hashMap.put("key5", null);
        hashMap.put("Key3", "value6");

        System.out.println("\nHashMap: ");
        printMap(hashMap);

        HashMap<String, String> hashMap1 = new HashMap<>(2);
        hashMap1.put("key1", "value1");
        hashMap1.put("key3", "value3");
        hashMap1.put("key2", "value2");
        System.out.println(hashMap1.hashCode());
        System.out.println(hashMap.equals(hashMap1));


        /**
         * 1) Synchronized
         * 2) accepts no null values or keys
         * 3) initial capacity : 16, load factor: .75
         * 4) order is not guarantee
         *
         * Time Complexity:
         *
         *   Insertion:   Avg-O(1),  Worst-O(log n)
         *   Delete:      Avg-O(1),  Worst-O(log n)
         *   Search:      Avg-O(1)   Worst-O(log n)
         *
         * Space Complexity: O(n)
         */
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "value1");
        hashtable.put("key2", "value2");
        hashtable.put("key3", "value3");
        hashtable.put("key4", "value4");
        hashtable.put("key5", "value5");
        hashtable.put("Key5", "value6");
        //hashtable.put("key2", null);  //null pointer exception
        //hashtable.put(null, "");   //null pointer exception

        System.out.println("\nHashTable: ");
        printMap(hashtable);

        /**
         * 1) Not Synchronized
         * 2) accepts null values and one null key
         * 3) initial capacity : 16, load factor: .75
         * 4) insertion order
         * Time Complexity:
         *
         *   Insertion:   Avg-O(1),  Worst-O(log n)
         *   Delete:      Avg-O(1),  Worst-O(log n)
         *   Search:      Avg-O(1)   Worst-O(log n)
         *
         * Space Complexity: O(n)
         */
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("key1", "value1");
        linkedHashMap.put("key2", "value2");
        linkedHashMap.put(null, "value3");
        linkedHashMap.put("key3", null);
        linkedHashMap.put("key4", null);
        System.out.println("\nLinkedHashMap: ");
        printMap(linkedHashMap);

        /**
         * 1) Not Synchronized
         * 2) accepts null values but wont accept null key
         * 3) initial capacity : 16, load factor: .75
         * 4) key, value order
         *
         * Time Complexity:
         *
         *   Insertion:   Avg-O(log n)
         *   Delete:      Avg-O(log n)
         *   Search:      Avg-O(log n)
         *
         * Space Complexity: O(n)
         */
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("key1", "value1");
        treeMap.put("key3", "value3");
        treeMap.put("key2", "value2");
        //treeMap.put(null, "nullkey");
        treeMap.put("nullvalue1", null);
        treeMap.put("nullvalue2", null);

        System.out.println("\nTreeMap: ");
        printMap(treeMap);

        System.out.println("index_1".hashCode());
        System.out.println("index_1".toUpperCase().hashCode());
        //System.out.println("index_2".hashCode());
        //System.out.println("index_11".hashCode());
        //System.out.println("Hello".hashCode() == "World".hashCode());


    }

    private static void printMap(Map map){


        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println("Key: "+entry.getKey() +", Value: "+entry.getValue());
        }
    }
}
