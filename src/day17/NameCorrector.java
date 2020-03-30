package day17;

public class NameCorrector {

    public static void main(String[] args) {

        String name = "kHumAyRa" ;

//        String nameFixed = (name.charAt(0)+"").toUpperCase();
//                nameFixed = nameFixed+name.substring(1).toLowerCase();

        String nameFixed = name.toUpperCase().substring(0,1);
               nameFixed += name.substring(1).toLowerCase();

        System.out.println("nameFixed = " + nameFixed);








    }
}
