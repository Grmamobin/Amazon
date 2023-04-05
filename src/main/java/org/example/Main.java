package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.regex.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static String ANSI_RESET = "\u001B[0m";
    public static Product product = new Product();
    static String ShopName = "Amazon";
    static String WebAddress = "https://www.amazon.com/";
    static String SupportPhone = "09336145843";
    public  static Shop shop = new Shop(ShopName,WebAddress,SupportPhone);
    public static Admin admin = new Admin("Mobina", "2004", "dymamsijhidjj@gmail.com", "09100000040","iran","Woman");
    public static User user = new User("","");
    public static Seller sellers =  new Seller(shop.getShopName(), "me","4560");
    public static Seller seller = new Seller(shop.getShopName(), "cole","9360");
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        shop.addToListAccounts(admin);
        shop.addToListAccounts(seller);
        shop.addToListAccounts(sellers);

        Electronics laptops = new Electronics("Lp001","MacbookPro", 900.99, 10, new ArrayList<String>(), "Laptops",seller.getUsername());
        laptops.addComment("Despite being a Windows user for many years," +
                " I have to say the transition over to Apple was by far the best decision." +
                " The MacBook Pro 13 inch offers a beautiful Retina display that's wildly clear and vivid." +
                " This laptop is incredibly lightweight and slim.");

        Electronics laptop = new Electronics("Lp002","MacbookPro", 920.99, 5, new ArrayList<String>(), "Laptops",sellers.getUsername());
        laptop.addComment("Amazon made finding a MacBook Air within my budget easy!" +
                " I settled on the 2015 version because it had all the specs I needed for home and work use." +
                " And after trying out the 2017 MacBook Pro in-store, I am happy with my decision." +
                " I HATE the new keyboard the newer version comes with." +
                " It's essentially flat");

        Electronics phones = new Electronics("Ph001","SamsungA73" ,668.8,12,new ArrayList<String>(),"Phone",seller.getUsername());
        phones.addComment("This is my first new phone in about 4 to 5 years." +
                " I love this phone so far. I have had it a week or so." +
                " I am still learning everything." +
                " I looked a long time for a new phone and I believe I made a good choice.");

        Electronics phone = new Electronics("Ph002","SamsungS23" ,700.12,3,new ArrayList<String>(),"Phone",sellers.getUsername());

        Electronics Tvs = new Electronics("Tv001","LG" ,1200.8,8,new ArrayList<String>(),"Tv",sellers.getUsername());

        Electronics Tv = new Electronics("Tv002","Sony️" ,3290.8,7,new ArrayList<String>(),"Tv",sellers.getUsername());
        Tv.addComment("Like others I was frustrated trying to interact with this skill directly through Alexa," +
                " The real power of this skill is when it is used with Alexa routines," +
                " using that method it works flawlessly" +
                ". NOTE TO DEVELOPERS ... I would like to see the ability to activate the TV's screensaver added." +
                " I have a custom screensaver that shows Spotify album Art and would love to enable it when I run my \"Music Mode\" routine." +
                " Instead I have to navigate through the Bravia setup menu, or wait the minimum 5 minute timeout.");

        Product.Laptops.add(laptop); Product.Laptops.add(laptops);
        Product.Phone.add(phones); Product.Phone.add(phone);
        Product.Tv.add(Tv); Product.Tv.add(Tvs);
        shop.addToListProducts(Tv);
        shop.addToListProducts(Tvs);
        shop.addToListProducts(laptop);
        shop.addToListProducts(laptops);
        shop.addToListProducts(phone);
        shop.addToListProducts(phones);

        Books fictions = new Books("Fi001","EyesOfTheMind",100 ,3,new ArrayList<String>(),"Fiction",sellers.getUsername());
        fictions.addComment("I really like James Dashner's writing," +
                " and was excited to read the first installment in The Mortality Doctrine series." +
                " The Eye of Minds was very different from my usual reads:" +
                " it's about high-intensity virtual gaming. I'm not a gamer," +
                " but I still really enjoyed this unique, imaginative, thrilling book.");

        Books fiction = new Books("Fi002","KillOrder",124 ,1,new ArrayList<String>(),"Fiction",seller.getUsername());

        Books dramas = new Books("Dr001","Hamlet",98,4,new ArrayList<String>(),"Drama",sellers.getUsername());
        dramas.addComment("We got this for our teenager who is studying Shakespeare in school." +
                " When asked if the book were helpful, I received a “Yeah, it’s fine” type of response." +
                "For those who do not speak teenager, that means: “It did what I needed it to do." +
                " I am not really thrilled about it but thank you.”");

        Books drama = new Books("Dr002","Freedom",83 ,7,new ArrayList<String>(),"Drama",seller.getUsername());

        Books poetrys = new Books("Py001","MilkAndHoney",120 ,6,new ArrayList<String>(),"Poetry",sellers.getUsername());

        Books poetry = new Books("Py002","TheSonAndHerFlowers",170 ,5,new ArrayList<String>(),"Poetry",seller.getUsername());
        poetry.addComment("I absolutely love this book I love the author and it is so great.\n");
        poetry.addComment("I read this After., \"Milk and Honey\", and it's made made me more of a fan." +
                " This is a great follow up to her first. You can definitely hear her voice and feel her tone and style." +
                " This book is just a great blessing. As a man it helps me to understand the feminine more.");
        Product.Fiction.add(fiction);  Product.Fiction.add(fictions);
        Product.Drama.add(drama);  Product.Drama.add(dramas);
        Product.Poetry.add(poetry); Product.Poetry.add(poetrys);
        shop.addToListProducts(fiction);
        shop.addToListProducts(fictions);
        shop.addToListProducts(drama);
        shop.addToListProducts(dramas);
        shop.addToListProducts(poetry);
        shop.addToListProducts(poetrys);

        Clothes man = new Clothes("Mn001","ShirtBlue",560,12,new ArrayList<String>(),"Man",sellers.getUsername());
        man.addComment("bought the solid dark & light blue shirts for my husband but had to return both." +
                " First the fiber blend is not as stated cotton/linen but Rayon/Linen." +
                " They are true to size and fabric is not too thick for summer" +
                " BUT they itch..... Probably because of the linen being a coarser natural fibers so had to return them. ");

        Clothes woman = new Clothes("Wn001","DressCyan",710.78,8,new ArrayList<String>(),"Woman",seller.getUsername());

        Clothes kid = new Clothes("Ks001","Socks",211.23,35,new ArrayList<String>(),"Kids",sellers.getUsername());
        Product.ManClothes.add(man);
        Product.WomanClothes.add(woman);
        Product.KidsClothes.add(kid);
        shop.addToListProducts(man);
        shop.addToListProducts(woman);
        shop.addToListProducts(kid);

        run(shop);

    }
    public static String color = "YELLOW";
    public static void run(Shop shop ) throws InterruptedException {

        System.out.print("     _                     \n" +
                "    | |                    \n" +
                " ___| |__   ___  _ __  ___ \n" +
                "/ __| '_ \\ / _ \\| '_ \\/ __|\n" +
                "\\__ \\ | | | (_) | |_) \\__ \\\n" +
                "|___/_| |_|\\___/| .__/|___/\n" +
                "                | |        \n" +
                "                |_|        ");
        System.out.println(shop.setColor(color)+"    " + shop.getShopName() +" Shop   "+ ANSI_RESET);
        System.out.print(" 1.User       2.Admin       3.Seller       4.Exit\n 1-1.Sign up  2-1.Sign up   3-1.Sign up \n 1-2.log in   2-2.log in    3-2.log in \n ");
        System.out.print("Choose your Access by selecting number =  "); String select = input.next();
        if(select.equals("1-1")){SignUpUser(shop);}
        if(select.equals("1-2")){LogInUser(shop);}
        if(select.equals("2-1")){SignUpAdmin(shop);}
        if(select.equals("2-2")){LogInAdmin(shop);}
        if(select.equals("3-1")){SignUpSeller(shop);}
        if (select.equals("3-2")){LogInSeller(shop);}
        if(select.equals("4")){return;}

    }

    public static void SignUpUser(Shop shop) throws InterruptedException {

        System.out.print("Username :");String username = input.next();
        System.out.print("Password :");String password = input.next();
        System.out.print("Email Address :");String email = input.next();

        Pattern Email = Pattern.compile("^\\w+([.-]?\\w+)*@[a-zA-Z\\\\d]*\\.[a-zA-Z]{3}$");
        Matcher matcher = Email.matcher(email);

        while (!matcher.find()){

             System.out.println("Your Email Address is wrong ⚠️ ︎");
             System.out.print("Email Address :");  email = input.next();

             Email = Pattern.compile("^\\w+([.-]?\\w+)*@[a-zA-Z\\\\d]*\\.[a-zA-Z]{3}$");
             matcher = Email.matcher(email);

        }

        System.out.print("Phone Number : "); String phone = input.next();

        Pattern Phone = Pattern.compile("^(0|0098|\\+98)9(0[1-5]|[1 3]\\d|2[0-2]|98)\\d{7}$");
        Matcher matcher1 = Phone.matcher(phone);

        while (!matcher1.find()){

            System.out.println("Your Phone Number is wrong ⚠️ ︎");
            System.out.print("Phone Number : ");  phone = input.next();

            Phone = Pattern.compile("^(0|0098|\\+98)9(0[1-5]|[1 3]\\d|2[0-2]|98)\\d{7}$");
            matcher1 = Phone.matcher(phone);

        }

        System.out.print("Address :");String address = input.next();
        System.out.println("Gender : (Man/Woman)"); String gender = input.next();

        if(shop.createAccount(username,password,"User")){
            Account user = new User(username, password, email, phone , address , gender);
            shop.addToListAccounts(user);
            userMenu(shop, (User) shop.getCurrentAccount(user.getUsername()),admin,seller);
        }
        else{
            run(shop);
        }
    }

    public static void LogInUser(Shop shop ) throws InterruptedException {

        System.out.print("Username :"); String username = input.next();
        System.out.print("Password :"); String password = input.next();

        if(shop.login(username, password)){
            Account user = new User(username,password);
            System.out.println("                  WELCOME BACK USER              ");
            userMenu(shop, (User) shop.getCurrentAccount(user.getUsername()),admin,seller);
        }
        else{run(shop);}

    }

    public static void SignUpAdmin(Shop shop) throws InterruptedException {

        System.out.print("Username :");String username = input.next();
        System.out.print("Password :");String password = input.next();
        System.out.print("Email Address :");String email = input.next();

        Pattern Email = Pattern.compile("^\\w+([.-]?\\w+)*@[a-zA-Z\\\\d]*\\.[a-zA-Z]{3}$");
        Matcher matcher = Email.matcher(email);

        while (!matcher.find()){

            System.out.println("Your Email Address is wrong ⚠️ ︎");
            System.out.print("Email Address :");  email = input.next();

            Email = Pattern.compile("^\\w+([.-]?\\w+)*@[a-zA-Z\\\\d]*\\.[a-zA-Z]{3}$");
            matcher = Email.matcher(email);

        }

        System.out.print("Phone Number : "); String phone = input.next();

        Pattern Phone = Pattern.compile("^(0|0098|\\+98)9(0[1-5]|[1 3]\\d|2[0-2]|98)\\d{7}$");
        Matcher matcher1 = Phone.matcher(phone);

        while (!matcher1.find()){

            System.out.println("Your Phone Number is wrong ⚠️ ︎");
            System.out.print("Phone Number : ");  phone = input.next();

            Phone = Pattern.compile("^(0|0098|\\+98)9(0[1-5]|[1 3]\\d|2[0-2]|98)\\d{7}$");
            matcher1 = Phone.matcher(phone);

        }

        String address = input.next();
        System.out.println("Gender : (Man/Woman)");
        String gender = input.next();

        if (shop.createAccount(username, password, "Admin")) {
            Admin admin1 = new Admin(username, password, email, phone, address, gender);
            admin.ListWaitedAdmin(admin1);

        }
        run(shop);
    }

    public static void LogInAdmin(Shop shop ) throws InterruptedException {

        System.out.print("Username :"); String username = input.next();
        System.out.print("Password :"); String password = input.next();

        if(shop.login(username, password)){
            System.out.println("            WELCOME ADMIN            ");
            /*Account admin = new Admin(username,password);*/
            adminMenu(shop, (User) shop.getCurrentAccount(user.getUsername()),admin, seller);
        }
        else {
            run(shop);
        }

    }

    public static void SignUpSeller(Shop shop) throws InterruptedException {

        System.out.print("Username :");String username = input.next();
        System.out.print("Password :");String password = input.next();
        System.out.print("Email Address :");String email = input.next();

        Pattern Email = Pattern.compile("^\\w+([.-]?\\w+)*@[a-zA-Z\\\\d]*\\.[a-zA-Z]{3}$");
        Matcher matcher = Email.matcher(email);

        while (!matcher.find()){

            System.out.println("Your Email Address is wrong ⚠️ ︎");
            System.out.print("Email Address :");  email = input.next();

            Email = Pattern.compile("^\\w+([.-]?\\w+)*@[a-zA-Z\\\\d]*\\.[a-zA-Z]{3}$");
            matcher = Email.matcher(email);

        }

        System.out.print("Phone Number : "); String phone = input.next();

        Pattern Phone = Pattern.compile("^(0|0098|\\+98)9(0[1-5]|[1 3]\\d|2[0-2]|98)\\d{7}$");
        Matcher matcher1 = Phone.matcher(phone);

        while (!matcher1.find()){

            System.out.println("Your Phone Number is wrong ⚠️ ︎");
            System.out.print("Phone Number : ");  phone = input.next();

            Phone = Pattern.compile("^(0|0098|\\+98)9(0[1-5]|[1 3]\\d|2[0-2]|98)\\d{7}$");
            matcher1 = Phone.matcher(phone);

        }

        System.out.print("Address :");String address = input.next();
        System.out.println("Gender : (Man/Woman)"); String gender = input.next();

        if(shop.createAccount(username,password,"Seller")) {

            Account sellerx = new Seller(shop.getShopName(),username, password, email, phone, address , gender);
            shop.addToListAccounts(sellerx);
            sellerMenu(shop, (User) shop.getCurrentAccount(user.getUsername()),admin ,(Seller) shop.getCurrentAccount(sellerx.getUsername()));
        }
        else {
            run(shop);
        }

    }

    public static void LogInSeller(Shop shop) throws InterruptedException {

        System.out.print("Username :"); String username = input.next();
        System.out.print("Password :"); String password = input.next();

        if(shop.login(username, password)){
            Account seller = new Seller(shop.getShopName(),username,password);
            System.out.println("             WELCOME BACK SELLER             ");
            sellerMenu(shop, (User) shop.getCurrentAccount(user.getUsername()),admin ,(Seller) shop.getCurrentAccount(seller.getUsername()));
        }

        else{run(shop);}

    }

    public static void Design(){

        System.out.println("************************************************************* --USER ACCESS-- ***************************************************************");
        System.out.println("1.View profile \uD83D\uDC64        2.Edit profile \uD83D\uDC64                   3.Orders \uD83D\uDC64                     4.Wallet \uD83D\uDC64 ");
        System.out.println("5.Shopping cart \uD83D\uDC64       6.Products \uD83D\uDC64                       7.Search for product \uD83D\uDC64         8.Log out⚪      ");
        System.out.println("************************************************************* --ADMIN ACCESS-- **************************************************************");
        System.out.println("1.Confirm/Reject request of admin to become member \uD83D\uDCBC            2.List All of users and admin and seller & Edit desired user \uD83D\uDCBC   5.Confirm/Reject user to buy \uD83D\uDCBC ");
        System.out.println("3.Confirm request of User for money \uD83D\uDCBC                           4.Confirm/Reject request of seller for sell product \uD83D\uDCBC    6.Log out⚪");
        System.out.println("************************************************************* --SELLER ACCESS-- *************************************************************");
        System.out.println("1.Sell Product \uD83D\uDECD        2.Change ShopName \uD83D\uDECD             3.Wallet \uD83D\uDECD         4.List Available Product \uD83D\uDECD    5.Log out⚪ \n");
        System.out.println("        Web address : " + shop.getWebAddress()     +     "      Support Phone : "  +shop.getSupportPhone()  +      "       Shop totalProfit : "+shop.getTotalProfit());

    }

    public static void userMenu(Shop shop , User user , Admin admin, Seller seller) throws InterruptedException {
        Design();
        int select = input.nextInt();

        switch (select) {

            case 1:
                user.viewProfile();
                TimeUnit.SECONDS.sleep(2);
                userMenu(shop, user, admin, seller);

            case 2:
                editProfile(user);
                TimeUnit.SECONDS.sleep(2);
                userMenu(shop, user, admin, seller);

            case 3:

                System.out.println("⤯ ⤯ ⤯ ⤯ ⤯ Your Order List(not purchased) ⤰ ⤰ ⤰ ⤰ ⤰");
                System.out.println(user.getListOrder());
                System.out.println("⤯ ⤯ ⤯ ⤯ ⤯ Latest Order List(Purchased Products) ⤰ ⤰ ⤰ ⤰ ⤰");
                System.out.println(user.getPurchasedProducts());
                TimeUnit.SECONDS.sleep(2);
                userMenu(shop, user, admin, seller);

            case 4:
                System.out.println("This is all the money [[" + user.getWallet() + "]] you have in your wallet.");

                System.out.println("Do you want to ask the admin for more money? (y/n)" +
                        "     NOTICE: If you write 'n', you will go back to the menu.");
                String yn = input.next();

                if (yn.equals("y")) {
                    System.out.println("How much funding are you looking for?");
                    double amount = input.nextInt();
                    user.requestFunds(amount, user);
                    user.addToUserAndNewAmountList(user, amount);
                    System.out.println("To find out about the result wait for admin to accept your requests.");
                }

                TimeUnit.SECONDS.sleep(2);
                userMenu(shop, user, admin, seller);

            case 5:
                ShoppingCart carts = new ShoppingCart();
                System.out.println(user.getListOrder());
                System.out.println("Your Current Money is = " + user.getWallet().getCurrentMoney());
                System.out.println("Total Price You have to pay is = " + carts.getTotalPrice(user) + "\n");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("If you want to update the number of items in your cart press '1'.\n" +
                        " If you want to remove products from your list, press '2'.\n" +
                        " If your list is not yet finished, press '3'.\n" +
                        " If you are ready to pay off, press '4'.\n");

                int option = input.nextInt();

                if (option == 1) {

                    System.out.println("Which of them do you want to update?(write it's id)");
                    String id = input.next();
                    // in this part all quantity that user take is go back in to  the product--->
                    shop.increaseQuantity(shop.getChoosenProduct(id) ,user.FindOrderUser(id).getQuantity());

                    System.out.println("Do you want to 'increase' it or 'decrease' it?");
                    String choose1 = input.next();

                    if (choose1.equals("decrease")) {

                        System.out.println("How much do you want it Now?");
                        int amount = input.nextInt();
                        user.setListOrder(amount, user.FindOrderUser(id));
                        carts.setTotalPrice(carts.getTotalPrice(user));
                        // in this part it is decrease from product--->
                        int currentQuantity = shop.getChoosenProduct(id).getQuantity();
                        shop.getChoosenProduct(id).setQuantity(currentQuantity - amount);

                        userMenu(shop, user, admin, seller);

                    }

                    if (choose1.equals("increase")) {

                        System.out.println("How much do you want it Now?");
                        int amount = input.nextInt();

                        int currentQuantity = shop.getChoosenProduct(id).getQuantity();
                        if (currentQuantity >= amount) {
                            user.setListOrder(amount, user.FindOrderUser(id));
                            // in this part it is decrease from product--->
                            shop.getChoosenProduct(id).setQuantity(currentQuantity - amount);
                        } else {
                            System.out.println("We don't have this amount of product in our category");
                        }

                        userMenu(shop, user, admin, seller);
                    }
                }

                if (option == 2) {
                    System.out.println("Which of them do you want to remove?(write it's id)");
                    String id = input.next();
                    user.removeToListOrderForUser(user.FindOrderUser(id));
                    userMenu(shop, user, admin, seller);
                }

                if (option == 3) {
                    userMenu(shop, user, admin, seller);
                }

                if (option == 4) {
                    System.out.println("Do you ask for admin to buy?(y/n)");
                    yn = input.next();

                    if (yn.equals("y")) {

                        if (shop.getCurrentAccount(user.getUsername()).getConfirm()) {

                            ShoppingCart cart = new ShoppingCart();

                            if (cart.PriceInCart(user) >= cart.getTotalPrice(user)) {

                                System.out.print("\007");
                                System.out.flush();
                                double remainPrice = cart.PriceInCart(user) - cart.getTotalPrice(user);
                                System.out.println("****\uD83D\uDCB6 YOU PAID SUCCESSFULLY \uD83D\uDCB6****" + "\n" +
                                        "Remaining = " + remainPrice + "\n");
                                user.getWallet().setCurrentMoney(remainPrice); //   <---current money
                                shop.setTotalProfit(cart.getTotalPrice(user) * (0.1));
                                user.transaction(shop);
                                user.addPurchasedProducts();
                                user.getListOrder().clear();
                                user.getCart().clear();
                                shop.getCurrentAccount(user.getUsername()).setConfirm(false);

                            } else {
                                System.out.println("You have insufficient funds to purchase these products.");
                            }

                        }

                        else if (!shop.getCurrentAccount(user.getUsername()).getConfirm()) {
                            System.out.println("Sorry\uD83D\uDD12 --> admin reject you to buy product....");
                        }

                    } else {
                        shop.transaction(user);
                        System.out.println("SENT \uD83D\uDCE9 --> " + user.getUsername() + "  Wants to buy these product");
                    }

                    userMenu(shop, user, admin, seller);
                }

            case 6:
                System.out.println("-----Category-----");
                System.out.println("⭕Clothes");
                System.out.println("  ○ Man \uD83D\uDC55");
                System.out.println("  ○ Woman \uD83D\uDC57");
                System.out.println("  ○ Kids \uD83E\uDDE6");
                System.out.println("⭕Electronics");
                System.out.println("  ◌ Laptop \uD83D\uDCBB");
                System.out.println("  ◌ Phone \uD83D\uDCF1");
                System.out.println("  ◌ Tv \uD83D\uDCFA   ");
                System.out.println("⭕Books");
                System.out.println("  ✪ Fiction \uD83D\uDCD6");
                System.out.println("  ✪ Poetry \uD83D\uDCD3");
                System.out.println("  ✪ Drama \uD83D\uDCD5");
                String optionss = input.next();

                if (optionss.equals("Man")) {

                    product.ManClothes();
                    runFromCategory(user);
                    userMenu(shop, user, admin, seller);

                }

                if ("Woman".equals(optionss)) {

                    product.WomanClothes();
                    runFromCategory(user);
                    userMenu(shop, user, admin, seller);

                }

                if ("Kids".equals(optionss)) {

                    product.KidsClothes();
                    runFromCategory(user);
                    userMenu(shop, user, admin, seller);

                }

                if ("Laptop".equals(optionss)) {

                    product.LaptopEle();
                    runFromCategory(user);
                    userMenu(shop, user, admin, seller);

                }

                if ("Phone".equals(optionss)) {

                    product.PhoneELe();
                    runFromCategory(user);
                    userMenu(shop, user, admin, seller);

                }

                if ("Tv".equals(optionss)) {

                    product.TvELe();
                    runFromCategory(user);
                    userMenu(shop, user, admin, seller);

                }

                if ("Fiction".equals(optionss)) {

                    product.FictionBook();
                    runFromCategory(user);
                    userMenu(shop, user, admin, seller);

                }

                if ("Poetry".equals(optionss)) {

                    product.PoetryBook();
                    runFromCategory(user);
                    userMenu(shop, user, admin, seller);

                }

                if ("Drama".equals(optionss)) {

                    product.DramaBook();
                    runFromCategory(user);
                    userMenu(shop, user, admin, seller);

                }

            case 7:
                System.out.println("Write the Title of this product...");
                String title = input.next();
                System.out.println("Do you want to sort it by a 'Higher' price, a 'Lower' price, or 'Random' order?");
                String ans = input.next();

                if(ans.equals("Lower")){
                    System.out.println(shop.ClassifiedHigher(title));
                }
                if(ans.equals("Higher")){
                    System.out.println(shop.ClassifiedLower(title));
                }
                if(ans.equals("Random")) {
                    System.out.println(shop.searchByTitle(title));
                }

                runFromCategory(user);
                userMenu(shop,user,admin, seller);

            case 8:
                shop.logout();
                run(shop);

        }
    }
        public static void adminMenu (Shop shop , User user , Admin admin, Seller seller) throws InterruptedException {

            Design();
            int select = input.nextInt();

            switch (select) {

                case 1:
                    System.out.println(admin.getListWaitedAdmin());
                    System.out.println("Do you want to reject or confirm?(y/n)"); String yn = input.next();
                    if(yn.equals("y")) {

                        System.out.println("Which admin do you want to confirm OR reject?");

                        System.out.print("username = ");
                        String admin1 = input.next();
                        System.out.println("Do you want to confirm?(y,n)");
                        yn = input.next();

                        if (yn.equals("y")) {
                            Admin account = admin.ListWaited(admin1);
                            shop.addToListAccounts(account);
                            admin.removeListWaited(account);
                        } else {
                            Admin account = admin.ListWaited(admin1);
                            admin.removeListWaited(account);
                        }
                    }

                    adminMenu(shop, user, admin, seller);

                case 2:
                    System.out.println(shop.getListAccounts());
                    System.out.println("Do you want to edit desired user (y/n)?");
                    yn = input.next();

                    if (yn.equals("y")) {

                        System.out.println("write it's username...");
                        String ans = input.next();
                        System.out.println(shop.searchByUsername(ans));
                        editProfile(user);

                    }
                    adminMenu(shop, user, admin, seller);

                case 3:
                    System.out.println(Account.getUserAndNewAmount());
                    System.out.println("Do you want to add Fund?(y/n)"); yn = input.next();

                    if(yn.equals("y")) {

                        System.out.println("Which user do you want to add Fund?");
                        System.out.print("username = ");
                        String username = input.next();
                        System.out.println("How much money does it want?");
                        double amount = input.nextDouble();
                        admin.addFunds(amount, new Wallet(), (User) shop.getCurrentAccount(username));
                        admin.removeUserAndNewAmountList((User) shop.getCurrentAccount(username), amount);

                    }
                    adminMenu(shop, user, admin, seller);

                case 4:
                    System.out.println(shop.getListAuthorization());
                    System.out.println("Do you want to check it now?(y/n)"); yn = input.next();

                    if(yn.equals("y")) {

                        System.out.println("Write seller username...");
                        String name = input.next();
                        System.out.println("Do you want to confirm it?(y/n)");
                        yn = input.next();
                        if (yn.equals("y")) {
                            shop.getCurrentAccount(name).setConfirm(true);
                        }
                        if (yn.equals("n")) {
                            shop.getCurrentAccount(name).setConfirm(false);
                        }
                        shop.removeSeller((Seller) shop.getCurrentAccount(name));

                    }
                    adminMenu(shop,user,admin,seller);

                case 5:
                    System.out.println(shop.getListAuthorize());
                    System.out.println("Do you want to check it now?(y/n)"); yn = input.next();

                    if(yn.equals("y")) {

                        System.out.println();
                        System.out.println("Write User username...");
                        String name = input.next();
                        User user1 = (User) shop.getCurrentAccount(name);
                        System.out.println(user1.getListOrder());
                        System.out.println("Do you want to confirm it?(y/n)");
                        yn = input.next();

                        if (yn.equals("y")) {
                            shop.getCurrentAccount(name).setConfirm(true);
                        }

                        if (yn.equals("n")) {
                            shop.getCurrentAccount(name).setConfirm(false);
                        }

                        shop.removeUser((User) shop.getCurrentAccount(name));

                    }
                    adminMenu(shop,user,admin,seller);

                case 6:
                    shop.logout();
                    run(shop);

            }
        }

        public static void sellerMenu (Shop shop , User user , Admin admin, Seller seller) throws InterruptedException {

            Design();
            int select = input.nextInt();
            switch (select) {

                case 1:
                    System.out.println("Did you ask for authorization?(y/n)['y' means go and see the result and 'n' means go and ask]");
                    String yn = input.next();
                    if(yn.equals("y")) {

                        if (shop.getCurrentAccount(seller.getUsername()).getConfirm()) {

                            System.out.println("** You can sell now \uD83D\uDD13︎ ** ");
                            System.out.println("Which product in this category do you want to sell?");
                            System.out.println("-----Category-----");
                            System.out.println("⭕Clothes");
                            System.out.println("  ○ Man \uD83D\uDC55");
                            System.out.println("  ○ Woman \uD83D\uDC57");
                            System.out.println("  ○ Kids \uD83E\uDDE6");
                            System.out.println("⭕Electronics");
                            System.out.println("  ◌ Laptop \uD83D\uDCBB");
                            System.out.println("  ◌ Phone \uD83D\uDCF1");
                            System.out.println("  ◌ Tv \uD83D\uDCFA   ");
                            System.out.println("⭕Books");
                            System.out.println("  ✪ Fiction \uD83D\uDCD7");
                            System.out.println("  ✪ Poetry \uD83D\uDCD8");
                            System.out.println("  ✪ Drama \uD83D\uDCD9");

                            String sell = input.next(); //to call the name of category --->

                            System.out.print("Enter name product : ");
                            String title = input.next();
                            System.out.print("Enter Price : ");
                            double price = input.nextDouble();
                            System.out.print("Enter Quantity : ");
                            int quantity = input.nextInt();

                            System.out.println(" * This is the last ID in this category , Use the next one after this -->");


                            if (sell.equals("Man")) {

                                System.out.println(seller.LatestIdMan());
                                System.out.print("Enter new id use s.th like Mn__: ");
                                String id = input.next();

                                while (id.equals(seller.LatestIdMan())) {

                                    System.out.println("You Can't Use This ID... " +
                                            "Use id after this " + seller.LatestIdMan());
                                    id = input.next();

                                }

                                Clothes clothes = new Clothes(id, title, price, quantity, new ArrayList<String>(), "Clothes", seller.getUsername());
                                Product.ManClothes.add(clothes);
                                shop.addToListProducts(clothes);
                            }

                            if (sell.equals("Woman")) {

                                System.out.println(seller.LatestIdWoman());
                                System.out.print("Enter new id use s.th like Wn__: ");
                                String id = input.next();

                                while(id.equals(seller.LatestIdWoman())) {

                                    System.out.println("You Can't Use This ID... " +
                                            "Use id after this " + seller.LatestIdWoman());
                                    id = input.next();

                                }

                                Clothes clothes = new Clothes(id, title, price, quantity, new ArrayList<String>(), "Clothes", seller.getUsername());
                                Product.WomanClothes.add(clothes);
                                shop.addToListProducts(clothes);

                            }

                            if (sell.equals("Kids")) {

                                System.out.println(seller.LatestIdKids());
                                System.out.print("Enter new id use s.th like Ks__: ");
                                String id = input.next();

                                while(id.equals(seller.LatestIdKids())) {

                                    System.out.println("You Can't Use This ID... " +
                                            "Use id after this " + seller.LatestIdKids());
                                    id = input.next();

                                }

                                Clothes clothes = new Clothes(id, title, price, quantity, new ArrayList<String>(), "Clothes", seller.getUsername());
                                Product.KidsClothes.add(clothes);
                                shop.addToListProducts(clothes);

                            }

                            if (sell.equals("Laptop")) {

                                System.out.println(seller.LatestIdLaptop());
                                System.out.print("Enter new id use s.th like Lp__: ");
                                String id = input.next();

                                while(id.equals(seller.LatestIdLaptop())) {

                                    System.out.println("You Can't Use This ID... " +
                                            "Use id after this " + seller.LatestIdLaptop());
                                    id = input.next();

                                }

                                Electronics electronics = new Electronics(id, title, price, quantity, new ArrayList<String>(), "Laptops", seller.getUsername());
                                Product.Laptops.add(electronics);
                                shop.addToListProducts(electronics);

                            }

                            if (sell.equals("Phone")) {

                                System.out.println(seller.LatestIdPhone());
                                System.out.print("Enter new id use s.th like Ph__: ");
                                String id = input.next();

                                while(id.equals(seller.LatestIdPhone())) {

                                    System.out.println("You Can't Use This ID... " +
                                            "Use id after this " + seller.LatestIdPhone());
                                    id = input.next();

                                }

                                Electronics electronics = new Electronics(id, title, price, quantity, new ArrayList<String>(), "Phone", seller.getUsername());
                                Product.Phone.add(electronics);
                                shop.addToListProducts(electronics);

                            }

                            if (sell.equals("Tv")) {

                                System.out.println(seller.LatestIdTv());
                                System.out.print("Enter new id use s.th like Tv__: ");
                                String id = input.next();

                                while(id.equals(seller.LatestIdTv())) {

                                    System.out.println("You Can't Use This ID... " +
                                            "Use id after this " + seller.LatestIdTv());
                                    id = input.next();

                                }

                                Electronics electronics = new Electronics(id, title, price, quantity, new ArrayList<String>(), "Tv", seller.getUsername());
                                Product.Tv.add(electronics);
                                shop.addToListProducts(electronics);

                            }

                            if (sell.equals("Drama")) {

                                System.out.println(seller.LatestIdDrama());
                                System.out.print("Enter new id use s.th like Dr__: ");
                                String id = input.next();

                                while(id.equals(seller.LatestIdDrama())){

                                    System.out.println("You Can't Use This ID... " +
                                            "Use id after this "+seller.LatestIdDrama());
                                     id = input.next();

                                }

                                Books books = new Books(id, title, price, quantity, new ArrayList<String>(), "Drama", seller.getUsername());
                                Product.Drama.add(books);
                                shop.addToListProducts(books);

                            }

                            if (sell.equals("Fiction")) {

                                System.out.println(seller.LatestIdFiction());
                                System.out.print("Enter new id use s.th like Fi__: ");
                                String id = input.next();

                                while(id.equals(seller.LatestIdFiction())){

                                    System.out.println("You Can't Use This ID... " +
                                            "Use id after this "+seller.LatestIdFiction());
                                    id = input.next();

                                }

                                Books books = new Books(id, title, price, quantity, new ArrayList<String>(), "Fiction", seller.getUsername());
                                Product.Fiction.add(books);
                                shop.addToListProducts(books);

                            }

                            if (sell.equals("Poetry")) {

                                System.out.println(seller.LatestIdPoetry());
                                System.out.print("Enter new id use s.th like Py__: ");
                                String id = input.next();

                                while(id.equals(seller.LatestIdPoetry())){

                                    System.out.println("You Can't Use This ID... " +
                                            "Use id after this "+seller.LatestIdPoetry());
                                    id = input.next();

                                }

                                Books books = new Books(id, title, price, quantity, new ArrayList<String>(), "Poetry", seller.getUsername());
                                Product.Poetry.add(books);
                                shop.addToListProducts(books);

                            }
                            shop.getCurrentAccount(seller.getUsername()).setConfirm(false);
                        }

                        if (!shop.getCurrentAccount(seller.getUsername()).getConfirm()) {
                            System.out.println("Sorry\uD83D\uDD12 --> admin reject you to sell product....");
                        }
                    }

                    if(yn.equals("n")) {
                        System.out.println("send --> "+seller.getUsername()+ " Ask for sell the product");
                        shop.addSeller(seller);
                    }

                    sellerMenu(shop, user, admin, seller);

                case 2:
                    System.out.print("Enter your desired name :"); String choose = input.next();
                    seller.setShopName(choose,shop);
                    System.out.println("Do you want to change the color?(y/n)"); yn = input.next();

                    if(yn.equals("y")){

                        System.out.println("Select color for background :     BLACK / RED / GREEN / YELLOW / BLUE / PURPLE / CYAN / WHITE ");
                        color = input.next();

                        switch (color) {

                            case "BLACK":
                                shop.setColor("BLACK");
                            case "RED":
                                shop.setColor("RED");
                            case "GREEN":
                                shop.setColor("GREEN");
                            case "YELLOW":
                                shop.setColor("YELLOW");
                            case "BLUE":
                                shop.setColor("BLUE");
                            case "PURPLE":
                                shop.setColor("PURPLE");
                            case "CYAN":
                                shop.setColor("CYAN");
                            case "WHITE":
                                shop.setColor("WHITE");

                        }

                    }

                    sellerMenu(shop,user,admin, seller);

                case 3:
                        System.out.println( "This is all of your Money : "+ seller.getPriceInWallet());
                        TimeUnit.SECONDS.sleep(3);
                        sellerMenu(shop,user,admin, seller);

                case 4:
                    seller.ListAvailable(shop);
                    sellerMenu(shop,user,admin, seller);

                case 5:
                    shop.logout();
                    run(shop);
            }

        }

    public static void runFromCategory(User user){

        System.out.println("Would you like to add any products to your order list?(y/n)");
        String yn = input.next();

        if (yn.equals("y")) {
            System.out.println("plz write it's id..");
            String id = input.next();

            if (shop.doesProductExist(id)) {
                System.out.println("How many of this product do you want?");
                int count = input.nextInt();

                shop.decreaseQuantity(shop.getChoosenProduct(id), count, shop, id, count, user ,shop.getChoosenProduct(id).getBuyer());
                System.out.println("Do you want to add comment below of this product?(y/n)");
                yn = input.next();

                if (yn.equals("y")) {
                    System.out.println("add your comment ...");
                    String ans = input.next();
                    shop.addComment(shop.getChoosenProduct(id), ans);
                }

            } else {
                System.out.println("If you haven't noticed, this product no longer exists.");
            }

        }

    }

    public static void editProfile(User user) {

        System.out.println("*** if you want to edit so do it ***");
        System.out.print("Username :");
        String username = input.next();
        System.out.print("Password :");
        String password = input.next();
        System.out.print("Email Address :");
        String email = input.next();
        System.out.print("Phone Number : +98");
        String phone = input.next();
        System.out.print("Address : ");
        String address = input.next();
        System.out.println("Gender : (Man/Woman)");
        String gender = input.next();
        shop.getCurrentAccount(user.getUsername()).setUsername(username);
        shop.getCurrentAccount(user.getUsername()).setPassword(password);
        shop.getCurrentAccount(user.getUsername()).setEmailAddress(email);
        shop.getCurrentAccount(user.getUsername()).setPhoneNumber(phone);
        shop.getCurrentAccount(user.getUsername()).setAddress(address);
        shop.getCurrentAccount(user.getUsername()).setGender(gender);

    }

}