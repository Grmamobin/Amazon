package org.example;

import java.util.ArrayList;
public abstract class Category extends Product {
    public abstract void modelProduct();
    public Category(String productName , double price ,int quantity , ArrayList<String> commentList){
        super(productName , price , quantity , commentList);
        this.modelProduct();
    }
}
