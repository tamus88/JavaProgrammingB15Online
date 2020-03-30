package day60;

public class MyOwnCheckedException extends Exception {

    public static void main(String[] args) {

        int num = 12345;
        String str = "" + num;

        for (int i =str.length()-1; i>=0 ; i--) {
            System.out.println("str = " + str.charAt(i));
        }
    }


}
