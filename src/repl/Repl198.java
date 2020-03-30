package repl;

import java.util.ArrayList;


public class Repl198 {
    public static void main(String[] args) {
        ArrayList<String> newWord1 = new ArrayList<>();
        // System.out.println(combineAl("Chanel","Toma"));
    }

    public static ArrayList<String> combineAl(ArrayList<String> wordList1, ArrayList<String> wordList2) {

        ArrayList<String> newWord = new ArrayList<>();

        wordList1.addAll(wordList2);

        newWord.addAll(wordList1);

        return newWord;
    }
}
