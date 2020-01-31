package dailyCodingProblem;

import java.util.Arrays;

/**
 * Day #4
 */
public class FirstMissingIntegerInArray {
    public static void main(String[] x) {
        System.out.println("Hello FirstMissingIntegerInArray!!!");

        int[] input = {3, 4, -1, 1,1, 5};
        System.out.println(doFirstMissingIntegerInArray(input));
    }

    private static int doFirstMissingIntegerInArray(int[] input) {

        int[] sortedArr = Arrays.stream(input).sorted().toArray();

        for (int i = 0; i < sortedArr.length; i++) {
            if (sortedArr[i] < 0) continue;
            else if ((i + 1) < sortedArr.length) {
                if (sortedArr[i] + 1 != sortedArr[i + 1])
                    return sortedArr[i] + 1;
            } else return sortedArr[i] + 1;
        }

        return 0;
    }
}
