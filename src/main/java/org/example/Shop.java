package org.example;
import java.util.ArrayList;
import java.util.HashMap;

public class Shop {
    private String ShopName;
    private String WebAddress;
    private String SupportPhone;
    private ArrayList<Account> ListAccounts;
    private ArrayList<Product> ListProducts;
    private HashMap<String, Integer> ProductMaps;
    private ArrayList<Order> ListOrders;
    private double TotalProfit;
    private Account currentAccount; //*
    public Shop() {
        currentAccount = new Account("", "", "", "","","");
        ListAccounts = null;
        /*{
            @Override
            public String getType() {
                return null;
            }
        };*/
        Account admin = new Admin("Mobina", "2004", "dymamsijhidjj@gmail.com", "09102000040","iran","Woman");
     /*   ListAccounts.add(admin);*/
    }
    public Shop(String ShopName , String WebAddress , String SupportPhone ,Account currentAccount){
        this.ShopName = ShopName;
        this.WebAddress=WebAddress;
        this.SupportPhone = SupportPhone;
        this.ListAccounts = new ArrayList<>();
        this.ListProducts = new ArrayList<>();
        this.ListOrders = new ArrayList<>();
        this.TotalProfit = 0.0;
        this.currentAccount = currentAccount;
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
    public void addToListProducts(Product product ){
        ListProducts.add(product);
    }
    public void addToListAccounts(Account account){
        ListAccounts.add(account);
    }

  /*  public Account getCurrentAccount() {
        return currentAccount;
    }*/
    public Account getCurrentAccount(String username) {

        for (Account user : this.ListAccounts) {

            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
    public Product getChoosenProduct(String id) {

        for (Product product : this.ListProducts) {

            if (product.getId().equals(id)) {

                return product;
            }
        }
        return null;
    }
    public void setCurrentAccount(Account currentAccount) {
        this.currentAccount = currentAccount;
    }

    public boolean createAccount(String username, String password , String typeAccount) {

        for (Account account : ListAccounts) {

            if (account.getUsername().contains(username) && account.getPassword().contains(password)) {
                System.out.println("Can't Sign up cause you have an account");
                return false;
            }
            if (account.getUsername().contains(username)) {
                System.out.println("Plz change your username bc it's for another person ");
                return false;
            }
          /*  if (account.getType().equalsIgnoreCase(typeAccount)) {
                System.out.println("Account type mismatch.");
                return false;
            }*/
        }
        if (typeAccount.equals("Admin")) {
            /*Account accokunt = new Admin(username, password, email, phone, address);ListAccounts.add(account);*/
            System.out.println("...........***...........................WELCOME New Admin...........***...........................");

            return true;
        }
        if (typeAccount.equals("Seller")) {
           /* Account ackcount = new Seller(username, password, email, password, address, shopName); ListAccounts.add(account);*/
            System.out.println("...........***...........................WELCOME New Seller...........***...........................");

            return true;
        }
            System.out.println("...........***...........................WELCOME New User...........***...........................");
          /*  Account acckount = new User(username, password, email, password, address);
            ListAccounts.add(account);*/
            return true;

    }
    public boolean login(String username, String password) {

        for (Account account : ListAccounts)
        {
            if (account.getUsername().contains(username) && account.getPassword().contains(password))
            {
                setCurrentAccount(account);
                return true;
            }

        }
        return false;
    }
    public void logout() {
        System.out.println("Hop you're Entertaining");
        this.currentAccount = null;
        return;
    }
    public void increaseQuantity(String id){
        if (!ProductMaps.containsKey(id)) {

            ProductMaps.put(id, 1);
        } else {

            ProductMaps.replace(id, ProductMaps.get(id) + 1);
        }
    }
    public void decreaseQuantity(String id) {
        ProductMaps.replace(id,ProductMaps.get(id) - 1);
    }
    public boolean doesProductExist(String id) {
        for (Product product : this.ListProducts) {

            if (product.getId().equals(id) && ProductMaps.get(product.getId()) > 0) {
                return true;
            }
        }
        return false;
    }

    public void addToListOrder(Order order){
        ListOrders.add(order);
        TotalProfit += order.getTotalPrice();
    }
    public void confirmOrder(Order order){} //*
}