package Arrays;

import java.util.*;

public class MinMaxSum {
    
    public static void reuslt(List<Integer> arr) {
        Collections.sort(arr);
        Long min = arr.subList(0, 4).stream()
            .map(x -> Long.parseLong(x.toString()))
            .reduce(0L, Long::sum);
        Long max = arr.subList(arr.size() - 4, arr.size()).stream()
            .map(x -> Long.parseLong(x.toString()))
            .reduce(0L, Long::sum);
        System.out.print(min + " " + max);
    }

    public static void main(String[] args) {
        reuslt(Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625));
    }
}
