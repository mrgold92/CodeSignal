package avoidObstacles;

import java.util.HashSet;

/**
 * You are given an array of integers representing coordinates of obstacles situated on a straight line.
 * Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make jumps
 * of the same length represented by some integer.
 * <p>
 * Find the minimal length of the jump enough to avoid all the obstacles.
 * <p>
 * Example:
 * For inputArray = [5, 3, 6, 7, 9], the output should be solution(inputArray) = 4.
 */
public class Main {
    public static void main(String[] args) {

        int[] inputArray = {2,3};
        System.out.println(solution(inputArray));
    }

    public static int solution(int[] inputArray) {
        HashSet<Integer> obstacles = new HashSet<Integer>();
        int max = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
            obstacles.add(inputArray[i]);
            max = Math.max(max, inputArray[i]);
        }

        for (int i = 1; i <= max; i++) {
            int j;
            for (j = i; j <= max; j = j + i) {
                if (obstacles.contains(j)) {
                    break;
                }
            }

            if (j > max) {
                return i;
            }
        }
        return max + 1;
    }


}




