package algorithms;

public class Camelcase {
    public static void main(String[] x){
        System.out.println("Hello Camelcase");

        String input = "saveChangesInTheEditor";
        int count = 1;

        for(int i=0; i< input.length(); i++){
            if(Character.isUpperCase(input.charAt(i))) {
               count+=1;
            }
        }

        System.out.println(count);
    }
}
