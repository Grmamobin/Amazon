package org.example;

import java.util.ArrayList;

public class Electronics extends SubCategory {

    public Electronics(String id,String name, double price, int quantity,
                       ArrayList<String> commentList, String subcategory,String buyer,double rating) {

        super(id,name, price, quantity,commentList ,"Electronics", subcategory,buyer ,rating);

    }

    @Override
    public double getDiscount() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

