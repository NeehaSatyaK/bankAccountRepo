package org.example.bankAccount;

public class LoanAccount extends BankAccount{

    private String interest;
    private int balance;

    public LoanAccount(String interest, int balance){
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
