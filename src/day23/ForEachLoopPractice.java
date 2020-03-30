package day23;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        long[] salaries = new long[5] ;

        salaries[0] = 50000l;
        salaries[1] = 60000l;
        salaries[2] = 70000l;
        salaries[3] = 80000l;
        salaries[4] = 105000l;

        for (long totalAmount : salaries ) {
//            System.out.println("totalAmount = " + totalAmount);
        }

        for (long salary : salaries){

//            if(salary > 100000){
//                System.out.println("salary = " + salary);
//            }
            if(salary<=100000){
                continue;
            }
            System.out.println("salary = " + salary);
        }



    }
}
