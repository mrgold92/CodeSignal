package matrixElementsSum;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1, 0}, {0, 5, 0, 1}, {2, 1, 3, 10}};
        System.out.println(matrixElementsSum(arr));
    }

    public static int matrixElementsSum(int[][] matrix) {
        int sum = 0, i = 0;

        while (i < matrix[0].length) {
            for (int[] ints : matrix) {
                if (ints[i] > 0) {
                    sum += ints[i];
                } else {
                    break;
                }
            }

            i++;
        }

        return sum;
    }
}
