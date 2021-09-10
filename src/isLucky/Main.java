package isLucky;

public class Main {
    public static void main(String[] args) {
        System.out.println(isLucky(239017));
    }

    public static boolean isLucky(int n) {
        String number = String.valueOf(n);
        int mitad = (int) Math.floor(number.length() - 1) / 2;


        int m11 = Integer.parseInt(number.substring(0, mitad + 1));
        int m22 = Integer.parseInt(number.substring(mitad + 1));

        int sum1 = sum(m11), sum2 = sum(m22);

        return sum1 == sum2;

    }

    public static int sum(int n) {
        return n == 0 ? 0 : n % 10 + sum(n / 10);
    }
}
