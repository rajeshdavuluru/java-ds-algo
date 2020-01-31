package algorithms;

public class SumOfTwoBigNumbers {

    public static void main(String[] x) {
        System.out.println("Hello SumOfTwoBigNumbers!!!");

        String number1 = "123456", number2 = "12345", finalString = "";

        System.out.println(doSumOfTwoBigNumbers(number1, number2, number1.length() - 1, number2.length() - 1, 0, finalString));
    }

    private static String doSumOfTwoBigNumbers(String number1, String number2, int size1, int size2, int remainder, String finalString) {

        char char1 = '0', char2 = '0';
        if (size1 < 0 && size2 < 0)
            return finalString;

        if (size1 > -1) char1 = number1.charAt(size1);
        if (size2 > -1) char2 = number2.charAt(size2);

        return doSumOfTwoBigNumbers(number1, number2, size1 - 1, size2 - 1,
                (Character.getNumericValue(char1) + Character.getNumericValue(char2)) / 10,
                ("" + ((((Character.getNumericValue(char1) + Character.getNumericValue(char2))+ remainder) % 10))).concat(finalString));

    }
}
