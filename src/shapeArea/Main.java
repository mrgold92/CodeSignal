package shapeArea;

/**
 * Below we will define an n-interesting polygon.
 * Your task is to find the area of a polygon for a given n.
 * <p>
 * A 1-interesting polygon is just a square with a side of length 1.
 * An n-interesting polygon is obtained by taking the n - 1-interesting polygon
 * and appending 1-interesting polygons to its rim, side by side.
 * You can see the 1-, 2-, 3- and 4-interesting polygons in the picture below.
 * <p>
 * <p>
 * Example:
 * <p>
 * For n = 2, the output should be
 * shapeArea(n) = 5;
 * <p>
 * For n = 3, the output should be
 * shapeArea(n) = 13.
 *
 * @author David Salazar
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(shapeArea(3));
    }

    public static int shapeArea(int n) {

        return (n * n) + (n - 1) * (n - 1);
    }
}

