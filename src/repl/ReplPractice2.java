package repl;

import java.util.Arrays;

public class ReplPractice2 {
    public static void main(String[] args) {

        String[] words ={"java", "code", "python", "code", "rust", "code", "rust"};
        System.out.println(Arrays.toString(words));

        // System.out.println((printUniqueWords(Arrays.toString(words)));

    }
    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE

        String result = "";
        for(int j=0; j<words.length; j++){
            int count = 0;
            for(int x=0; x<words.length; x++){
                if(words[x]==words[j]){
                    count++;
                }
            }
            if(count==1){
                result+=""+words[j];
            }
        }
    }
    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE
        int count = 0;
        for (int x = 0; x < nums.length; x++) {
          //  if(){

        }

        }
    }






