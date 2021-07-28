package Arrays;

import java.util.*;

public class DiagonalDifference {
 
    private static int result(List<List<Integer>> arr) {
        int n = arr.size();
        int leftToRightDiagonal = 0;
        for (int i = 0; i < n; i++) {
            leftToRightDiagonal += arr.get(i).get(i);
        }
        int rightToLeftDiagonal = 0;
        for (int i = n; i > 0; i--) {
            rightToLeftDiagonal += arr.get(n - i).get(i - 1);
        }
        return Math.abs(leftToRightDiagonal - rightToLeftDiagonal);
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(
            Arrays.asList(11, 2, 4),
            Arrays.asList(4, 5, 6),
            Arrays.asList(10, 8, -12)
        );
        int a = result(arr);
        System.out.println(a);
        System.out.println(a == 15);
    }
}
