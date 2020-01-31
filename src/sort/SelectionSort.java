package sort;

public class SelectionSort {

    public static void main(String[] x){
        System.out.println("Hello SelectionSort!!!");
        int[] input = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170, 9};
        doSelectionSort(input);
        System.out.println("Sorted Array: ");
        for(int i = 0; i< input.length; i++){
            System.out.println(input[i]);
        }
    }

    private static void doSelectionSort(int[] input){

        int minIndex = 0, tempSwap = 0;

        for(int i = 0; i< input.length; i++){
            minIndex = i;
            for(int j = i+1; j < input.length; j++){
                if(input[i] > input[j])
                    minIndex  = j;
            }

            tempSwap = input[i];
            input[i] = input[minIndex];
            input[minIndex] = tempSwap;

        }
    }
}
