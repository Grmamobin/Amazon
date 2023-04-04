package org.example;

public class Wallet {

    private double currentMoney;

    public Wallet(){
        this.currentMoney = 0.0;
    }

    public double getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(double currentMoney) {
        this.currentMoney = currentMoney;
    }

    @Override
    public String toString() {
        return "currentMoney =" + currentMoney;
    }

}
