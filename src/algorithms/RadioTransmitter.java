package algorithms;

import java.util.Arrays;

public class RadioTransmitter {
    public static void main(String[] a){
        System.out.println("Hello RadioTransmitter!!!");
        int[] input = {7, 2, 4, 6, 5, 9, 12, 11 };
        int distance = 2, count=0, previous = 0;
        input = Arrays.stream(input).sorted().toArray();
        Arrays.stream(input).forEach(System.out::println);

        for(int i=0; i< input.length-1; i++){
            if(input[i]+distance == input[i+1] ){
                count+=1; previous = input[i]+distance;
            }
          /* int j = input[i]+distance;
            for(int k= i+1; k<input.length-1; k++){
                if(j == input[k]){
                    count+=1; previous = input[k];
                }
            }*/
        }


    }
}
