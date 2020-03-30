package repl;

import java.util.Scanner;

public class Repl {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double version = 1.5;
        System.out.println("Print android " + version);
        if (version >= 1.5) {
            System.out.println("Cupcake");
        } else if (version >= 9.0) {
            System.out.println("Pie");
        } else {
            System.out.println("Sorry, I don't know this version! ");




        }
    }
}