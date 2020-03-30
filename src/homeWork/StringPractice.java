package homeWork;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {

        String allHeroes = "Wonder Woman-Princess Diana";

        String[] heroeSplitted = allHeroes.split("-");
        System.out.println("heroeSplitted = " + Arrays.toString(heroeSplitted));

        String nameCode =heroeSplitted[0];
        String fullName = heroeSplitted[1];
        System.out.println("fulName = " + fullName);
       String[] fulNameSplitted = fullName.split(" ");
        String lastName =fulNameSplitted[fulNameSplitted.length-1];
        System.out.println("Initial full name is " +fullName.charAt(0) + lastName.charAt(0));




    }
}
