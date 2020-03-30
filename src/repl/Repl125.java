package repl;

import java.util.Scanner;

public class Repl125 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};
        String minLength = str[0];
        for (int x = 0; x < str.length; x++) {
            if (minLength.length() > str[x].length()) {
                minLength = str[x];

            }
        }
        // System.out.println(minLength);
        System.out.println(minLength);

    }
}

