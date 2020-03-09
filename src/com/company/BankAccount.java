package com.company;

public class BankAccount {
    double amount;// остаток на счете

    public double getAmount() {
        return amount;
    }//возвращает текущий остаток на счете


    public void deposit(double sum) {//положить деньги на счет
        if (sum > 0) {
            amount = sum + amount;
            System.out.println(amount);
        }
    }

    public void withDraw(int sum) throws LimitException { //снимает указанную сумму со счета
        if (getAmount()<sum) {
            amount=amount-amount;
            System.out.println("Остаток на счету " + amount);
            throw new LimitException("Недостаточно средств на счету", getAmount());
        } else {
            amount=amount-sum;
            System.out.println("Со счета снято " + sum);
        }
    }
}