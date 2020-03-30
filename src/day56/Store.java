package day56;

import java.util.ArrayList;
import java.util.List;

public class Store {

    String name;
List<Product> allProducts;

   public Store(){
       this.name = "Cybertek Store";
        this.allProducts = new ArrayList<>();
   }

    public Store(String name, List<Product> otherProduct) {
       this();
        this.name = name;
       this.allProducts.addAll(otherProduct);


    }
    public void addProduct(Product p){
       this.allProducts.add(p);
    }
    public void addProduct(String productName,int productPrice){
       Product newP = new Product(productName,productPrice);
       allProducts.add(newP);

   }
public int getProductCount(){
    return allProducts.size();
}

    public void displayProducts(){

       for (Product each :allProducts) {
            System.out.println("each = " + each);
        }
    }

    public void removeProduct(Product p){
       this.allProducts.remove(p);
    }
    public boolean checkIfProductExist(Product p){
    return allProducts.contains(p);
    }

    public int indexOfProduct(Product p){
       return allProducts.indexOf(p);
    }

    public double getAveragePrice(){
       return findSumOfAllProducts()/getProductCount();
    }

    public int findSumOfAllProducts(){
       int sum = 0;
        for (Product each :allProducts) {
           sum+= each.getPrice();
        }
    return sum;
    }
   public double maxPrice(){
       double max = 0;
       for (int x = 0; x < allProducts.size(); x++) {
           if(allProducts.get(x).getPrice()>max){
            max = allProducts.get(x).getPrice();
          }
       }
     return max;
   }


    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", allProducts=" + allProducts +
                '}';
    }
}
