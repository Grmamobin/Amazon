package org.example;
import java.util.Scanner;
public class Main {
    // Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[0m";
    // Declaring the color
    // Custom declaration
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String ShopName = "Amazon";
        String WebAddress = "www.amazon.com";
        String SupportPhone = "09336145843";
        Shop shop = new Shop();
        run(shop);
    }

    public static void run(Shop shop ){
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


        if(shop.createAccount(username,password,email,phone,address,"Admin","")){userMenu(shop);}
        else{run(shop);}
    }
    public static void LogInUser(Shop shop ){

        System.out.print("Username :"); String username = input.next();
        System.out.print("Password :"); String password = input.next();

        if(shop.login(username, password)){
            System.out.println("...........***...........................WELCOME BACK USER...........***...........................");
            userMenu(shop);
        }
        else{run(shop);}

    }
    public static void SignUpAdmin(Shop shop) {

        System.out.print("Username :");String username = input.next();
        System.out.print("Password :");String password = input.next();
        System.out.print("Email Address :");String email = input.next();
        System.out.print("Phone Number : +98");String phone = input.next();
        System.out.print("Address :");String address = input.next();
        if(shop.createAccount(username,password,email,phone,address,"Admin","")){adminMenu(shop);}
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
        if(shop.createAccount(username,password,email,phone,address,"Seller",shop.getShopName())){sellerMenu(shop);}
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

    public static void userMenu(Shop shop){

        System.out.println("------------------------------------------|------------------------------------------|---------------------------------------------|-------------------------------|");
        System.out.println("1_view your profile                       |2_Edit your profile                       |3_orders                                     |4_                             |");
        System.out.println("------------------------------------------|------------------------------------------|---------------------------------------------|-------------------------------|");
        System.out.println("5_                                        |6_                                        |7_Log out                                    |8_                             |");
        System.out.println("------------------------------------------|------------------------------------------|---------------------------------------------|-------------------------------|");
        int select = input.nextInt();
    }
    public static void adminMenu(Shop shop){

    }
    public static void sellerMenu(Shop shop){

    }



}