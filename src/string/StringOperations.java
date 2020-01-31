package string;

import java.io.Serializable;

public class StringOperations {

    public static void main(String[] s1){

        System.out.println("Hello StringOperations!!!");

     //   String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String s = "We promptly judged antique ivory buckles for the next prize";
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        boolean found = false;
        for(int i = 0; i< alphabets.length(); i++){
            System.out.println(s.indexOf(alphabets.charAt(i)));

            if(s.indexOf(alphabets.charAt(i)) > 0
                    || s.indexOf(Character.toUpperCase(alphabets.charAt(i))) <0){
                found = true;
                break;
            }

        }


        System.out.println(found);


        System.out.println("Rajesh".replace("a", ""));

       // if(found) return "pangram";
       // else return "not pangram";


        String str = "aaabccddd";
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                str = str.substring(0, i-1) + str.substring(i+1);
                i = 0;
            }
            System.out.println(str);
        }
        System.out.println("New Str:-"+str);

        System.out.println('b'-'a');

    }
}
