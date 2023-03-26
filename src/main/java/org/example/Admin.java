package org.example;

public abstract class Admin extends Account{

    public Admin(String username , String password , String emailAddress , String phoneNumber) {

        super(username ,password ,emailAddress,phoneNumber );
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
    public String toString() {
        return super.toString();
    }
}
