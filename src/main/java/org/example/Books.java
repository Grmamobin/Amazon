package org.example;
import java.util.ArrayList;

public class Books extends SubCategory {
    public static String shape;
    public Books(String id,String name, double price, int quantity, ArrayList<String> commentList,String subcategory) {
        super(id,name, price, quantity, commentList, "Books", subcategory);
    }

    @Override
    public double getDiscount() {
        return getPrice() * (0.6); //60% off
    }
}
