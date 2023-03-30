package org.example;

public class Account {
    private String username;
    private String password;
    private String emailAddress;
    private String phoneNumber;
    private String address;
    private String gender;
    private Wallet wallet;

    public Account(String username , String password , String emailAddress , String phoneNumber , String address,String gender){
        this.username = username;
        this.password = password;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.getWallet();
    }
    public Account(String username ,String password){
        this.username = username;
        this.password = password;
        this.emailAddress = getUsername();
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

    public String getAddress() {return address;}

    public String getGender() {return gender;}

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

    public void setAddress(String address) {this.address = address;}

    public void setGender(String gender) {this.gender = gender;}

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public void login(){ //*

    }
    public void signup(){ //*

    }
    public void logout(){ //*

    }
   /* public abstract String getType();*/
}
