package algorithms;

public class ConnectedCellsInGrid {

    public static void main(String[] x) {
        System.out.println("Hello ConnectedCellsInGrid!!!");

        int[][] input = {
                {0, 1, 0, 0},
                {0, 1, 1, 0},
                {0, 0, 1, 0},
                {1, 0, 1, 1}};
        getConnectedCellGridLength(input);
    }

    private static void getConnectedCellGridLength(int[][] input) {
        int length = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                int temp =  connectedCellsLength(input, i, j);
                System.out.println(temp);
                length = Math.max(length, temp);
            }
        }

        System.out.println("connected Grid Length: "+ length);
    }

    private static int connectedCellsLength(int[][] input, int i, int j) {

        if (i < 0 || j < 0 || i >= input.length || j >= input[0].length || input[i][j] == 0) return 0;

        int length = input[i][j]--;

        length += connectedCellsLength(input, i - 1, j);
        length += connectedCellsLength(input, i + 1, j);
        length += connectedCellsLength(input, i, j - 1);
        length += connectedCellsLength(input, i, j + 1);
        length += connectedCellsLength(input, i + 1, j + 1);
        length += connectedCellsLength(input, i - 1, j - 1);
        length += connectedCellsLength(input, i + 1, j - 1);
        length += connectedCellsLength(input, i - 1, j + 1);
        return length;
    }
}
