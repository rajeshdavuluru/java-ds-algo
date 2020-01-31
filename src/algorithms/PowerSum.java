package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSum {

    public static void main(String[] x){
        System.out.println("Hello PowerSum!!!");

        int number = 13, expo = 2, i=1, j=1;

        List<Integer> expoArr = new ArrayList<>();

        while(Math.pow(j, 2)<=number){
            expoArr.add((int) Math.pow(j, 2));
            j++;
        }
        expoArr.stream().forEach(System.out::println);

       //System.out.println(Integer.parseInt("05", 1));
    }


}
