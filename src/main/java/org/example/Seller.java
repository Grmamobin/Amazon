package org.example;
import java.util.ArrayList;
import java.util.HashMap;
public class Seller extends Account{
    private String ShopName;
    private double priceInWallet;
    private double saveMoney;
    private ArrayList<Order> Buys;

    public  Seller(String ShopName, String username,String password , String emailAddress , String phoneNumber, String address , String gender){
        super(username , password ,emailAddress,phoneNumber ,address ,gender);
        this.ShopName = ShopName;
        this.priceInWallet = 0.0;
        this.saveMoney = 0.0;
    }
    public Seller(String ShopName,String username , String password){
        super(username, password);
        this.ShopName = ShopName;
    }

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName , Shop shop) {
        ShopName = shopName;
        shop.setShopName(shopName);
    }

    public boolean IsAuthorization(){
        return false;
    }

   /* @Override
    public String getType() {
        return "Seller";
    }*/

    public double getPriceInWallet() {
        return priceInWallet;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public double getSaveMoney() {
        return saveMoney;
    }

    public void setSaveMoney(double Money) {
        this.saveMoney = saveMoney +Money;
    }

    public void setPriceInWallet(double price) {
        this.priceInWallet = price+ priceInWallet;
    }
    public void saveMoney(double quantity, double price){
         setSaveMoney(price * quantity);
    }
    public void addToListSave(Order order){
        Buys.add(order);
    }

    @Override
    public String toString() {
        return "Name seller : " + getUsername() ;
    }


}

