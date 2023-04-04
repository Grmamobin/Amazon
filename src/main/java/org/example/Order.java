package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Order {

    private String id;
    private int quantity;
    private Date date;
    private double totalPrice;
    private double unitPrice;
    private User detailsBuyer;
    private String detailsSeller;
    private ArrayList<Seller> seller;

    public Order(String id,int quantity,Date date , double totalPrice ,double unitPrice ,User detailsBuyer
                 ,String detailsSeller){
        this.id = id;
        this.quantity = quantity;
        this.date = date;
        this.totalPrice = unitPrice * quantity;
        this.unitPrice = unitPrice;
        this.detailsBuyer = detailsBuyer;
        this.detailsSeller = detailsSeller;

    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public  String getDetailsSeller() {
        return detailsSeller;
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

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {

        return  " id = " + id + "\n" +
                " quantity = " + quantity + "\n" +
                " date = " + date + "\n" +
                " totalPrice = " + totalPrice + "\n" +
                " unitPrice = " + unitPrice + "\n" +
                " detailsBuyer = " + detailsBuyer + "\n" +
                " detailsSeller = " + detailsSeller+ "\n";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return quantity == order.quantity && Double.compare(order.totalPrice, totalPrice) == 0 && Double.compare(order.unitPrice, unitPrice) == 0 && Objects.equals(id, order.id) && Objects.equals(date, order.date) && Objects.equals(detailsBuyer, order.detailsBuyer) && Objects.equals(detailsSeller, order.detailsSeller) && Objects.equals(products, order.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantity, date, totalPrice, unitPrice, detailsBuyer, detailsSeller, products);
    }

}
