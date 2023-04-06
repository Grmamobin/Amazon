package org.example;

import java.util.ArrayList;

public class Clothes extends SubCategory {

    public Clothes(String id, String name, double price, int quantity
            , ArrayList<String> commentList, String subcategory,String buyer,double rating) {

        super(id, name, price, quantity, commentList, "Clothes", subcategory,buyer,rating);

    }

    @Override
    public double getDiscount() {
        return getPrice() * (0.3); //30% off
    }

}