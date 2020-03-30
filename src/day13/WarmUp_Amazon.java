package day13;

public class WarmUp_Amazon {

    public static void main(String[] args) {

        String memberType = " member";
        double amount = 45.99d ;
        int shippingFee = 0 ;

        if(memberType.equalsIgnoreCase("PRIME MEMBER")){
            System.out.println("You Get 1 Day Free Shipping ");
            System.out.println("Your final price is "+ amount );
        }else if(amount > 25 ){
            System.out.println("Not a Prime member but your order is more than 25 ");
            System.out.println("You Got Free Shipping on Amount " + amount );
        }else {
            System.out.println(" Do You Wanna Sign Up For Prime Membership ? ");
            shippingFee = 5;
            amount = amount + shippingFee; //amount += shippingFee
            System.out.println(" Your Final Amount Is " + amount );

        }

    }
}
