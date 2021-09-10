package adjacentElementsProduct;

/**
 * Given an array of integers, find the pair of adjacent elements
 * that has the largest product and return that product.
 * <p>
 * Example:
 * <p>
 * For inputArray = [3,6, -2, -5, 7, 3], the output should be
 * adjacentElementsProduct(inputArray) = 21.
 * <p>
 * 7 and 3 produce the largest product.
 *
 * @author David Salazar
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {3, 6, -2, -5, 7, 3};

        System.out.println(adjacentElementsProduct(array));
    }

    public static int adjacentElementsProduct(int[] inputArray) {
        int max = inputArray[0] * inputArray[1];

        for (int i = 1; i < inputArray.length - 1; i++) {
            int actual = inputArray[i] * inputArray[i + 1];
            if (actual > max) {
                max = actual;
            }
        }

        return max;


    }
}
