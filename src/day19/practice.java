package day19;

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter starting speed and ending speed ");
        int start = scan.nextInt();
        int end =scan.nextInt();

        System.out.println("You have started at speed-->> ");
        for (int i = start; i <end ; i++) {
            System.out.println(i+ " " );
        }




//        int start = 20 ;
//        int end =30;


//        for (start = 20; start <= end; start++) {
//            System.out.println("Your speed is : " + start);
        }


    }




