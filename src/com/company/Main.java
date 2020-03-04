package com.company;

public class Main {

    public static void main(String[] args) {
        LimitException limitException = new LimitException("Ваш остаток на счету");
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        for (int i = 0; ; i++) {
            try {
                bankAccount.withDraw(0);
                limitException.getRemainingAmount();
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }
    }



