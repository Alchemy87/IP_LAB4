public class Main {
    public static void main(String[] args) {
        BankEmployee employee = new BankEmployee("Alice Johnson", "E1234");
        AIComponent ai = new AIComponent("BankAI v3.0", 95.0, employee);
        BankCustomer customer = new BankCustomer("John Doe", "123456789", 2000.0);


        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Account Number: " + customer.getAccountNumber());
        System.out.println("Current Balance: $" + customer.getBalance());

        customer.deposit(500);
        customer.withdraw(300);
        customer.withdraw(5000);

        System.out.println("AI Model: " + ai.getModelName());
        System.out.println("Accuracy rate: " + ai.getConfidenceLevel() + "%");

        System.out.println("AI STATUS CHECK: " + ai.isAIActive());
        ai.toggleAIStatus(false);
        System.out.println("AI STATUS CHECK: " + ai.isAIActive());
        ai.toggleAIStatus(true);

        System.out.println("Employee Details: " + employee.getEmployeeDetails());
        employee.increaseReviewedResponses();
        employee.increaseReviewedResponses();
        System.out.println("Updated Employee Details: " + employee.getEmployeeDetails());
        
        System.out.println("\n");

        customer.askQuestion(ai, "How can I apply for a credit card?");
        customer.askQuestion(ai, "What are the interest rates for savings accounts?");

        System.out.println("Employee has reviewed " + employee.getReviewedResponses() + " responses.");
    }
}
