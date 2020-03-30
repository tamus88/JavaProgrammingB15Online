package repl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repl193 {

    public static void main(String[] args) {

        String[] r1 = {"Star","MIshel","Michael","Nora"};
        String[] r2 = {"Baby"};
//       ArrayList<String> words = new ArrayList<>();
//        ArrayList<String> words1 = new ArrayList<>();
//       words.addAll(Arrays.asList(r1));
        //words1.addAll(Arrays.asList(r2));
       System.out.println(combineRs(r1,r2));
    }
    public static String combineRs(String[] r1,String[] r2) {
        String result = "";
        List<String> l1 = Arrays.asList(r1);
        List<String> l2 = Arrays.asList(r2);
      //List<String> temp = new ArrayList<>();
       //l1.addAll(Arrays.asList(r2));
       l2.addAll(Arrays.asList(r1));
       result = result+l2;
    return result;
    }

}
