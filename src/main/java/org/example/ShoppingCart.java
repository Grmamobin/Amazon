package org.example;
import java.util.ArrayList;
public class ShoppingCart {
    private String productName;
    private double totalPrice = 0.0;
    private double unitPrice;
    private int quantity;
    private ArrayList<Product> ProductInCart;


    public ShoppingCart(/*String productName , double totalPrice ,double unitPrice , int quantity ,
                ArrayList<Product> ProductInCart*/) {
        this.productName = getProductName();
        this.totalPrice = getUnitPrice() * getQuantity();
        this.unitPrice = getUnitPrice();
        this.quantity = getQuantity();
        ProductInCart = new ArrayList<>();
    }

    public String getProductName() {
        return productName;
    }

    public double getUnitPrice() {
        return (unitPrice * quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public ArrayList<Product> getProductInCart() {
        return ProductInCart;
    }

    /*    public  void removeItem(Userk user,String id){
            ArrayList<Product> userCart =  user.getCart();
            if( userCart!= null) {
                this.ProductInCart.removeIf(product -> product.getId().equals(id));
                System.out.println("Product has been successfully removed");
            }
        }*/
    public void addItem(Product product) {
        ProductInCart.add(product);
    }

    public void showCart() {
        System.out.println(ProductInCart);
    }

    public double getTotalPrice(User user) {
        double totalPrice = 0;
        for (Order product : user.getCart()) {
            totalPrice += product.getUnitPrice() * product.getQuantity();
        }
        return totalPrice;
    }


    public double PriceInCart(User user){

        return 0;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Cart = "+
                " totalPrices = " + totalPrice +'\n';
    }
}
