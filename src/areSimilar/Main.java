package areSimilar;

import java.util.Arrays;

/**
 *
 * Two arrays are called similar if one can be obtained from another by swapping
 * at most one pair of elements in one of the arrays. Given two arrays a and b,
 * check whether they are similar.
 *
 * Example:
 *
 * For a = [1,2,3] and b = [1,2,3], the output should be areSimilar(a,b) = true
 * The arrays are equal, no need to swap any elements.
 *
 * For a = [1, 2, 3] and b = [2, 1, 3], the output should be areSimilar(a, b) =
 * true.
 *
 * We can obtain b from a by swapping 2 and 1 in b.
 *
 * For a = [1, 2, 2] and b = [2, 1, 1], the output should be areSimilar(a, b) =
 * false.
 *
 * Any swap of any two elements either in a or in b won't make a and b equal.
 *
 * @author David Salazar
 */
public class Main {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        System.out.println(areSimilar(a, b));
    }

    public static boolean areSimilar(int[] a, int[] b) {

        int c = 0;
        boolean r;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                c++;
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            r = c <= 2;
        } else {
            r = false;
        }

        return r;
    }

}
