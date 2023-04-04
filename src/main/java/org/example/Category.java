package org.example;

import java.util.ArrayList;

public abstract class Category extends Product {

    private String category;
    public Category(String id,String productName , double price ,int quantity
            , ArrayList<String> commentList ,String category,String buyer ){

        super(id,productName , price , quantity , commentList , buyer);
        this.category = category;

    }

    public abstract double getDiscount();

}
