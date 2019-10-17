package online_reader_system;

public class User {
    
    private int userId;
    private String details;
    private int accountType;

    public void renewMembership() {}

    public User(int userId, String details, int accountType) {
        this.userId = userId;
        this.details = details;
        this.accountType = accoutType;
    }

    /**. getters and setters **/
    public int getId() { return id; }
    public void setId(int userId) { this.userId = userId; }

    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }

    public int getAccoutType() { return accountType; }
    public void setAccountType(Int accountType) { 
        this.accountType = accountType;
    }
}
