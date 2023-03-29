package org.example;

import java.util.ArrayList;
import java.util.HashMap;
public class Product {
    private String id;
    private String productName;
    private double price;
    private int quantity;
    private ArrayList<String> commentList;
    public static ArrayList<Clothes> ManClothes = new ArrayList<>();
    public static ArrayList<Clothes> WomanClothes = new ArrayList<>();
    public static ArrayList<Clothes> KidsClothes = new ArrayList<>();
    public static ArrayList<Electronics> Laptops = new ArrayList<>();
    public static ArrayList<Electronics> Tv = new ArrayList<>();
    public static  ArrayList<Electronics> Phone = new ArrayList<>();
    public static ArrayList<Books> Drama = new ArrayList<>();
    public static ArrayList<Books> Poetry = new ArrayList<>();
    public static ArrayList<Books> Fiction = new ArrayList<>();

    public Product( String id, String productName , double price ,int quantity , ArrayList<String> commentList){
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.commentList = commentList;
    }
    public Product( ){
        this.id = null;
        this.productName = null;
        this.price = 0.0;
        this.quantity =0;
        this.commentList = null;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public ArrayList<String> getCommentList() {
        return commentList;
    }

    public String getId() {return id;}

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCommentList(ArrayList<String> commentList) {
        this.commentList = commentList;
    }

    public void setId(String id) {this.id = id;}

    public void addComment(String comment){
        commentList.add(comment);
    }

    public ArrayList<Clothes> getManClothes() {
        return ManClothes;
    }
    public void setManClothes(ArrayList<Clothes> manClothes) {
        ManClothes = manClothes;
    }

    public static ArrayList<Clothes> getWomanClothes() {
        return WomanClothes;
    }

    public static void setWomanClothes(ArrayList<Clothes> womanClothes) {
        WomanClothes = womanClothes;
    }

    public static ArrayList<Clothes> getKidsClothes() {
        return KidsClothes;
    }

    public static void setKidsClothes(ArrayList<Clothes> kidsClothes) {
        KidsClothes = kidsClothes;
    }
    public void ManClothes(){
           System.out.print("                  _\n" +
                "                 ( |\n" +
                "                   |\n" +
                "            __,--./|.--,__\n" +
                "          .`   \\ \\ / /    `.\n" +
                "        .`      \\ | /       `.\n" +
                "       /   /     ^|^      \\   \\\n" +
                "      /   / |     |o     | \\   \\\n" +
                "     /===/  |     |      |  \\===\\\n" +
                "    /___/   |     |o     |   \\___\\\n" +
                "            |     |      |\n" +
                "            |     |o     |\n" +
                "            |     |      |\n" +
                "            |     |o     |\n" +
                "            |     |      |\n" +
                "            |     |o     |      jgs\n" +
                "            |_____/\\_____|");


        System.out.print("Man clothes are :\n" + ManClothes);
    }
    public void WomanClothes(){
        System.out.print("                  _\n" +
                "                 ( |\n" +
                "                   |\n" +
                "            __,--./|.--,__\n" +
                "          .`   \\ \\ / /    `.\n" +
                "        .`      \\ | /       `.\n" +
                "       /   /     ^|^      \\   \\\n" +
                "      /   / |     |o     | \\   \\\n" +
                "     /===/  |     |      |  \\===\\\n" +
                "    /___/   |     |o     |   \\___\\\n" +
                "            |     |      |\n" +
                "            |     |o     |\n" +
                "            |     |      |\n" +
                "            |     |o     |\n" +
                "            |     |      |\n" +
                "            |     |o     |      jgs\n" +
                "            |_____/\\_____|");

        System.out.print("Woman clothes are :\n" + WomanClothes);
    }
    public void KidsClothes(){
        System.out.print("                  _\n" +
                "                 ( |\n" +
                "                   |\n" +
                "            __,--./|.--,__\n" +
                "          .`   \\ \\ / /    `.\n" +
                "        .`      \\ | /       `.\n" +
                "       /   /     ^|^      \\   \\\n" +
                "      /   / |     |o     | \\   \\\n" +
                "     /===/  |     |      |  \\===\\\n" +
                "    /___/   |     |o     |   \\___\\\n" +
                "            |     |      |\n" +
                "            |     |o     |\n" +
                "            |     |      |\n" +
                "            |     |o     |\n" +
                "            |     |      |\n" +
                "            |     |o     |      jgs\n" +
                "            |_____/\\_____|");

        System.out.print("Kids clothes are :\n" + KidsClothes);
    }
    public void LaptopEle(){
         System.out.print("\n" +
                 "                                      ._________________.\n" +
                 "                                      |.---------------.|\n" +
                 "                                      ||               ||\n" +
                 "                                      ||   -._ .-.     ||\n" +
                 "                                      ||   -._| | |    ||\n" +
                 "                                      ||   -._|\"|\"|    ||\n" +
                 "                                      ||   -._|.-.|    ||\n" +
                 "                                      ||_______________||\n" +
                 "                                      /.-.-.-.-.-.-.-.-.\\\n" +
                 "                                     /.-.-.-.-.-.-.-.-.-.\\\n" +
                 "                                    /.-.-.-.-.-.-.-.-.-.-.\\\n" +
                 "                                   /______/__________\\___o_\\ DrS\n" +
                 "                                   \\_______________________/");
        System.out.print("Laptops are :\n" + Laptops);
    }
    public void TvELe(){
        System.out.print("\n" +
                "                    o\n" +
                "           o       /\n" +
                "            \\     /\n" +
                "             \\   /\n" +
                "              \\ /\n" +
                "+--------------v-------------+\n" +
                "|  __________________      @ |\n" +
                "| /          ,  ooo  \\       |\n" +
                "| |  ---=====|#O#### |  (\\)  |\n" +
                "| |          `  \\ )  |       |\n" +
                "| |   ,;`,      | |  |  (-)  |\n" +
                "| |  // o ',    | |  |       |\n" +
                "| \\  ' o \\ /,   | |  / :|||: |\n" +
                "|  -ooo--------------  :|||: |\n" +
                "+----------------------------+\n" +
                "   []                    []\n");
        System.out.print("Tvs are :\n"+ Tv);
    }
    public void PhoneELe(){
        System.out.print(" \n" +
                "\n" +
                "                                                         .\n" +
                "                            .              .   .'.     \\   /\n" +
                "                          \\   /      .'. .' '.'   '  -=  o  =-\n" +
                "                        -=  o  =-  .'   '              / | \\\n" +
                "                          / | \\                          |\n" +
                "                            |                            |\n" +
                "                            |                            |\n" +
                "                            |                      .=====|\n" +
                "                            |=====.                |.---.|\n" +
                "                            |.---.|                ||=o=||\n" +
                "                            ||=o=||                ||   ||\n" +
                "                            ||   ||                ||   ||\n" +
                "                            ||   ||                ||___||\n" +
                "                            ||___||                |[:::]|\n" +
                "                       jgs  |[:::]|                '-----'\n" +
                "                            '-----'\n" +
                "\n");
        System.out.print("Phones are :\n" + Phone);
    }
    public void DramaBook(){


        System.out.print("\n" +
                "                .-~~~~~~~~~-._       _.-~~~~~~~~~-.\n" +
                "            __.'              ~.   .~              `.__\n" +
                "          .'//                  \\./                  \\\\`.\n" +
                "        .'//                     |                     \\\\`.\n" +
                "      .'// .-~\"\"\"\"\"\"\"~~~~-._     |     _,-~~~~\"\"\"\"\"\"\"~-. \\\\`.     DRAMA\n" +
                "    .'//.-\"                 `-.  |  .-'                 \"-.\\\\`.\n" +
                "  .'//______.============-..   \\ | /   ..-============.______\\\\`.\n" +
                ".'______________________________\\|/______________________________`.");

        System.out.print("Dramas books are :\n" + Drama);
    }
    public void FictionBook(){

        System.out.print("\n" +
                "                .-~~~~~~~~~-._       _.-~~~~~~~~~-.\n" +
                "            __.'              ~.   .~              `.__\n" +
                "          .'//                  \\./                  \\\\`.\n" +
                "        .'//                     |                     \\\\`.\n" +
                "      .'// .-~\"\"\"\"\"\"\"~~~~-._     |     _,-~~~~\"\"\"\"\"\"\"~-. \\\\`.     FICTION\n" +
                "    .'//.-\"                 `-.  |  .-'                 \"-.\\\\`.\n" +
                "  .'//______.============-..   \\ | /   ..-============.______\\\\`.\n" +
                ".'______________________________\\|/______________________________`.");
        System.out.print("Fiction books are :\n" + Fiction);
    }
    public void PoetryBook(){

        System.out.print("\n" +
                "                .-~~~~~~~~~-._       _.-~~~~~~~~~-.\n" +
                "            __.'              ~.   .~              `.__\n" +
                "          .'//                  \\./                  \\\\`.\n" +
                "        .'//                     |                     \\\\`.\n" +
                "      .'// .-~\"\"\"\"\"\"\"~~~~-._     |     _,-~~~~\"\"\"\"\"\"\"~-. \\\\`.     POETRY\n" +
                "    .'//.-\"                 `-.  |  .-'                 \"-.\\\\`.\n" +
                "  .'//______.============-..   \\ | /   ..-============.______\\\\`.\n" +
                ".'______________________________\\|/______________________________`.");
        System.out.print("Poetry books are :\n" + Poetry);
    }




    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", commentList=" + commentList +
                '}';
    }
}
