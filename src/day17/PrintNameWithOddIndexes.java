package day17;

import java.util.Scanner;

public class PrintNameWithOddIndexes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name please ");
        String name = scan.nextLine();

        int x = 0 ;

        while ( x< name.length() ){

            if(x%2==0){
                System.out.println( name.charAt(x) );
            }
            ++x;

        }












    }
}
