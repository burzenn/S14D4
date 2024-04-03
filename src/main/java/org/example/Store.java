package org.example;

import org.example.model.Bread;
import org.example.model.Chocolate;
import org.example.model.Coke;
import org.example.model.ProductForSale;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[4];
        products[0] = new Bread("brown",5,"only breakfast","sandwich");
        products[1] = new Chocolate("dark",15,"delicious","cacao");
        products[2] = new Coke("diet",10,"not healthy","white");

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products){
            if(product != null){
                product.showDetails();
            }
        }


    }

}
