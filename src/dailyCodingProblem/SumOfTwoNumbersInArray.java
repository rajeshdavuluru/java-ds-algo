package dailyCodingProblem;

import java.util.ArrayList;
import java.util.List;

/**
 * Day #1
 */
public class SumOfTwoNumbersInArray {

    public static void main(String[] x) {
        System.out.println("Hello SumOfTwoNumbersInArray!!!");

        int[] input = {15, 10, 3, 7};
        int target = 17;

        List<List<Integer>> finalList = new ArrayList<>();

        boolean found = doSumOfTwoNumbersInArray(input, 0, target);
        if (found)
            System.out.println("Found!!!");
        else System.out.println("Not Found!!!");
    }

    private static boolean doSumOfTwoNumbersInArray(int[] input, int start, int target) {

        if (start < input.length) {
            for (int i = start + 1; i < input.length; i++) {
                System.out.println(input[start] + " : " + input[i]);
                if (input[start] + input[i] == target) {
                    return true;
                }

            }
            return doSumOfTwoNumbersInArray(input, start + 1, target);
        }

        return false;
    }
}
