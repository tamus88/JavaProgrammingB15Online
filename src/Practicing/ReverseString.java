package Practicing;

public class ReverseString {
    public static void main(String[] args) {
//        System.out.println(firstTwo("a"));
//        System.out.println(firstTwo(""));
        System.out.println(firstTwo("Hello"));

        System.out.println(firstHalf("HelloThere"));

    }

    public static String firstTwo(String str) {
//        if (str.length() == 0 && str.length() == 1) {
//            return str;
//        }
        return str.substring(0, 2);
    }

    public static String firstHalf(String str) {

    String[]spl = str.split(" ");
        return spl[0];
    }
}