package day30;

public class CarInventory {

    public static void main(String[] args) {

        // count how many Chevrolet is in this array
// and how many civic you have

        String[] cars = {
                "Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Honda-Civic"};
        int countChevy = 0;
        int civic = 0;

        for (String eachCar : cars){

            if(eachCar.toLowerCase().startsWith("chevrolet")){
                countChevy++;
            }
            if(eachCar.toUpperCase().contains("CIVIC")){
                civic++;
            }

        }
        System.out.println("countChevy = " + countChevy);
        System.out.println("civic = " + civic);
    }
}
