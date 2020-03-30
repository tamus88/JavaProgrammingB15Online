package day12;

public class CarShopping {

    public static void main(String[] args) {


        String carBrand = "corolla";
        int carPrice = 60000;
        int budget = 40000 ;

//               if(carBrand.equals("corolla") || (carBrand.equals("Tesla") && carPrice<=budget)){
//
//            System.out.println( " Car Acquired ");
//
//            }else{
//            System.out.println(" Not What I AM Looking For ");
//
//        }

        if( carBrand.equals("corolla")){
            System.out.println( " Car Acquired " );
        }else if (carBrand.equals(" Tesla ") && carPrice <= budget){
            System.out.println( " Car Acquired ");
        }else{
            System.out.println(" Not What I AM Looking For ");
        }



    }
}
