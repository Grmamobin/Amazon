package org.example;

import java.util.ArrayList;

public class Product {

    private String id;
    private String productName;
    private double price;
    private int quantity;
    private ArrayList<String> commentList;
    private String buyer;
    private double rating;
    public static ArrayList<Clothes> ManClothes = new ArrayList<>();
    public static ArrayList<Clothes> WomanClothes = new ArrayList<>();
    public static ArrayList<Clothes> KidsClothes = new ArrayList<>();
    public static ArrayList<Electronics> Laptops = new ArrayList<>();
    public static ArrayList<Electronics> Tv = new ArrayList<>();
    public static  ArrayList<Electronics> Phone = new ArrayList<>();
    public static ArrayList<Books> Drama = new ArrayList<>();
    public static ArrayList<Books> Poetry = new ArrayList<>();
    public static ArrayList<Books> Fiction = new ArrayList<>();

    public Product( String id, String productName , double price ,int quantity , ArrayList<String> commentList
            ,String buyer , double rating){

        this.id = id;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.commentList = commentList;
        this.buyer = buyer;
        this.rating = 0.0;

    }

    public Product(){

        this.id = null;
        this.productName = null;
        this.price = 0.0;
        this.quantity =0;
        this.commentList = null;
        this.buyer =null;

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

    public String getId() {return id;}

    public String getBuyer() {
        return buyer;
    }

    private StringBuilder getStar() {

        StringBuilder addToMe = new StringBuilder();

        for (int i = 1 ; i <= this.rating ; i++) {

            addToMe.append("\uD83C\uDF15"); //sun

            if (i == this.rating) {

                int remain = (int) (5 - this.rating);
                if(remain == 0) {
                     return addToMe;
                 }

                for(int j = 1 ; j <= remain ; j++){

                    addToMe.append("\uD83C\uDF11");

                }

                return addToMe;
            }

            if(i + 0.5 == this.rating) {

                addToMe.append("\uD83C\uDF17");

                int j = (int) (i + 0.5);
                int remain = (5 - j);

                if(remain == 0) {
                    return addToMe;
                }

                for(int k = 1 ; k <= remain - 1 ; k++){

                    addToMe.append("\uD83C\uDF11");

                }

                return addToMe;
            }
        }
        return new StringBuilder(("\uD83C\uDF11 \uD83C\uDF11 \uD83C\uDF11 \uD83C\uDF11 \uD83C\uDF11"));
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void addComment(String comment){
        commentList.add(comment);
    }

    public void ManClothes() {

           System.out.print("                       ,,~~~~~~,,..\n" +
                   "                             ...., ,'~             |\n" +
                   "                             \\    V                /\n" +
                   "                              \\  /                 /\n" +
                   "                              ;####>     @@@@@     )\n" +
                   "                              ##;,      @@@@@@@    )\n" +
                   "                           .##/  ~>      @@@@@   .   .\n" +
                   "                          ###''#>              '      '\n" +
                   "      .:::::::.      ..###/ #>               '         '\n" +
                   "     //////))))----~~ ## #}                '            '\n" +
                   "   ///////))))))                          '             '\n" +
                   "  ///////)))))))\\                        '              '\n" +
                   " //////)))))))))))                                      '\n" +
                   " |////)))))))))))))____________________________________).\n" +
                   "|||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n" +
                   " ````````````````````````````''''''''''''''''''''''''''''\n");


        System.out.print("Man clothes are :\n" + ManClothes);

    }

    public void WomanClothes() {
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
                "            |     |o     |      \n" +
                "            |_____/\\_____|");

        System.out.print("Woman clothes are :\n" + WomanClothes);

    }

    public void KidsClothes() {
        System.out.print(" \n" +
                "              __.-.__.-.__\n" +
                "            .'\\ '-.__.-' /'.\n" +
                "           /  |    ,_    |  \\\n" +
                "          /   |  _/| \\_  |   \\\n" +
                "          '-._/ \\.-\"\"-./ \\_.-'\n" +
                "              | ( ^ \\^ ) |\n" +
                "              |  \\ == /  |\n" +
                "              |  /'--'\\  |\n" +
                "              |          |\n" +
                "              '._      _.'\n" +
                "                 `\"\"\"\"`");

        System.out.print("Kids clothes are :\n" + KidsClothes);

    }

    public void LaptopEle() {

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

    public void TvELe() {

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

    public void PhoneELe() {

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

    public void DramaBook() {

        System.out.print("      ___________________   ___________________\n" +
                "  .-/|  78   ~~**~~      \\ /      ~~**~~   79  |\\-.\n" +
                "  ||||                    :                    ||||\n" +
                "  ||||   Dorothy asked    :   The Scarecrow    ||||\n" +
                "  ||||   the Scarecrow    :   answered \"Some   ||||\n" +
                "  ||||   \"How can you     :   people without   ||||\n" +
                "  ||||   talk if you      :   brains do an     ||||\n" +
                "  ||||   haven't got      :   awful lot        ||||\n" +
                "  ||||   a brain?\"        :   of talking.\"     ||||\n" +
                "  ||||   She looked at    :   She replied,     ||||\n" +
                "  ||||   him puzzled.     :   \"That's true.\"   ||||\n" +
                "  ||||                    :                    ||||\n" +
                "  ||||  The Wizard Of Oz  :    boba@wwa.com    ||||\n" +
                "  ||||___________________ : ___________________||||\n" +
                "  ||/====================\\:/====================\\||\n" +
                "  `---------------------~___~--------------------''\n");

        System.out.print("Dramas books are :\n" + Drama);

    }

    public void FictionBook() {

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

    public void PoetryBook() {

        System.out.print("  __\n" +
                " (`/\\\n" +
                " `=\\/\\ __...--~~~~~-._   _.-~~~~~--...__\n" +
                "  `=\\/\\               \\ /               \\\\\n" +
                "   `=\\/                V                 \\\\\n" +
                "   //_\\___--~~~~~~-._  |  _.-~~~~~~--...__\\\\\n" +
                "  //  ) (..----~~~~._\\ | /_.~~~~----.....__\\\\\n" +
                " ===( INK )==========\\\\|//====================\n" +
                "__ejm\\___/________dwb`---`____________________________________________\n");
        System.out.print("Poetry books are :\n" + Poetry);

    }

    @Override
    public String toString() {

        return "Product  = " +
                " id =  " +  id  +"\n" +
                "  productName =   "  + productName +  "\n" +
                "  price =  " + price +   "\n" +
                "  quantity = " + quantity +   "\n" +
                "  Rating = " + rating +" "+getStar()+"\n"+
                "  commentList = " + commentList +   "\n";
    }

}