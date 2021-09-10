package centuryFromYear;

/**
 * Given a year, return the century it is in.
 * <p>
 * The first century spans from the year 1 up to
 * and including the year 100. The second -from the
 * year 101 up to and including the year 200, etc.
 * <p>
 * Example:
 * <p>
 * For year = 1905, the output should be
 * centuryFromYear(year) = 20;
 * <p>
 * For year = 1700, the output should be
 * centuryFromYear(year) = 17.
 *
 * @author David Salazar
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(centuryFromYear(1905));
    }

    public static int centuryFromYear(int year) {
        return (int) Math.ceil(year / 100d);
    }
}


