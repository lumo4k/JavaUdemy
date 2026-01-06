package org.estudos;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(123, "Alex", 190.25);
        BusinessAccount bacc = new BusinessAccount(100, "Maria", 0.0, 500.00);

        // Upcasting
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // Downcasting
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(100.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

        // Teste de Withdraw com Override
        Account acc07 = new Account(1005, "Theodoro", 200.00);
        acc07.withdraw(100.00);
        System.out.println(acc07.getBalance());

        SavingsAccount sacc02 = new SavingsAccount(1005, "Theodoro", 200.00, 0.07);
        sacc02.withdraw(100.00);
        System.out.println(sacc02.getBalance());

        BusinessAccount bacc05 = new BusinessAccount(1005, "Theodoro", 200.00, 500.00);
        bacc05.withdraw(100.00);
        System.out.println(bacc05.getBalance());
    }
}