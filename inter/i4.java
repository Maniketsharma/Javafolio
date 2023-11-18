import java.util.ArrayList;
import java.util.List;

// Account interface
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double viewBalance();
}

// SavingsAccount class implementing Account interface
class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public double viewBalance() {
        return balance;
    }

    // Additional method specific to SavingsAccount
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

// CurrentAccount class implementing Account interface
class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Exceeded overdraft limit.");
        }
    }

    @Override
    public double calculateInterest() {
        // Current accounts may not have interest, so returning 0.
        return 0;
    }

    @Override
    public double viewBalance() {
        return balance;
    }

    // Additional method specific to CurrentAccount
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}

// Bank class
class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<Account>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added to the bank.");
    }

    // Other methods for managing accounts in the bank, such as removeAccount, getAccountList, etc.
}

// Main class to test the banking system
public class i4{
    public static void main(String[] args) {
        // Creating instances of accounts
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.02);
        CurrentAccount currentAccount = new CurrentAccount(500, 100);

        // Creating an instance of the bank
        Bank bank = new Bank();

        // Adding accounts to the bank
        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        // Performing operations on accounts
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        System.out.println("Savings Account Balance: " + savingsAccount.viewBalance());
        System.out.println("Savings Account Interest: " + savingsAccount.calculateInterest());

        currentAccount.deposit(200);
        currentAccount.withdraw(800);
        System.out.println("Current Account Balance: " + currentAccount.viewBalance());
    }
}
