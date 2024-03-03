public class BankManagerCredentials {
    private String username;
    private String password;

    // Constructor
    public BankManagerCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for password (Note: It's not recommended to provide a setter for password for security reasons)
    public String getPassword() {
        return password;
    }

    // Override toString method for displaying credentials
    @Override
    public String toString() {
        return "BankManagerCredentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
