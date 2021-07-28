package Strings;

public class StairCase {
    
    public static void result(int n) {
        String row = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                row += " ";
            }
            for (int j = 0; j < n - (n - i); j++) {
                row += "#";
            }
            row += "\n";
        }
        System.out.print(row);
    }

    public static void main(String[] args) {
        result(6);
    }
}
