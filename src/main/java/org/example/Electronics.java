package org.example;

import java.util.ArrayList;

public class Electronics extends SubCategory {

    public Electronics(String id,String name, double price, int quantity,
                       ArrayList<String> commentList, String subcategory,String buyer) {

        super(id,name, price, quantity,commentList ,"Electronics", subcategory,buyer);

    }

    public double getDiscount() {
     return getPrice() * (0.2); // 20% off
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

