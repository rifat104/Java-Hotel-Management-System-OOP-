public class Employee extends Person {
    private String employeeId; //data type
    private String role;

    public Employee(String employeeId, String name, String address, String phoneNumber, String email, String role) {
        super(name, address, phoneNumber, email);
        this.employeeId = employeeId;
        this.role = role;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    // Print details method for Employee
    @Override
    public void printDetails() {
        super.printDetails();  // Print common details from Person
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Role: " + role);
    }
}
