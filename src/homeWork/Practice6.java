package homeWork;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");
        int numberOfBedrooms = scan.nextInt();
        int startingPrice=0;
        //WRITE YOUR CODE HERE
        if(numberOfBedrooms== 1){
            System.out.println("One Bedroom Selected");
            System.out.println("set starting price as 1100");
        }else if(numberOfBedrooms==2){
            System.out.println("Two Bedroom Selected");
            System.out.println("set starting price as 1850");
        }else if(numberOfBedrooms == 3){
            System.out.println("Three Bedroom Selected");
            System.out.println("set starting price as 2550");
        }else{
            System.out.println("No such Bedrooms available");

        }
    }



}



