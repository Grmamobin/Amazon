package org.example;

import org.json.JSONObject;

import java.util.ArrayList;

public  class User extends Account {

    private ArrayList<Order> ListOrderforUser;
    private ArrayList<Order> PurchasedProducts;
    private ArrayList<Order> cart;
    JSONObject rateProduct = new JSONObject(); //using json for rating to all products
    private double rate;
    public  User(String username , String password , String emailAddress , String phoneNumber , String address, String gender){

        super(username,password,emailAddress,phoneNumber,address , gender);
        this.ListOrderforUser = new ArrayList<>();
        this.PurchasedProducts = new ArrayList<Order>();
        this.cart = new ArrayList<Order>();

    }

    public User(String username , String password){
        super(username, password);
    }

    public void transaction(Shop shop){ //add money to sellers wallet  -->

        for(Account seller : shop.getListAccounts()) {

            if(shop.getCurrentAccount(seller.getUsername()) != null ) {

                for(Order order: this.ListOrderforUser) {

                    if(seller.getUsername().equals(order.getDetailsSeller())) {

                        Seller seller1 = (Seller) seller;
                        seller1.setPriceInWallet(order.getTotalPrice() * 0.9); //sellers got 90% of money -->
                        seller1.setNotification1("\uD83D\uDD14");
                    }

                }

            }

        }

    }

    public void setListOrder(int quantity , Order order) {

        order.setQuantity(quantity);
        order.setUnitPrice(order.getUnitPrice());
        order.setTotalPrice(order.getUnitPrice() * quantity);

    }

    public ArrayList<Order> getListOrder() {
        return ListOrderforUser;
    }

    public ArrayList<Order> getPurchasedProducts() {
        return PurchasedProducts;
    }

    public ArrayList<Order> getCart() {
        return cart;
    }

    public void addToCart(Order product){
        cart.add(product);
    }

    public void removeToCart(Order product){
        cart.remove(product);
    }

    public void addToListOrderForUser(Order order){
        ListOrderforUser.add(order);
        addToCart(order);
    }

    public void removeToListOrderForUser(Order order){
        ListOrderforUser.remove(order);
        removeToCart(order);
    }

    public Order FindOrderUser(String id){

        for (Order order : this.ListOrderforUser) {

            if (order.getId().equals(id)) {
                return order;
            }
        }
        return null;
    }

    public void addPurchasedProducts(){
        PurchasedProducts.addAll(ListOrderforUser);
    }

    public void viewProfile() {  //take picture for profile-->

        if(getGender().equals("Woman")){
            System.out.print("       ),\n" +
                    "    .(>o<).\n" +
                    "   / ~~~~~ \\\n" +
                    "   ) '*_*' (\n" +
                    "  ((  ._.  ))\n" +
                    "    '.._..'    \n" +
                    "  _,.'___'.,_\n" +
                    " /.:.:.:.:.:.\\\n");
        }
        else{
            System.out.print("    .+++++.\n" +
                    "   | ~~~~~ |\n" +
                    "   ) '*_*' (\n" +
                    "   (  ._.  )\n" +
                    "    '.._..'    \n" +
                    "  _,/\\   /\\,_\n" +
                    " /    ':'    \\\n");
        }

        System.out.println("Username : " + this.getUsername());
        System.out.println("Password : "+this.getPassword());
        System.out.println("Email Address : " + this.getEmailAddress());
        System.out.println("Phone Number : +98"+ this.getPhoneNumber());
        System.out.print("Address : "+ this.getAddress()+"\n");
        System.out.println("Gender : (Man/Woman)"+this.getGender());

    }

    public void requestFunds(double amount, User user) { //ask admin for fund
        System.out.println("SENT \uD83D\uDCE9--> request to admin for "+amount+" money from  "+ user.getUsername());
    }

    public double getRate(String id) {

        try {
            return rateProduct.getDouble(id);
        }
        catch (Exception e) {
            return 0;
        }
    }

    public void setRate(String id,double rate) {

        if(rate < 5.5 && rate > 0) {
            this.rate = rate;
            rateProduct.put(id, this.rate);
        }

    }

    @Override
    public String toString() {
        return "User :" +
                " username='" + getUsername() + '\'' +
                " password='" + getPassword() + '\'' +
                " emailAddress='" + getEmailAddress() + '\'' +
                " phoneNumber='" + getPhoneNumber() + '\'' +
                " address='" + getAddress()+ '\'' +
                " Request price is =  "+ getUserAndNewAmount();
    }

}
