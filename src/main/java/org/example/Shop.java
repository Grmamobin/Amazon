package org.example;
import java.util.ArrayList;
import java.util.HashMap;

public class Shop {
    private String ShopName;
    private String WebAddress;
    private String SupportPhone;
    private ArrayList<Account> ListAccounts;
    private HashMap<Product , Product> ListProducts; // name / price *
    private ArrayList<Order> ListOrders;
    private double TotalProfit;
    private User currentUser; //*

    public Shop(String ShopName , String WebAddress , String SupportPhone){
        this.ShopName = ShopName;
        this.WebAddress=WebAddress;
        this.SupportPhone = SupportPhone;
        this.ListAccounts = new ArrayList<>();
        this.ListProducts = new HashMap<>();
        this.ListOrders = new ArrayList<>();
        this.TotalProfit = 0.0;
        this.currentUser = null;
    }

    public String getShopName() {
        return ShopName;
    }

    public String getWebAddress() {
        return WebAddress;
    }

    public String getSupportPhone() {
        return SupportPhone;
    }

    public double getTotalProfit() {
        return TotalProfit;
    }
    public void addToListProducts(Product product , Product price){
        ListProducts.put(product , price);
    }
    public void addToListAccounts(Account account){
        ListAccounts.add(account);
    }
    public void addToListOrder(Order order){ListOrders.add(order); TotalProfit += order.getTotalPrice();}
    public void confirmOrder(Order order){} //*
}