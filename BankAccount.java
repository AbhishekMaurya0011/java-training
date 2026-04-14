public class BankAccount {
    // step1:make a variales private(data hiding)
    private int accountNumber;
    private double balance;

    // step2:setter methods to assign values
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // step3:getter methods to access values
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // step4:create object
        BankAccount acc = new BankAccount();
        System.out.println("For Bank Account.java");

        // step5:set using setters methods
        acc.setAccountNumber(1234);
        acc.setBalance(25000.00);

        // step6: access values using getter methods
        System.out.println("AccountNumber:" + acc.getAccountNumber());
        System.out.println("Balance:" + acc.getBalance());

    }
}
