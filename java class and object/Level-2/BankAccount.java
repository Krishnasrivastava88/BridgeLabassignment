class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if(amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance!");
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountHolder = "Krishna";
        acc.accountNumber = 12345;
        acc.balance = 1000;
        acc.deposit(500);
        acc.withdraw(200);
        acc.displayBalance();
    }
}
