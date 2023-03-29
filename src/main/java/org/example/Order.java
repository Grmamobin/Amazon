package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private boolean checkout;
    private Date date;
    private double totalPrice;
    private User detailsBuyer;
    private Seller detailsSeller;
    private ArrayList<Product> product;
    private ArrayList<User> orders;

    public Order(boolean checkout , Date date , double totalPrice , User detailsBuyer , Seller detailsSeller){
        this.checkout = true;
        this.date = date;
        this.totalPrice = totalPrice;
        this.detailsBuyer = detailsBuyer;
        this.detailsSeller = detailsSeller;
    }


    public Date getDate() {
        return new Date();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public User getDetailsBuyer() {
        return detailsBuyer;
    }

    public Seller getDetailsSeller() {
        return detailsSeller;
    }

    public ArrayList<Product> getProduct() {
        return product;
    }

    public ArrayList<User> getOrders() {
        return orders;
    }
    public void addOrder(User detailsBuyer){
        orders.add(detailsBuyer);
    }

    public void ConformReceive(){

    }
    public  void  UpdateRemaining(){

    }


}
