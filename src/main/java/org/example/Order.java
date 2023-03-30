package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private String id;
    private int quantity;
    private Date date;
    private double totalPrice;
    private double unitPrice;
    private User detailsBuyer;
    private Seller detailsSeller;
    private ArrayList<Product> products;
  /*  private ArrayList<Order> orderUser;*/

    public Order(String id,int quantity,Date date , double totalPrice ,double unitPrice ,User detailsBuyer , Seller detailsSeller){
        this.id = id;
        this.quantity = quantity;
        this.date = date;
        this.totalPrice = unitPrice * quantity;
        this.unitPrice = unitPrice;
        this.detailsBuyer = detailsBuyer;
        this.detailsSeller = detailsSeller;
    }
    public Order( User detailsBuyer){
        this.totalPrice = totalPrice;
        this.detailsBuyer = detailsBuyer;
    }

    public Date getDate() {
        return new Date();
    }

    public double getTotalPrice(/*Product product , int quantity*/) {
        /*totalPrice += (product.getPrice() * quantity);*/
        return totalPrice;
    }

    public User getDetailsBuyer() {
        return detailsBuyer;
    }

    public Seller getDetailsSeller() {
        return detailsSeller;
    }

    public ArrayList<Product> getProduct() {
        return products;
    }

    public void ConformReceive(){

    }
    public  void  UpdateRemaining(){

    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    // Confirm an order
/*    public void confirmOrder(Order order) {
        if (order.getBuyer().getWallet() >= order.getTotalPrice()) {
            order.getSeller().getWallet().subtractFunds(order.getTotalPrice() * 0.9);
            order.getBuyer().getWallet().subtractFunds(order.getTotalPrice());
            order.getBuyer().getPurchasedProducts().addAll(order.getItems());
            order.getSeller().getAvailableProducts().removeAll(order.getItems());
            order.getBuyer().setShoppingCart(new ArrayList<Product>());
            order.getSeller().setWallet(order.getSeller().getWallet().getFunds() + order.getTotalPrice() * 0.9);
            order.getDate(); // set the order date
        }*/
   /* public void addOrderForUser(User detailsBuyer, Order order){
        orderUser.add(order);
    }*/

    @Override
    public String toString() {
        return  " id = " + id + "\n" +
                " quantity = " + quantity + "\n" +
                " date = " + date + "\n" +
                " totalPrice = " + totalPrice + "\n" +
                " unitPrice = " + unitPrice + "\n" +
                " detailsBuyer = " + detailsBuyer + "\n" +
                " detailsSeller = " + detailsSeller + "\n";
    }
}
