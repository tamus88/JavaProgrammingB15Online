package repl;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl206 {
    public static void main(String[] args) {

        ArrayList<Boolean> a = new ArrayList<>(Arrays.asList(true, false, false));
        repeatAl(a);
    }

    public static void repeatAl(ArrayList<Boolean> a) {

        a.addAll(a);

        System.out.print(a);
    }

}
