package org.example.bankAccount;

public class SavingAccount extends  BankAccount{

    private String interest;
    private int balance;

    public SavingAccount(String interest, int balance){
        this.interest = interest;
        this.balance = balance;
    }
    @Override
    public String getInterestRate() {
        return this.interest;
    }

    @Override
    public int getCurrentBalance() {
        return this.balance;
    }
}
