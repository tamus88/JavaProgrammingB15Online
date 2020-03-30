package day05;

import java.util.Scanner;

public class TheScannerWay {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("what is your name : ");
        String name = scan.next();
        System.out.println("My name is : " + name);


    }
}
