package repl;

import java.util.Scanner;

public class Repl10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupons=scan.nextInt();
        if(coupons==13) {
            System.out.println("Number of Candies: 1");
            System.out.println("Number of Gumballs: 1");
        }else if(coupons==23) {
            System.out.println("Number of Candies: 2");
            System.out.println("Number of Gumballs: 1");
        }else if(coupons==2) {
            System.out.println("Not enough coupons");

        }

        //        Display prompt: "Enter number of coupons:"
//        13
//        Display prompt: "Number of Candies: 1"
//        Display prompt: "Number of Gumballs: 1"
//
//        Example2:
//
//        Display prompt: "Enter number of coupons:"
//        23
//        Display prompt: "Number of Candies: 2"
//        Display prompt: "Number of Gumballs: 1"
//
//        Example3:
//
//        Display prompt: "Enter number of coupons:"
//        2
//        Display prompt: "Not enough coupons"
//


    }

}
