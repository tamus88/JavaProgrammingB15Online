package repl;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl197 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Apple","Nuts","Salmon","Pears","Butter"));
        test1(words);
        ArrayList<Double> dubs = new ArrayList<>(Arrays.asList(9.99, 25.99,12.99, 75.99));
        test(dubs);
    }
    public static void test1(ArrayList<String> words){
        //write code here
        words.add(0,"hey");
        words.add(3,"yo");
        System.out.println(words);
    }
    public static void test(ArrayList<Double> dubs) {
        //write code here

        dubs.remove(0);
        dubs.remove(0);
        System.out.println(dubs);
    }
}

//    On the left, write code that will remove the first two elements in an ArrayList
//        of doubles (be careful, this is a little tricky!)

//    On the left, given an ArrayList of Strings called words, insert "hey"
//        in the 0th index and then insert "yo" in the 3rd index.