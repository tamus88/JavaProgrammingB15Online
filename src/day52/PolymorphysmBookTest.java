package day52;

import java.util.Arrays;
import java.util.List;

public class PolymorphysmBookTest {
    public static void main(String[] args) {

        Book b1 = new PaperBook("Game of Throne","Shekspir",2);
        Book b2 = new AudioBook("Sinderella","Gyugo",90);
        b1.displayBookInfo();
        b2.displayBookInfo();
        KnowledgeBank kb = b1;
        kb.takeNote();

        List<Book> bookLst = Arrays.asList(b1,b2);
        for (Book each :bookLst) {
            String className = each.getClass().getSimpleName();
            System.out.println(className);
        }

    }


}
