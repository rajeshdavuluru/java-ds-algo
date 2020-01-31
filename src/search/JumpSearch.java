package search;

import java.util.Arrays;

/**
 *  1. Array should be sorted
 *  2. Time Complexity:  O(sqrt(n))
 *  3. Space Complexity:
 */
public class JumpSearch {

    public static void main(String[] args){

        System.out.println("Hello JumpSearch!!!");
        int[] input = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170, 9};
        int x = 50, step = (int)Math.round(Math.sqrt(input.length));

        // Sorting the array using streams
        // {9, 10, 20, 30, 50, 60, 80, 100, 110, 130, 170};
        int[] sortedArr = Arrays.stream(input).sorted().toArray();

        boolean found = doJumpSearch(sortedArr, x, step,  0, step );
        if(found) System.out.println("Element Found");
        else System.out.println("Element Not Found");
    }

    private static boolean doJumpSearch(int[] input, int x, int step, int startIndex, int endIndex){

        boolean found = false;
        if(input.length >= endIndex){
            if(input[endIndex] == x){
                found = true;
            }else if(input[endIndex] < x){
                return doJumpSearch(input, x, step, startIndex+step,  endIndex+step);
            }else {
                for(int i=endIndex-1; i>=startIndex; i--){
                    if(input[i] == x)
                        found = true;
                }
            }
        }
        return found;
    }
}
