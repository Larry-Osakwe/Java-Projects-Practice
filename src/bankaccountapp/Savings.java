package bankaccountapp;

public class Savings extends Account {
    // List properties specific for a savings account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    // Constructor to initialize savings account properties
    public Savings(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
        accountNumber = "1" + accountNumber;
    }
    // List methods specific to savings account
    public void showInfo() {
        super.showInfo();
        System.out.println("This is the savings account");
    }
}
