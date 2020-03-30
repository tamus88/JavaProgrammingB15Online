package day55;

public class TaxiAction {
    public static void main(String[] args) {

      Engine e1 = new Engine("v6",400);
      Driver d1 = new Driver("Guga",12345);
        System.out.println(d1.name.charAt(0));
        Taxi t1 = new Taxi(101,e1,d1);
      System.out.println(t1);
   Taxi t2 = new Taxi(102,new Engine("v8",777),new Driver("Toma",5678));
        System.out.println("t2 = " + t2);

        System.out.println(t2.dr.name);
         int x = t2.plateNumber;
         Driver y = t2.dr;
         Engine z = t2.eng;
        System.out.println(y.name);
        System.out.println(t2.dr.name.charAt(0));
        System.out.println(t2.eng.horsePower);

    }


}
