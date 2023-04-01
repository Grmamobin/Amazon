package org.example;

import java.util.ArrayList;

public abstract class SubCategory extends Category {
    private String subCategory;
    public String buyer ;

    public SubCategory(String id,String name, double price, int quantity, ArrayList<String> commentList, String category, String subcategory ,String buyer) {
        super(id,name, price, quantity, commentList ,category);
        this.subCategory = subcategory;
        this.buyer = buyer;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

/*    @Override
    public String toString() {
        return "SubCategory{" +
                "subCategory='" + subCategory + '\'' +
                '}';
    }*/
}
