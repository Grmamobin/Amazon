package org.example;

import java.util.ArrayList;

public class Seller extends Account{
    private String ShopName;

    public  Seller(String ShopName, String username,String password , String emailAddress , String phoneNumber, String address , String gender){
        super(username , password ,emailAddress,phoneNumber ,address ,gender);
        this.ShopName = ShopName;
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


    @Override
    public String toString() {
        return "Name seller : " + getUsername() + "\n"+
                "PassWord seller : " + getPassword() + "\n";
    }
}

