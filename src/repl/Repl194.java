package repl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repl194 {

    public static void main(String[] args) {

//        ArrayList<String> words = new ArrayList<>(Arrays.asList("Toma", "Guga", "Chanel", "Kia"));
//        test(words);
        //  String[][] word ={{"Hello","Chanel"},{"Toma"}};
        // List<String> comb = new ArrayList<>(Arrays.asList(r1,r2));
//        ArrayList<String> strs = new ArrayList<String>(Arrays.asList("Moni","Zuma"));
//        test(strs);


//    public static void test(ArrayList<String> words) {
//        //write code here
//        List<String> words1 = new ArrayList<>(words);
//        words1.set(0, "git");
//        words1.set(2, "gud");
//        System.out.println("words1 = " + words1);

        // }

//    public static ArrayList<String> test(String strs){
//        ArrayList<String> names = new ArrayList<String>();
//        //write code below
//        names.addAll(Arrays.asList("Toma", "Guga","Chanel"));
//        System.out.println("names = " + names);
//        //leave below code alone
//        return names;
       List<String> bjn = new ArrayList<>();
        bjn.addAll(Arrays.asList("Tamara","Guga"));
        //removeAll(("Tamara","Chanel"));
    }
    public static void removeAll(ArrayList<String> wordList, String targetWord){
        String name = targetWord;
        ArrayList<String> word = new ArrayList<String>(Arrays.asList(name));
        word.removeAll(Arrays.asList(name));
        System.out.println("word = " + word);

    }
}







