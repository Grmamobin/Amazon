package org.example;

import java.util.HashMap;

public class  Account {

    private String username;
    private String password;
    private String emailAddress;
    private String phoneNumber;
    private String address;
    private String gender;
    private Wallet wallet;
    private static HashMap<String, Double> UserAndNewAmount;
    private boolean confirm;
    private String notification = "";
    private String notification1 = "";

    public Account(String username, String password, String emailAddress, String phoneNumber, String address, String gender) {

        this.username = username;
        this.password = password;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.wallet = new Wallet();
        this.UserAndNewAmount = new HashMap<String, Double>();
        this.confirm = false;

    }

    public Account(String username, String password) {

        this.username = username;
        this.password = password;
        this.emailAddress = getEmailAddress();
        this.phoneNumber = getPhoneNumber();
        this.address = getAddress();
        this.gender = getGender();
        this.wallet = new Wallet();

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public static HashMap<String, Double> getUserAndNewAmount() {
        return UserAndNewAmount;
    }

    public void addToUserAndNewAmountList(User user, Double amount) {
        UserAndNewAmount.put(user.getUsername(), amount);
    }

    public void removeUserAndNewAmountList(User user, Double amount) {
        UserAndNewAmount.remove(user.getUsername(), amount);
    }

    public boolean getConfirm() {
        return this.confirm;
    }

    public void setConfirm(boolean confirm) {
        this.confirm = confirm;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getNotification1() {
        return notification1;
    }

    public void setNotification1(String notification1) {
        this.notification1 = notification1;
    }

}


