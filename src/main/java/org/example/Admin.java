package org.example;

public class Admin extends Account{

    public Admin(String username , String password , String emailAddress , String phoneNumber ,String address) {

        super(username ,password ,emailAddress,phoneNumber,address);
    }

    public void addAdmin(Admin admin) {}
    public void addFunds(User user, double amount) {}
    public boolean confirmRequest(){
        return true;
    }
    public boolean rejectRequest(){
        return false;
    }
    @Override
    public String getType() {
        return "Admin";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
