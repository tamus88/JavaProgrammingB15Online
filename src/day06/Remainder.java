package day06;

import java.util.Scanner;

public class Remainder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int minutes = 135;

        int hourPart = 135 / 60;
        int minsPart = 135 % 60;

        System.out.println("The minutes " + minutes + " is " + hourPart + " hours and " + minsPart + " minutes");


    }
}
