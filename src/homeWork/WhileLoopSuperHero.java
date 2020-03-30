package homeWork;

import java.util.Scanner;

public class WhileLoopSuperHero {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Your Favorite Super Hero?");
        String password=scan.next();
        while(password.equals("SHAZAM")){
            System.out.println("You are now Super Hero!!!");
       password=scan.next();
        }

        System.out.println("Wrong password");
    }


}
