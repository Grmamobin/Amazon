package org.example;

import java.util.ArrayList;

public class User extends Account{
    private String address;
    private ArrayList<Product> ListOrder;
    private ArrayList<Product> PurchasedProducts;
    private ShoppingCart cart;
    public  User(String username , String password , String emailAddress , String phoneNumber , String address, String gender){
        super(username,password,emailAddress,phoneNumber,address , gender);
        this.ListOrder = new ArrayList<>();
        this.PurchasedProducts = new ArrayList<>();
        this.cart = new ShoppingCart();
    }
    public User(String username , String password){
        super(username, password);
    }
    public String getAddress() {
        return address;
    }

    public void setListOrder(ArrayList<Product> listOrder) {
        ListOrder = listOrder;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Product> getListOrder() {
        return ListOrder;
    }
    public void addToListOrder(Product product) {
        ListOrder.add(product);
        System.out.println("Add successfully to your order list");
    }
    public ArrayList<Product> getPurchasedProducts() {
        return PurchasedProducts;
    }

    public void setPurchasedProducts(ArrayList<Product> purchasedProducts) {
        PurchasedProducts = purchasedProducts;
    }
    public ShoppingCart getCart() {return cart;}

    public void setCart(ShoppingCart cart) {this.cart = cart;}
    public void addToCart(Product product){

    }

    public void addPurchasedProducts(Product product){
        PurchasedProducts.add(product);
    }
    public void searchByTitle(){ //*

    }
    public void searchByModel(){ //*

    }
    public void viewProfile(){

        if(getGender().equals("woman")){
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
                    " /    ':'    \\");
        }

        System.out.println("Username : " + this.getUsername());
        System.out.println("Password : "+this.getPassword());
        System.out.println("Email Address : " + this.getEmailAddress());
        System.out.println("Phone Number : +98"+ this.getPhoneNumber());
        System.out.print(  "Address : "+ this.getAddress());
        System.out.println("Gender : (Man/Woman)"+this.getGender());

    }
    public void editProfile(String editUsername , String  editPassword , String  editEmail , String editPhone , String editAddress , String editGender) {

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

    }
  /*  @Override
    public String getType() {
        return "User";
    }*/

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