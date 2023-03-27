package org.example;

import java.util.ArrayList;
public abstract class Category extends Product {
  /*  public abstract void modelProduct();*/
    private String category;
    public Category(String id,String productName , double price ,int quantity , ArrayList<String> commentList ,String category){
        super(id,productName , price , quantity , commentList);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public abstract double getDiscount();

    @Override
    public String toString() {
        return "Category{" +
                "category='" + category + '\'' +
                '}';
    }
}
