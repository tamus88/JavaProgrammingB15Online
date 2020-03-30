package repl;

import java.util.Scanner;

public class Repl161PalindromeNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        int resultNumber = 0;
        for (int i = num; i !=0; i /= 10) {
            resultNumber = resultNumber * 10 + i % 10;
        }
        if(num==resultNumber){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}


