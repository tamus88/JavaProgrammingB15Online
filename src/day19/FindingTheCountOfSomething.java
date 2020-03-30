package day19;

public class FindingTheCountOfSomething {

    public static void main(String[] args) {

        int counter = 0 ;

        for (int i = 1; i <= 100 ; i++) {

            if(i%15==0){
                System.out.println(i);
//                counter+=1;
                ++counter;
            }

        }
        System.out.println("counter = " + counter);;

        String name = "Esra Fidan Said Hasan Tamara Guvanch Chanel Murat ";

        System.out.println(name.charAt(0) == 'a');

        int countOfA = 0 ;

        for (int x = 0; x < name.length(); x++) {

//            System.out.println(name.charAt(x));
            if(name.charAt(x) == 'a' ){

//                System.out.println("Bingo");
                ++countOfA;
            }

        }

        System.out.println("countOfA = " + countOfA);
















    }
}
