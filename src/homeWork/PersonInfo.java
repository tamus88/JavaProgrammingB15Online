package homeWork;

public class PersonInfo {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.getInfo("Tamara","Suleymanova",31);
        System.out.println(p1.toString());
        p1.noArg();
    }

}
