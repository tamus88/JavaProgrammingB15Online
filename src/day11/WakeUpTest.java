package day11;

public class WakeUpTest {

    public static void main(String[] args) {

//        String targetOption;
//        targetOption = " bd ";
//
//        switch (targetOption) {
//            case " bd ":
//                System.out.println(" You have turned on bedroom light ");
//                break;
//            case " ki ":
//
//                System.out.println(" You have turned on kitchen light ");
//                break;
//            case " li ":
//                System.out.println(" You have turned on living light ");
//                break;
//            case " hw ":
//                System.out.println(" You have turned on Hallway light ");
//                break;
//            default:
//                System.out.println( " wrong click " );
        {

        }

    int light = 1 ;
    String greeting = "";

        if(light==1){
        greeting = " Bedroom light" ;
    }else if (light==2) {
        greeting = " Kitchen light" ;
    }else if (light==3) {
        greeting = " Hallway light" ;
    }else if (light==4) {
        greeting = " Bathroom light" ;

    }
        System.out.println(" You have turned on " + greeting) ;


    }
}



