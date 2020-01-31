package dailyCodingProblem;

/**
 * Day #2
 */
public class ProductOfAllElements {

    public static void main(String[] x) {
        System.out.println("Hello ProductOfAllElements!!!");

        int[] input = {1, 2, 3, 4, 5};
        int[] finalArr = new int[input.length];

        doProductOfAllElements(input, finalArr);
        for(int i:finalArr)
            System.out.println(i);

    }

    public static void doProductOfAllElements(int[] input, int[] finalArr){
        int product = 1;
        for(int i=0; i<input.length; i++){
            product *=input[i];
        }

        for(int i=0; i<input.length; i++){
            finalArr[i] = product/input[i];
        }
    }
}
