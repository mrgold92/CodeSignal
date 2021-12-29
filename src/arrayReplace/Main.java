package arrayReplace;

/**
 * Given an array of integers, replae all the ocurrences of `elemToReplace` with `substitutionElem`.
 * <p>
 * Example:
 * For `inputArray = [1, 2, 1]` and `elemToReplace = 1` and `substitutionElem = 3`,
 * the output should be `solution(inputArray, elemToReplace, substitutionElem) = [3, 2, 3]`.
 */
public class Main {

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 1};
        int elemToReplace = 1;
        int substitutionElem = 3;
        int[] result = solution(inputArray, elemToReplace, substitutionElem);

        for (int j : result) {
            System.out.print(j + " ");
        }

    }

    public static int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {
        int[] result = new int[inputArray.length];
        int index = 0;
        for (int j : inputArray) {
            if (j == elemToReplace) {
                result[index] = substitutionElem;
            } else {
                result[index] = j;
            }
            index++;
        }
        return result;
    }
}

