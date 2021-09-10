package makeArrayConsecutive;

import java.util.Arrays;

/**
 * Ratiorg got statues of different sizes as a present from CodeMaster for his birthday,
 * each statue having an non-negative integer size.
 * Since he likes to make things perfect, he wants to arrange them from smallest
 * to largest so that each statue will be bigger than the previous one exactly by 1.
 * He may need some additional statues to be able to accomplish that.
 * Help him figure out the minimum number of additional statues needed.
 * <p>
 * Example:
 * <p>
 * For statues = [6,2,3,8], the output should be
 * makeArrayConsecutive2(statues) = 3.
 * <p>
 * Ratiorg needs statues of sizes 4,5 and 7.
 *
 * @author David Salazar
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = {0, 3};

        System.out.println(makeArrayConsecutive2(arr));
    }

    public static int makeArrayConsecutive2(int[] statues) {

        Arrays.sort(statues);
        int n = 0;

        for (int i = statues[0]; i <= statues[statues.length - 1]; i++) {
            n++;
        }

        return n - statues.length;
    }
}
