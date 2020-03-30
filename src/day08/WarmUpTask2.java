package day08;

import java.util.Scanner;

public class WarmUpTask2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Guess my favorite number ? ");

        int myFavoriteNumber = scan.nextInt();
        int yourFavoriteNumber = scan.nextInt();

        if ( myFavoriteNumber == yourFavoriteNumber ) {
            System.out.println( " BINGO!!!! ");
        } else {
            System.out.println(" You are not my best friend , try again ");
        }








    }
}
