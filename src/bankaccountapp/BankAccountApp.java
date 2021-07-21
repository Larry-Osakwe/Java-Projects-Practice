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

        for (String[] accountHolder : newAccountHolder) {
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);

//            System.out.println(name + " " + sSN + " " + accountType + " " + initDeposit);

            if (accountType.equals("Checking")) {
                System.out.println("Check check");
            } else if (accountType.equals("Savings")) {
                System.out.println("Save Save");
            } else {
                System.out.println("Error");
            }

        }


    }

}
