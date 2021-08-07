package br.com.hackerrank.arrays;

import java.util.Arrays;
import java.util.List;

public class HourglassSum {

    public static int result(List<List<Integer>> arr) {
        int result = Integer.MIN_VALUE;
        int maxColumnIdx = arr.size() - 2;
        int maxRowIdx = arr.size() - 2;
        for (int i = 0; i < maxColumnIdx; i++) {
            for (int j = 0; j < maxRowIdx; j++) {
                result = Integer.max(result, hourGlass(i, j, arr ));
            }
        }
        return result;
    }

    private static int[][] matriz3(int offsetX, int offsetY, List<List<Integer>> arr) {
        int[][] result = new int[3][3];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = arr.get(i + offsetX).get(j + offsetY);
            }
        }
        return result;
    }

    private static int hourGlass(int offsetX, int offsetY, List<List<Integer>> arr) {
        int[][] m3 = matriz3(offsetX, offsetY, arr);
        return m3[0][0] + m3[0][1] + m3[0][2] + m3[1][1] + m3[2][0] + m3[2][1] + m3[2][2];
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(
            Arrays.asList(1, 1, 1, 0, 0, 0),
            Arrays.asList(0, 1, 0, 0, 0, 0),
            Arrays.asList(1, 1, 1, 0, 0, 0),
            Arrays.asList(0, 0, 2, 4, 4, 0),
            Arrays.asList(0, 0, 0, 2, 0, 0),
            Arrays.asList(0, 0, 1, 2, 4, 0)
        );
        int a = result(arr);
        System.out.println(a + " : " + (a == 19));
    }
}
