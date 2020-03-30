package repl;

import java.util.ArrayList;

public class Practicing {

    public static void main(String[] args) {

    }

    public static String search(ArrayList<String> r, String find) {

        String result = "";
        for (int x = 0; x < r.size(); x++) {
            if (r.contains(find)) {
               return result += r.get(x);
            }
        }
        return "search failed";
    }
}
