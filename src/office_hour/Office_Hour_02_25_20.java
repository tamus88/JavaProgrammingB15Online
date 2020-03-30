package office_hour;

import java.util.Map;

public class Office_Hour_02_25_20 {
    public static void main(String[] args) {

        int num = 200;
        int n = 5;
        for (int i = 0; i <= num; i += n) {
            System.out.println("i = " + i);
        }
    }

    public boolean frontAgain(String str) {
        if (str.startsWith("ed") && str.endsWith("ed")) {
            return true;
        } else if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return true;
        }
        return false;
    }
}













//
//        StringBuilder sb1 = new StringBuilder("java");
//        //System.out.println(sb1.);
//        StringBuffer sb2 = new StringBuffer("Apple");
//
//
//        String name = "";
//        int i = name.indexOf("x");
//        if (name.substring(i, i + 1).equals("x")) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
//
//    }
//
//    public String firstHalf(String str) {
//        String half = str.substring(str.length()/2);
//        return half;
//    }
//
//}





