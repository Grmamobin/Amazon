package org.example;

import java.util.ArrayList;

public abstract class User extends Account{
    private String address;
    private ArrayList<Order> ListOrder;
    private ArrayList<Product> PurchasedProducts;
    private ShoppingCart cart;
    public  User(String username , String password , String emailAddress , String phoneNumber , String address){

        super(username , password , emailAddress , phoneNumber);
        this.address = address;
        this.ListOrder = new ArrayList<>();
        this.PurchasedProducts = new ArrayList<>();
        this.cart = new ShoppingCart();
    }

    public String getAddress() {
        return address;
    }

    public void setListOrder(ArrayList<Order> listOrder) {
        ListOrder = listOrder;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Order> getListOrder() {
        return ListOrder;
    }
    public void addToListOrder(Order order){ListOrder.add(order);System.out.println("Add successfully to your order list");}
    public ArrayList<Product> getPurchasedProducts() {
        return PurchasedProducts;
    }

    public void setPurchasedProducts(ArrayList<Product> purchasedProducts) {PurchasedProducts = purchasedProducts;}

    public ShoppingCart getCart() {return cart;}

    public void setCart(ShoppingCart cart) {this.cart = cart;}
    public void addToCart(){}//*

    public void addPurchasedProducts(Product product){
        PurchasedProducts.add(product);
    }
    public void searchByTitle(){ //*

    }
    public void searchByModel(){ //*

    }
    public void viewProfile(){}//*
    public void editProfile(){}//*

    @Override
    public String toString() {
        return "User{" +
                "username='" + getUsername() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", emailAddress='" + getEmailAddress() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", address='" + getAddress() + '\'' +
                '}';
    }
}