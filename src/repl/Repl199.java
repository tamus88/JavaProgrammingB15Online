package repl;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl199 {

    public static void main(String[] args) {


    }

    public static void removeAll(ArrayList<String> wordList, String targetWord) {

        ArrayList<String> move = new ArrayList<>(Arrays.asList(targetWord));
        //ArrayList<String> move2 = new ArrayList<>((wordList));

        System.out.println(wordList.removeAll(move));

                }
            }


