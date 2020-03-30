package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl126 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String [] arrayString = str.split(", ");
        String shortestWord = arrayString[0];

        for(String eachWord : arrayString){
            if(eachWord.length() < shortestWord.length()){
                shortestWord = eachWord;
            }
        }

        String shortsString = "";

        for(String otherShorts : arrayString){
            if(otherShorts.length() == shortestWord.length()){
                shortsString = shortsString.concat(otherShorts+ " ");
            }
        }

        String [] shortsArray = shortsString.split(" ");
        Arrays.sort(shortsArray);

        System.out.println(Arrays.toString(shortsArray));

    }
}
