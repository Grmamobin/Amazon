package org.example;

import java.util.ArrayList;

public abstract class SubCategory extends Category {

    public SubCategory(String id,String name, double price, int quantity, ArrayList<String> commentList,
                       String category, String subcategory ,String buyer){

        super(id,name, price, quantity, commentList ,category,buyer);

    }

}
