/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20pt02
 */

import java.util.*;

public class Account 
{
    String owner;
    double Balance;
    long Accno;
    private static int numAccounts = 0;
    int numOfDeposits = 0;
    int numOfWithdrawals = 0;
    double totalDepositAmt;
    double totalWithdrawalAmt;
    
    public Account(double initBal,String owner,long number)
    {
        this.Balance = initBal;
        this.owner = owner;
        this.Accno = number;
        numAccounts++;
        System.out.println("Account with acc no "+ this.Accno+" created.");
    }
    
    public Account(double initBal,String owner)
    {
        this.Balance = initBal;
        this.owner = owner;
        long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        this.Accno = number;
        numAccounts++;
        System.out.println("Account with acc no "+ this.Accno+" created.");
    }
    
    public Account(String owner)
    {
        this.Balance = 0;
        this.owner = owner;
        long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        this.Accno = number;
        numAccounts++;
        System.out.println("Account with acc no "+ this.Accno+" created.");
    }
    
    public void Withdraw(double amt)
    {
        if(this.Balance >= amt)
        {
            this.Balance -= amt;
            System.out.println("Amount successfully withdrawn.");
            System.out.println("Current Balance: Rs."+ this.Balance+"\n");
            this.numOfWithdrawals++;
            this.totalWithdrawalAmt += amt;
        }
        else
        {
            System.out.println("Unsufficient balance.\nAmount cannot be withdrawn.\n");
        }    
    }
    
    public double getBalance()
    {
        return this.Balance;
    }
    
    public void Deposit(double amt)
    {
        this.Balance += amt;
        System.out.println("Amount successfully deposited.");
        System.out.println("Current Balance: Rs"+ this.Balance+"\n");  
        this.numOfDeposits++;
        this.totalDepositAmt+=amt;
    }
    
    public void Close()
    {
       this.owner = owner + " CLOSED";
       this.Balance = 0; 
       this.numOfDeposits = 0;
       this.numOfWithdrawals = 0;
       this.totalDepositAmt = 0;
       this.totalWithdrawalAmt = 0;
       System.out.println("Account closed");
       numAccounts--;
    }
    
    public String toString()
    {
        return "\nAccno: " + this.Accno + "\nOwner: "+ this.owner + "\nBalance: "+ this.Balance 
                +"\nTotal number of deposits: "+this.numOfDeposits+"\nTotal number of withdrawals: "
                +this.numOfWithdrawals + "\nTotal deposit amount: " + this.totalDepositAmt + 
                "\nTotal Withdrawal Amt: " + this.totalWithdrawalAmt + "\n";
    }
    
    public static int getNumAccounts()
    {
        return numAccounts;
    }
    
    public static void main(String[] args)
    {
        Account A1 = new Account(5000,"Name1",1234567891);
        Account A2 = new Account(1000,"Name2");
        Account A3 = new Account("Name3");
        System.out.println(A1);
        A1.Deposit(5000);
        A1.Withdraw(500);
        A1.Deposit(10000);
        A1.Withdraw(20000);
        System.out.println(A1);
        System.out.println("Total number of accounts: " + Account.getNumAccounts()+ "\n");
        A1.Close();
        System.out.println(A1);
        System.out.println("Total number of accounts: " + Account.getNumAccounts()+ "\n");
    }

    
}
