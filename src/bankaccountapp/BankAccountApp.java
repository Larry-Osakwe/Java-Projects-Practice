package bankaccountapp;

import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {

        String file = "D:\\Libraries\\Documents\\Java Learning\\JProjs\\src\\NewBankAccounts.csv";

//        Checking chkAcc1 = new Checking("John Smith", "123432134", 50);
//        Savings savAcc1 = new Savings("John Smith", "123432134", 50);
//
//
//        savAcc1.compound();
//
//        chkAcc1.showInfo();
//        System.out.println("***************");
//        savAcc1.showInfo();

        // Read a CSV file and create new accounts based on that data
        List<String[]> newAccountHolder = utilities.CSV.read(file);
    }

}
