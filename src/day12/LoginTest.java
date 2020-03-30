package day12;

public class LoginTest {

    public static void main(String[] args) {

        String userName = " user123 ";
        String password = " pass123 ";

        if (userName.equals(" user123 ") && password.equals(" pass123 ")) {
            System.out.println(" Login successful ");
        } else if (!userName.equals(" user123 ") && password.equals(" pass123 ")) {
            System.out.println(" userName and Password is not correct ");
        } else if (userName.equals(" user123 ") && password.equals(" pass123 ")) {
            System.out.println(" Password is not correct ");
        } else if (userName.equals(" user321 ") && password.equals(" pass123 ")) {
            System.out.println(" Username is not correct");
        } else {
            System.out.println(" Try again in 5 minutes ");
        }


    }
}
