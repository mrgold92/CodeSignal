package arrayChange;

/*
 * You are given an array of integers. On each
 * move you're allowed to increase exactly one
 * of its elements by one. Find the minimal
 * number of moves required to obtain a strictly
 * increasing sequence from the input.
 * 
 * Example:
 * 
 * For inputArray = [1,1,1], the output should be
 * arrayChange(inputArray) = 3
 * 
 * @author David Salazar
 */
public class Main {

    public static void main(String[] args) {
        int[] input = {2, 1, 10, 1};

        System.out.println(arrayChange(input));
    }

    public static int arrayChange(int[] inputArray) {

        int c = 0;
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i - 1] >= inputArray[i]) {
                int d = Math.abs(inputArray[i - 1] - inputArray[i]) + 1;
                inputArray[i] += d;
                c += d;
            }
        }

        return c;
    }
}
