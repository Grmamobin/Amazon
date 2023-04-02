package org.example;

import java.util.ArrayList;

public class Seller extends Account{
    private String ShopName;
    private ArrayList<Seller> ListAuthorization;
    public  Seller(String ShopName, String username,String password , String emailAddress , String phoneNumber
            , String address , String gender){
        super(username , password ,emailAddress,phoneNumber ,address ,gender);
        this.ShopName = ShopName;
        this.ListAuthorization = new ArrayList<>();
    }
    public Seller(String ShopName,String username , String password){
        super(username, password);
        this.ShopName = ShopName;
    }



    public String getShopName() {
        return ShopName;
    }

    public ArrayList<Seller> getListAuthorization() {
        return ListAuthorization;
    }

    public void setShopName(String shopName , Shop shop) {
        ShopName = shopName;
        shop.setShopName(shopName);
    }

    public void setListListAuthorization(ArrayList<Product> listListAuthorization) {
        ListAuthorization = ListAuthorization;
    }
    public void addSeller(Seller seller){
        ListAuthorization.add(seller);
    }
    public void removeSeller(Seller seller) {
        ListAuthorization.remove(seller);
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

