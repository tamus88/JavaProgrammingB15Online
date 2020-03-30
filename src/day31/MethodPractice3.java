package day31;

public class MethodPractice3 {

    public static void main(String[] args) {

        printOddNumbers1to100();
        name();


    }

    public static void printOddNumbers1to100() {

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }

        }

    }

    public static void name() {

        String name = "Guvanch";
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + "-");
            name = name.substring(0, name.length()-1);

        }

    }

}
