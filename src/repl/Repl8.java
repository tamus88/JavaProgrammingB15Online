package repl;

import java.util.Scanner;

public class Repl8 {

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();

       num =num;
       if(num<0) {
           System.out.println("negative");
       }else if(num>0) {
           System.out.println("positive");
       }else if(num==0){
           System.out.println("Zero");
       }
           //        in this assignment you are given an int num.
//        you need to check if num is positive negative or equals to zero.
//        use 3 if statements to do this .
//                output if num is positive negative or zero
//
//        for example:
//        num  = 1
//
//        print:
//        "positive"
//
//        num = -6
//
//        print:
//        "negative"
//
//        num = 0
//
//        print:
//        "zero"



    }

}
