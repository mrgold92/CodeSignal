public class Main {
  public static void main(String[] args) {
    System.out.println(solution(new int[] { 2, 4, 5, 6 }));
  }

  private static int solution(int[] inputArray) {

    int max = 0;
    for (int i = 0; i < inputArray.length - 1; i++) {
      int diff = Math.abs(inputArray[i] - inputArray[i + 1]);
      if (diff > max) {
        max = diff;
      }
    }
    return max;

  }
}
