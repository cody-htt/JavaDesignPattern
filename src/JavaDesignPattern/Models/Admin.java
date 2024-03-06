package JavaDesignPattern.Models;

public class Admin extends User {

    private final String adminId;
    private final String departmentId;
    private final String role;

    public Admin(String adminId, String departmentId, String role) {
        this.username = "admin";
        this.password = "admin123";
        this.adminId = adminId;
        this.departmentId = departmentId;
        this.role = role;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId='" + adminId + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
    
}
