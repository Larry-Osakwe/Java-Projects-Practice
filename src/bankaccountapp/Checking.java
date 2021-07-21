package bankaccountapp;

public class Checking extends Account {
    // List properties specific for a checking account
    int debitCardNumber;
    int debitCardPin;

    // Constructor to initialize checking account properties
    public Checking(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    // List methods specific to checking account
    private void setDebitCard() {
        debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
        debitCardPin =  (int)(Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Checking Account Features" +
                "\nDebit Card Number: " + debitCardNumber +
                "\nDebit Card Pin: " + debitCardPin);

    }

}
