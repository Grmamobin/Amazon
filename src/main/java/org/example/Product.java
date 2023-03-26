package org.example;

import java.util.ArrayList;

public class Product {
    private String productName;
    private double price;
    private int quantity;
    private ArrayList<String> commentList;

    public Product(String productName , double price , int quantity , ArrayList<String> commentList){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.commentList = commentList;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public ArrayList<String> getCommentList() {
        return commentList;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCommentList(ArrayList<String> commentList) {
        this.commentList = commentList;
    }
    public void addComment(String comment){
        commentList.add(comment);
    }

    public double increaseQuantity(double quantity){
        return quantity++;
    }
    public double decreaseQuantity(double quantity){
        return quantity--;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", quantity='" + quantity + '\'' +
                ", commentList=" + commentList +
                '}';
    }
}
