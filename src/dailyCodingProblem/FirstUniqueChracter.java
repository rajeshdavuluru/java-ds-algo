package dailyCodingProblem;

import java.util.ArrayList;
import java.util.List;

public class FirstUniqueChracter {

    public static void main(String[] x) {
        System.out.println("Hello FirstUniqueChracter!!!");

        String input = "rajeshdavuluru";

        List<String> visited = new ArrayList<>();
        char unique = doFirstUniqueChracter(input, 0, visited);
        System.out.println(unique);
    }

    private static char doFirstUniqueChracter(String input, int start, List<String> visited) {

        if(visited.contains(""+input.charAt(start)))
            return doFirstUniqueChracter(input, start + 1, visited);

        for (int i = start + 1; i < input.length(); i++) {
            if (input.charAt(start) == input.charAt(i)) {
                visited.add(""+input.charAt(start));
                return doFirstUniqueChracter(input, start + 1, visited);
            }
        }
        return input.charAt(start);
    }
}
