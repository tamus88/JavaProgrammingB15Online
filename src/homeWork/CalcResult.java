package homeWork;

public class CalcResult {

    public static void main(String[] args) {

        Calc a = new Calc();
        a.setX(1);
        a.setY(1);
        a.plus();
        System.out.println("1+1 = " + a.getResult());//1+1 = 2

        int num = 98;
        String vb = ""+num;
        System.out.println(vb+"av");
    }
}
