package org.example.bankAccount;

public class BankFactory {
    public static BankAccount getBankAccount(BankAccountFactory factory){
        return factory.createBankAccount();
    }
}
