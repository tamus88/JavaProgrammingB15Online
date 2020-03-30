package repl;
import java.util.Scanner;

public class Repl2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the text:");
        String text=scan.next();
        System.out.println(text.length() );
        System.out.println("Length is:4");
        //        Display message: "Please enter the text:"
//        input: java
//        Display message: "Length is: 4"
        //String text="Java";
       // System.out.println(scan.length()  );

    }
}
