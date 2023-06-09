package org.example;

import java.util.ArrayList;

public class Books extends SubCategory {

    public Books(String id,String name, double price, int quantity,
                 ArrayList<String> commentList,String subcategory,String buyer,double rating) {

        super(id,name, price, quantity, commentList, "Books", subcategory,buyer ,rating);

    }

    @Override
    public double getDiscount() {
        return getPrice() * (0.6); //60% off
    }

}
