package reverseInParentheses;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseInParentheses("foo(bar)baz(blim)"));
    }

    public static String reverseInParentheses(String inputString) {

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.toCharArray()[i] == ')') {
                inputString = inputString.substring(0, i) + inputString.substring(i + 1);
                i--;
                String reverser = "";
                while (inputString.toCharArray()[i] != '(') {
                    reverser += inputString.toCharArray()[i];
                    inputString = inputString.substring(0, i) + inputString.substring(i + 1);
                    i--;
                }

                inputString = inputString.substring(0, i) + reverser + inputString.substring(i + 1);
                i += reverser.length() - 1;
            }
        }

        return inputString;
    }


}
