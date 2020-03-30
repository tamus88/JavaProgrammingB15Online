package day20;

public class PalindromeTest {

    public static void main(String[] args) {

        String name = "Nurses run" ;

        String reversedName = "";

        for (int x = name.length()-1; x >=0 ; x--) {
            reversedName = reversedName + name.charAt(x);
        }

        System.out.println("reversedName = " + reversedName);

        name=name.replace(" ","");
        reversedName=reversedName.replace(" ","");

        if(name.equalsIgnoreCase(reversedName)){

            System.out.println("Palindrome Test has passed ");
        }else{
            System.out.println("Palindrome test has failed");
        }














    }
}
