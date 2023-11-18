import java.util.ArrayList;

class Account {
    private String accountNumber;
    private String customerName;
    private double balance;

    public Account(String accountNumber, String customerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal unsuccessful.");
        }
    }
}

public class o6 {
    private ArrayList<Account> accounts;

    public o6() {
        accounts = new ArrayList<Account>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added successfully. Account Number: " + account.getAccountNumber());
    }

    public void removeAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                accounts.remove(account);
                System.out.println("Account removed successfully. Account Number: " + accountNumber);
                return;
            }
        }
        System.out.println("Account not found. Removal unsuccessful.");
    }

    public void displayAccounts() {
        System.out.println("List of Accounts:");
        for (Account account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Customer Name: " + account.getCustomerName());
            System.out.println("Balance: $" + account.getBalance());
            System.out.println("------------------------");
        }
    }

    public static void main(String[] args) {
        o6 bank = new o6();

        // Adding accounts
        Account account1 = new Account("12345", "John Doe", 1000.0);
        Account account2 = new Account("67890", "Jane Smith", 2000.0);

        bank.addAccount(account1);
        bank.addAccount(account2);

        // Displaying initial account details
        System.out.println("\nInitial Account Details:");
        bank.displayAccounts();

        // Depositing and withdrawing money
        account1.deposit(500.0);
        account2.withdraw(1000.0);

        // Displaying updated account details
        System.out.println("\nUpdated Account Details:");
        bank.displayAccounts();

        // Removing an account
        bank.removeAccount("12345");

        // Displaying final account details
        System.out.println("\nFinal Account Details:");
        bank.displayAccounts();
    }
}
