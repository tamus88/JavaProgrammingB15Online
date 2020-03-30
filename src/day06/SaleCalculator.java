package day06;

import java.util.Scanner;

public class SaleCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double regularPrice;
        double discount;
        double salePrice;


        System.out.println(" What is the regular price is ");
        regularPrice = scan.nextDouble();

        System.out.println(" What is discount rate ");
        discount = scan.nextDouble();

        salePrice = regularPrice - regularPrice * discount;

        System.out.println(" regular price is " + regularPrice + "  discount is " + discount + " and your got deal for " + salePrice);


    }
}
