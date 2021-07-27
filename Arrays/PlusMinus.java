import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PlusMinus {

    public static void result(List<Integer> arr) {
        if (arr == null || arr.isEmpty())
            System.exit(0);
        long size = arr.size();
        long countPositive = arr.stream().filter(x -> x > 0).count();
        long countNegative = arr.stream().filter(x -> x < 0).count();
        long countZero = size - (countPositive + countNegative);
        DecimalFormat df = new DecimalFormat("#,##0.000000");
        System.out.println(df.format((double) countPositive / size));
        System.out.println(df.format((double) countNegative / size));
        System.out.println(df.format((double) countZero / size));
    }
    
    public static void main(String[] args) {
        result(Arrays.asList(-4, 3, -9, 0, 4, 1));
    }
}
