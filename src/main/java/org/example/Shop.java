package org.example;
import java.util.*;

public class Shop {
    private String ShopName;
    private String WebAddress;
    private String SupportPhone;
    private ArrayList<Account> ListAccounts;
    private ArrayList<Product> ListProducts;
    private HashMap<String, Integer> ProductMaps;
    private ArrayList<Order> ListOrders;
    public static String ANSI_RESET = "\u001B[0m";
    // Declaring the color
    // Custom declaration

    public static String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    private double TotalProfit;
    private Account currentAccount; //*
/*    public Shop() {
        currentAccount = new Account("", "", "", "","","");
        ListAccounts = new ArrayList<>();
        *//*{
            @Override
            public String getType() {
                return null;
            }
        };*//*
        Account admin = new Admin("Mobina", "2004", "dymamsijhidjj@gmail.com", "09102000040","iran","Woman");
     *//*   ListAccounts.add(admin);*//*
    }*/

    public Shop(String ShopName , String WebAddress , String SupportPhone /*,Account currentAccount*/){
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

    public void setShopName(String shopName) {
        ShopName = shopName;
    }
    public String setColor(String color){
     if(color.equals("BLACK")){
         return ANSI_BLACK_BACKGROUND;
     }
     if(color.equals("YELLOW")){
         return ANSI_YELLOW_BACKGROUND;
     }
     if(color.equals("BLUE")){
         return ANSI_BLUE_BACKGROUND;
     }
     if(color.equals("CYAN")){
         return ANSI_CYAN_BACKGROUND;
     }
     if(color.equals("PURPLE")){
         return ANSI_PURPLE_BACKGROUND;
     }
     if(color.equals("WHITE")){
         return ANSI_YELLOW_BACKGROUND;
     }
     if(color.equals("RED")){
            return ANSI_RED_BACKGROUND;
     }
     return ANSI_GREEN_BACKGROUND;
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

    public void removeFromListAccount(Account account){
        ListAccounts.remove(account);
    }

    public Account getCurrentAccount() {
        return currentAccount;
    }
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
            System.out.println("...........***...........................WELCOME New Admin Plz Wait For Head Of Admins To Accept you And Try It Again In LogIn ...........***...........................");

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
    public void increaseQuantity(Product product, int quantity){
        int currentQuantity = product.getQuantity();
        product.setQuantity(currentQuantity + quantity);
    }
    public void decreaseQuantity(Product product , int quantity , Shop shop ,String id , int count , User user) {
        int currentQuantity = product.getQuantity();
        if (currentQuantity >= quantity) {
            product.setQuantity(currentQuantity - quantity);
            System.out.println("ADD SUCCESSFULLY");
            Order order = new Order(shop.getChoosenProduct(id).getId(),count, new Date(), shop.getChoosenProduct(id).getPrice(),shop.getChoosenProduct(id).getPrice(), user, null);
            shop.addToListOrder(user,order);
        } else {
            System.out.println("If you haven't noticed, this product no longer exists.");
        }

    }
    public void addComment(Product product , String comment) {
            product.addComment(comment);
    }

    public boolean doesProductExist(String id) {
        for (Product product : ListProducts) {

            if (product.getId().equals(id) && product.getQuantity() >= 1) {
                return true;
            }
        }
        return false;
    }

    public void addToListOrder(User user,Order order){
        ListOrders.add(order); //related to doc we should have list of all order
        user.addToListOrderForUser(order);
        TotalProfit += order.getTotalPrice();
    }

    public ArrayList<Account> getListAccounts() {
        return ListAccounts;
    }

    public ArrayList<Account>  searchByUsername(String username) {
        // Implement search by genre logic here
        ArrayList<Account> result = new ArrayList<>();
        for (Account account : ListAccounts) {
            if (username.compareTo(account.getUsername()) == 0) {
                result.add(account);
            }
        }
        return result;
    }

    public ArrayList<Product> searchByTitle(String title) {

        ArrayList<Product> result = new ArrayList<>();
        for (Product product : ListProducts)
        {
            if(title.compareTo(product.getProductName())== 0)
            {
                result.add(product);
            }
        }
        return result;
    }

    public ArrayList<Product> ClassifiedHigher(String title) {

        ArrayList<Product> result = new ArrayList<>();
        for (Product product : ListProducts)
        {
            if(title.compareTo(product.getProductName())== 0)
            {
                result.add(product);
            }
        }
        Collections.sort(result , Comparator.comparing( Product::getPrice));
        return result;
    }

    public ArrayList<Product> ClassifiedLower(String title) {

        ArrayList<Product> result = new ArrayList<>();
        for (Product product : ListProducts)
        {
            if(title.compareTo(product.getProductName())== 0)
            {
                result.add(product);
            }
        }
        Collections.sort(result , Comparator.comparing( Product::getPrice));
        Collections.reverse(result);
        return result;
    }

    @Override
    public String toString() {
        return "ListAccounts = " + getListAccounts();
    }
}