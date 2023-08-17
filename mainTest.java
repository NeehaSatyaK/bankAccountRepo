package org.example.bankAccount;



public class mainTest {
    public static void main(String[] args){
        implementBankFactory();
    }

    private static void implementBankFactory() {



        BankAccount savingsAccount = BankFactory.getBankAccount(new SavingAccountFactory("6%",123333));
        BankAccount currentAccount = BankFactory.getBankAccount(new CurrentAccountFactory("7%",125451));
        BankAccount loanAccount = BankFactory.getBankAccount(new LoanAccountFactory("0%",11177));
        System.out.println("Savings Account has been created with interst rate and balance " +savingsAccount.getInterestRate()+","+savingsAccount.getCurrentBalance());
        System.out.println("Current Account has been created with interest rate and balance "+currentAccount.getInterestRate()+","+currentAccount.getCurrentBalance() );
        System.out.println("Loan Account has been created with interest rate and balance "+loanAccount.getInterestRate()+","+loanAccount.getCurrentBalance());


    }
}
