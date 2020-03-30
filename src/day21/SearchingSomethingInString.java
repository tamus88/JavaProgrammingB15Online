package day21;

public class SearchingSomethingInString {

    public static void main(String[] args) {

        String myName = "Hasan Mammadov";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount - 1;
        System.out.println("lastCharIndex = " + lastCharIndex);


        System.out.println("---1 char ---");
        //for (int x = 0; x < charCount ; x++) {
        for (int x = 0; x <= lastCharIndex; x++) {

            String currentChar = myName.substring(x, x + 1);

//            System.out.print(myName.substring(x, x + 1) + "->");

            if(currentChar.equalsIgnoreCase("a")){

                System.out.println(" The index of a or A is " + x);
            }


        }
    }
}