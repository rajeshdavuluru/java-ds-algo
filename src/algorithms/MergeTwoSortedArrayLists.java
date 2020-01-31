package algorithms;

import java.util.ArrayList;

public class MergeTwoSortedArrayLists {

    public static void main(String[] x) {
        System.out.println("Hello MergeTwoSortedArrayLists!!!");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(9);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);

        ArrayList<Integer> finalArr = new ArrayList<>();


        mergerArrayLists(list1, list2, 0, 0, finalArr);

        for (Integer i : finalArr) {
            System.out.println(i);
        }
    }

    private static void mergerArrayLists(ArrayList<Integer> list1,
                                         ArrayList<Integer> list2,
                                         int list1Index,
                                         int list2Index,
                                         ArrayList<Integer> finalArr) {

        if (list1Index >= list1.size() && list2Index >= list2.size())
            return;

        if (list1Index >= list1.size()) {
            while (list2Index < list2.size()) {
                finalArr.add(list2.get(list2Index));
                list2Index++;
            }
        }

        if (list2Index >= list2.size()) {
            while (list1Index < list1.size()) {
                finalArr.add(list1.get(list1Index));
                list1Index++;
            }
        }


        while (list1Index < list1.size() && list2Index < list2.size() &&
                list1.get(list1Index) < list2.get(list2Index)) {
            finalArr.add(list1.get(list1Index));
            list1Index++;
        }

        while (list1Index < list1.size() && list2Index < list2.size() &&
                list2.get(list2Index) < list1.get(list1Index)) {
            finalArr.add(list2.get(list2Index));
            list2Index++;
        }

        mergerArrayLists(list1, list2, list1Index, list2Index, finalArr);
    }
}
