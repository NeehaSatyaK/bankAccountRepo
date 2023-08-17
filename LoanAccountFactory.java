package org.example.bankAccount;

public class LoanAccountFactory implements BankAccountFactory {
    private String interest;
    private int balance;

    public LoanAccountFactory(String interest, int balance){
        this.interest = interest;
        this.balance = balance;
    }

    @Override
    public BankAccount createBankAccount() {
        return new LoanAccount(interest,balance);
    }
}
