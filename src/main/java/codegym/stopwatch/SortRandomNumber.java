package codegym.stopwatch;

import java.util.Random;

public class SortRandomNumber {

    public static int[] list() {
        int[] list = new int[100000];
        for (int i = 0; i < 100000; i++) {
            Random rd = new Random(100000);
            list[i] = rd.nextInt(100) + 1;
        }
        return list;
    }

    public static void sort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int current = list[i];
            int j;
            for (j = i - 1; j > 0 && list[j] > current; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = current;
        }
    }
}
