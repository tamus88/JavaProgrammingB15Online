package repl;

import java.util.*;

public class Repl120 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {

            words[i] = input.nextLine();

        }


        //write your code below
        String longestWord = "";

        for (String currentWord : words) {
            if (currentWord.length() > longestWord.length()) {
                longestWord = currentWord;
            }


        }

        System.out.println("longestWord = " + longestWord);


    }


}








