package algorithms;

public class BigSorting {

    public static void main(String[] a){
        System.out.println("Hello BigSorting!!!");

        String[] input = { "2", "1","100", "12303479849857341718340192371",
                "3084193741082938", "3084193741082937",  "200", "111" };

        for (int i= 0; i<input.length-1; i++){
            for (int j =0 ; j<input.length-1; j++){
                if(input[j].length()> input[j+1].length()){
                    String temp = input[j+1];
                    input[j+1] = input[j];
                    input[j] = temp;
                }else if(input[j].length()== input[j+1].length()){
                    boolean swapped = false;
                    for(int k =0; k <input[j].length(); k++){
                        if(input[j].charAt(k) > input[j+1].charAt(k)){
                            String temp = input[j+1];
                            input[j+1] = input[j];
                            input[j] = temp;
                            swapped = true;
                        }else if(input[j].charAt(k) < input[j+1].charAt(k))
                            swapped = true;
                        if(swapped) break;
                    }
                }
            }
        }

        for(String s: input){
            System.out.println(s);
        }
    }
}
