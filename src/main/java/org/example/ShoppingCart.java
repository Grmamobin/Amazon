package org.example;
import java.util.ArrayList;
public class ShoppingCart {
    private  String productName;
    private double totalPrice;
    private double unitPrice;
    private int quantity;
    private ArrayList<Product> ProductInCart;

    public ShoppingCart(/*String productName , double totalPrice ,double unitPrice , int quantity ,
                ArrayList<Product> ProductInCart*/){
        this.productName = getProductName();
        this.totalPrice = getTotalPrice();
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
    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : ProductInCart) {
            totalPrice += product.getPrice() * product.getQuantity();
        }
        return totalPrice;
    }
    public int getQuantity() {
        return quantity;
    }

    public ArrayList<Product> getProductInCart() {
        return ProductInCart;
    }
    public void removeItem(Product product){
        ProductInCart.remove(product);
    }
    public void addItem(Product product){
        ProductInCart.add(product);
    }
    public void showCart(){
        System.out.println(ProductInCart);
    }


    @Override
    public String toString() {
        return "Cart{" +
                "productName='" + productName + '\'' +
                ", totalPrice=" + totalPrice +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", ProductInCart=" + ProductInCart +
                '}';
    }
}
