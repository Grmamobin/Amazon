package org.example;

import java.util.ArrayList;

public class User extends Account{
    private String address;
    private ArrayList<Order> ListOrderforUser;
    private ArrayList<Product> PurchasedProducts;
    private ArrayList<Order> cart;
   /* ShoppingCart cart;*/
    public  User(String username , String password , String emailAddress , String phoneNumber , String address, String gender){
        super(username,password,emailAddress,phoneNumber,address , gender);
        this.ListOrderforUser = new ArrayList<>();
        this.PurchasedProducts = new ArrayList<>();
        /*this.cart = new ShoppingCart();*/
        this.cart = new ArrayList<Order>();
    }
    public User(String username , String password){
        super(username, password);
    }
    public String getAddress() {
        return address;
    }

    public void setListOrder(int quantity , Order order) {
        order.setQuantity(quantity);
        order.setUnitPrice(order.getUnitPrice());
        order.setTotalPrice(order.getUnitPrice() * quantity);

    }
    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Order> getListOrder() {
        return ListOrderforUser;
    }
 /*   public void addToListOrder(Product product) {
        ListOrder.add(product);
        System.out.println("Add successfully to your order list");
    }*/
    public ArrayList<Product> getPurchasedProducts() {
        return PurchasedProducts;
    }

    public void setPurchasedProducts(ArrayList<Product> purchasedProducts) {
        PurchasedProducts = purchasedProducts;
    }
    public ArrayList<Order> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Order> cart) {
        this.cart = cart;
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
    public void addPurchasedProducts(Product product){
        PurchasedProducts.add(product);
    }
    public void searchByTitle(){ //*

    }
    public void searchByModel(){ //*

    }
    public void viewProfile(){

        if(getGender().equals("Woman")){
            System.out.print("       ),\n" +
                    "    .(>o<).\n" +
                    "   / ~~~~~ \\\n" +
                    "   ) '*_*' (\n" +
                    "  ((  ._.  ))\n" +
                    "    '.._..' ScS\n" +
                    "  _,.'___'.,_\n" +
                    " /.:.:.:.:.:.\\\n");
        }
        else{
            System.out.print("    .+++++.\n" +
                    "   | ~~~~~ |\n" +
                    "   ) '*_*' (\n" +
                    "   (  ._.  )\n" +
                    "    '.._..' ScS\n" +
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
    public String editProfile(String editUsername , String  editPassword , String  editEmail , String editPhone , String editAddress , String editGender) {

        if (editUsername.equalsIgnoreCase("n")) {
            this.setUsername(editUsername);
        }
        if (editPassword.equalsIgnoreCase("n")) {
            this.setPassword(editPassword);
        }
        if (editEmail.equalsIgnoreCase("n")) {
            this.setEmailAddress(editEmail);
        }
        if (editPhone.equalsIgnoreCase("n")) {
            this.setAddress(editAddress);
        }
        if (editGender.equals("n")) {
            this.setGender(editGender);
        }

        System.out.println("You have edited your profile successfully. To see the changes, go to 'view profile'");

        return editUsername;
    }
  /*  @Override
    public String getType() {
        return "User";
    }*/

    public void requestFunds(double amount, User user) {
        System.out.println("Sent--> request to admin for "+amount+" money from  "+ user.getUsername() +"'s wallet");

    }

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