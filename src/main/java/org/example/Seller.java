package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Seller extends Account {

    private double priceInWallet;

    private String ShopName;

    public  Seller(String ShopName, String username,String password
            , String emailAddress , String phoneNumber, String address , String gender) {

        super(username , password ,emailAddress,phoneNumber ,address ,gender);
        this.ShopName = ShopName;
        this.priceInWallet = 0.0;

    }

    public Seller(String ShopName,String username , String password){

        super(username, password);
        this.priceInWallet = 0.0;

    }


    public void setShopName(String shopName , Shop shop) {
        ShopName = shopName;
        shop.setShopName(shopName);
    }

    public double getPriceInWallet() {
        return priceInWallet;
    }

    public void setPriceInWallet(double price) {
        this.priceInWallet = price+ priceInWallet;
    }

    public void ListAvailable(Shop shop){
        System.out.println("List of available products: ");

        for(Product product :  shop.getListProducts()){
            if(product.getQuantity() != 0){
                System.out.println(product);
            }
        }
    }

    public String LatestIdMan(){

         ArrayList<Product> result = new ArrayList<>();
        for (Product product : Product.ManClothes) {
                result.add(product);
        }

        Collections.sort(result, Comparator.comparing(Product::getId));
        Collections.reverse(result);
         Product x = result.get(0);
          return x.getId();
    }

    public String LatestIdWoman(){

        ArrayList<Product> result = new ArrayList<>();
        for (Product product : Product.WomanClothes) {
            result.add(product);
        }

        Collections.sort(result, Comparator.comparing(Product::getId));
        Collections.reverse(result);
        Product x = result.get(0);
        return x.getId();
    }

    public String LatestIdKids(){

        ArrayList<Product> result = new ArrayList<>();
        for (Product product : Product.KidsClothes) {
            result.add(product);
        }

        Collections.sort(result, Comparator.comparing(Product::getId));
        Collections.reverse(result);
        Product x = result.get(0);
        return x.getId();
    }

    public String LatestIdLaptop(){

        ArrayList<Product> result = new ArrayList<>();
        for (Product product : Product.Laptops) {
            result.add(product);
        }

        Collections.sort(result, Comparator.comparing(Product::getId));
        Collections.reverse(result);
        Product x = result.get(0);
        return x.getId();
    }

    public String LatestIdTv(){

        ArrayList<Product> result = new ArrayList<>();
        for (Product product : Product.Tv) {
            result.add(product);
        }

        Collections.sort(result, Comparator.comparing(Product::getId));
        Collections.reverse(result);
        Product x = result.get(0);
        return x.getId();
    }

    public String LatestIdPhone(){

        ArrayList<Product> result = new ArrayList<>();
        for (Product product : Product.Phone) {
            result.add(product);
        }

        Collections.sort(result, Comparator.comparing(Product::getId));
        Collections.reverse(result);
        Product x = result.get(0);
        return x.getId();
    }

    public String LatestIdPoetry(){

        ArrayList<Product> result = new ArrayList<>();
        for (Product product : Product.Poetry) {
            result.add(product);
        }

        Collections.sort(result, Comparator.comparing(Product::getId));
        Collections.reverse(result);
        Product x = result.get(0);
        return x.getId();
    }

    public String LatestIdDrama(){

        ArrayList<Product> result = new ArrayList<>();
        for (Product product : Product.Drama) {
            result.add(product);
        }

        Collections.sort(result, Comparator.comparing(Product::getId));
        Collections.reverse(result);
        Product x = result.get(0);
        return x.getId();
    }

    public String LatestIdFiction(){

        ArrayList<Product> result = new ArrayList<>();
        for (Product product : Product.Fiction) {
            result.add(product);
        }

        Collections.sort(result, Comparator.comparing(Product::getId));
        Collections.reverse(result);
        Product x = result.get(0);
        return x.getId();
    }

    @Override
    public String toString() {
        return "Name seller : " + getUsername();
    }

}

