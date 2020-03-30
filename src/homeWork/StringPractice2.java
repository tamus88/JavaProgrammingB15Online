package homeWork;

import java.util.Arrays;

public class StringPractice2 {

    public static void main(String[] args) {

        String[] allHeroes = {"Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
                "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen ",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};

        for (String eachHero: allHeroes) {

        String hero1 = eachHero;

            String[] heroeSplitted = eachHero.split("-");
            System.out.println("heroeSplitted = " + Arrays.toString(heroeSplitted));

            String nameCode =heroeSplitted[0];
            String fullName = heroeSplitted[1];
            System.out.println("fulName = " + fullName);
            String[] fulNameSplitted = fullName.split(" ");
            String lastName =fulNameSplitted[fulNameSplitted.length-1];
            System.out.println("Initial full name is " +fullName.charAt(0) + lastName.charAt(0));

        }

    }

}
