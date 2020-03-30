package day20;

public class FindDogInASentence {

    public static void main(String[] args) {


        String msg = "I like Dog , Dogs are cute , Dogs are friendly";

        int lastCharIndex = msg.length()-1;

        for (int x = 0; x <= lastCharIndex-2 ; x++) {
            String current3Chars = msg.substring(x=x+3);
//            System.out.println(x + " : " + current3Chars) ;
            if(current3Chars.equals("Dog")){
                System.out.println("Bingo !!! AT " + x);

            }
        }
















    }
}
