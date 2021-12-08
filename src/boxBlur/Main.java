package boxBlur;

import java.util.Arrays;

/**
 * Last night you partied a little too hard. Now there's a black and white photo of you that's about to go viral!
 * You can't let this ruin your reputation, so you want to apply the box blur algorithm to the photo
 * to hide its content.
 * <p>
 * The pixels in the input image are represented as integers. The algorithm distorts the input image in the
 * following way: Every pixel x in the output image has a value equal to the average value of the pixel values
 * from the 3 x 3 square that has its center
 * at x, including x itself. All the pixels on the border of x are then removed.
 * <p>
 * Return the blurred image as an integer, with the fractions rounded down.
 * <p>
 * Example:
 * image = [[1,1,1], [1,7,1], [1,1,1]]
 * the output should be boxBlur(image) = [[1]].
 * <p>
 * The get the value of the middle pixel in the input 3x3 square:
 * (1 + 1 + 1 + 1 + 7 + 1 + 1 + 1 + 1) = 15 / 9 = 1.66666 = 1.
 * The border pixels are cropped from the final result.
 * <p>
 * for image = [[7,4,0,1], [5,6,2,2], [6,10,7,8], [1,4,2,0]],
 * the output should be solution(image) = [[5,4], [4,4]].
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{7, 4, 0, 1}, {5, 6, 2, 2}, {6, 10, 7, 8}, {1, 4, 2, 0}}));
    }

    public static int[][] solution(int[][] image) {
        int[][] result = new int[image.length - 2][image[0].length - 2];
        for (int i = 1; i < image.length - 1; i++) {
            for (int j = 1; j < image[0].length - 1; j++) {
                int sum = 0;
                for (int k = -1; k < 2; k++) {
                    for (int l = -1; l < 2; l++) {
                        sum += image[i + k][j + l];
                    }
                }
                result[i - 1][j - 1] = sum / 9;
            }
        }

        return result;
    }
}
