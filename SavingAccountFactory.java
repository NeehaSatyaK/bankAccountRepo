package org.example.bankAccount;

public class SavingAccountFactory implements BankAccountFactory{
    private String interest;
    private int balance;

    public SavingAccountFactory(String interest, int balance){
        this.interest = interest;
        this.balance = balance;
    }

    @Override
    public BankAccount createBankAccount() {
        return new SavingAccount(interest,balance);
    }
}
