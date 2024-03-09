/* 
File     : BankApp.java
Tanggal  : 9 Maret 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: Program main BankApp, implementasi exception
*/

public class BankApp {
    public static void main(String[] args){
        BankAccount account = new BankAccount(500.0);

        try{
            System.out.println("Saldo saat ini: $" + account.getBalance());
            
            //Skenario saldo mencukupi
            account.withdraw(200.0);
            System.out.println("Saldo saat ini: $" + account.getBalance());

            //Menambahkan saldo
            account.deposit(50);
            System.out.println("Saldo saat ini: $" + account.getBalance());

            //Skenario saldo tidak mencukupi
            account.withdraw(400.0);
            System.out.println("Saldo saat ini: $" + account.getBalance());
        } catch (InsufficientFundsException exception){
            System.out.println(exception.getMessage());
        }    
    }
}
