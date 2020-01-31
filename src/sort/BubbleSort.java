package sort;

public class BubbleSort {

    public static void main(String[] x){
        System.out.println("Hello BubbleSort!!!");
        int[] input = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170, 9};
        doRecursiveBubbleSort(input, input.length-1);

        for(int i = 0; i< input.length; i++){
            System.out.println(input[i]);
        }
    }

    private static void  doRecursiveBubbleSort(int[] input, int length){

        if(length == 0)
            return;

        for(int i=0; i< length; i++){
            if(input[i] > input[i+1]){
                int temp = input[i];
                input[i] = input[i+1];
                input[i+1] = temp;
            }
        }
        doRecursiveBubbleSort(input, length-1);
    }

    private static void doIterativeBubbleSort(int[] input){

    }
}
