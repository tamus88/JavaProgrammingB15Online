package Practicing;

public class Repl_161 {

    public static void main(String[] args) {

//        int num = 1234567;
//        StringBuilder str = new StringBuilder(String.valueOf(num)).reverse();
//        num = Integer.parseInt(str.toString());
//        System.out.println(num);
        isPalindrome(1001);

    }

    public static void isPalindrome(int num) {
        //WRITE YOUR CODE HERE
        int original = num;
        StringBuilder str = new StringBuilder(String.valueOf(num)).reverse();
        num = Integer.parseInt(str.toString());

        if (num == original) {
            System.out.println("true");
        } else {
            System.out.println("false");


        }

    }
}

