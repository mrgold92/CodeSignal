package add;

/**
 * White a function that return the sum of two numbers.
 * <p>
 * For example:
 * param1 = 1
 * param2 = 2
 * <p>
 * add(param2, param2) = 3
 *
 * @author David Salazar
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
    }

    public static int add(int param1, int param2) {
        return param1 + param2;
    }
}
