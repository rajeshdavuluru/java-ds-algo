package algorithms;

import java.io.InputStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TwoAlternativeCharacters {
    public static void main(String[] z){
        System.out.println("Hello TwoAlternativeCharacters!!!");

        String input = "beabeefeabf";
        int[]  charsArr = input.chars().distinct().toArray();
        IntStream.range(0, charsArr.length-1).forEach(System.out::println);
        Stream<String>  strignStream = IntStream.range(0, charsArr.length-1)
            .mapToObj(i -> IntStream.range(i+1, charsArr.length-1)
                    .mapToObj(j -> "[^" + (char) charsArr[i] + (char) charsArr[j] + "]")
            ).flatMap( i->i);

        strignStream.forEach(System.out::println);


        char[]  charsArr1 = input.toCharArray();


    }
}
