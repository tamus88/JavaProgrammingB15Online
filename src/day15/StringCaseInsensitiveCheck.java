package day15;

public class StringCaseInsensitiveCheck {

    public static void main(String[] args) {

        String name = "Arya Stark";

        System.out.println("name contains( \"st\") Result is : " + name.contains("st"));

        System.out.println(name.contains("st" ));

        String uppercaseName = name.toUpperCase();

        System.out.println("uppercaseName contains ST or not ? " +uppercaseName.contains("ST"));

        String lowercaseName = name.toLowerCase();
        System.out.println("lowercaseName contains st or not ? " +lowercaseName.contains("st"));

        System.out.println(name.toLowerCase().contains("st"));


    }
}
