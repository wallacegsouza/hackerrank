package Arrays;

import java.util.*;

public class DirthdayCakeCandles {

    public static int result(List<Integer> candles) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (Integer cd : candles) {
            if (cd > max) {
                max = cd;
                count = 1;
            } else if (max == cd) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a = result(Arrays.asList(3, 2, 1, 3));
        System.out.println(a == 2);
    }
}
