package com.company;

import java.util.Scanner;

public class BankAccount {
    private double amount; // остаток на счете

    public String getAmount(){
    return getAmount();
    }//возвращает текущий остаток на счете


    public double deposit(double sum) { //положить деньги на счет
        return sum;
    }


    public double withDraw(int sum) throws LimitException { //снимает указанную сумму со счета
        System.out.println("Какую сумму вы хотите снять со счета?");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        if (scanner.nextInt() > amount) ;
        {
            throw new LimitException("Недостаточно средств на счету");
        }
    }
         }
