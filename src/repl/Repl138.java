package repl;

import java.util.Scanner;

public class Repl138 {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
     //   String sentence = "Java is fun";

//        String[] splitted = sentence.split(" ");
//        System.out.println("splitted = " + Arrays.toString(splitted));
//        splitted[0]=splitted[2];
//        splitted[1]=splitted[1];
//        splitted[2]=splitted[0];
//        for (String each : splitted) {
//
//
//            System.out.println( Arrays.toString(splitted));

//
     String name1 = "Java";
    String name2 = "is";
    String name3 = "fun";
    String tempCont = name1;
    name1=name3;
    name2=name2;
    name3= tempCont;




   System.out.println( name1+"\n" + name2+"\n" + name3+"\n" );

//        String sentence2 = "Java is fun";
//
//
//       String[] splitted = sentence2.split(" ");
//
//        String reversed = "";
//        splitted[0]="fun";
//        splitted[2]="Java";
//        System.out.println("splitted = " + Arrays.toString(splitted));

//        reversed+= Arrays.toString(splitted);
//        System.out.println("reversed = " + reversed);

        //String firstWord =sentence.substring(0,sentence.indexOf(" "));
//String lastWord = sentence.substring(sentence.lastIndexOf(" "));



      //  System.out.println(reversed);
    //TODO: start your code here

        }
}









