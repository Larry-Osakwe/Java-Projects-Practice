package bankaccountapp;

public class Checking extends Account {
    // List properties specific for a checking account
    int debitCardNumber;
    int debitCardPin;

    // Constructor to initialize checking account properties
    public Checking(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
        accountNumber = "2" + accountNumber;
    }

    // List methods specific to checking account
    public void showInfo() {
        super.showInfo();
        System.out.println("This is the checking account");
    }

}
