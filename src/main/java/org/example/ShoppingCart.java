package org.example;

public class ShoppingCart {

    private String productName;
    private double totalPrice = 0.0;
    private double unitPrice;
    private int quantity;

    public ShoppingCart() {

        this.productName = getProductName();
        this.totalPrice = getUnitPrice() * getQuantity();
        this.unitPrice = getUnitPrice();
        this.quantity = getQuantity();

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

    public double getTotalPrice(User user) {
        double totalPrice = 0;
        for (Order product : user.getCart()) {
            totalPrice += product.getUnitPrice() * product.getQuantity();
        }
        return totalPrice;
    }

    public double PriceInCart(User user){
        return user.getWallet().getCurrentMoney();
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
