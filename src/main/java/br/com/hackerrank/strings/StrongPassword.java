package br.com.hackerrank.strings;

import java.io.*;

public class StrongPassword {

    public static int minimumNumber(int n, String password) {

        boolean lowerCase = false;
        boolean upperCase = false;
        boolean numbers = false;
        boolean specialCharacters = false;

        for (int i = 0; i < password.length(); i++) {
            String pass = String.valueOf(password.charAt(i));
            lowerCase |= pass.matches("[a-z]");
            upperCase |= pass.matches("[A-Z]");
            numbers |= pass.matches("[0-9]");
            if ("-".equals(pass))
                System.out.println("Teste");
            specialCharacters |= pass.matches("[-!@#$%^&*()+ ]");
            if (i < password.length())
                System.out.print(pass);
            else
                System.out.println(pass);
        }

        int result = 0;
        if (!lowerCase)
            result++;
        if (!upperCase)
            result++;
        if (!numbers)
            result++;
        if (!specialCharacters)
            result++;
        if (n < 6)
            result = Integer.max(result, 6 - n);

        return result;
    }

    public static void main(String[] args) throws IOException {
        int answer = minimumNumber(7, "AUzs-nV");
        System.out.println(answer + " : " + (answer == 1));
        answer = minimumNumber(4, "4700");
        System.out.println(answer + " : " + (answer == 3));
        answer = minimumNumber(4, "goxg");
        System.out.println(answer + " : " + (answer == 3));
        answer = minimumNumber(4, "&+^&");
        System.out.println(answer + " : " + (answer == 3));
        answer = minimumNumber(1, "!");
        System.out.println(answer + " : " + (answer == 5));
        answer = minimumNumber(100,
                "VNVURFTZIVVZKTGVAZPHTTWTPFFKYUZOCEGKMOLKPASGGCWGFPEDTTMODPRPGEQWGMNXUBAYJKSLAGZOQFHJZSTKWCXNZJYCPQPB");
        System.out.println(answer + " : " + (answer == 3));
        answer = minimumNumber(11, "#HackerRank");
        System.out.println(answer + " : " + (answer == 1));
        answer = minimumNumber(3, "Ab1");
        System.out.println(answer + " : " + (answer == 3));
    }
}
