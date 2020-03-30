package day12;

public class WarmUp_SeasonFinder {

    public static void main(String[] args) {

        int month = 12;

        if (month<1 || month>12 ){
            System.out.println("it's INVALID MONTH ");
        }else if(3<month && month<5){
            System.out.println("it's Spring ");
        }else if( 6<month && month<8){
            System.out.println("it's Summer ");
        }else if( 9<month && month<11){
            System.out.println("it's Fall ");
        }else if( month==12 || month==1 ||month==2){
            System.out.println(" it's WINTER !");
        }




    }
}
