package repl;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl182 {

    public static void main(String[] args) {

        System.out.println(clean("he said bla bla bla","bla"));

    }

    public static String clean(String text, String badWord) {
        String result = "";

        ArrayList<String> arrl = new ArrayList<>(Arrays.asList(text));
        ArrayList<String> arrl1 = new ArrayList<>(Arrays.asList(badWord));
        arrl.retainAll(arrl1);
        System.out.println("arrl = " + arrl);
        result += arrl;

        return result;
    }


}
