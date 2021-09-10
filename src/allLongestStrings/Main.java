package allLongestStrings;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"aba", "aa", "ad", "vcd", "aba"};
        String[] returnString = allLongestStrings(arr);

        for (String re : returnString) {
            System.out.println(re);
        }
    }

    public static String[] allLongestStrings(String[] inputArray) {

        List<String> lista = new ArrayList<>();

        Optional<Integer> max = Arrays.stream(inputArray)
                .max(Comparator.comparing(String::length))
                .map(String::length);

        for (String s : inputArray) {
            if (s.length() == max.get()) {
                lista.add(s);
            }
        }

        return lista.toArray(new String[0]);
    }
}
