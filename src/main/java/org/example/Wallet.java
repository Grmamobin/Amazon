package org.example;

import java.util.ArrayList;

public class Wallet {
    private double currentMoney;
    public Wallet(){
        this.currentMoney = 0.0;
    }
    public Wallet(double currentMoney){
        this.currentMoney = currentMoney;
    }

    public double getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(double currentMoney) {
        this.currentMoney = currentMoney;
    }
    public void requestToAdmin(User user){

    }
    public void confirmRequest(Seller seller){

    }
    public void addFunds(User user){

    }



}
