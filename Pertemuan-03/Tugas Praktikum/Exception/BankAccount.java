/* 
File     : BankAccount.java
Tanggal  : 9 Maret 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: Class BankAccount yang berisi balance, deposit, withdraw
*/

public class BankAccount {
    private double balance;
    private final double MIN_BALANCE = 100.0; // Saldo minimal

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance - amount < MIN_BALANCE){
            throw new InsufficientFundsException("Insufficient funds. Minimum balance required: $" + MIN_BALANCE);
        }
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
    }

    public double getBalance(){
        return balance;
    }
}
