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
            throw new LimitException("Недостаточно средств на счету", getAmount());
        } else {
            System.out.println(amount=amount-sum);
        }   if (getAmount()<sum){
            System.out.println(amount=amount-amount);
        }
    }
}