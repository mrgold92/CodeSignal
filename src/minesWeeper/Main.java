package minesWeeper;

/**
 * In the popular Minesweeper game you have a board with some mines and those
 * cells that don't contain a mine have a number in it that indicates
 * the total number of mines in the neighboring cells.
 * Starting off with some arrangement of mines we want to create a Minesweeper game setup.
 * <p>
 * For example:
 * matrix =  [[true, false, false],
 * [false, true, false],
 * [false, false, false]]
 * <p>
 * The output should be:
 * solution(matrix) = [[1, 2, 1],
 * [2, 1, 1],
 * [1, 1, 1]]
 * <p>
 * input: A non-empty rectangular matrix consisting of boolean values - true
 * if the corresponding cell contains a mine, false otherwise.
 * <p>
 * output: An array of the same size as the input array, where the value of
 * each element is the number of mines in the neighboring cells.
 */
public class Main {
    public static void main(String[] args) {
        boolean[][] matrix = new boolean[][]{
                {true, false, false, true},
                {false, false, true, false},
                {true, true, false, true}
        };
        int[][] result = solution(matrix);
        for (int[] row : result) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static int[][] solution(boolean[][] matrix) {
        int[][] result = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = new int[matrix[i].length];
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                for (int k = i - 1; k < i + 2; k++) {
                    for (int l = j - 1; l < j + 2; l++) {
                        if (k >= 0 && k < matrix.length && l >= 0 && l < matrix[i].length && !(k == i && j == l) && matrix[k][l]) {
                            if (matrix[k][l]) {
                                result[i][j]++;
                            }
                        }
                    }
                }
            }
        }

        return result;
    }


}
