package org.example;

import java.util.ArrayList;

public class Admin extends Account {

    private ArrayList<Admin> ListWaitedAdmin;

    public Admin(String username , String password , String emailAddress , String phoneNumber ,String address,String gender) {

        super(username ,password ,emailAddress,phoneNumber,address ,gender);
        this.ListWaitedAdmin = new ArrayList<>();

    }

    public Admin(String username , String password ) {

        super(username ,password);
        this.ListWaitedAdmin = new ArrayList<>();

    }

    public void addFunds(double amount , Wallet wallet , User user){
        user.getWallet().setCurrentMoney(user.getWallet().getCurrentMoney() + amount);
    }

    public void ListWaitedAdmin(Admin admin){
        ListWaitedAdmin.add(admin);
    }

    public void removeListWaited(Admin admin){
        ListWaitedAdmin.remove(admin);
    }

    public ArrayList<Admin> getListWaitedAdmin() {
        return ListWaitedAdmin;
    }

    public Admin ListWaited(String username) {

        for (Admin user : this.ListWaitedAdmin) {

            if (user.getUsername().equals(username)) {
                return user;
            }

        }
        return null;

    }

    @Override
    public String toString() {
        return "Admin : "  + "   Username : " + getUsername() + "  password : "+ getPassword() +
                "  Email : "+getEmailAddress() + "  Phone Number : +98" + getPhoneNumber()+
                "  Address :" + getAddress() + "   Gender : (Man/Woman)" + getGender();
    }

}
