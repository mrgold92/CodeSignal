package addBorder;

/**
 * Given a rectangular matrix of characters, add a border of asterisks (*) to
 * it.
 *
 * Example:
 *
 * picture = ["abc", 
 *            "ded"]
 *
 * the output should be
 *
 * addBorder(picture) = ["*****", 
 *                       "*abc*",
 *                       "*ded*",
 *                       "*****"]
 *
 * @author David Salazar
 */
public class Main {

    public static void main(String[] args) {
        String[] picture = {"abc", "ded"};

        String[] result = addBorder(picture);

        for (String string : result) {
            System.out.println(string);
        }

    }

    public static String[] addBorder(String[] picture) {

        int first = picture[0].length() + 2;
        int length = picture.length + 2;

        String[] result = new String[length];

        String border = "";

        for (int i = 1; i <= first; i++) {
            border += "*";
        }

        for (int i = 0; i < length; i++) {

            if (i == 0) {
                result[i] = border;
            } else if (i == length - 1) {
                result[i] = border;
            } else {
                String add = "*" + picture[i - 1] + "*";
                result[i] = add;
            }
        }

        return result;
    }
}
