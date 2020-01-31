package java8;

import java.util.Collection;
import java.util.Optional;

public class OptionalExamples {

    public static void main(String[] x) {
        System.out.println("Hello OptionalExamples!!!");

        Optional<String> name1 = Optional.empty();
        System.out.println(name1);

        /**
         * if name2 is null it return empty object
         */
        String name2 = null;
        System.out.println(Optional.ofNullable(name2));

        /**
         * if name is not null it returns object. if it is null them it returns default value(else value)
         */
        String name3 = null; //"Rajesh";
        System.out.println(Optional.ofNullable(name3).orElse("Kumar"));

        /**
         * if name is not null it returns object. if it is null them it returns default value(else value)
         */
        String name4 = null; //"Rajesh";
        System.out.println(Optional.ofNullable(name4).orElseGet(() -> "Kumar"));


        /**
         *  orElse vs orElseGet
         *  orElse --> it will call the method even object is not null
         *  orElseGet --> if object is not null, it Wont call the method
         */

        OptionalExamples optionalExamples = new OptionalExamples();
        String name5 = "name5";
        String defaultValue = Optional.ofNullable(name5).orElse(optionalExamples.getDefaultValue());
        System.out.println(defaultValue);

        defaultValue = Optional.ofNullable(name5).orElseGet(optionalExamples::getDefaultValue);
        System.out.println(defaultValue);

        /**
         *  if object is null it throws the exception
         */
        String name6 = "name6";
        try {
            System.out.println(Optional.ofNullable(name6).orElseThrow(Exception::new));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private String getDefaultValue() {
        System.out.println("Calling getDefaultValue()");
        return "DefaultValue";
    }
}
