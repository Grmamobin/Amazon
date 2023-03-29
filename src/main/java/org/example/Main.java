package org.example;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

import org.example.User;
public class Main {
    // Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[0m";
    // Declaring the color
    // Custom declaration
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static Product product = new Product();

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Electronics laptops = new Electronics("Lap001","MacbookPro", 900.99, 10, new ArrayList<String>(), "Laptops");
        laptops.addComment("Despite being a Windows user for many years," +
                " I have to say the transition over to Apple was by far the best decision." +
                " The MacBook Pro 13 inch offers a beautiful Retina display that's wildly clear and vivid." +
                " This laptop is incredibly lightweight and slim.");

        Electronics laptop = new Electronics("Lap002","MacbookAir", 920.99, 5, new ArrayList<String>(), "Laptops");
        laptop.addComment("Amazon made finding a MacBook Air within my budget easy!" +
                " I settled on the 2015 version because it had all the specs I needed for home and work use." +
                " And after trying out the 2017 MacBook Pro in-store, I am happy with my decision." +
                " I HATE the new keyboard the newer version comes with." +
                " It's essentially flat");

        Electronics phones = new Electronics("Ph001","SamsungA73" ,668.8,12,new ArrayList<String>(),"Phone");
        phones.addComment("This is my first new phone in about 4 to 5 years." +
                " I love this phone so far. I have had it a week or so." +
                " I am still learning everything." +
                " I looked a long time for a new phone and I believe I made a good choice.");

        Electronics phone = new Electronics("Ph002","SamsungS23" ,700.12,3,new ArrayList<String>(),"Phone");

        Electronics Tvs = new Electronics("Tv001","LG" ,1200.8,8,new ArrayList<String>(),"Tv");

        Electronics Tv = new Electronics("Tv002","Sony" ,3290.8,7,new ArrayList<String>(),"Tv");
        Tv.addComment("Like others I was frustrated trying to interact with this skill directly through Alexa," +
                " The real power of this skill is when it is used with Alexa routines," +
                " using that method it works flawlessly" +
                ". NOTE TO DEVELOPERS ... I would like to see the ability to activate the TV's screensaver added." +
                " I have a custom screensaver that shows Spotify album Art and would love to enable it when I run my \"Music Mode\" routine." +
                " Instead I have to navigate through the Bravia setup menu, or wait the minimum 5 minute timeout.");

        Product.Laptops.add(laptop); Product.Laptops.add(laptops);
        Product.Phone.add(phones); Product.Phone.add(phone);
        Product.Tv.add(Tv); Product.Tv.add(Tvs);

        Books fictions = new Books("Fi001","EyesOfTheMind",100 ,3,new ArrayList<String>(),"Fiction");
        fictions.addComment("I really like James Dashner's writing," +
                " and was excited to read the first installment in The Mortality Doctrine series." +
                " The Eye of Minds was very different from my usual reads:" +
                " it's about high-intensity virtual gaming. I'm not a gamer," +
                " but I still really enjoyed this unique, imaginative, thrilling book.");

        Books fiction = new Books("Fi002","KillOrder",124 ,1,new ArrayList<String>(),"Fiction");

        Books dramas = new Books("Dr001","Hamlet",98,4,new ArrayList<String>(),"Drama");
        dramas.addComment("We got this for our teenager who is studying Shakespeare in school." +
                " When asked if the book were helpful, I received a “Yeah, it’s fine” type of response." +
                "For those who do not speak teenager, that means: “It did what I needed it to do." +
                " I am not really thrilled about it but thank you.”");

        Books drama = new Books("Dr002","Freedom",83 ,7,new ArrayList<String>(),"Drama");

        Books poetrys = new Books("Py001","MilkAndHoney",120 ,6,new ArrayList<String>(),"Poetry");

        Books poetry = new Books("Py002","TheSonAndHerFlowers",170 ,5,new ArrayList<String>(),"Poetry");
        poetry.addComment("I absolutely love this book I love the author and it is so great.\n");
        poetry.addComment("I read this After., \"Milk and Honey\", and it's made made me more of a fan." +
                " This is a great follow up to her first. You can definitely hear her voice and feel her tone and style." +
                " This book is just a great blessing. As a man it helps me to understand the feminine more.");
        Product.Fiction.add(fiction);  Product.Fiction.add(fictions);
        Product.Drama.add(drama);  Product.Drama.add(dramas);
        Product.Poetry.add(poetry); Product.Poetry.add(poetrys);

        Clothes man = new Clothes("Mn001","ShirtBlue",560,12,new ArrayList<String>(),"Man");
        man.addComment("bought the solid dark & light blue shirts for my husband but had to return both." +
                " First the fiber blend is not as stated cotton/linen but Rayon/Linen." +
                " They are true to size and fabric is not too thick for summer" +
                " BUT they itch..... Probably because of the linen being a coarser natural fibers so had to return them. ");

        Clothes woman = new Clothes("Wn001","DressCyan",710.78,8,new ArrayList<String>(),"Woman");

        Clothes kid = new Clothes("Ks001","Socks",211.23,35,new ArrayList<String>(),"Kids");
        Product.ManClothes.add(man);
        Product.WomanClothes.add(woman);
        Product.KidsClothes.add(kid);



        String ShopName = "Amazon";
        String WebAddress = "www.amazon.com";
        String SupportPhone = "09336145843";
        Shop shop = new Shop();
        run(shop);
    }

    public static void run(Shop shop ){
        System.out.print("     _                     \n" +
                "    | |                    \n" +
                " ___| |__   ___  _ __  ___ \n" +
                "/ __| '_ \\ / _ \\| '_ \\/ __|\n" +
                "\\__ \\ | | | (_) | |_) \\__ \\\n" +
                "|___/_| |_|\\___/| .__/|___/\n" +
                "                | |        \n" +
                "                |_|        ");
        System.out.println(ANSI_YELLOW_BACKGROUND+"      Amazon Shop        "+ ANSI_RESET);
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
            userMenu(shop, (User) shop.getCurrentAccount(user.getUsername()));
        }
        else{run(shop);}
    }
    public static void LogInUser(Shop shop ){

        System.out.print("Username :"); String username = input.next();
        System.out.print("Password :"); String password = input.next();

        if(shop.login(username, password)){
            Account user = new User(username,password);
            System.out.println("...........***...........................WELCOME BACK USER...........***...........................");
            userMenu(shop, (User) shop.getCurrentAccount(user.getUsername()));
        }
        else{run(shop);}

    }
    public static void SignUpAdmin(Shop shop) {

        System.out.print("Username :");String username = input.next();
        System.out.print("Password :");String password = input.next();
        System.out.print("Email Address :");String email = input.next();
        System.out.print("Phone Number : +98");String phone = input.next();
        System.out.print("Address :");String address = input.next();
        System.out.println("Gender : (Man/Woman)"); String gender = input.next();
        if(shop.createAccount(username,password,"Admin")){adminMenu(shop);}
        else{run(shop);}
    }
    public static void LogInAdmin(Shop shop ){

        System.out.print("Username :"); String username = input.next();
        System.out.print("Password :"); String password = input.next();

        if(shop.login(username, password)){
            System.out.println("...........***...........................WELCOME BACK ADMIN...........***...........................");
            adminMenu(shop);
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
        if(shop.createAccount(username,password,"Seller")){sellerMenu(shop);}
        else{run(shop);}
    }
    public static void LogInSeller(Shop shop){

        System.out.print("Username :"); String username = input.next();
        System.out.print("Password :"); String password = input.next();

        if(shop.login(username, password)){
            System.out.println("...........***...........................WELCOME BACK SELLER...........***...........................");
            sellerMenu(shop);
        }
        else{run(shop);}

    }

    public static void userMenu(Shop shop , User user){

        System.out.println("------------------------------------------|------------------------------------------|---------------------------------------------|--------------------------------|");
        System.out.println("1_view your profile ⚪                    |2_Edit your profile ⚪                    |3_orders ⚪                                  |7_Products ⚪                   |");
        System.out.println("------------------------------------------|------------------------------------------|---------------------------------------------|----------------------------------|");
        System.out.println("4_Wallet ⚪                               |5_ShoppingCart  ⚪                        |6_Log out ⚪                                 |8_consequences of the request ⚪ |");
        System.out.println("------------------------------------------|------------------------------------------|---------------------------------------------|---------------------------------|");
        int select = input.nextInt();
        switch (select){
            case 1:
                user.viewProfile();
                userMenu(shop,user);
            case 2:
                System.out.println("*** if you want to edit so do it. if not write 'n' in front of each information ***");
                System.out.print("Username :");String username = input.next();
                System.out.print("Password :");String password = input.next();
                System.out.print("Email Address :");String email = input.next();
                System.out.print("Phone Number : +98");String phone = input.next();
                System.out.print("Address :");String address = input.next();
                System.out.println("Gender : (Man/Woman)"); String gender = input.next();
                user.editProfile(username,password,email,phone,address,gender);
                userMenu(shop,user);
            case 3:
                System.out.println("⤯ ⤯ ⤯ ⤯ ⤯ Your Order List(not purchased) ⤰ ⤰ ⤰ ⤰ ⤰");
                System.out.println(user.getListOrder());
                System.out.println("⤯ ⤯ ⤯ ⤯ ⤯ Latest Order List(Purchased Products) ⤰ ⤰ ⤰ ⤰ ⤰");
                System.out.println(user.getPurchasedProducts());
            case 4:
                System.out.println("This is all the money you have in your wallet.");
                user.getWallet();
                System.out.println("Do you want to ask the admin for more money? (y/n)" +
                        "NOTICE: If you write 'n', you will go back to the menu."); String yn = input.next();
                if(yn.equals("y")){
                    System.out.println("How much funding are you looking for?"); double amount = input.nextInt();
                    user.getWallet().requestToAdmin(user,amount);
                    System.out.println("To find out about the results of requests, go to the 'consequences of the request' section.");
                }
                userMenu(shop,user);

            case 5:
                System.out.println(user.getListOrder());
                System.out.println("If you want to update the number of items in your cart press '1'.\n" +
                        " If you want to remove something from your list, press '2'.\n" +
                        " If your list is not yet finished, press '3'.\n"+
                        " If you are ready to pay off, press '4'.\n");
                  int option = input.nextInt();
                  if(option == 1){
                      System.out.println("Which of them do you want to update?(write it's id)"); String id =input.next();
                      System.out.println("Do you want to 'increase' it or 'decrease' it?"); String choose1 = input.next();
                      if(choose1.equals("decrease")){
                          System.out.println("How much do you want it to decrease?"); select = input.nextInt();
                          for(int i = 0 ; i < select ; i++){

                          }

                      }
                      if(choose1.equals("increase")){System.out.println("How much do you want it to increase?");}
                  }
                  if(option == 2){}
                  if(option == 3){}
                  if(option == 4){}
                  userMenu(shop,user);
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
                 String options = input.next();
                switch (options){
                    case "Man":
                        product.ManClothes();
                        System.out.println("Would you like to add any products to your order list?(y/n)");  yn = input.next();
                        if(yn.equals("y")) {
                            System.out.println("plz write it's id..");
                            String id = input.next();
                            if (shop.doesProductExist(id)) {
                                System.out.println("How many of this product do you want?");
                                int count = input.nextInt();
                                int remain = 0;
                                for (int i = 1; i <= count; i++) {

                                    if (shop.doesProductExist(id)) {
                                        remain ++;
                                        shop.decreaseQuantity(shop.getChoosenProduct(id).getId());
                                        Product product1= shop.getChoosenProduct(id);
                                        Product Product2 = new Product(product1.getId(),product1.getProductName(), product1.getPrice(),remain,product1.getCommentList());
                                        user.addToListOrder(Product2);
                                        //user.addToCart(shop.getChoosenProduct(id));
                                        user.addToListOrder(Product2);

                                    } else {
                                        System.out.println("If you haven't noticed, this product no longer exists.");
                                        break;
                                    }
                                }
                             System.out.println("You add"+ remain +"products to your order list.");
                            } else {
                                System.out.println("If you haven't noticed, this product no longer exists.");
                            }

                        }
                        else{userMenu(shop,user);}

                    case "Woman":
                        product.WomanClothes();
                        System.out.println("Do you like to add comment?(Don't make this part for now)");
                        System.out.println("Would you like to add any products to your order list?(y/n)");  yn = input.next();
                        if(yn.equals("y")) {
                            System.out.println("plz write it's id..");
                            String id = input.next();
                            if (shop.doesProductExist(id)) {
                                System.out.println("How many of this product do you want?");
                                int count = input.nextInt();
                                int remain = 0;
                                for (int i = 1; i <= count; i++) {
                                    remain = i;
                                    if (shop.doesProductExist(id)) {
                                        shop.decreaseQuantity(shop.getChoosenProduct(id).getId());
                                        user.addToListOrder(shop.getChoosenProduct(id));
                                    } else {
                                        System.out.println("If you haven't noticed, this product no longer exists.");
                                        break;
                                    }
                                }
                                remain = remain - 1;
                                System.out.println("You add"+ remain +"products to your order list.");
                            } else {
                                System.out.println("If you haven't noticed, this product no longer exists.");
                            }

                        }
                        else{userMenu(shop,user);}
                    case "Kids":
                        product.KidsClothes();
                        System.out.println("Would you like to add any products to your order list?(y/n)");  yn = input.next();
                        if(yn.equals("y")) {
                            System.out.println("plz write it's id..");
                            String id = input.next();
                            if (shop.doesProductExist(id)) {
                                System.out.println("How many of this product do you want?");
                                int count = input.nextInt();
                                int remain = 0;
                                for (int i = 1; i <= count; i++) {
                                    remain = i;
                                    if (shop.doesProductExist(id)) {
                                        shop.decreaseQuantity(shop.getChoosenProduct(id).getId());
                                        user.addToListOrder(shop.getChoosenProduct(id));
                                    } else {
                                        System.out.println("If you haven't noticed, this product no longer exists.");
                                        break;
                                    }
                                }
                                remain = remain - 1;
                                System.out.println("You add"+ remain +"products to your order list.");
                            } else {
                                System.out.println("If you haven't noticed, this product no longer exists.");
                            }

                        }
                        else{userMenu(shop,user);}
                    case "Laptop":
                        product.LaptopEle();
                        System.out.println("Would you like to add any products to your order list?(y/n)");  yn = input.next();
                        if(yn.equals("y")) {
                            System.out.println("plz write it's id..");
                            String id = input.next();
                            if (shop.doesProductExist(id)) {
                                System.out.println("How many of this product do you want?");
                                int count = input.nextInt();
                                int remain = 0;
                                for (int i = 1; i <= count; i++) {
                                    remain = i;
                                    if (shop.doesProductExist(id)) {
                                        shop.decreaseQuantity(shop.getChoosenProduct(id).getId());
                                        user.addToListOrder(shop.getChoosenProduct(id));
                                    } else {
                                        System.out.println("If you haven't noticed, this product no longer exists.");
                                        break;
                                    }
                                }
                                remain = remain - 1;
                                System.out.println("You add"+ remain +"products to your order list.");
                            } else {
                                System.out.println("If you haven't noticed, this product no longer exists.");
                            }

                        }
                        else{userMenu(shop,user);}
                    case "Phone":
                        product.PhoneELe();
                        System.out.println("Would you like to add any products to your order list?(y/n)");  yn = input.next();
                        if(yn.equals("y")) {
                            System.out.println("plz write it's id..");
                            String id = input.next();
                            if (shop.doesProductExist(id)) {
                                System.out.println("How many of this product do you want?");
                                int count = input.nextInt();
                                int remain = 0;
                                for (int i = 1; i <= count; i++) {
                                    remain = i;
                                    if (shop.doesProductExist(id)) {
                                        shop.decreaseQuantity(shop.getChoosenProduct(id).getId());
                                        user.addToListOrder(shop.getChoosenProduct(id));
                                    } else {
                                        System.out.println("If you haven't noticed, this product no longer exists.");
                                        break;
                                    }
                                }
                                remain = remain - 1;
                                System.out.println("You add"+ remain +"products to your order list.");
                            } else {
                                System.out.println("If you haven't noticed, this product no longer exists.");
                            }

                        }
                        else{userMenu(shop,user);}
                    case "Tv":
                        product.TvELe();
                        System.out.println("Would you like to add any products to your order list?(y/n)");  yn = input.next();
                        if(yn.equals("y")) {
                            System.out.println("plz write it's id..");
                            String id = input.next();
                            if (shop.doesProductExist(id)) {
                                System.out.println("How many of this product do you want?");
                                int count = input.nextInt();
                                int remain = 0;
                                for (int i = 1; i <= count; i++) {
                                    remain = i;
                                    if (shop.doesProductExist(id)) {
                                        shop.decreaseQuantity(shop.getChoosenProduct(id).getId());
                                        user.addToListOrder(shop.getChoosenProduct(id));
                                    } else {
                                        System.out.println("If you haven't noticed, this product no longer exists.");
                                        break;
                                    }
                                }
                                remain = remain - 1;
                                System.out.println("You add"+ remain +"products to your order list.");
                            } else {
                                System.out.println("If you haven't noticed, this product no longer exists.");
                            }

                        }
                        else{userMenu(shop,user);}
                    case "Fiction":
                        product.FictionBook();
                        System.out.println("Would you like to add any products to your order list?(y/n)"); yn = input.next();
                        if(yn.equals("y")) {
                            System.out.println("plz write it's id..");
                            String id = input.next();
                            if (shop.doesProductExist(id)) {
                                System.out.println("How many of this product do you want?");
                                int count = input.nextInt();
                                int remain = 0;
                                for (int i = 1; i <= count; i++) {
                                    remain = i;
                                    if (shop.doesProductExist(id)) {
                                        shop.decreaseQuantity(shop.getChoosenProduct(id).getId());
                                        user.addToListOrder(shop.getChoosenProduct(id));
                                    } else {
                                        System.out.println("If you haven't noticed, this product no longer exists.");
                                        break;
                                    }
                                }
                                remain = remain - 1;
                                System.out.println("You add"+ remain +"products to your order list.");
                            } else {
                                System.out.println("If you haven't noticed, this product no longer exists.");
                            }

                        }
                        else{userMenu(shop,user);}
                    case "Poetry":
                        product.PoetryBook();
                        System.out.println("Would you like to add any products to your order list?(y/n)");  yn = input.next();
                        if(yn.equals("y")) {
                            System.out.println("plz write it's id..");
                            String id = input.next();
                            if (shop.doesProductExist(id)) {
                                System.out.println("How many of this product do you want?");
                                int count = input.nextInt();
                                int remain = 0;
                                for (int i = 1; i <= count; i++) {
                                    remain = i;
                                    if (shop.doesProductExist(id)) {
                                        shop.decreaseQuantity(shop.getChoosenProduct(id).getId());
                                        user.addToListOrder(shop.getChoosenProduct(id));
                                    } else {
                                        System.out.println("If you haven't noticed, this product no longer exists.");
                                        break;
                                    }
                                }
                                remain = remain - 1;
                                System.out.println("You add"+ remain +"products to your order list.");
                            } else {
                                System.out.println("If you haven't noticed, this product no longer exists.");
                            }

                        }
                        else{userMenu(shop,user);}
                    case "Drama":
                        product.DramaBook();
                        System.out.println("Would you like to add any products to your order list?(y/n)");  yn = input.next();
                        if(yn.equals("y")) {
                            System.out.println("plz write it's id..");
                            String id = input.next();
                            if (shop.doesProductExist(id)) {
                                System.out.println("How many of this product do you want?");
                                int count = input.nextInt();
                                int remain = 0;
                                for (int i = 1; i <= count; i++) {
                                    remain = i;
                                    if (shop.doesProductExist(id)) {
                                        shop.decreaseQuantity(shop.getChoosenProduct(id).getId());
                                        user.addToListOrder(shop.getChoosenProduct(id));
                                    } else {
                                        System.out.println("If you haven't noticed, this product no longer exists.");
                                        break;
                                    }
                                }
                                remain = remain - 1;
                                System.out.println("You add"+ remain +"products to your order list.");
                            } else {
                                System.out.println("If you haven't noticed, this product no longer exists.");
                            }

                        }
                        else{userMenu(shop,user);}

                }

        }
    }
    public static void adminMenu(Shop shop){

    }
    public static void sellerMenu(Shop shop){

    }



}