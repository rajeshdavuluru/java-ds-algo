package algorithms;

import java.util.ArrayList;
import java.util.List;

public class ArrayPossibleCombination {

    public static void main(String[] x) {
        System.out.println("Hello ArrayPossibleCombination!!!");
        int[] input = {1, 2, 3};

        List<List<Integer>> fullList = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        doArrayPossibleCombination(input, fullList, subList, 0);

        System.out.println(fullList.size());
        System.out.println(fullList);
    }

    private static void doArrayPossibleCombination(int[] input, List<List<Integer>> fullList,
                                                   List<Integer> subList, int startIndex) {
        fullList.add(new ArrayList<>(subList));

        for (int i = startIndex; i < input.length; i++) {
            subList.add(input[i]);
            doArrayPossibleCombination(input, fullList, subList, i + 1);
            subList.remove(subList.size() - 1);
        }
    }
}
