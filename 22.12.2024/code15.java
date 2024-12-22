import java.util.Scanner;
public class BankSystem {
    double balance = 0;
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
        }
    }
    
    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankSystem bank = new BankSystem();
        
        bank.deposit(scanner.nextDouble());
        bank.withdraw(scanner.nextDouble());
        bank.displayBalance();
    }
}
