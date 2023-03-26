package org.example;

import java.util.ArrayList;

public class Seller extends Account{
    private String ShopName;
    private ArrayList<Product> ListAvailableProducts;
    public  Seller(String ShopName, String password , String username , String emailAddress , String phoneNumber , String address){
        super(username , password ,emailAddress,phoneNumber ,address);
        this.ShopName = ShopName;
        this.ListAvailableProducts = new ArrayList<>();
    }

    public String getShopName() {
        return ShopName;
    }

    public ArrayList<Product> getListAvailableProducts() {
        return ListAvailableProducts;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public void setListAvailableProducts(ArrayList<Product> listAvailableProducts) {
        ListAvailableProducts = listAvailableProducts;
    }
    public void addProduct(Product product){
        ListAvailableProducts.add(product);
    }
    public void removeProduct(Product product) {
        ListAvailableProducts.remove(product);
    }
    public boolean IsAuthorization(){
        return false;
    }
    @Override
    public String getType() {
        return "Seller";
    }


    @Override
    public String toString() {
        return "Seller{" +
                "ShopName='" + ShopName + '\'' +
                ", username='" + getUsername() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", phone number='" + getPhoneNumber()+ '\'' +
                ", ListAvailableProducts=" + ListAvailableProducts +
                ", wallet=" + getWallet() +
                '}';
    }
}

