package bankaccountapp;

public class Savings extends Account {
    // List properties specific for a savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // Constructor to initialize savings account properties
    public Savings(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    // List methods specific to savings account
    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey =  (int)(Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Savings Account Features" +
                "\nSafety Deposit Box ID: " + safetyDepositBoxID +
                "\nSafety Deposit Box Key: " + safetyDepositBoxKey);

    }
}
