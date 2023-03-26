package org.example;
import java.util.ArrayList;
import java.util.HashMap;

public class Shop {
    private String ShopName;
    private String WebAddress;
    private String SupportPhone;
    private ArrayList<Account> ListAccounts;
    private HashMap<Product , Product> ListProducts; // name / price *
    private ArrayList<Order> ListOrders;
    private double TotalProfit;
    private Account currentAccount; //*
    public Shop() {
        currentAccount = new Account("", "", "", "","") {
            @Override
            public String getType() {
                return null;
            }
        };
        Account admin = new Admin("Mobina", "2004", "dymamsijhidjj@gmail.com", "09102000040","iran");
        ListAccounts.add(admin);
    }
    public Shop(String ShopName , String WebAddress , String SupportPhone ,Account currentAccount){
        this.ShopName = ShopName;
        this.WebAddress=WebAddress;
        this.SupportPhone = SupportPhone;
        this.ListAccounts = new ArrayList<>();
        this.ListProducts = new HashMap<>();
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
    public void addToListProducts(Product product , Product price){
        ListProducts.put(product , price);
    }
    public void addToListAccounts(Account account){
        ListAccounts.add(account);
    }

    public Account getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(Account currentAccount) {
        this.currentAccount = currentAccount;
    }

    public boolean createAccount(String username, String password, String email, String phone, String address,
                                 String typeAccount , String shopName) {

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
            Account account = new Admin(username, password, email, phone, address);
            System.out.println("...........***...........................WELCOME New Admin...........***...........................");
            ListAccounts.add(account);
            return true;
        }
        if (typeAccount.equals("Seller")) {
            Account account = new Seller(username, password, email, password, address, shopName);
            System.out.println("...........***...........................WELCOME New Seller...........***...........................");
            ListAccounts.add(account);
            return true;
        }
            System.out.println("...........***...........................WELCOME New User...........***...........................");
            Account account = new User(username, password, email, password, address);
            ListAccounts.add(account);
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

    public void addToListOrder(Order order){ListOrders.add(order); TotalProfit += order.getTotalPrice();}
    public void confirmOrder(Order order){} //*
}