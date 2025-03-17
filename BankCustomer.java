public class BankCustomer {
    private String name;
    private String accountNumber;
    private double balance;

    public BankCustomer(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(name + " deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds for " + name);
        } else {
            balance -= amount;
            System.out.println(name + " withdrew $" + amount + ". New balance: $" + balance);
        }
    }

    public void askQuestion(AIComponent ai, String question) {
        System.out.println(name + " (Account: " + accountNumber + ") asks: " + question);
        String aiResponse = ai.generateResponse(question);
        System.out.println("AI's initial response: " + aiResponse);
        ai.sendForValidation(question, aiResponse, this);
    }

    public void receiveFinalResponse(String response) {
        System.out.println("Final validated response for " + name + ": " + response);
    }
}