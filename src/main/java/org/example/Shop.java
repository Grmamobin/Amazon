package org.example;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import org.json.JSONObject;

public class Shop {

    private String ShopName;
    private String WebAddress;
    private String SupportPhone;
    private ArrayList<Account> ListAccounts;
    private ArrayList<Product> ListProducts;
    private ArrayList<Order> ListOrders;
    private ArrayList<Seller> ListAuthorization;
    private ArrayList<User>ListAuthorize;

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

    private double TotalProfit = 0.0;
    private Account currentAccount;

    public Shop(String ShopName , String WebAddress , String SupportPhone ){

        this.ShopName = ShopName;
        this.WebAddress=WebAddress;
        this.SupportPhone = SupportPhone;
        this.ListAccounts = new ArrayList<>();
        this.ListProducts = new ArrayList<>();
        this.ListOrders = new ArrayList<>();
        this.currentAccount = currentAccount;
        this.ListAuthorization = new ArrayList<>();
        this.ListAuthorize = new ArrayList<>();

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
            return ANSI_WHITE_BACKGROUND;
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

    public void setTotalProfit(double totalProfit) {
        TotalProfit  = totalProfit + TotalProfit;
    }

    public void addToListProducts(Product product ){
        ListProducts.add(product);
    }
    public void addToListAccounts(Account account){
        ListAccounts.add(account);
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

        }

        if (typeAccount.equals("Admin")) {
              System.out.println("      WELCOME New Admin Plz Wait For Head Of Admins To Accept you And Try It Again In LogIn                      ");

            return true;
        }

        if (typeAccount.equals("Seller")) {
                  System.out.println("        WELCOME New Seller          ");

            return true;
        }

        System.out.println("           WELCOME New User         ");

        return true;

    }

    public boolean login(String username, String password) {

        for (Account account : ListAccounts) {
            if (account.getUsername().contains(username) && account.getPassword().contains(password)) {
                setCurrentAccount(account);
                return true;
            }

        }

        return false;

    }

    public void logout() {
        System.out.println("     Hope you're Entertaining       ");
        this.currentAccount = null;
        return;
    }

    public void increaseQuantity(Product product, int quantity){
        int currentQuantity = product.getQuantity();
        product.setQuantity(currentQuantity + quantity);
    }

    public void decreaseQuantity(Product product , int quantity , Shop shop , String id , int count , User user , String seller) {

        int currentQuantity = product.getQuantity();
        if (currentQuantity >= quantity) {

            product.setQuantity(currentQuantity - quantity);
            System.out.println("ADD SUCCESSFULLY");
            Order order = new Order(shop.getChoosenProduct(id).getId(),count, new Date(), shop.getChoosenProduct(id).getPrice(),shop.getChoosenProduct(id).getPrice(),user,seller);
            shop.addToListOrder(user,order);
        }

        else {
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

    public void addToListOrder(User user, Order order){
        ListOrders.add(order); //related to doc we should have list of all order
        user.addToListOrderForUser(order);
    }

    public ArrayList<Product> getListProducts() {
        return ListProducts;
    }

    public ArrayList<Account> getListAccounts() {
        return ListAccounts;
    }

    public ArrayList<Account>  searchByUsername(String username) {

        ArrayList<Account> result = new ArrayList<>();
        for (Account account : ListAccounts) {
            if (username.compareTo(account.getUsername()) == 0) {
                result.add(account);
            }
        }

        return result;

    }

    public ArrayList<Product> searchByTitle(String title) {

        //If this has capital and normal case in programing it will be recognizing --->

        Pattern search1 = Pattern.compile(".*" + title + ".*", Pattern.CASE_INSENSITIVE);

        ArrayList<Product> result = new ArrayList<>();

        for (Product product : ListProducts) {

            Pattern search2 = Pattern.compile("(?i)(?:"+product.getProductName()+")",Pattern.CASE_INSENSITIVE);
            Matcher matcher1 = search1.matcher(product.getProductName());
            Matcher matcher2 = search2.matcher(title);

            if(title.compareTo(product.getProductName())== 0 || matcher1.find() || matcher2.find()) {

                result.add(product);

            }
        }

        return result;

    }

    public ArrayList<Product> ClassifiedHigher(String title) {

        //classify the list of product by higher price --->

        Pattern search1 = Pattern.compile(".*" + title + ".*", Pattern.CASE_INSENSITIVE);

        ArrayList<Product> result = new ArrayList<>();

        for (Product product : ListProducts) {

            Pattern search2 = Pattern.compile("(?i)(?:"+product.getProductName()+")",Pattern.CASE_INSENSITIVE);
            Matcher matcher1 = search1.matcher(product.getProductName());
            Matcher matcher2 = search2.matcher(title);

            if(title.compareTo(product.getProductName())== 0 || matcher1.find() || matcher2.find()) {

                result.add(product);

            }
        }

        Collections.sort(result , Comparator.comparing( Product::getPrice));
        return result;

    }

    public ArrayList<Product> ClassifiedLower(String title) {

        //classify the list of product by Lower price --->

        Pattern search1 = Pattern.compile(".*" + title + ".*", Pattern.CASE_INSENSITIVE);

        ArrayList<Product> result = new ArrayList<>();

        for (Product product : ListProducts) {

            Pattern search2 = Pattern.compile("(?i)(?:"+product.getProductName()+")",Pattern.CASE_INSENSITIVE);
            Matcher matcher1 = search1.matcher(product.getProductName());
            Matcher matcher2 = search2.matcher(title);

            if(title.compareTo(product.getProductName())== 0 || matcher1.find() || matcher2.find()) {

                result.add(product);

            }
        }

        Collections.sort(result , Comparator.comparing( Product::getPrice));
        Collections.reverse(result);
        return result;

    }

    public ArrayList<Seller> getListAuthorization() {
        return ListAuthorization;
    }

    public void addSeller(Seller seller){
        ListAuthorization.add(seller);
    }

    public void transaction(User user){
        ListAuthorize.add(user);
    }

    public ArrayList<User> getListAuthorize() {
        return ListAuthorize;
    }

    public void removeSeller(Seller seller) {
        ListAuthorization.remove(seller);
    }

    public void removeUser(User user) {
        ListAuthorize.remove(user);
    }

    @Override
    public String toString() {
        return "Shop totalProfit  : " + getTotalProfit();
    }

}
