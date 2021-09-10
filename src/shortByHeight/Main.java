package shortByHeight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 11, 2, 16};
        int[] re = sortByHeight(arr);

        for (int r : re) {
            System.out.println(r);
        }
    }

    public static int[] sortByHeight(int[] a) {

        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                lista.add(a[i]);
            }
        }

        Collections.sort(lista);

        for (int i = 0; i < a.length; i++) {
            if (a[i] == -1) {
                lista.add(i, -1);
            }
        }

        return lista.stream().mapToInt(i -> i).toArray();
    }

}
