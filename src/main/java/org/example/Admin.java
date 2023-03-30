package org.example;

public class Admin extends Account{

    public Admin(String username , String password , String emailAddress , String phoneNumber ,String address,String gender) {

        super(username ,password ,emailAddress,phoneNumber,address ,gender);
    }

    public void addAdmin(Admin admin) {}
    public void sendFunds(double amount, User user, Admin admin) {
        if (admin.confirmRequest(amount)) {

            admin.addFunds(amount, user.getWallet());
            System.out.println("Transferred "+amount+" money from Admin to recipient's wallet");

        }

        if(admin.rejectRequest(amount)){
            System.out.println("Request denied by admin");
        }

    }
    public void addFunds(double amount , Wallet wallet){

    }
    public boolean confirmRequest(double amount){

        return true;
    }
    public boolean rejectRequest(double amount){
        return false;
    }

/*    @Override
    public String getType() {
        return "Admin";
    }*/
/*
public void addFunds(double amount) {
    wallet += amount;
}

    public void removeFunds(double amount) {
        wallet -= amount;
    }
*/



    @Override
    public String toString() {
        return super.toString();
    }
}
