package repl;
import java.util.*;
public class Repl135 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below
       // String sentence = "Java is fun";
        String[] splitted = sentence.split(" ");
      //  System.out.println("splitted = " + Arrays.toString(splitted));
//        String name1 = splitted[0];
//        String name2 = splitted[1];
//        String name3 = splitted[2];
        for (String each : splitted) {


            System.out.println(each);
        }
    }

        }









