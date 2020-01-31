package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class StreamsInJava8 {

    public static void main(String[] x){
        System.out.println("Hello StreamsInJava8!!!");

        List<String> namesList = new ArrayList<>();
        namesList.add("Raj");
        namesList.add("Bhavi");
        namesList.add("Vasu");

       namesList.stream().filter(name -> name.startsWith("B")).map(String::toUpperCase).forEach(System.out::println);

        Stream<String> s =  namesList.stream().filter(name -> name.startsWith("B")).map(String::toUpperCase);
        System.out.println(s);
    }
}
