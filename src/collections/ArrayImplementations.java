package collections;

public class ArrayImplementations {

    public static void main(String[] x) {
        System.out.println("Hello ArrayImplementations");

        /**
         * Time Complexity:
         *
         *   Insertion:     O(n)        -- Need to move the all elements to right side
         *   Delete:        O(n)        -- Need to move the all elements to left side
         *   Search:        O(n)        -- Need to iterate all the elements and find the require element
         *
         * If you insert or delete at the specific index time complexity will be O(1)
         *
         * Space Complexity:  O(n)      -- Need space to store all the elements
         *
         * 1) Arrays will hold primitive data types & Objects
         * 2)
         *
         */
        int[] intArr = new int[21];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;


        System.out.println(10>>1);

        for (int i : intArr) {
            System.out.println(i);
        }


    }
}
