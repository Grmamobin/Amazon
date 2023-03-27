package org.example;

import java.util.ArrayList;

public class Clothes extends SubCategory{

    public Clothes(String id,String name, double price, int quantity, ArrayList<String> commentList,String subcategory) {
        super(id,name, price, quantity, commentList, "Clothes", subcategory);
    }

    @Override
    public double getDiscount() {
        return getPrice() * (0.3); //30% off
    }
    /*public System.out.print("                  _\n" +
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
                "            |_____/\\_____|");*/

}
