public class AIComponent {
    private String modelName;
    private double confidenceLevel;
    private BankEmployee validator;
    private boolean isActive;

    public AIComponent(String modelName, double confidenceLevel, BankEmployee validator) {
        this.modelName = modelName;
        this.confidenceLevel = confidenceLevel;
        this.validator = validator;
        this.isActive = true; 
    }

    public String isAIActive() {
        return isActive ? "AI is currently active." : "AI is currently inactive.";
    }

    public void toggleAIStatus(boolean status) {
        this.isActive = status;
        System.out.println("AI status changed: " + (status ? "Active" : "Inactive"));
    }

    public String getModelName() { return modelName; }
    public double getConfidenceLevel() { return confidenceLevel; }

    
    public String generateResponse(String question) {
        return "AI-generated response for '" + question + "' (Confidence: " + confidenceLevel + "%)";
    }

    public void sendForValidation(String question, String aiResponse, BankCustomer customer) {
        validator.validateResponse(question, aiResponse, customer);
    }
}
