package repl;

import java.util.Scanner;

public class Repl107 {
    public static void main(String[] args) {


        int num, digit1, digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int nums = scan.nextInt();
        //  int count = 0;
        for (int x = 1; x <= nums; x++) {


            System.out.println(x);
        }
    }
}