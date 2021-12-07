public class Main {
  public static void main(String[] args) {
    int yourLeft = 10;
    int yourRight = 15;
    int friendsLeft = 5;
    int friendsRight = 20;

    boolean areEquallyStrong = solution(yourLeft, yourRight, friendsLeft, friendsRight);
    System.out.println(areEquallyStrong);
  }

  public static boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {

    int yourMax = Math.max(yourLeft, yourRight);
    int yourMin = Math.min(yourLeft, yourRight);
    int friendsMax = Math.max(friendsLeft, friendsRight);
    int friendsMin = Math.min(friendsLeft, friendsRight);

    if (yourMax == friendsMax && yourMin == friendsMin) {
      return true;
    } else if (yourMax == friendsMin && yourMin == friendsMax) {
      return true;
    } else {
      return false;
    }
  }
}