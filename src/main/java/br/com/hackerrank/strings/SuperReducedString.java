package br.com.hackerrank.strings;

public class SuperReducedString {

    private static String result (String s) {
        if (s == null) System.exit(0);
        int length = s.length();
        int i = 0;
        while (i < length - 1) {
            if (length == 1) break;
            String aux = s.substring(i, i + 2);
            if (aux.charAt(0) == aux.charAt(1)) {
                s = s.substring(0, i) + s.substring(i + 2, length);
                length = s.length();
                i = 0;
            } else {
                i++;
            }
        }
        if (s.isEmpty()) return "Empty String";
        return s;
    }

    public static void main(String[] args) {
        String a = result("aaabccddd");
        System.out.println(a + " : " + "abd".equals(a));
        a = result("aa");
        System.out.println(a + " : " + "Empty String".equals(a));
        a = result("baab");
        System.out.println(a + " : " + "Empty String".equals(a));
        a = result("baabcc");
        System.out.println(a + " : " + "Empty String".equals(a));
        a = result("aaaacc");
        System.out.println(a + " : " + "Empty String".equals(a));
        a = result("aaaaaa");
        System.out.println(a + " : " + "Empty String".equals(a));
        a = result("aaa");
        System.out.println(a + " : " + "a".equals(a));

    }
}
