package day50;

import java.util.Arrays;
import java.util.List;

public class MathTest {

    public static void main(String[] args) {

        Addition a1 = new Addition(10,90);

        System.out.println("a1 : " + a1);
        a1.calculate();
        System.out.println("a1 : " + a1);
    Substraction s1 = new Substraction(90,20);
    s1.calculate();
        System.out.println("s1 = " + s1);
        Substraction s2 = new Substraction(10,80);
    s2.calculate();
        System.out.println("s2 = " + s2);

        Multiplication m1 = new Multiplication(4,4);
        m1.calculate();
        System.out.println("m1 = " + m1);

        Division d1 = new Division(10,5);
        d1.calculate();
        System.out.println("d1 = " + d1);

        List<Question> allQuestions = Arrays.asList(a1,s1,m1,d1);
        for (Question eachQ :allQuestions) {
            System.out.println("eachQ = " + eachQ);
        }

    }

}
