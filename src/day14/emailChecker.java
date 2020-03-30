package day14;

public class emailChecker {

    public static void main(String[] args) {

        String email = "dj.googa92@gmail.com";

        if (!email.contains("@") || (!email.contains(" ")) ){
            System.out.println("Invalid email ");

        }else if (email.endsWith("@gmail.com")) {
            System.out.println("gmail");

        } else if (email.endsWith("@yahoo.com")) {
            System.out.println("yahoo email");

        } else if (email.endsWith("@mail.ru")) {
            System.out.println("russian email");
        }


    }
}
