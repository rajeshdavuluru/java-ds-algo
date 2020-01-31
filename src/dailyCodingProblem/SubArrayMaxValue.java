package dailyCodingProblem;

/**
 * Day #18
 */
public class SubArrayMaxValue {
    public static void main(String[] x) {
        System.out.println("Hello SubArrayMaxValue!!!");

        int[] input = {10, 5, 2, 7, 8, 7};
        int k = 3;
        doSubArrayMaxValue(input, 0, 3);

    }

    private static void doSubArrayMaxValue(int[] input, int start, int subArrLength) {

        int max = 0;
        if ((start + subArrLength) <= input.length) {
            for (int i = start; i < (start + subArrLength); i++) {
                if (max < input[i])
                    max = input[i];
            }
            System.out.println(max);
            doSubArrayMaxValue(input, start + 1, subArrLength);
        }


    }
}
