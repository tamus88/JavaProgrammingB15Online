package repl;
import java.util.Scanner;
public class Repl5 {

    public static void main(String[] args) {
        System.out.println("Enter the word:");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        System.out.println("Sentence:");
        String sentence = scan.nextLine();
        if (word.contains("ju")) {
            System.out.println("Result is:"+word.contains("ju"));
            // Write a program that will verify if word contains in the sentence.
            // Print out the result as boolean value.
        }
    }
}