package algorithms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {

    public static void main(String[] x){
        System.out.println("Hello StrongPassword!!!");

        String inputString = "AUzs-nV3";

        Pattern pat = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()\\-+]).{8,}");
        Matcher match = pat.matcher(inputString);

        if(match.find())
        {
            System.out.println("Strong Password");
        }else{
            System.out.println("Weak Password");
        }
    }
}
