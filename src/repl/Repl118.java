package repl;
import java.util.Scanner;
class Repl118 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
        String[] letter=email.split("@");
      if(letter.equals(email)){
          System.out.println("Good");
      }else{
          System.out.println("Invalid email");
      }

    }
}