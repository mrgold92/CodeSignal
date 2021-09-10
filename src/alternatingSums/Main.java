package alternatingSums;

public class Main {

    public static void main(String[] args) {

        int[] arr = {50, 60, 60, 45, 70};

        for (int z : alternatingSums(arr)) {
            System.out.println(z);
        }

    }

    public static int[] alternatingSums(int[] a) {
        int sumTeam1 = 0, sumTeam2 = 0;

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                sumTeam1 += a[i];
            } else {
                sumTeam2 += a[i];
            }
        }

        return new int[]{sumTeam1, sumTeam2};
    }
}
