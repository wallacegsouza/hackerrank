import java.util.*;

public class DynamicArray {
    
    private static List<Integer> result(int n, List<List<Integer>> queries) {
        if (n < 1 || n > 1000) {
            System.exit(0);
        }
        for (List<Integer> query : queries) {
            
        }
        return null;
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(
            Arrays.asList(1, 1, 1, 0),
            Arrays.asList(0, 1, 0, 0),
            Arrays.asList(1, 1, 1, 0),
            Arrays.asList(0, 0, 2, 4),
            Arrays.asList(0, 0, 0, 2),
            Arrays.asList(0, 0, 1, 2)
        );
        List<Integer> result = result(25, arr);
    }
}
