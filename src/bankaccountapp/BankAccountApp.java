package bankaccountapp;

public class BankAccountApp {

    public static void main(String[] args) {

        Checking chkAcc1 = new Checking("John Smith", "123432134", 50);
        Savings savAcc1 = new Savings("John Smith", "123432134", 50);


        savAcc1.compound();

        chkAcc1.showInfo();
        System.out.println("***************");
        savAcc1.showInfo();

        // Read a CSV file and create new accounts based on that data
    }

}
