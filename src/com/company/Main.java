package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        for (int i = 0; ; i++) {
            try { bankAccount.withDraw(6000);
                System.out.println("У вас осталось на счету " + bankAccount.getAmount());
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}




