package palindrome;

/**
 * Given the string, check if it is a palindrome.
 * <p>
 * Example:
 * <p>
 * For inputString = "aabaa", the output should be
 * checkPalindrome(inputString) = true;
 * <p>
 * For inputString = "abac", the output should be
 * checkPalindrome(inputString) = false;
 * <p>
 * For inputString = "a", the output should be
 * checkPalindrome(inputString) = true.
 *
 * @author David Salazar
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(checkPalindrome("abac"));
    }

    public static boolean checkPalindrome(String inputString) {

        String reverse = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverse += String.valueOf(inputString.charAt(i));
        }

        return reverse.equals(inputString);
    }
}
