package day16;

public class MonkeyLoops {

    public static void main(String[] args) {

     /*   5 little monkeys jumping on the bed,
        One fell down and bumped his head,
                Mama called the doctor and the doctor said,
                No more monkeys jumping on the bed!
                4 little monkeys jumping on the bed,
        One fell down and bumped his head,
                Mama called the doctor and the doctor said,
                No more monkeys jumping on the bed!
                3 little monkeys jumping on the bed,
        One fell down and bumped his head,
                Mama called the doctor and the doctor said,
                No more monkeys jumping on the bed!
                2 little monkeys jumping on the bed,
        One fell down and bumped his head,
                Mama called the doctor and the doctor said,
                No more monkeys jumping on the bed!
                1 little monkey jumping on the bed,
        One fell down and bumped his head,
                Mama called the doctor and the doctor said,
                No more monkeys jumping on the bed!
                Put those monkeys right to bed!
                Collapse */

        int monkeys = 5;
        while (monkeys >= 1) {
            System.out.println("No more monkeys jumping on the bed! " + monkeys);
            --monkeys;


            System.out.println("Put those monkeys right to bed!");
        }

    }
}