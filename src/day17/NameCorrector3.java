package day17;

import java.util.Scanner;

public class NameCorrector3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name in 2 words");


        String fullName = "Arya Stark";
        int indexOfSpace = fullName.indexOf(" ") ;

        String firstName = fullName.substring(0, indexOfSpace );
        String lastName = fullName.substring( indexOfSpace+1 );

        String firstNameCorrected =
                firstName.toUpperCase().substring(0, 1) +
                        firstName.toLowerCase().substring(1);

        System.out.println(firstNameCorrected);

        String lastNameCorrected =
                lastName.toUpperCase().substring(0,1) +
                        lastName.toLowerCase().substring(1);

        System.out.println(lastNameCorrected);

        fullName = firstNameCorrected +" "+ lastNameCorrected;
        System.out.println(fullName);

    }
}
