package org.example;

import java.util.ArrayList;
import java.util.List;

public class SupermarketManager {


    private List<Product> productsInStock;

    public SupermarketManager() {
        this.productsInStock = new ArrayList<>();
    }

    public void addProducts(Product product){
        productsInStock.add(product);
    }

    public void getStatusOfGoods(){
        for (Product p : productsInStock){
            System.out.println(p.getName());
        }
    };
    public int getNumberOfSourMilk(){
       int souredMilk = 0;
       for (Product p : productsInStock){
          if(p.getProductType().equals(ProductType.MILK)){
              if (p instanceof ExpirationChecker e){
                   e.isExpired();
                   souredMilk++;
              }
          }
       }
        System.out.println(souredMilk);
       return souredMilk;
    };
}
