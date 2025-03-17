public class BankEmployee {
    private String name;
    private String employeeID;
    private int reviewedResponses;

    public BankEmployee(String name, String employeeID) {
        this.name = name;
        this.employeeID = employeeID;
        this.reviewedResponses = 0;
    }

    // Metode simple noi
    public void increaseReviewedResponses() {
        reviewedResponses++;
        System.out.println(name + " has reviewed another response. Total: " + reviewedResponses);
    }

    public String getEmployeeDetails() {
        return "Employee Name: " + name + ", ID: " + employeeID + ", Responses Reviewed: " + reviewedResponses;
    }

    // Metode simple existente
    public String getName() { return name; }
    public int getReviewedResponses() { return reviewedResponses; }

    // Metodă complexă
    public void validateResponse(String question, String aiResponse, BankCustomer customer) {
        reviewedResponses++;
        String finalResponse = aiResponse + " (Reviewed by " + name + ")";
        customer.receiveFinalResponse(finalResponse);
    }
}
