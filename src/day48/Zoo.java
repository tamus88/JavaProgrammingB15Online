package day48;

public class Zoo {

    public static void main(String[] args) {

        Kangaroo k1 = new Kangaroo("Australia", 3);
        k1.eat();
        k1.bounce();

        Ball b1 = new Ball("Circle", "Black");
        b1.color = "White";
        b1.bounce();
        System.out.println(k1);
    }
}
