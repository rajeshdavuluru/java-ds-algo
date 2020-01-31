package algorithms;

public class BirthdayChocolate {

    public static void main(String[] x){
        System.out.println("BirthdayChocolate");
        int[] input =  {2,5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1};
        int month = 7, day = 18, count = 0, temp = 0;


            if(input.length == 1 && input[0] == day){
                count+=1;
            }else {
                for(int i = 0; i< input.length; i++){
                    temp = input[i];
                    for(int j = i+1; j< i+month ; j++){
                        if(j< input.length)
                            temp += input[j];
                    }
                    if(temp == day) count+=1;
                }
            }
            System.out.println(count);
    }
}
