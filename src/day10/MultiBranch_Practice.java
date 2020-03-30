package day10;

public class MultiBranch_Practice {

    public static void main(String[] args) {

        System.out.println(" Welcome to McDonald , what can I get for you ? ");

        String order = "" ;
        int itemNumber = 35 ;

        if (itemNumber == 1){
            System.out.println(" You have selected 11 ");
            order = " Burger ";
        }else if ( itemNumber == 5){
            System.out.println(" You have selected 5 ");
            order = " French Fry ";
        }else if ( itemNumber == 8){
            System.out.println(" You have selected 8 ");
            order = " Nuggets ";
        }else if ( itemNumber == 35){
            System.out.println(" You have selected 35 ");
            order = " Ice Cream ";
        }else{
            System.out.println(" You have selected unknown item number ! ! ");
            order = " Unknown " ;
        }

        System.out.println(" Your order is "+order );








    }
}
