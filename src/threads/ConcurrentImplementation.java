package threads;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentImplementation {

    public static void main(String[] s){
        System.out.println("Hello ConcurrentImplementation!!!");


        /**
         * 1) one Array on top of it and each index of this additional array represents complete HashMap. This is called Segment.
         *    Segment size calculated by using Concurrency Level
         *    Segment size decides number of threads
         *
         * 2) Initial Capacity : 16  --  intial capacty of the HashMap
         *    LoadFactor: .75f     --
         *    ConcurrencyLevel:     -- this will decide the number of threads
         *
         *          Ex: Concurrency Level =10
         *             number of segments = 2^x >= 10   ==> 2^4 >=10  that means 16 segments
         * 3)  read from same segment/diff segments - without locking we can read from same segment or other segment
         *     Writing to same segment --  if two threads trying to write on same segment, first thread lock the segment
         *                                 and second thread has to wait till first thread completes the operations
         *     Writing to different segments  -- different threads can write different segments without blocking each other
         *
         *
         *  Volatile   --  if a variable declared as Volatile , value of this variable always reads from the main memory
         *    Every thread copy the variables into their local memory that is called ad Working memeoty.
         *    if one thread modified the variable that cannot visible to other threads.
         *
         *  Transient  -- if you declare a variable as Transient, that wont be serialized
         *
         */
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>(10, .75f, 2);

        concurrentHashMap.put("key1", "value1");
        concurrentHashMap.put("key2", "value2");
        concurrentHashMap.put("key3", "value3");
        concurrentHashMap.put("key4", "value4");

        Set<Map.Entry<String, String>> entrySet = concurrentHashMap.entrySet();


        for(Map.Entry<String, String> entry : entrySet){
             System.out.println(entry.getKey()+" - "+entry.getValue());
        }

        Iterator itr = entrySet.iterator();
        while(itr.hasNext()){
            Map.Entry<String, String> entry = (Map.Entry)itr.next();

            System.out.println(entry.getKey() +" - "+ entry.getValue());
        }


    }
}
