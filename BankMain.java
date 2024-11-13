package com.oops;

import java.util.Scanner;
class Account implements Bank{

    double balance=0;

    public double withdraw(double amount){
        if(balance>amount){
            balance=balance-amount;
            System.out.println("After deposit current amount : "+balance);
        }
        else{
            System.out.println("Your balance is insufficient");
        }
        return balance;
    }

    public double deposit(double amount){
        balance=balance+amount;
        System.out.println("After deposit current amount : "+balance);
        return balance;
    }
    public void display(){
        System.out.println("Your balance : "+balance);
    }

}

public class BankMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1: For Deposit");
        System.out.println("Enter 2: For Withdraw");
        System.out.println("Enter 3: Display");
        int choice=sc.nextInt();
        Account acc=new Account();
        switch(choice){
            case 1:
                System.out.println("Enter deposit amount: ");
                double depositAmount=sc.nextDouble();
                acc.deposit(depositAmount);
                break;
            case 2:
                System.out.println("Enter withdraw amount: ");
                double withdrawAmount=sc.nextDouble();
                acc.withdraw(withdrawAmount);
                break;
            case 3:
                acc.display();
                break;
            default:
                System.out.println("Entered invalid option");
        }
    }
}