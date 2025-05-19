package com.pluralsight;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123, "Pam", 12500);
        Valuable account2 = new BankAccount(456, "Gary", 1500);

        account1.deposit(100);


        System.out.println("Account 1 balance: " + account1.getValue());
        System.out.println("Account 2 balance: " + account2.getValue());
    }
}
