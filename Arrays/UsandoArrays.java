package Arrays;

import static java.lang.System.out;
import java.util.*;

public class UsandoArrays {

    public static void main(String[] args) {
        //criando();
        //arrayNegativo();
        simpleSum();
    }

    public static void criando() {
        out.println("================================================");
        out.println("==== exemplo criando array de forma literal ====");
        out.println("================================================");
        out.println("");
        int[] a = { 11, 22, 33 };
        for (int i = 0; i < a.length; i++) {
            out.print(a[i]);
            if (i < a.length - 1)
                out.print(", ");
        }
        out.println("");
        out.println("======================================================");
        out.println("==== exemplo criando array e inicializando depois ====");
        out.println("======================================================");
        out.println("");
        a = new int[4];
        a[0] = 99;
        a[1] = 88;
        a[2] = 77;
        a[3] = 66;
        for (int i = 0; i < a.length; i++) {
            out.print(a[i]);
            if (i < a.length - 1)
                out.print(", ");
        }
        out.println("");
    }

    public static void arrayNegativo() {
        out.println("================================");
        out.println("==== exemplo array negativo ====");
        out.println("=================================");
        out.println("");
        int[] a = { 11, 22, 33, 44 };
        for (int i = a.length - 1; i >= 0; i--) {
            out.print(a[i]);
            if (i > 0)
                out.print(", ");
        }
        out.println("");
    }

    public static void simpleSum() {
        out.println("==============================");
        out.println("==== exemplo array simple sum ====");
        out.println("===============================");
        out.println("");

        int sum = 0;
        List<Integer> a = Arrays.asList(11, 22, 33, 44);
        out.println(a.stream().reduce(0, Integer::sum));
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
        }
        out.println(sum);
    }
}
