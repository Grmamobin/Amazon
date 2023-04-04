package org.example;

public class Seller extends Account{

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

    @Override
    public String toString() {
        return "Name seller : " + getUsername();
    }

}

