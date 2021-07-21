package bankaccountapp;

public class Checking extends Account {
    // List properties specific for a checking account
    int debitCardNumber;
    int debitCardPin;

    // Constructor to initialize checking account properties
    public Checking(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
    }

    // List methods specific to checking account

}
