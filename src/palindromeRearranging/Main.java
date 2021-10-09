package palindromeRearranging;

/*
 * Given a string, find out if its characters can be rearranged
 * to form a palindrome.
 *
 * @author David Salazar
 */
public class Main {

    public static void main(String[] args) {

        System.out.println(palindromeRearranging("aabb"));
    }

    public static boolean palindromeRearranging(String inputString) {

        int c = 0;

        while (inputString.length() > 0) {
            String remove = String.valueOf(inputString.charAt(0));
            String t = inputString.replaceAll(remove, "");
            int d = inputString.length() - t.length();
            c = d % 2 == 0 ? c : c + 1;
            inputString = t;
        }

        return c < 2;

    }
}
