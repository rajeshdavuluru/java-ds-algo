package search;

import java.util.Arrays;

/**
 *   1. Array should be sorted
 *   2. Time complexity : O(log n)  - https://hackernoon.com/what-does-the-time-complexity-o-log-n-actually-mean-45f94bb5bfbf
 *   3. Space Complexity:
 */
public class BinarySearch {

    public static void main(String[] args) {
        System.out.println("Hello BinarySearch!");

        int[] input = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170, 9};
        int x = 100;

        // Sorting the array using streams
        // {10, 20, 30, 50, 60, 80, 100, 110, 130, 170};
        int[] sortedArr = Arrays.stream(input).sorted().toArray();

        boolean found = doBinarySearch(sortedArr, x, 0, sortedArr.length-1);
        if(found)
            System.out.println("Element Found");
        else System.out.println("Element Not Found");
    }

    private static boolean doBinarySearch(int[] input, int x, int startIndex, int endIndex){


        boolean found = false;
        if(endIndex >= startIndex ){

            int middleIndex = (startIndex + endIndex)/2;
            if(input[middleIndex] == x){
                return found = true;
            }else if(input[middleIndex] > x){
                return doBinarySearch(input, x, startIndex, middleIndex-1);
            }else{
                return doBinarySearch(input, x,  middleIndex +1, endIndex);
            }
        }
        return found;
    }

}
