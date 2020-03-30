package day17;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME !!");
        String name = scan.nextLine();

//        String fullName = "Guvanch Kurbanov";

        int lastIndex = name.length() - 1;

        while (lastIndex >= 0) {
            System.out.println("index " + lastIndex + " : " + name.charAt(lastIndex));
            --lastIndex;
        }


    }
}
