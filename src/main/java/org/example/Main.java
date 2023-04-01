package org.example;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    // Declaring ANSI_RESET so that we can reset the color
    public static String ANSI_RESET = "\u001B[0m";
    // Declaring the color
    // Custom declaration
    public static String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static Product product = new Product();
     static String ShopName = "Amazon";
    static String WebAddress = "www.amazon.com";
     static String SupportPhone = "09336145843";
    public  static Shop shop = new Shop(ShopName,WebAddress,SupportPhone);
    public static Admin admin = new Admin("Mobina", "2004", "dymamsijhidjj@gmail.com", "09100000040","iran","Woman");
    public static User user = new User("","");
    public static Seller seller =  new Seller(shop.getShopName(),"","");
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        shop.addToListAccounts(admin);
//💻
        //👨‍💻
        Electronics laptops = new Electronics("Lap001","MacbookPro", 900.99, 10, new ArrayList<String>(), "Laptops","cole");
        laptops.addComment("Despite being a Windows user for many years," +
                " I have to say the transition over to Apple was by far the best decision." +
                " The MacBook Pro 13 inch offers a beautiful Retina display that's wildly clear and vivid." +
                " This laptop is incredibly lightweight and slim.");

        Electronics laptop = new Electronics("Lap002","MacbookPro", 920.99, 5, new ArrayList<String>(), "Laptops","dylan");
        laptop.addComment("Amazon made finding a MacBook Air within my budget easy!" +
                " I settled on the 2015 version because it had all the specs I needed for home and work use." +
                " And after trying out the 2017 MacBook Pro in-store, I am happy with my decision." +
                " I HATE the new keyboard the newer version comes with." +
                " It's essentially flat");

        Electronics phones = new Electronics("Ph001","SamsungA73 \uD83D\uDCF1" ,668.8,12,new ArrayList<String>(),"Phone","cole");
        phones.addComment("This is my first new phone in about 4 to 5 years." +
                " I love this phone so far. I have had it a week or so." +
                " I am still learning everything." +
                " I looked a long time for a new phone and I believe I made a good choice.");

        Electronics phone = new Electronics("Ph002","SamsungS23 \uD83D\uDCF1" ,700.12,3,new ArrayList<String>(),"Phone","cole");

        Electronics Tvs = new Electronics("Tv001","LG \uD83D\uDCFA" ,1200.8,8,new ArrayList<String>(),"Tv","dylan");

        Electronics Tv = new Electronics("Tv002","Sony \uD83D\uDCFA️" ,3290.8,7,new ArrayList<String>(),"Tv","me");
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

        Books fictions = new Books("Fi001","EyesOfTheMind \uD83D\uDCD6",100 ,3,new ArrayList<String>(),"Fiction","me");
        fictions.addComment("I really like James Dashner's writing," +
                " and was excited to read the first installment in The Mortality Doctrine series." +
                " The Eye of Minds was very different from my usual reads:" +
                " it's about high-intensity virtual gaming. I'm not a gamer," +
                " but I still really enjoyed this unique, imaginative, thrilling book.");

        Books fiction = new Books("Fi002","KillOrder \uD83D\uDCD3",124 ,1,new ArrayList<String>(),"Fiction","me");

        Books dramas = new Books("Dr001","Hamlet \uD83D\uDCD5",98,4,new ArrayList<String>(),"Drama","cole");
        dramas.addComment("We got this for our teenager who is studying Shakespeare in school." +
                " When asked if the book were helpful, I received a “Yeah, it’s fine” type of response." +
                "For those who do not speak teenager, that means: “It did what I needed it to do." +
                " I am not really thrilled about it but thank you.”");

        Books drama = new Books("Dr002","Freedom \uD83D\uDCD7",83 ,7,new ArrayList<String>(),"Drama","dylan");

        Books poetrys = new Books("Py001","MilkAndHoney \uD83D\uDCD8",120 ,6,new ArrayList<String>(),"Poetry","dylan");

        Books poetry = new Books("Py002","TheSonAndHerFlowers \uD83D\uDCD9",170 ,5,new ArrayList<String>(),"Poetry","sellerFirst");
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

        Clothes man = new Clothes("Mn001","ShirtBlue \uD83D\uDC55",560,12,new ArrayList<String>(),"Man","me");
        man.addComment("bought the solid dark & light blue shirts for my husband but had to return both." +
                " First the fiber blend is not as stated cotton/linen but Rayon/Linen." +
                " They are true to size and fabric is not too thick for summer" +
                " BUT they itch..... Probably because of the linen being a coarser natural fibers so had to return them. ");

        Clothes woman = new Clothes("Wn001","DressCyan \uD83D\uDC57",710.78,8,new ArrayList<String>(),"Woman","me");

        Clothes kid = new Clothes("Ks001","Socks \uD83E\uDDE6",211.23,35,new ArrayList<String>(),"Kids","me");
        Product.ManClothes.add(man);
        Product.WomanClothes.add(woman);
        Product.KidsClothes.add(kid);
        shop.addToListProducts(man);
        shop.addToListProducts(woman);
        shop.addToListProducts(kid);


  /*      String ShopName = "Amazon";
        String WebAddress = "www.amazon.com";
        String SupportPhone = "09336145843";
        Shop shop = new Shop(ShopName,WebAddress,SupportPhone);*/
        run(shop);
    }
public static String color = "YELLOW";
    public static void run(Shop shop ){
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
    public static void SignUpUser(Shop shop) {

        System.out.print("Username :");String username = input.next();
        System.out.print("Password :");String password = input.next();
        System.out.print("Email Address :");String email = input.next();
        System.out.print("Phone Number : +98");String phone = input.next();
        System.out.print("Address :");String address = input.next();
        System.out.println("Gender : (Man/Woman)"); String gender = input.next();

        if(shop.createAccount(username,password,"User")){
            Account user = new User(username, password, email, password, address , gender);
            shop.addToListAccounts(user);
            userMenu(shop, (User) shop.getCurrentAccount(user.getUsername()),admin,seller);
        }
        else{run(shop);}
    }
    public static void LogInUser(Shop shop ){

        System.out.print("Username :"); String username = input.next();
        System.out.print("Password :"); String password = input.next();

        if(shop.login(username, password)){
            Account user = new User(username,password);
            System.out.println("...........***...........................WELCOME BACK USER...........***...........................");
            userMenu(shop, (User) shop.getCurrentAccount(user.getUsername()),admin,seller);
        }
        else{run(shop);}

    }
    public static void SignUpAdmin(Shop shop) {

        System.out.print("Username :");
        String username = input.next();
        System.out.print("Password :");
        String password = input.next();
        System.out.print("Email Address :");
        String email = input.next();
        System.out.print("Phone Number : +98");
        String phone = input.next();
        System.out.print("Address :");
        String address = input.next();
        System.out.println("Gender : (Man/Woman)");
        String gender = input.next();
        if (shop.createAccount(username, password, "Admin")) {
            Admin admin1 = new Admin(username, password, email, password, address, gender);
            shop.addToListAccounts(admin1);
            admin.ListWaitedAdmin(admin1);
            userMenu(shop, (User) shop.getCurrentAccount(user.getUsername()),admin, seller);
            /* adminMenu(shop, (Admin) shop.getCurrentAccount(admin1.getUsername()), (Admin) shop.getCurrentAccount(admin.getUsername()));*/
        }
        run(shop);
    }
    public static void LogInAdmin(Shop shop ){

        System.out.print("Username :"); String username = input.next();
        System.out.print("Password :"); String password = input.next();

        if(shop.login(username, password)){
            System.out.println("...........***...........................WELCOME ADMIN...........***...........................");
            /*adminMenu(shop);*/
            userMenu(shop, (User) shop.getCurrentAccount(user.getUsername()),admin, seller);
        }
        else{run(shop);}

    }
    public static void SignUpSeller(Shop shop) {

        System.out.print("Username :");String username = input.next();
        System.out.print("Password :");String password = input.next();
        System.out.print("Email Address :");String email = input.next();
        System.out.print("Phone Number : +98");String phone = input.next();
        System.out.print("Address :");String address = input.next();
        System.out.println("Gender : (Man/Woman)"); String gender = input.next();
        if(shop.createAccount(username,password,"Seller")){
            Account seller = new Seller(shop.getShopName(),username, password, email, password, address , gender);
            shop.addToListAccounts(seller);
            userMenu(shop, (User) shop.getCurrentAccount(user.getUsername()),admin ,(Seller) shop.getCurrentAccount(seller.getUsername()));
        }
        else{run(shop);}
    }
    public static void LogInSeller(Shop shop){

        System.out.print("Username :"); String username = input.next();
        System.out.print("Password :"); String password = input.next();

        if(shop.login(username, password)){
            Account seller = new Seller(shop.getShopName(),username,password);
            System.out.println("...........***...........................WELCOME BACK SELLER...........***...........................");
            userMenu(shop, (User) shop.getCurrentAccount(user.getUsername()),admin ,(Seller) shop.getCurrentAccount(seller.getUsername()));
        }
        else{run(shop);}

    }
    public static void Design(){

        System.out.println("-----------------------------------------------------------|-------------------------------------------|---------------------------------------------|----------------------------------");
        System.out.println("1_view your profile   \uD83D\uDC64    *                    | 2_Edit your profile \uD83D\uDC64    ^     |3_orders \uD83D\uDC64                        |7_Products \uD83D\uDC64       ^   ");
        System.out.println("-----------------------------------------------------------|-------------------------------------------|---------------------------------------------|----------------------------------");
        System.out.println("4_Wallet\uD83D\uDC64                   ^                   |5_ShoppingCart  \uD83D\uDC64               |6_Log out ⚪   ^                             |8_consequences of the request\uD83D\uDC64  ");
        System.out.println("-----------------------------------------------------------|------------------------------------------ |---------------------------------------------|----------------------------------");
        System.out.println("9_See the request of admin to become member \uD83D\uDCBC   |10_ see all of users and admin & edit desired user  \uD83D\uDCBC                |12_ go to consequence and confirm the request of User for money ");
        System.out.println("-----------------------------------------------------------|-------------------------------------------|---------------------------------------------|----------------------------------");
        System.out.println("13_Search for product  \uD83D\uDC64                       | 11_ See the request pertaining to the seller  \uD83D\uDCBC |   ");
        System.out.println("-----------------------------------------------------------|-------------------------------------------|---------------------------------------------------------------------------------");
        System.out.println("14_ sell Product \uD83D\uDECD                              | 15_ change ShopName \uD83D\uDECD          |16_seller wallet\uD83D\uDECD      ");


    }

    public static void userMenu(Shop shop , User user , Admin admin, Seller seller) {
        Design();
        int select = input.nextInt();
        switch (select) {
            case 1:
                user.viewProfile();
                userMenu(shop, user, admin, seller);
            case 2:
                editProfile();
                userMenu(shop, user, admin, seller);
            case 3:
                System.out.println("⤯ ⤯ ⤯ ⤯ ⤯ Your Order List(not purchased) ⤰ ⤰ ⤰ ⤰ ⤰");
                System.out.println(user.getListOrder());
                System.out.println("⤯ ⤯ ⤯ ⤯ ⤯ Latest Order List(Purchased Products) ⤰ ⤰ ⤰ ⤰ ⤰");
                System.out.println(user.getPurchasedProducts());
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
                    System.out.println("To find out about the results of requests, go to the 'consequences of the request' section.");
                }
                userMenu(shop, user, admin, seller);

            case 5:
                ShoppingCart carts = new ShoppingCart();
                System.out.println((user.getListOrder()));
                System.out.println("Total Price You have to pay is = " + carts.getTotalPrice(user) + "\n");
                System.out.println("If you want to update the number of items in your cart press '1'.\n" +
                        " If you want to remove products from your list, press '2'.\n" +
                        " If your list is not yet finished, press '3'.\n" +
                        " If you are ready to pay off, press '4'.\n");
                int option = input.nextInt();
                if (option == 1) {
                    System.out.println("Which of them do you want to update?(write it's id)");
                    String id = input.next();
                    System.out.println("Do you want to 'increase' it or 'decrease' it?");
                    String choose1 = input.next();
                    if (choose1.equals("decrease")) {
                        System.out.println("How much do you want it already?");
                        int amount = input.nextInt();

                        shop.increaseQuantity(shop.getChoosenProduct(id), Math.abs(amount - user.FindOrderUser(id).getQuantity()));
                        user.setListOrder(amount, user.FindOrderUser(id));
                        carts.setTotalPrice(carts.getTotalPrice(user));
                        userMenu(shop, user, admin, seller);
                    }
                    if (choose1.equals("increase")) {
                        System.out.println("How much do you want it already?");
                        int amount = input.nextInt();

                        int currentQuantity = shop.getChoosenProduct(id).getQuantity();
                        if (currentQuantity >= amount) {
                            user.setListOrder(amount, user.FindOrderUser(id));
                            shop.getChoosenProduct(id).setQuantity(Math.abs(currentQuantity - Math.abs(amount - user.FindOrderUser(id).getQuantity())));
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

                    ShoppingCart cart = new ShoppingCart();
                    if (cart.PriceInCart(user) >= cart.getTotalPrice(user)) {
                        double remainPrice = cart.PriceInCart(user) - cart.getTotalPrice(user);
                        cart.setTotalPrice(remainPrice);
                        System.out.println("remaining = " + remainPrice + "\n");
                        //the money should go to in seller wallet
                    } else {
                        System.out.println("You have insufficient funds to purchase these products.");
                    }
                    userMenu(shop, user, admin, seller);
                }
            case 6:
                shop.logout();
                run(shop);
            case 7:
                System.out.println("-----Category-----");
                System.out.println("⭕Clothes");
                System.out.println("  ○ Man "); //blue circle
                System.out.println("  ○ Woman"); //blue circle
                System.out.println("  ○ Kids"); //blue circle
                System.out.println("⭕Electronics");
                System.out.println("  ◌ Laptop");
                System.out.println("  ◌ Phone ");
                System.out.println("  ◌ Tv    ");
                System.out.println("⭕Books");
                System.out.println("  ✪ Fiction");
                System.out.println("  ✪ Poetry ");
                System.out.println("  ✪ Drama ");
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
            case 9:
                admin.getListWaitedAdmin();
                System.out.println("Which admin do you want to confirm and Which admin do you want reject?(if you don't wanna continue press'0')");
                String admins = input.next();
                while (!admins.equals("0")) {
                    System.out.println("username = ");
                    admins = input.next();
                    System.out.println("Do you want to confirm?(y,n)");
                    yn = input.next();
                    if (yn.equals("y")) {
                        Account account = shop.getCurrentAccount(admins);
                        admin.removeListWaited((Admin) account);
                    } else {
                        Account account = shop.getCurrentAccount(admins);
                        admin.removeListWaited((Admin) account);
                        shop.removeFromListAccount(account);
                    }

                }
                userMenu(shop, user, admin, seller);

            case 10:
                System.out.println(shop.getListAccounts());
                System.out.println("Do you want to edit desired user (y/n)?");
                yn = input.next();
                if (yn.equals("y")) {
                    System.out.println("write it's username...");
                    String ans = input.next();
                    System.out.println(shop.searchByUsername(ans));
                    editProfile();
                }
                userMenu(shop, user, admin, seller);
            case 11:
                userMenu(shop, user, admin, seller);
            case 12:
                System.out.println(Account.getUserAndNewAmount());
                System.out.println("Which user do you want to add Fund?(if you don't want to continue press'0' in front of username)");
                String username = input.next();
                while (username.equalsIgnoreCase("0")) {
                    System.out.print("username = ");
                    username = input.next();
                    System.out.println("How much money does it want?");
                    double amount = input.nextInt();
                    admin.addFunds(amount, new Wallet(), (User) shop.getCurrentAccount(username));
                    /*admin.removeUserAndNewAmountList(user,amount);*/
                }

                userMenu(shop, user, admin, seller);
            case 13:

                System.out.println("Write the Title of this product...");
                String title = input.next();
                System.out.println("Do you want to sort it by a 'Higher' price, a 'Lower' price, or 'Random' order?"); String ans = input.next();
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

            case 14:
                if(admin.confirmRequest()){
                  System.out.println("** You can sell now ** ");
                  System.out.println("Which product in this category do you want to sell?\nSystem.out.println(\"-----Category-----\");\n" +
                          "                System.out.println(\"⭕Clothes\");\n" +
                          "                System.out.println(\"  ○ Man \"); \n" +
                          "                System.out.println(\"  ○ Woman\"); \n" +
                          "                System.out.println(\"  ○ Kids\"); \n" +
                          "                System.out.println(\"⭕Electronics\");\n" +
                          "                System.out.println(\"  ◌ Laptop\");\n" +
                          "                System.out.println(\"  ◌ Phone \");\n" +
                          "                System.out.println(\"  ◌ Tv    \");\n" +
                          "                System.out.println(\"⭕Books\");\n" +
                          "                System.out.println(\"  ✪ Fiction\");\n" +
                          "                System.out.println(\"  ✪ Poetry \");\n" +
                          "                System.out.println(\"  ✪ Drama \"); ");

                  String sell = input.next();
                  System.out.println("Enter new id : "); String id = input.next();
                  System.out.println("Enter name product : ");  title = input.next();
                  System.out.println("Enter Price : "); double price = input.nextInt();
                  System.out.println("Enter Quantity : "); int quantity = input.nextInt();

                    if(sell.equals("Man")){

                        Clothes clothes = new Clothes(id,title,price,quantity,new ArrayList<String>(),"Clothes",seller.getUsername());
                        Product.ManClothes.add(clothes);
                        shop.addToListProducts(clothes);
                    }
                    if(sell.equals("Woman")){

                        Clothes clothes = new Clothes(id,title,price,quantity,new ArrayList<String>(),"Clothes",seller.getUsername());
                        Product.WomanClothes.add(clothes);
                        shop.addToListProducts(clothes);
                    }
                    if(sell.equals("Kids")){

                        Clothes clothes = new Clothes(id,title,price,quantity,new ArrayList<String>(),"Clothes",seller.getUsername());
                        Product.KidsClothes.add(clothes);
                        shop.addToListProducts(clothes);
                    }
                    if(sell.equals("Laptop")){

                        Electronics electronics = new Electronics(id,title,price,quantity,new ArrayList<String>(),"Laptops",seller.getUsername());
                        Product.Laptops.add(electronics);
                        shop.addToListProducts(electronics);
                    }
                    if(sell.equals("Phone")){

                        Electronics electronics = new Electronics(id,title,price,quantity,new ArrayList<String>(),"Phone",seller.getUsername());
                        Product.Phone.add(electronics);
                        shop.addToListProducts(electronics);
                    }
                    if(sell.equals("Tv")){

                        Electronics electronics = new Electronics(id,title,price,quantity,new ArrayList<String>(),"Tv",seller.getUsername());
                        Product.Tv.add(electronics);
                        shop.addToListProducts(electronics);
                    }
                    if(sell.equals("Drama")){

                        Books books = new Books(id,title,price,quantity,new ArrayList<String>(),"Drama",seller.getUsername());
                        Product.Drama.add(books);
                        shop.addToListProducts(books);
                    }
                    if(sell.equals("Fiction")){
                        Books books = new Books(id,title,price,quantity,new ArrayList<String>(),"Fiction",seller.getUsername());
                        Product.Fiction.add(books);
                        shop.addToListProducts(books);
                    }
                    if(sell.equals("Poetry")){
                        Books books = new Books(id,title,price,quantity,new ArrayList<String>(),"Poetry",seller.getUsername());
                        Product.Poetry.add(books);
                        shop.addToListProducts(books);
                    }


                }
                System.out.println("Wait for the admin to authorize your permission....");
                userMenu(shop,user,admin,seller);
            case 15:
                System.out.print("Enter your desired name :"); String choose = input.next();
                seller.setShopName(choose,shop);
                System.out.println("Do you want to change the color?(y/n)"); yn = input.next();
                if(yn.equals("y")){
                    System.out.println("Select color for background :     BLACK / RED / GREEN / YELLOW / BLUE / PURPLE / CYAN / WHITE ");
                    color = input.next();
                    switch (color){
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
                userMenu(shop,user,admin, seller);

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
                    shop.decreaseQuantity(shop.getChoosenProduct(id), count, shop, id, count, user);
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
        public static void editProfile(){
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

        public static void adminMenu (Shop shop , User user , Admin admin){
            Design();


        }
        public static void sellerMenu (Shop shop){

        }

}