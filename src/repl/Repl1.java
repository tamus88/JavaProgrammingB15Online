package repl;
import java.util.Scanner;
public class Repl1 {

    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("How are you?");
        String word = scan.next();


        System.out.println(word.startsWith("G"));
    }
}