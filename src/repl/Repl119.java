package repl;

import java.util.Arrays;
import java.util.Scanner;
public class Repl119 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String email = input.nextLine();

    //Write your code below
    String[] letter=email.split("@");
        System.out.println(Arrays.toString(letter));
        for (String eachLetter:letter) {

        }

    }

}
