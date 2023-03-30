package org.example;

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

    public boolean confirmRequest(User user,double amount){
        this.currentMoney += amount;
        System.out.println("Funds request for $" + amount + " from user " + user.getUsername() + "has been approved.");
        System.out.println("Your current money is" + this.currentMoney + "now.");
        return true;
    }
    public boolean ignoreRequest(User user){
        System.out.println("Sorry"+ user.getUsername()+ "request has been denied by the Admin.");
        System.out.println("Your current money is" + this.currentMoney + "now.");
        return false;
    }

    public void deductFunds(double amount) {
        this.currentMoney -= amount;
    }
    public void addFunds(User user){

    }

    @Override
    public String toString() {
        return "currentMoney =" + currentMoney;
    }
}
