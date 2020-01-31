package search;

import java.util.Arrays;

/**
 *   Time Complexity : O(n)
 */
public class LinearSearch {

    public static void main(String[] args) {
        System.out.println("Hello LinearSearch!");

        int[] input = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        int x = 100;

        /**
         * Using streams
         */
        boolean found = Arrays.stream(input).filter(value -> value == x).findAny().isPresent();
        if(found)
            System.out.println("Element Found");
        else System.out.println("Element Not Found");

        /**
         * Using loops
         */
        found = false;
        for(int i : input){
            if(i == x){
                found = true;
            }
        }
        if(found)
            System.out.println("Element Found");
        else System.out.println("Element Not Found");


    }



}
