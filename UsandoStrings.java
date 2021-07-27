import static java.lang.System.out;

public class UsandoStrings {

    public static void main(String[] args) {
        // arrayDeChar();
        // umStringComoArrayDeChar();
        // ultimoCaracterDeUmaString();
        // matriz();
        // criandoStrings();
        verificandoIqualdade();
    }

    public static void arrayDeChar() {
        out.println("==================================");
        out.println("==== exemplo de array de char ====");
        out.println("==================================");
        out.println("");
        char[] letras = { 'a', 'b', 'c', 'd' };
        for (int i = 0; i < letras.length; i++) {
            out.print(letras[i]);
        }
        out.println("");
    }

    public static void umStringComoArrayDeChar() {
        out.println("===========================================================");
        out.println("==== exemplo de string percorida como um array de char ====");
        out.println("===========================================================");
        out.println("");
        String letras = "efgh";
        for (int i = 0; i < letras.length(); i++) {
            out.print(letras.charAt(i));
        }
        out.println("");
        out.println("usando o toCharArray");
        out.println("");
        char[] toChar = letras.toCharArray();
        for (int i = 0; i < toChar.length; i++) {
            out.print(toChar[i]);
        }
        out.println("");
    }

    public static void ultimoCaracterDeUmaString() {
        out.println("===============================================");
        out.println("==== exemplo ultimo caracter de uma string ====");
        out.println("===============================================");
        out.println("");
        String letras = "CodeInterView";
        out.println("palavra:     " + letras);
        out.println("ultimaletra: " + letras.charAt(letras.length() - 1));
        out.println("");
    }

    public static void matriz() {
        out.println("===============================================");
        out.println("==== exemplo de uma matriz de caracter ====");
        out.println("===============================================");
        out.println("");
        char[][] letras = { { 'a', 's', 'd', 'f' }, { 'q', 'w', 'e', 'r' } };
        for (int i = 0; i < letras.length; i++) {
            out.println("");
            for (int j = i; j < letras[i].length; j++) {
                out.print(letras[i][j]);
            }
            out.println("");
        }
        out.println("");
    }

    public static void criandoStrings() {
        out.println("===============================================");
        out.println("==== exemplo formas de criar uma string ====");
        out.println("===============================================");
        out.println("");
        out.println("valueOf");
        String s = String.valueOf("Vasco");
        out.println(s);
        out.println("");
        out.println("new");
        out.println(new String("Java"));
        out.println("literal");
        out.println("aspas duplas");
    }

    public static void verificandoIqualdade() {
        out.println("===============================================");
        out.println("==== exemplo == e equals ====");
        out.println("===============================================");
        out.println("");
        String a = "Vasco";
        String b = "Vasco";
        out.println("a : " + a);
        out.println("b : " + b);
        out.println("");
        out.println("a == b");
        out.println(a == b);
        out.println("");
        out.println("a.equals(b)");
        out.println(a.equals(b));

        out.println("Criando uma String usando new para a variavel 'a'");
        a = new String("Vasco");
        out.println("a : " + a);
        out.println("b : " + b);
        out.println("");
        out.println("a == b");
        out.println(a == b);
        out.println("");
        out.println("a.equals(b)");
        out.println(a.equals(b));
    }
}
