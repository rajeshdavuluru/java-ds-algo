package algorithms;

public class RotateMatrixByNinetyDegrees {

    public static void main(String[] x) {
        System.out.println("Hello RotateMatrixByNinetyDegrees!!!");

        int[][] input = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input[0].length; j++) {

                int temp = input[i][j];
                input[i][j] = input[j][i];
                input[j][i] = temp;

            }
        }

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
