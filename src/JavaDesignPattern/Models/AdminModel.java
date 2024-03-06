package JavaDesignPattern.Models;

public class AdminModel extends User {

    private final String adminId;
    private final String departmentId;
    private final String role;

    public AdminModel(String adminId, String departmentId, String role) {
        this.username = "admin";
        this.password = "admin123";
        this.adminId = adminId;
        this.departmentId = departmentId;
        this.role = role;
    }

    @Override
    public String toString() {
        return "AdminModel{" +
                "adminId='" + adminId + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
    
}
