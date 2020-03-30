package repl;

public class repl140 {

    public static void main(String[] args) {

//            Scanner input = new Scanner(System.in);
//            String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
//        String[] words = {"hello", "why", "by", "apple", "note"};
//
//        //TODO: Write your code below
//
//        for (int x = 0; x < words.length; x++) {
//            String firstIndex = words[x].substring(0, 1);
//            String lastIndex = words[x].substring((words[x].length() - 1));
//            words[x]=firstIndex+lastIndex;
//
//        }
//        System.out.print(Arrays.toString(words));
//
//        System.out.println("===============================");

        String str = "Java"; //4
        String reversed = "";

        for (int i=str.length()-1; i >= 0; i--) {
            reversed+=str.charAt(i);
        }
        System.out.println();

    }

}




