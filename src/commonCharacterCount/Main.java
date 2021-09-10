package commonCharacterCount;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static int c = 0;

    public static void main(String[] args) {

        System.out.println(commonCharacterCount("zzzz", "zzzzzzz"));
    }

    public static int commonCharacterCount(String s1, String s2) {

        Map<Character, Integer> s1count = countLetters(s1);
        Map<Character, Integer> s2count = countLetters(s2);

        return s1count.keySet()
                .stream()
                .filter(s2count.keySet()::contains)
                .mapToInt(a -> Math.min(s1count.get(a), s2count.get(a)))
                .sum();
    }

    private static Map<Character, Integer> countLetters(String s1) {
        String[] s11 = s1.split("");
        Map<Character, Integer> s1count = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char letra = s1.charAt(i);
            int contador = 0;
            for (String s : s11) {
                if (s.equals(String.valueOf(letra))) {
                    contador++;
                }

            }
            s1count.put(letra, contador);
        }

        return s1count;
    }

}
