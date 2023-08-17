package org.example.bankAccount;

public class CurrentAccountFactory implements BankAccountFactory{

    private String interest;
    private int balance;

    public CurrentAccountFactory(String interest, int balance){
        this.interest = interest;
        this.balance = balance;
    }

    @Override
    public BankAccount createBankAccount() {
        return new CurrentAccount(interest,balance);
    }
}
